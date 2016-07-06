package es.ulpgc.eite.showyou.android.screen.eventos.landscape;

import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.eventos.master.model.I_EventosMasterModel;
import es.ulpgc.eite.showyou.android.screen.eventos.master.presenter.EventosMasterPresenter;


public class LandEventosMasterPresenter extends EventosMasterPresenter {

    private I_EventosMasterModel getEventosModel(){
        return (I_EventosMasterModel) getScreenModel();
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.EVENTOS_PORTRAIT);
    }

    @Override
    public void setListPosition(int position) {

        getEventosModel().setPosition(position);

        debug("setListPosition_LandEventosDetail", "position", position);
        debug("setListPosition_LandEventosDetail", "data", getEventosModel().getData());

        startNextScreenWithObserver(this, ShowYouMediatorCode.EVENTOS_SELECT_LANDSCAPE);
    }

}
