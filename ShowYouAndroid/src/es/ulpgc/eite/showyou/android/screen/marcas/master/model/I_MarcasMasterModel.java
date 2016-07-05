package es.ulpgc.eite.showyou.android.screen.marcas.master.model;


import es.ulpgc.eite.showyou.android.screen.database.marcas_db.MarcasData;

import java.util.List;

public interface I_MarcasMasterModel {

    List<MarcasData> getCollection();
    int getPosition();
    void setPosition(int pos);
    MarcasData getData();
}
