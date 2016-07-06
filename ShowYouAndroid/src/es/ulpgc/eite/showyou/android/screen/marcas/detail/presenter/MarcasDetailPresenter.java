package es.ulpgc.eite.showyou.android.screen.marcas.detail.presenter;

import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.database.marcas_db.MarcasData;
import es.ulpgc.eite.showyou.android.screen.marcas.detail.model.I_MarcasDetailModel;
import es.ulpgc.eite.showyou.android.screen.marcas.detail.view.I_MarcasDetailView;
import es.ulpgc.eite.showyou.android.screen.marcas.state.MarcasState;

public class MarcasDetailPresenter extends AndroidScreenPresenter implements I_MarcasDetailPresenter {

    private I_MarcasDetailView getMarcasDetailView(){
        return (I_MarcasDetailView) getScreenView();
    }

    private I_MarcasDetailModel getMarcasDetailModel(){
        return (I_MarcasDetailModel) getScreenModel();
    }

    @Override
    public void createScreen() {
        debug("createScreen_MarcasDetail");

        getMarcasDetailView().setMarcasDetailScreen();
        getMarcasDetailModel().setData(new MarcasData());
    }

    @Override
    public void backScreen() {
        debug("backScreen_MarcasDetail");
    }

    @Override
    public void resumeScreen() {
        debug("resumeScreen_MarcasDetail");

        getMarcasDetailView().setMarcasDetailData(getMarcasDetailModel().getData());
    }

    @Override
    public void pauseScreen() {
        debug("pauseScreen_MarcasDetail");
    }

    @Override
    public void rotateScreen() {
        debug("rotateScreen_MarcasDetail");
    }

    public void changeRotation(int code){

    }

    //ESTADOS
    @Override
    public void setScreenState(Class<? extends I_ScreenView> view, int code, I_ScreenState state) {
        debug("setScreenState_MarcasDetail", "code", code);

        MarcasState _state = (MarcasState) state;
        getMarcasDetailModel().setData( _state.getData());
    }

    @Override
    public I_ScreenState getScreenState() {
        debug("getScreenState_MarcasDetail");
        return null;
    }

    @Override
    public I_ScreenState getNextState(Class<? extends I_ScreenView> view, int code) {
        debug("getNextState_MarcasDetail", "code", code);
        return null;
    }


}
