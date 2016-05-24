package es.ulpgc.eite.showyou.android.screen.marcas.master.landscape;

import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.marcas.master.presenter.MarcasMasterPresenter;

public class LandscapeMarcasMasterPresenter extends MarcasMasterPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.MARCAS_MASTER_PORTRAIT);
    }

}
