package es.ulpgc.eite.showyou.android.screen.noticias.master.view;


import es.ulpgc.eite.showyou.android.screen.database.noticias_db.I_NoticiasData;

import java.util.List;

public interface I_NoticiasMasterView {

    void setLayout();
    void setNoticiasScreen();
    void setNoticiasCollection(List<? extends I_NoticiasData> collection);
    void setListPosition(int position);

}
