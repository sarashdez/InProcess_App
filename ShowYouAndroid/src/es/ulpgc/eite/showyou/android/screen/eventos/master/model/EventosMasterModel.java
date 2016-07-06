package es.ulpgc.eite.showyou.android.screen.eventos.master.model;



import es.ulpgc.eite.showyou.android.screen.database.eventos_db.EventosData;
import es.ulpgc.eite.showyou.android.screen.database.eventos_db.I_EventosDatabase;
import es.ulpgc.eite.showyou.android.screen.master.model.MasterModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.List;

public class EventosMasterModel extends MasterModel implements I_EventosMasterModel {

    private int position;

    private I_EventosDatabase getDatabase() {
        return (I_EventosDatabase) getScreenDatabase();
    }

    @Override
    public List<EventosData> getCollection(){
        if(getDatabase().getEventosDataList().size() == 0){
            fillDatabase();
        }
        return getDatabase().getEventosDataList();
    }

   private void fillDatabase() {
        debug("fillDatabase EventosMaster");

        if(getDatabase().getEventosDataList().size()==0){
            mapperJsonToJava(loadJsonFromAsset("eventosDB.json"));
        }

    }

    private void mapperJsonToJava(String jsonString) {
        try {
            JSONArray jsonArray = new JSONArray(jsonString);

            for(int i =0; i<jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                EventosData data = getJavaObject(jsonObject);
                getDatabase().saveEventosData(data);
            }
        } catch (JSONException e) {

        }
    }

    private EventosData getJavaObject(JSONObject jsonObject) throws JSONException {
        int idEventos = Integer.parseInt(jsonObject.getString("id_eventos"));
        String nombre = jsonObject.getString("nombre");
        String lugar = jsonObject.getString("lugar");
        String fecha = jsonObject.getString("fecha");
        String descripcion = jsonObject.getString("descripcion");

        return new EventosData(idEventos, nombre, lugar, fecha, descripcion);
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
    public EventosData getData() {
        return getDatabase().getEventosDataList().get(getPosition());
    }

}




