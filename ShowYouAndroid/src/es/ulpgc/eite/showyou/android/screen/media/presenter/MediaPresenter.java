package es.ulpgc.eite.showyou.android.screen.media.presenter;


import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import es.ulpgc.eite.framework.android.AndroidScreenPresenter;
import es.ulpgc.eite.framework.android.I_AndroidMediatorSingleton;
import es.ulpgc.eite.framework.core.screen.I_ScreenState;
import es.ulpgc.eite.framework.core.screen.I_ScreenView;
import es.ulpgc.eite.showyou.android.screen.media.view.I_MediaView;

import java.util.List;

public class MediaPresenter extends AndroidScreenPresenter implements I_MediaPresenter {

    private I_MediaView getMediaView(){
        return (I_MediaView) getScreenView();
    }

    @Override
    public void createScreen() {
        debug("createScreen");

        getMediaView().setLayout();
        getMediaView().setListener();
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

    //ABRIR NAVEGADOR CON LINKS
    //Facebook

//    private Boolean _facebookBtnClicked;
//    public Boolean getFacebookBtnClicked() {
//        return _facebookBtnClicked;
//    }
//    public void setFacebookBtnClicked(Boolean btnClicked) {
//        _facebookBtnClicked = btnClicked;
//    }
//
//    @Override
//    public void facebookButtonClicked() {
//        setFacebookBtnClicked(true);
//
//        debug("facebookButtonClicked", "clicked", getFacebookBtnClicked());
//
//        String facebookPage = "InProcessCompany";
//        final String urlFb = "fb://page/"+ facebookPage;
//
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse(urlFb));
//
//        /*
//        final PackageManager packageManager = getPackageManager();
//        List<ResolveInfo> list =
//                packageManager.queryIntentActivities(intent,
//                        PackageManager.MATCH_DEFAULT_ONLY);
//        if (list.size() == 0) {*/
//            final String urlBrowser = "https://www.facebook.com/pages/"+facebookPage;
//            intent.setData(Uri.parse(urlBrowser));
//
//        getPlatformMediator().getContext().startActivity(intent);
//
//    }
    /*
    public final void launchFacebook() {
        final String urlFb = "fb://page/"+yourpageid;
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlFb));

        // If a Facebook app is installed, use it. Otherwise, launch
        // a browser
        final PackageManager packageManager = getPackageManager();
        List<ResolveInfo> list =
                packageManager.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        if (list.size() == 0) {
            final String urlBrowser = "https://www.facebook.com/pages/"+pageid;
            intent.setData(Uri.parse(urlBrowser));
        }

        startActivity(intent);
    }
    */

}
