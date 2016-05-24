package es.ulpgc.eite.showyou.android.screen.marcas.master.portrait;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.marcas.master.presenter.MarcasMasterPresenter;

public class PortraitMarcasMasterPresenter extends MarcasMasterPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.MARCAS_MASTER_LANDSCAPE);
    }

}
