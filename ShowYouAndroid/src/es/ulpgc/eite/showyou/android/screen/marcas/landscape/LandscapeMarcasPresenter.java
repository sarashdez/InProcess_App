package es.ulpgc.eite.showyou.android.screen.marcas.landscape;

import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.marcas.presenter.MarcasPresenter;

public class LandscapeMarcasPresenter extends MarcasPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.MARCAS_PORTRAIT);
    }

}
