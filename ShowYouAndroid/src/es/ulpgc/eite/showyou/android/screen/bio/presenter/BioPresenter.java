package es.ulpgc.eite.showyou.android.screen.bio.presenter;

import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.bio.view.I_BioView;


public class BioPresenter extends AndroidScreenPresenter implements I_BioPresenter {

    private I_BioView getBioView(){
        return (I_BioView) getScreenView();
    }

    @Override
    public void createScreen() {
        debug("createScreen_Bio");

        getBioView().setLayout();
    }

    @Override
    public void backScreen() {
        debug("backScreen_Bio");
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen_Bio");
    }

    @Override
    public void pauseScreen() {
        debug("pauseScreen_Bio");
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen_Bio");
    }

    public void changeRotation(int code){
        debug("changeRotation_Bio", "code", code);

        startNextScreenWithFinish(code, true);
    }

    @Override
    public void setScreenState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        debug("setScreenState_Bio");

    }

    @Override
    public I_ScreenState getScreenState() {
        debug("getScreenState_Bio");
        return null;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        debug("getNextState_Bio");
        return null;
    }
}
