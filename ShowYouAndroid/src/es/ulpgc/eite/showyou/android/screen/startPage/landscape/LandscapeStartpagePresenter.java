package es.ulpgc.eite.showyou.android.screen.startPage.landscape;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.startPage.presenter.StartPagePresenter;

public class LandscapeStartpagePresenter extends StartPagePresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.STARTPAGE_PORTRAIT);
    }

    @Override
    public void bioButtonClicked() {
        setBioBtnClicked(true);
        debug("buttonClicked", "clicked", getBioBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.BIO_LANDSCAPE);
    }

    @Override
    public void marcasButtonClicked() {
        setMarcasBtnClicked(true);
        debug("buttonClicked", "clicked", getMarcasBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.MARCAS_LANDSCAPE);
    }

    @Override
    public void serviciosButtonClicked() {
        setServiciosBtnClicked(true);
        debug("buttonClicked", "clicked", getServiciosBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.SERVICIOS_LANDSCAPE);
    }

    @Override
    public void noticiasButtonClicked() {
        setNoticiasBtnClicked(true);
        debug("buttonClicked", "clicked", getNoticiasBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.NOTICIAS_LANDSCAPE);
    }

    @Override
    public void contactoButtonClicked() {
        setContactoBtnClicked(true);
        debug("buttonClicked", "clicked", getContactoBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.CONTACTO_LANDSCAPE);
    }

}
