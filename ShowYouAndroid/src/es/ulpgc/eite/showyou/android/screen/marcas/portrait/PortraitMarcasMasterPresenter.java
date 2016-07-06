package es.ulpgc.eite.showyou.android.screen.marcas.portrait;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.marcas.master.model.I_MarcasMasterModel;
import es.ulpgc.eite.showyou.android.screen.marcas.master.presenter.MarcasMasterPresenter;

public class PortraitMarcasMasterPresenter extends MarcasMasterPresenter {

    private I_MarcasMasterModel getMarcasMasterModel(){
        return (I_MarcasMasterModel) getScreenModel();
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen_MarcasMaster");

        changeRotation(ShowYouMediatorCode.MARCAS_MASTER_LANDSCAPE);
    }

    @Override
    public void setListPosition(int position) {

        getMarcasMasterModel().setPosition(position);

        debug("setListPosition_MarcasModel", "position", position);

        startNextScreenWithObserver(this, ShowYouMediatorCode.MARCAS_SELECT_PORTRAIT);
    }

}
