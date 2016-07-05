package es.ulpgc.eite.showyou.android.screen.eventos.master.view;


import es.ulpgc.eite.showyou.android.screen.database.eventos_db.I_EventosData;

import java.util.List;

public interface I_EventosMasterView {
    void setLayout();
    void setEventosScreen();
    void setEventosCollection(List<? extends I_EventosData> collection);
    void setListPosition(int position);
}
