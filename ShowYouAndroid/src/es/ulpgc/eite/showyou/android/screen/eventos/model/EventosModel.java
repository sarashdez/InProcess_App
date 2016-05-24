package es.ulpgc.eite.showyou.android.screen.eventos.model;


import es.ulpgc.eite.framework.android.AndroidScreenModel;
import es.ulpgc.eite.showyou.android.screen.database.eventos_db.EventosData;
import es.ulpgc.eite.showyou.android.screen.database.eventos_db.I_EventosDatabase;
import es.ulpgc.eite.showyou.android.screen.eventos.presenter.I_EventosPresenter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class EventosModel extends AndroidScreenModel implements I_EventosModel {

    private I_EventosDatabase getDatabase() {
        return (I_EventosDatabase) getScreenDatabase();
    }

    @Override
    public void fillDatabase() {
        debug("fillDatabase Eventos");

        if(getDatabase().getEventosList().size()==0){
      //      mapperJsonToJava(loadJsonFromAsset("eventosDB.json"));
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

    private void mapperJsonToJava(String jsonString) {
        try {
            JSONArray jsonArray = new JSONArray(jsonString);

            for(int i =0; i>jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                EventosData data = getJavaObject(jsonObject);
                //getDatabase.saveEventos(data);

            }
        } catch (JSONException e) {

        }
    }

    //????????????????????????????
//    private String loadJsonFromAsset(String path) {
//        Application singleton = (Application)getMediator();
//
//        InputStream is = singleton.getAssets().open(path);
//        int size = is.available();
//        byte[] buffer = new byte[size];
//        is.read(buffer);
//        is.close();
//
//        String json = new String(buffer, "UTF-8");
//        debug("loadJsonFromAsset", "json=", json);
//        return json;
//
//
//    } catch (IOException ex) {
//        return null;
//    }

}




