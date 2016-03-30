package es.ulpgc.eite.showyou.android.screen.noticias.portrait;

import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.noticias.presenter.NoticiasPresenter;


public class PortraitNoticiasPresenter extends NoticiasPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.NOTICIAS_LANDSCAPE);
    }
}
