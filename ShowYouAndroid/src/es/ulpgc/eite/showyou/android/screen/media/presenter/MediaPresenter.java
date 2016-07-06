package es.ulpgc.eite.showyou.android.screen.media.presenter;


import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.media.view.I_MediaView;


public class MediaPresenter extends AndroidScreenPresenter implements I_MediaPresenter {

    private I_MediaView getMediaView(){
        return (I_MediaView) getScreenView();
    }

    @Override
    public void createScreen() {
        debug("createScreen_Media");

        getMediaView().setLayout();
        getMediaView().setListener();
    }

    @Override
    public void backScreen() {
        debug("backScreen_Media");
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen_Media");
    }

    @Override
    public void pauseScreen() {
        debug("pauseScreen_Media");
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen_Media");
    }

    public void changeRotation(int code){
        debug("changeRotation_Media", "code", code);

        startNextScreenWithFinish(code, true);
    }

    //ESTADOS
    @Override
    public void setScreenState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        debug("setScreenState_Media");
    }

    @Override
    public I_ScreenState getScreenState() {
        debug("getScreenState_Media");
        return null;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        debug("getNextState_Media");
        return null;
    }


}
