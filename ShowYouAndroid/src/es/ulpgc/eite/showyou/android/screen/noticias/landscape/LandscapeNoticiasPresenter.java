package es.ulpgc.eite.showyou.android.screen.noticias.landscape;

import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.noticias.presenter.NoticiasPresenter;

public class LandscapeNoticiasPresenter extends NoticiasPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.NOTICIAS_PORTRAIT);
    }

}
