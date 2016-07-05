package es.ulpgc.eite.showyou.android.screen.marcas.portrait;


import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.marcas.master.view.MarcasMasterView;

public class PortraitMarcasMasterView extends MarcasMasterView {

    @Override
    public int getLayout() {
        debug("getLayout");

        return R.layout.marcas_master_view;
    }

}
