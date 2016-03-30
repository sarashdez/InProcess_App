package es.ulpgc.eite.showyou.android.screen.bio.landscape;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.bio.presenter.BioPresenter;

public class LandscapeBioPresenter extends BioPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.BIO_PORTRAIT);
    }
}
