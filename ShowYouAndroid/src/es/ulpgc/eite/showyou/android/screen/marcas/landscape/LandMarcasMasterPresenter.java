package es.ulpgc.eite.showyou.android.screen.marcas.landscape;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.marcas.master.model.I_MarcasMasterModel;
import es.ulpgc.eite.showyou.android.screen.marcas.master.presenter.MarcasMasterPresenter;

public class LandMarcasMasterPresenter extends MarcasMasterPresenter  {

    private I_MarcasMasterModel getMarcasMasterModel(){
        return (I_MarcasMasterModel) getScreenModel();
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.MARCAS_MASTER_PORTRAIT);
    }

    @Override
    public void setListPosition(int position) {

        getMarcasMasterModel().setPosition(position);

        debug("setListPosition", "position", position);
        debug("setListPosition", "data", getMarcasMasterModel().getData());

        startNextScreenWithObserver(this, ShowYouMediatorCode.MARCAS_SELECT_LANDSCAPE);
    }

}
