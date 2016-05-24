package es.ulpgc.eite.showyou.android.screen.media.landscape;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.media.presenter.MediaPresenter;

public class LandscapeMediaPresenter extends MediaPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.MEDIA_PORTRAIT);
    }

}
