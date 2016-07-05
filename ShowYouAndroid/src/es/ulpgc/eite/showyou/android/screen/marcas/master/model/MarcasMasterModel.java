package es.ulpgc.eite.showyou.android.screen.marcas.master.model;


import android.app.Application;
import es.ulpgc.eite.framework.android.AndroidScreenModel;
import es.ulpgc.eite.showyou.android.screen.database.marcas_db.I_MarcasDatabase;
import es.ulpgc.eite.showyou.android.screen.database.marcas_db.MarcasData;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MarcasMasterModel extends AndroidScreenModel implements I_MarcasMasterModel {

    private int position;

    private I_MarcasDatabase getDatabase() {
        return (I_MarcasDatabase) getScreenDatabase();
    }

    @Override
    public List<MarcasData> getCollection(){
        if(getDatabase().getMarcasDataList().size() == 0){
            fillDatabase();
        }
        return getDatabase().getMarcasDataList();
    }

    private void fillDatabase() {
        debug("fillDatabase Marcas");

        if(getDatabase().getMarcasDataList().size()==0){
            mapperJsonToJava(loadJsonFromAsset("marcasDB.json"));
        }

    }

    private void mapperJsonToJava(String jsonString) {
        try {
            JSONArray jsonArray = new JSONArray(jsonString);

            for(int i =0; i<jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                MarcasData data = getJavaObject(jsonObject);
                getDatabase().saveMarcasData(data);
            }
        } catch (JSONException e) {

        }
    }

    private MarcasData getJavaObject(JSONObject jsonObject) throws JSONException {
        int idMarcas = Integer.parseInt(jsonObject.getString("id_marcas"));
        String nombre = jsonObject.getString("nombre");
        String imagen = jsonObject.getString("imagen");
        String descripcion = jsonObject.getString("descripcion");
        String web = jsonObject.getString("web");

        return new MarcasData(idMarcas, nombre, imagen, descripcion, web);
    }


    private String loadJsonFromAsset(String path) {

        Application singleton = (Application) getMediator();

        try {
            InputStream is = singleton.getAssets().open(path);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            String json = new String(buffer, "UTF-8");
            debug("loadJsonFromAsset", "json=", json);
            return json;

        } catch (IOException ex) {
            return null;
        }
    }

    @Override
    public int getPosition() {
        return position;
    }

    @Override
    public void setPosition(int pos) {
        position = pos;
    }

    @Override
    public MarcasData getData() {
        return getDatabase().getMarcasDataList().get(getPosition());
    }
}
