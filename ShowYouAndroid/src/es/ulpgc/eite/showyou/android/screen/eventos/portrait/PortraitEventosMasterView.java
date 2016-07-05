package es.ulpgc.eite.showyou.android.screen.eventos.portrait;


import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.eventos.master.view.EventosMasterView;


public class PortraitEventosMasterView extends EventosMasterView {

    @Override
    public int getLayout() {
        debug("getLayout");

        return R.layout.eventos_master_view;
    }

}
