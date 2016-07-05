package es.ulpgc.eite.showyou.android.screen.eventos.master.presenter;


import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.eventos.master.model.I_EventosMasterModel;
import es.ulpgc.eite.showyou.android.screen.eventos.master.view.I_EventosMasterView;
import es.ulpgc.eite.showyou.android.screen.eventos.state.EventosState;

public abstract class EventosMasterPresenter extends AndroidScreenPresenter implements I_EventosMasterPresenter, I_ScreenObserver {

    private I_EventosMasterView getEventosView(){
        return (I_EventosMasterView) getScreenView();
    }
    private I_EventosMasterModel getEventosModel(){
        return (I_EventosMasterModel) getScreenModel();
    }

    @Override
    public void createScreen() {
        debug("createScreen");

        getEventosView().setEventosScreen();
    }

    @Override
    public void backScreen() {
        debug("backScreen_Eventos");
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen_Eventos");

        getEventosView().setEventosCollection(getEventosModel().getCollection());
        getEventosView().setListPosition(getEventosModel().getPosition());
    }

    @Override
    public void pauseScreen() {
        debug("pauseScreen_Eventos");
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen_Eventos");
    }

    public void changeRotation(int code){
        debug("changeRotation", "code", code);

        startNextScreenWithFinish(code, true);
    }

    @Override
    public void setListPosition(int position) {

    }

    //ESTADOS
    @Override
    public void setScreenState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        debug("setScreenState", "code", code);
        if(state != null) {
            EventosState _state = (EventosState) state;
            getEventosModel().setPosition(_state.getPosition());
        }
    }

    @Override
    public I_ScreenState getScreenState() {
        debug("getScreenState");
        EventosState state = new EventosState(getEventosModel().getPosition());
        return state;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        debug("getNextState", "code", code);

        EventosState state = new EventosState(getEventosModel().getData());
        debug("getNextState", "data_nombre", state.getData().getNombre());
        return state;
    }


    public I_ScreenState updateObserverState(Class<? extends I_ScreenView> aClass, int i, I_ScreenState i_screenState) {
        return null;
    }

}

