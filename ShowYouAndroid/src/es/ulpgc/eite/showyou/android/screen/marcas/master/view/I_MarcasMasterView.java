package es.ulpgc.eite.showyou.android.screen.marcas.master.view;


import es.ulpgc.eite.showyou.android.screen.database.marcas_db.I_MarcasData;
import java.util.List;

public interface I_MarcasMasterView {

    void setLayout();
    void setMarcasScreen();
    void setMarcasCollection(List<? extends I_MarcasData> collection);
    void setListPosition(int position);
}
