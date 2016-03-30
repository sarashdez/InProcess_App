package es.ulpgc.eite.showyou.android.screen.servicios.portrait;

import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.servicios.presenter.ServiciosPresenter;


public class PortraitServiciosPresenter extends ServiciosPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.SERVICIOS_LANDSCAPE);
    }

}
