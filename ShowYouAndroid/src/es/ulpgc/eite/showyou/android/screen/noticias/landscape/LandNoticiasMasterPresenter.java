package es.ulpgc.eite.showyou.android.screen.noticias.landscape;

import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.noticias.master.model.I_NoticiasMasterModel;
import es.ulpgc.eite.showyou.android.screen.noticias.master.presenter.NoticiasMasterPresenter;

public class LandNoticiasMasterPresenter extends NoticiasMasterPresenter {

    private I_NoticiasMasterModel getNoticiasModel(){
        return (I_NoticiasMasterModel) getScreenModel();
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen_NoticiasDetail");

        changeRotation(ShowYouMediatorCode.NOTICIAS_MASTER_PORTRAIT);
    }

    @Override
    public void setListPosition(int position) {

        getNoticiasModel().setPosition(position);

        debug("setListPosition_NoticiasDetail", "position", position);

        startNextScreenWithObserver(this, ShowYouMediatorCode.NOTICIAS_SELECT_LANDSCAPE);
    }
}
