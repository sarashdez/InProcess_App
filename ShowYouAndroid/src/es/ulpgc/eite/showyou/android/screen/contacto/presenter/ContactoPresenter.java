package es.ulpgc.eite.showyou.android.screen.contacto.presenter;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.contacto.view.I_ContactoView;


public class ContactoPresenter extends AndroidScreenPresenter implements I_ContactoPresenter {

    private I_ContactoView getContactoView(){
        return (I_ContactoView) getScreenView();
    }

    @Override
    public void createScreen() {
        debug("createScreen");

        getContactoView().setLayout();

    }

    @Override
    public void backScreen() {
        debug("backScreen");
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen");
    }

    @Override
    public void pauseScreen() {
        debug("pauseScreen");
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen");
    }

    public void changeRotation(int code){
        debug("changeRotation", "code", code);

        startNextScreenWithFinish(code, true);
    }

    //Estados
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
