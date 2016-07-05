package es.ulpgc.eite.showyou.android.screen.noticias.master.model;


import android.app.Application;
import es.ulpgc.eite.framework.android.AndroidScreenModel;
import es.ulpgc.eite.showyou.android.screen.database.noticias_db.I_NoticiasDatabase;
import es.ulpgc.eite.showyou.android.screen.database.noticias_db.NoticiasData;
import es.ulpgc.eite.showyou.android.screen.master.model.MasterModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class NoticiasMasterModel extends MasterModel implements I_NoticiasMasterModel {

    private int position;

    private I_NoticiasDatabase getDatabase() {
        return (I_NoticiasDatabase) getScreenDatabase();
    }

    @Override
    public List<NoticiasData> getCollection(){
        if(getDatabase().getNoticiasDataList().size() == 0){
            fillDatabase();
        }
        return getDatabase().getNoticiasDataList();
    }

    private void fillDatabase() {
        debug("fillDatabase Noticias");

        if(getDatabase().getNoticiasDataList().size()==0){
            mapperJsonToJava(loadJsonFromAsset("noticiasDB.json"));
        }

    }

    private void mapperJsonToJava(String jsonString) {
        try {
            JSONArray jsonArray = new JSONArray(jsonString);

            for(int i =0; i<jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                NoticiasData data = getJavaObject(jsonObject);
                getDatabase().saveNoticiasData(data);
            }
        } catch (JSONException e) {

        }
    }

    private NoticiasData getJavaObject(JSONObject jsonObject) throws JSONException {
        int idNoticias = Integer.parseInt(jsonObject.getString("id_noticia"));
        String nombre = jsonObject.getString("nombre");
        String descripcion = jsonObject.getString("descripcion");

        return new NoticiasData(idNoticias, nombre, descripcion);
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
    public NoticiasData getData() {
        return getDatabase().getNoticiasDataList().get(getPosition());
    }

}
