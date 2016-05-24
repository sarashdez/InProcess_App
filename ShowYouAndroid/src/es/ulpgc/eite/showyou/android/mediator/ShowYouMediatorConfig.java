package es.ulpgc.eite.showyou.android.mediator;

import es.ulpgc.eite.framework.core.mediator.I_MediatorSingleton;
import es.ulpgc.eite.framework.core.mediator.MediatorConfig;
import es.ulpgc.eite.framework.core.mediator.MediatorScreen;
import es.ulpgc.eite.framework.core.mediator.MediatorTransition;
import es.ulpgc.eite.showyou.android.screen.bio.landscape.LandscapeBioPresenter;
import es.ulpgc.eite.showyou.android.screen.bio.landscape.LandscapeBioView;
import es.ulpgc.eite.showyou.android.screen.bio.model.BioModel;
import es.ulpgc.eite.showyou.android.screen.bio.portrait.PortraitBioPresenter;
import es.ulpgc.eite.showyou.android.screen.bio.portrait.PortraitBioView;
import es.ulpgc.eite.showyou.android.screen.contacto.landscape.LandscapeContactoPresenter;
import es.ulpgc.eite.showyou.android.screen.contacto.landscape.LandscapeContactoView;
import es.ulpgc.eite.showyou.android.screen.contacto.model.ContactoModel;
import es.ulpgc.eite.showyou.android.screen.contacto.portrait.PortraitContactoPresenter;
import es.ulpgc.eite.showyou.android.screen.contacto.portrait.PortraitContactoView;
import es.ulpgc.eite.showyou.android.screen.eventos.landscape.LandscapeEventosPresenter;
import es.ulpgc.eite.showyou.android.screen.eventos.landscape.LandscapeEventosView;
import es.ulpgc.eite.showyou.android.screen.eventos.model.EventosModel;
import es.ulpgc.eite.showyou.android.screen.eventos.portrait.PortraitEventosPresenter;
import es.ulpgc.eite.showyou.android.screen.eventos.portrait.PortraitEventosView;
import es.ulpgc.eite.showyou.android.screen.marcas.master.landscape.LandscapeMarcasMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.marcas.master.landscape.LandscapeMarcasMasterView;
import es.ulpgc.eite.showyou.android.screen.marcas.master.model.MarcasMasterModel;
import es.ulpgc.eite.showyou.android.screen.marcas.master.portrait.PortraitMarcasMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.marcas.master.portrait.PortraitMarcasMasterView;
import es.ulpgc.eite.showyou.android.screen.noticias.landscape.LandscapeNoticiasPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.landscape.LandscapeNoticiasView;
import es.ulpgc.eite.showyou.android.screen.noticias.model.NoticiasModel;
import es.ulpgc.eite.showyou.android.screen.noticias.portrait.PortraitNoticiasPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.portrait.PortraitNoticiasView;
import es.ulpgc.eite.showyou.android.screen.media.landscape.LandscapeMediaPresenter;
import es.ulpgc.eite.showyou.android.screen.media.landscape.LandscapeMediaView;
import es.ulpgc.eite.showyou.android.screen.media.model.MediaModel;
import es.ulpgc.eite.showyou.android.screen.media.portrait.PortraitMediaPresenter;
import es.ulpgc.eite.showyou.android.screen.media.portrait.PortraitMediaView;
import es.ulpgc.eite.showyou.android.screen.startPage.landscape.LandscapeStartpagePresenter;
import es.ulpgc.eite.showyou.android.screen.startPage.landscape.LandscapeStartpageView;
import es.ulpgc.eite.showyou.android.screen.startPage.model.StartPageModel;
import es.ulpgc.eite.showyou.android.screen.startPage.portrait.PortraitStartpagePresenter;
import es.ulpgc.eite.showyou.android.screen.startPage.portrait.PortraitStartpageView;


public class ShowYouMediatorConfig extends MediatorConfig {

    public ShowYouMediatorConfig (I_MediatorSingleton mediator){
        super(mediator);
    }

    @Override
    public void setCustomConfig() {
        setShowYouConfig();
    }

    private void setShowYouConfig() {
        setShowYouScreenCollection();
        setShowYouTransitionCollection();
    }

    private void setShowYouScreenCollection() {

        //SCREEN STARTPAGE
        getScreens().add(new MediatorScreen(PortraitStartpageView.class, PortraitStartpagePresenter.class, StartPageModel.class));
        getScreens().add(new MediatorScreen(LandscapeStartpageView.class, LandscapeStartpagePresenter.class, StartPageModel.class));

        //SCREEN BIO
        getScreens().add(new MediatorScreen(PortraitBioView.class, PortraitBioPresenter.class, BioModel.class));
        getScreens().add(new MediatorScreen(LandscapeBioView.class, LandscapeBioPresenter.class, BioModel.class));

        //SCREEN MARCAS
        getScreens().add(new MediatorScreen(PortraitMarcasMasterView.class, PortraitMarcasMasterPresenter.class, MarcasMasterModel.class));
        getScreens().add(new MediatorScreen(LandscapeMarcasMasterView.class, LandscapeMarcasMasterPresenter.class, MarcasMasterModel.class));

        //SCREEN MEDIA
        getScreens().add(new MediatorScreen(PortraitMediaView.class, PortraitMediaPresenter.class, MediaModel.class));
        getScreens().add(new MediatorScreen(LandscapeMediaView.class, LandscapeMediaPresenter.class, MediaModel.class));

        //SCREEN EVENTOS
        getScreens().add(new MediatorScreen(PortraitEventosView.class, PortraitEventosPresenter.class, EventosModel.class));
        getScreens().add(new MediatorScreen(LandscapeEventosView.class, LandscapeEventosPresenter.class, EventosModel.class));

        //SCREEN NOTICIAS
        getScreens().add(new MediatorScreen(PortraitNoticiasView.class, PortraitNoticiasPresenter.class, NoticiasModel.class));
        getScreens().add(new MediatorScreen(LandscapeNoticiasView.class, LandscapeNoticiasPresenter.class, NoticiasModel.class));

        //SCREEN CONTACTO
        getScreens().add(new MediatorScreen(PortraitContactoView.class, PortraitContactoPresenter.class, ContactoModel.class));
        getScreens().add(new MediatorScreen(LandscapeContactoView.class, LandscapeContactoPresenter.class, ContactoModel.class));
    }

    private void setShowYouTransitionCollection() {

        //STARTPAGE
        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, LandscapeStartpageView.class, ShowYouMediatorCode.STARTPAGE_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, PortraitStartpageView.class, ShowYouMediatorCode.STARTPAGE_PORTRAIT));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitBioView.class, ShowYouMediatorCode.BIO_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeBioView.class, ShowYouMediatorCode.BIO_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitMarcasMasterView.class, ShowYouMediatorCode.MARCAS_MASTER_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeMarcasMasterView.class, ShowYouMediatorCode.MARCAS_MASTER_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitMediaView.class, ShowYouMediatorCode.MEDIA_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeMediaView.class, ShowYouMediatorCode.MEDIA_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitNoticiasView.class, ShowYouMediatorCode.NOTICIAS_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeNoticiasView.class, ShowYouMediatorCode.NOTICIAS_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitContactoView.class, ShowYouMediatorCode.CONTACTO_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeContactoView.class, ShowYouMediatorCode.CONTACTO_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitEventosView.class, ShowYouMediatorCode.EVENTOS_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeEventosView.class, ShowYouMediatorCode.EVENTOS_LANDSCAPE));


        //BIO
        getTransitions().add(new MediatorTransition(PortraitBioView.class, LandscapeBioView.class, ShowYouMediatorCode.BIO_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeBioView.class, PortraitBioView.class, ShowYouMediatorCode.BIO_PORTRAIT));

        //MARCAS
        getTransitions().add(new MediatorTransition(PortraitMarcasMasterView.class, LandscapeMarcasMasterView.class, ShowYouMediatorCode.MARCAS_MASTER_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeMarcasMasterView.class, PortraitMarcasMasterView.class, ShowYouMediatorCode.MARCAS_MASTER_PORTRAIT));

        //MEDIA
        getTransitions().add(new MediatorTransition(PortraitMediaView.class, LandscapeMediaView.class, ShowYouMediatorCode.MEDIA_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeMediaView.class, PortraitMediaView.class, ShowYouMediatorCode.MEDIA_PORTRAIT));

        //EVENTOS
        getTransitions().add(new MediatorTransition(PortraitEventosView.class, LandscapeEventosView.class, ShowYouMediatorCode.EVENTOS_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeEventosView.class, PortraitEventosView.class, ShowYouMediatorCode.EVENTOS_PORTRAIT));

        //NOTICIAS
        getTransitions().add(new MediatorTransition(PortraitNoticiasView.class, LandscapeNoticiasView.class, ShowYouMediatorCode.NOTICIAS_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeNoticiasView.class, PortraitNoticiasView.class, ShowYouMediatorCode.NOTICIAS_PORTRAIT));

        //CONTACTO
        getTransitions().add(new MediatorTransition(PortraitContactoView.class, LandscapeContactoView.class, ShowYouMediatorCode.BIO_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeContactoView.class, PortraitContactoView.class, ShowYouMediatorCode.BIO_PORTRAIT));

    }
}
