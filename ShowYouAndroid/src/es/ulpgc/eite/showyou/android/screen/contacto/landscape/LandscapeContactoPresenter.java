package es.ulpgc.eite.showyou.android.screen.contacto.landscape;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.contacto.presenter.ContactoPresenter;

public class LandscapeContactoPresenter extends ContactoPresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.CONTACTO_PORTRAIT);
    }

    @Override
    public void enviarCorreoButtonClicked() {
        setEnviarCorreoBtnClicked(true);
        debug("EnviarCorreoButtonClicked", "clicked", getEnviarCorreoBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.CORREO_LANDSCAPE);
    }

}
