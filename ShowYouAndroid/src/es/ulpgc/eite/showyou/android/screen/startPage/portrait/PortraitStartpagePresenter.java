package es.ulpgc.eite.showyou.android.screen.startPage.portrait;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.startPage.presenter.StartPagePresenter;

public class PortraitStartpagePresenter extends StartPagePresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen_Startpage");

        changeRotation(ShowYouMediatorCode.STARTPAGE_LANDSCAPE);
    }

    @Override
    public void bioButtonClicked() {
        setBioBtnClicked(true);
        debug("bioButtonClicked", "clicked", getBioBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.BIO_PORTRAIT);
    }

    @Override
    public void marcasButtonClicked() {
        setMarcasBtnClicked(true);
        debug("marcasButtonClicked", "clicked", getMarcasBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.MARCAS_MASTER_PORTRAIT);
    }

    @Override
    public void eventosButtonClicked() {
        setEventosBtnClicked(true);
        debug("eventosButtonClicked", "clicked", getEventosBtnClicked());

        startNextScreenWithFinish( ShowYouMediatorCode.EVENTOS_PORTRAIT, false);
    }

    @Override
    public void mediaButtonClicked() {
        setMediaBtnClicked(true);
        debug("mediaButtonClicked", "clicked", getMediaBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.MEDIA_PORTRAIT);
    }

    @Override
    public void noticiasButtonClicked() {
        setNoticiasBtnClicked(true);
        debug("noticiasButtonClicked", "clicked", getNoticiasBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.NOTICIAS_MASTER_PORTRAIT);
    }

    @Override
    public void contactoButtonClicked() {
        setContactoBtnClicked(true);
        debug("contactoButtonClicked", "clicked", getContactoBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.CONTACTO_PORTRAIT);
    }



}
