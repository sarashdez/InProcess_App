package es.ulpgc.eite.showyou.android.screen.marcas.portrait;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.marcas.presenter.MarcasPresenter;

public class PortraitMarcasPresenter extends MarcasPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.MARCAS_LANDSCAPE);
    }

}
