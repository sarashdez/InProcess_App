package es.ulpgc.eite.showyou.android.screen.bio.portrait;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.bio.presenter.BioPresenter;

public class PortraitBioPresenter extends BioPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.BIO_LANDSCAPE);
    }

}
