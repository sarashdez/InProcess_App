package es.ulpgc.eite.showyou.android.screen.eventos.landscape;

import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.eventos.master.model.I_EventosModel;
import es.ulpgc.eite.showyou.android.screen.eventos.master.presenter.EventosPresenter;


public class LandEventosMasterPresenter extends EventosPresenter {

    private I_EventosModel getEventosModel(){
        return (I_EventosModel) getScreenModel();
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.EVENTOS_PORTRAIT);
    }

    @Override
    public void setListPosition(int position) {

        getEventosModel().setPosition(position);

        debug("setListPosition", "position", position);
        debug("setListPosition", "data", getEventosModel().getData());

        startNextScreenWithObserver(this, ShowYouMediatorCode.EVENTOS_SELECT_LANDSCAPE);
    }

}
