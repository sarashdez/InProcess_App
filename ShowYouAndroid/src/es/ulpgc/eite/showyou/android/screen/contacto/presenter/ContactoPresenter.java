package es.ulpgc.eite.showyou.android.screen.contacto.presenter;


import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.contacto.view.I_ContactoView;


public class ContactoPresenter extends AndroidScreenPresenter implements I_ContactoPresenter, I_ScreenObserver {

    private I_ContactoView getContactoView(){
        return (I_ContactoView) getScreenView();
    }

    @Override
    public void createScreen() {
        debug("createScreen_Contacto");

        getContactoView().setLayout();
        getContactoView().setListener();

    }

    @Override
    public void backScreen() {
        debug("backScreen_Contacto");
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen_Contacto");
    }

    @Override
    public void pauseScreen() {
        debug("pauseScreen_Contacto");
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen_Contacto");
    }

    public void changeRotation(int code){
        debug("changeRotation_Contacto", "code", code);

        startNextScreenWithFinish(code, true);
    }

    //Estados
    @Override
    public void setScreenState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        debug("setScreenState_Contacto");

    }

    @Override
    public I_ScreenState getScreenState() {
        debug("getScreenState_Contacto");
        return null;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        debug("getNextState_Contacto");
        return null;
    }

    @Override
    public I_ScreenState updateObserverState(Class<? extends I_ScreenView> aClass, int i, I_ScreenState i_screenState) {
        debug("updateObserverState_Contacto");
        return null;
    }

    //EnviarCorreo Button
    private Boolean _enviarCorreoBtnClicked;
    public Boolean getEnviarCorreoBtnClicked() {
        return _enviarCorreoBtnClicked;
    }
    public void setEnviarCorreoBtnClicked(Boolean btnClicked) {
        _enviarCorreoBtnClicked = btnClicked;
    }

    @Override
    public void enviarCorreoButtonClicked() {

    }



}
