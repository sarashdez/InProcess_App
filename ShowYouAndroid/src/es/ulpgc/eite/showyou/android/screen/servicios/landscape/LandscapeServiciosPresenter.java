package es.ulpgc.eite.showyou.android.screen.servicios.landscape;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.servicios.presenter.ServiciosPresenter;

public class LandscapeServiciosPresenter extends ServiciosPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.SERVICIOS_PORTRAIT);
    }

}
