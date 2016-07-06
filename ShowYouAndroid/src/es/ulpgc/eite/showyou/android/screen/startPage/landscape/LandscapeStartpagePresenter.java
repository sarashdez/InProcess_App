package es.ulpgc.eite.showyou.android.screen.startPage.landscape;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.startPage.presenter.StartPagePresenter;

public class LandscapeStartpagePresenter extends StartPagePresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen_Startpage");

        changeRotation(ShowYouMediatorCode.STARTPAGE_PORTRAIT);
    }

    @Override
    public void bioButtonClicked() {
        setBioBtnClicked(true);
        debug("bioButtonClicked", "clicked", getBioBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.BIO_LANDSCAPE);
    }

    @Override
    public void marcasButtonClicked() {
        setMarcasBtnClicked(true);
        debug("marcasButtonClicked", "clicked", getMarcasBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.MARCAS_MASTER_LANDSCAPE);
    }

    @Override
    public void mediaButtonClicked() {
        setMediaBtnClicked(true);
        debug("mediaButtonClicked", "clicked", getMediaBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.MEDIA_LANDSCAPE);
    }

    @Override
    public void eventosButtonClicked() {
        setEventosBtnClicked(true);
        debug("eventosButtonClicked", "clicked", getEventosBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.EVENTOS_LANDSCAPE);
    }

    @Override
    public void noticiasButtonClicked() {
        setNoticiasBtnClicked(true);
        debug("noticiasBbuttonClicked", "clicked", getNoticiasBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.NOTICIAS_MASTER_LANDSCAPE);
    }

    @Override
    public void contactoButtonClicked() {
        setContactoBtnClicked(true);
        debug("contactoButtonClicked", "clicked", getContactoBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.CONTACTO_LANDSCAPE);
    }

}
