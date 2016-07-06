package es.ulpgc.eite.showyou.android.screen.noticias.portrait;

import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.noticias.master.model.I_NoticiasMasterModel;
import es.ulpgc.eite.showyou.android.screen.noticias.master.presenter.NoticiasMasterPresenter;


public class PortraitNoticiasMasterPresenter extends NoticiasMasterPresenter {

    private I_NoticiasMasterModel getNoticiasMasterModel(){
        return (I_NoticiasMasterModel) getScreenModel();
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen_NoticiasMaster");

        changeRotation(ShowYouMediatorCode.NOTICIAS_MASTER_LANDSCAPE);
    }

    @Override
    public void setListPosition(int position) {

        getNoticiasMasterModel().setPosition(position);

        debug("setListPosition_NoticiasMaster", "position", position);

        startNextScreenWithObserver(this, ShowYouMediatorCode.NOTICIAS_SELECT_PORTRAIT);
    }
}
