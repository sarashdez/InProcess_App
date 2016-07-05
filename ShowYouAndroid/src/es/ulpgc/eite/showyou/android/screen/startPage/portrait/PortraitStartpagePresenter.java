package es.ulpgc.eite.showyou.android.screen.startPage.portrait;


import es.ulpgc.eite.showyou.android.mediator.ShowYouMediatorCode;
import es.ulpgc.eite.showyou.android.screen.startPage.presenter.StartPagePresenter;

public class PortraitStartpagePresenter extends StartPagePresenter {

    @Override
    public void rotateScreen() {
        debug("rotateScreen");

        changeRotation(ShowYouMediatorCode.STARTPAGE_LANDSCAPE);
    }

    @Override
    public void bioButtonClicked() {
        setBioBtnClicked(true);
        debug("buttonClicked", "clicked", getBioBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.BIO_PORTRAIT);
    }

    @Override
    public void marcasButtonClicked() {
        setMarcasBtnClicked(true);
        debug("buttonClicked", "clicked", getMarcasBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.MARCAS_MASTER_PORTRAIT);
    }

    @Override
    public void eventosButtonClicked() {
        setEventosBtnClicked(true);
        debug("buttonClicked", "clicked", getEventosBtnClicked());

        startNextScreenWithFinish( ShowYouMediatorCode.EVENTOS_PORTRAIT, false);
    }

    @Override
    public void mediaButtonClicked() {
        setMediaBtnClicked(true);
        debug("buttonClicked", "clicked", getMediaBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.MEDIA_PORTRAIT);
    }

    @Override
    public void noticiasButtonClicked() {
        setNoticiasBtnClicked(true);
        debug("buttonClicked", "clicked", getNoticiasBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.NOTICIAS_MASTER_PORTRAIT);
    }

    @Override
    public void contactoButtonClicked() {
        setContactoBtnClicked(true);
        debug("buttonClicked", "clicked", getContactoBtnClicked());

        startNextScreenWithObserver(this, ShowYouMediatorCode.CONTACTO_PORTRAIT);
    }



}
