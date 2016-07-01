package es.ulpgc.eite.showyou.android.screen.eventos.master.model;


import es.ulpgc.eite.showyou.android.screen.database.eventos_db.EventosData;
import es.ulpgc.eite.showyou.android.screen.database.eventos_db.I_EventosData;

import java.util.List;

public interface I_EventosModel {

    List<? extends I_EventosData> getCollection();

    //void fillDatabase();

    int getPosition();

    void setPosition(int pos);

    EventosData getDataRef();

    void setDataRef(EventosData data);

    I_EventosData getData();
}
