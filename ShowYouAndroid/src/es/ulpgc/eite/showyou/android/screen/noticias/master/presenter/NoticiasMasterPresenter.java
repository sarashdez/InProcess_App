package es.ulpgc.eite.showyou.android.screen.noticias.master.presenter;


import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.master.presenter.MasterPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.master.model.I_NoticiasMasterModel;
import es.ulpgc.eite.showyou.android.screen.noticias.master.view.I_NoticiasMasterView;
import es.ulpgc.eite.showyou.android.screen.noticias.state.NoticiasState;

public abstract class NoticiasMasterPresenter extends MasterPresenter implements I_NoticiasMasterPresenter, I_ScreenObserver {

    private I_NoticiasMasterView getNoticiasView(){
        return (I_NoticiasMasterView) getScreenView();
    }
    private I_NoticiasMasterModel getNoticiasModel(){
        return (I_NoticiasMasterModel) getScreenModel();
    }

    @Override
    public void createScreen() {
        debug("createScreen");

        getNoticiasView().setNoticiasScreen();
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen_NoticiasMaster");

        getNoticiasView().setNoticiasCollection(getNoticiasModel().getCollection());
        getNoticiasView().setListPosition(getNoticiasModel().getPosition());
    }

    //ESTADOS
    @Override
    public void setScreenState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        debug("setScreenState", "code", code);
        if(state != null) {
            NoticiasState _state = (NoticiasState) state;
            getNoticiasModel().setPosition(_state.getPosition());
        }
    }

    @Override
    public I_ScreenState getScreenState() {
        debug("getScreenState");
        NoticiasState state = new NoticiasState(getNoticiasModel().getPosition());
        return state;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        debug("getNextState", "code", code);

        NoticiasState state = new NoticiasState(getNoticiasModel().getData());
        debug("getNextState", "data_nombre", state.getData().getNombre());
        return state;
    }

    @Override
    public I_ScreenState updateObserverState(Class<? extends I_ScreenView> aClass, int i, I_ScreenState i_screenState) {
        return null;
    }
}
