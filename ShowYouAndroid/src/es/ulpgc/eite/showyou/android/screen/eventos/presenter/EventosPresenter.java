package es.ulpgc.eite.showyou.android.screen.eventos.presenter;


import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.eventos.model.I_EventosModel;
import es.ulpgc.eite.showyou.android.screen.eventos.view.I_EventosView;

public class EventosPresenter extends AndroidScreenPresenter implements I_EventosPresenter {

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

        getEventosView().setLayout();
    }

    @Override
    public void backScreen() {
        debug("backScreen_Eventos");
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen_Eventos");
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

    }

    @Override
    public I_ScreenState getScreenState() {
        return null;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        return null;
    }
}
