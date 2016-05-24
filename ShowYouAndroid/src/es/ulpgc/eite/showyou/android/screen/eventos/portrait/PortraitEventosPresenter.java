package es.ulpgc.eite.showyou.android.screen.eventos.portrait;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.eventos.presenter.EventosPresenter;

public class PortraitEventosPresenter extends EventosPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.EVENTOS_LANDSCAPE);
    }

}
