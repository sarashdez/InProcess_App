package es.ulpgc.eite.showyou.android.screen.marcas.master.presenter;


import es.ulpgc.eite.framework.core.screen.I_ScreenObserver;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.marcas.master.model.I_MarcasMasterModel;
import es.ulpgc.eite.showyou.android.screen.marcas.master.view.I_MarcasMasterView;
import es.ulpgc.eite.showyou.android.screen.marcas.state.MarcasState;
import es.ulpgc.eite.showyou.android.screen.master.presenter.MasterPresenter;

public abstract class MarcasMasterPresenter extends MasterPresenter implements I_MarcasMasterPresenter, I_ScreenObserver {

    private I_MarcasMasterView getMarcasView(){
        return (I_MarcasMasterView) getScreenView();
    }
    private I_MarcasMasterModel getMarcasModel(){
        return (I_MarcasMasterModel) getScreenModel();
    }

    @Override
    public void createScreen() {
        debug("createScreen_MarcasMaster");

        getMarcasView().setMarcasScreen();
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen_MarcasMaster");

        getMarcasView().setMarcasCollection(getMarcasModel().getCollection());
        getMarcasView().setListPosition(getMarcasModel().getPosition());
    }

    //ESTADOS
    @Override
    public void setScreenState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        debug("setScreenState_MarcasMaster", "code", code);
        if(state != null) {
            MarcasState _state = (MarcasState) state;
            getMarcasModel().setPosition(_state.getPosition());
        }
    }

    @Override
    public I_ScreenState getScreenState() {
        debug("getScreenState_MarcasMaster");
        MarcasState state = new MarcasState(getMarcasModel().getPosition());
        return state;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        debug("getNextState_MarcasMaster", "code", code);

        MarcasState state = new MarcasState(getMarcasModel().getData());
        return state;
    }

    @Override
    public I_ScreenState updateObserverState(Class<? extends I_ScreenView> aClass, int i, I_ScreenState i_screenState) {
        debug("updateObserverState_MarcasMaster");
        return null;
    }
}
