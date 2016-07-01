package es.ulpgc.eite.showyou.android.screen.eventos.landscape;

import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.eventos.master.presenter.EventosPresenter;


public class LandEventosMasterPresenter extends EventosPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.EVENTOS_PORTRAIT);
    }

}
