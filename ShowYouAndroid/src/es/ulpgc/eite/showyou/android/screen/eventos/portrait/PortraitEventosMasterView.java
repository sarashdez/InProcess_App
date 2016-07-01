package es.ulpgc.eite.showyou.android.screen.eventos.portrait;


import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.eventos.master.view.EventosView;


public class PortraitEventosMasterView extends EventosView {

    @Override
    public int getLayout() {
        debug("getLayout");
        return R.layout.eventos_master_view;
    }

}
