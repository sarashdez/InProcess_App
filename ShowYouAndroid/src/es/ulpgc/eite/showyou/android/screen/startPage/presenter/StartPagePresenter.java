package es.ulpgc.eite.showyou.android.screen.startPage.presenter;


import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.startPage.view.I_StartPageView;

public class StartPagePresenter extends AndroidScreenPresenter implements I_StartPagePresenter, I_ScreenObserver {

    private I_StartPageView getStartPageView() {
        return (I_StartPageView) getScreenView();
    }

    @Override
    public void createScreen() {
        debug("createScreen");

        getStartPageView().setLayout();
        getStartPageView().setListener();
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


    //ESTADOS
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

    @Override
    public I_ScreenState updateObserverState(Class<? extends I_ScreenView> view, int code, I_ScreenState i_screenState) {
        return null;
    }


    //BUTTON_CLICKED()
    private Boolean _marcasBtnClicked;
    public Boolean getMarcasBtnClicked() {
        return _marcasBtnClicked;
    }
    public void setMarcasBtnClicked(Boolean btnClicked) {
        _marcasBtnClicked = btnClicked;
    }

    @Override
    public void marcasButtonClicked() {

    }


    private Boolean _bioBtnClicked;
    public Boolean getBioBtnClicked() {
        return _bioBtnClicked;
    }
    public void setBioBtnClicked(Boolean btnClicked) {
        _bioBtnClicked = btnClicked;
    }

    @Override
    public void bioButtonClicked() {

    }

    private Boolean _noticiasBtnClicked;
    public Boolean getNoticiasBtnClicked() {
        return _noticiasBtnClicked;
    }
    public void setNoticiasBtnClicked(Boolean btnClicked) {
        _noticiasBtnClicked = btnClicked;
    }

    @Override
    public void noticiasButtonClicked() {

    }

    private Boolean _eventosBtnClicked;
    public Boolean getEventosBtnClicked() {
        return _eventosBtnClicked;
    }
    public void setEventosBtnClicked(Boolean btnClicked) {
        _eventosBtnClicked = btnClicked;
    }

    @Override
    public void eventosButtonClicked() {

    }

    private Boolean _mediaBtnClicked;
    public Boolean getMediaBtnClicked() {
        return _mediaBtnClicked;
    }
    public void setMediaBtnClicked(Boolean btnClicked) {
        _mediaBtnClicked = btnClicked;
    }
    @Override
    public void mediaButtonClicked() {

    }

    private Boolean _contactoBtnClicked;
    public Boolean getContactoBtnClicked() {
        return _contactoBtnClicked;
    }
    public void setContactoBtnClicked(Boolean btnClicked) {
        _contactoBtnClicked = btnClicked;
    }

    @Override
    public void contactoButtonClicked() {

    }


}
