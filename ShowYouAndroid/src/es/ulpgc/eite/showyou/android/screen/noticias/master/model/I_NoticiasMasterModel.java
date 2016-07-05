package es.ulpgc.eite.showyou.android.screen.noticias.master.model;


import es.ulpgc.eite.showyou.android.screen.database.noticias_db.NoticiasData;

import java.util.List;

public interface I_NoticiasMasterModel {

    List<NoticiasData> getCollection();
    int getPosition();
    void setPosition(int pos);
    NoticiasData getData();

}
