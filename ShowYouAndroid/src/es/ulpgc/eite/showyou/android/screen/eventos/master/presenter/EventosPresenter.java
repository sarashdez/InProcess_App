package es.ulpgc.eite.showyou.android.screen.eventos.master.presenter;


import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.eventos.master.model.I_EventosModel;
import es.ulpgc.eite.showyou.android.screen.eventos.master.view.I_EventosView;

public abstract class EventosPresenter extends AndroidScreenPresenter implements I_EventosPresenter, I_ScreenObserver {

    private I_EventosView getEventosView(){
        return (I_EventosView) getScreenView();
    }

    //MASTER
    private I_EventosModel getEventosModel(){
        return (I_EventosModel) getScreenModel();
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
    public void setScreenState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        debug("setScreenState", "code", code);
    }

    @Override
    public I_ScreenState getScreenState() {
        debug("getScreenState");
        return null;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        debug("getNextState", "code", code);
        return null;
    }

    @Override
    public void setListPosition(int position) {

        getEventosModel().setPosition(position);

        debug("setListPosition", "position", position);
        debug("setListPosition", "data", getEventosModel().getData());

        startNextScreenWithObserver(this, ShowYouMediatorCode.EVENTOS_DETAIL_PORTRAIT);
    }

    public I_ScreenState updateObserverState(Class<? extends I_ScreenView> aClass, int i, I_ScreenState i_screenState) {
        return null;
    }


}
