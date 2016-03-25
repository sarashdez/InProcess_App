package es.ulpgc.eite.showyou.android.screen.presenter;


import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.view.I_StartPageView;

public class StartPagePresenter extends AndroidScreenPresenter implements I_StartPagePresenter {

    private I_StartPageView getStartPageView() {
        return (I_StartPageView) getScreenView();
    }

    @Override
    public void createScreen() {
        debug("createScreen");

        getStartPageView().setLayout();
    }

    @Override
    public void backScreen() {

    }

    @Override
    public void resumeScreen() {

    }

    @Override
    public void pauseScreen() {

    }

    @Override
    public void rotateScreen() {

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
