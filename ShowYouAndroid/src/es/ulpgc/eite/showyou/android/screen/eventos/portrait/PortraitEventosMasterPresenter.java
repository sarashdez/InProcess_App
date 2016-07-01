package es.ulpgc.eite.showyou.android.screen.eventos.portrait;


import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.eventos.master.presenter.EventosPresenter;

public class PortraitEventosMasterPresenter extends EventosPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.EVENTOS_LANDSCAPE);
    }

}
