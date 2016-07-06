package es.ulpgc.eite.showyou.android.screen.eventos.portrait;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.eventos.master.model.I_EventosMasterModel;
import es.ulpgc.eite.showyou.android.screen.eventos.master.presenter.EventosMasterPresenter;

public class PortraitEventosMasterPresenter extends EventosMasterPresenter {

    private I_EventosMasterModel getEventosModel(){
        return (I_EventosMasterModel) getScreenModel();
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen_EventosMaster");

        changeRotation(ShowYouMediatorCode.EVENTOS_LANDSCAPE);
    }

    @Override
    public void setListPosition(int position) {

        getEventosModel().setPosition(position);

        debug("setListPosition_EventosMaster", "position", position);
        debug("setListPosition_EventosMaster", "data", getEventosModel().getData());

        startNextScreenWithObserver(this, ShowYouMediatorCode.EVENTOS_SELECT_PORTRAIT);
    }

}
