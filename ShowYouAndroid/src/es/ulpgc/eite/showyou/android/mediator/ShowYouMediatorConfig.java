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
import es.ulpgc.eite.showyou.android.screen.database.ShowYouDatabase;
import es.ulpgc.eite.showyou.android.screen.eventos.detail.model.EventosDetailModel;
import es.ulpgc.eite.showyou.android.screen.eventos.landscape.LandEventosDetailPresenter;
import es.ulpgc.eite.showyou.android.screen.eventos.landscape.LandEventosDetailView;
import es.ulpgc.eite.showyou.android.screen.eventos.landscape.LandEventosMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.eventos.landscape.LandEventosMasterView;
import es.ulpgc.eite.showyou.android.screen.eventos.master.model.EventosMasterModel;
import es.ulpgc.eite.showyou.android.screen.eventos.portrait.PortraitEventosDetailPresenter;
import es.ulpgc.eite.showyou.android.screen.eventos.portrait.PortraitEventosDetailView;
import es.ulpgc.eite.showyou.android.screen.eventos.portrait.PortraitEventosMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.eventos.portrait.PortraitEventosMasterView;
import es.ulpgc.eite.showyou.android.screen.marcas.detail.model.MarcasDetailModel;
import es.ulpgc.eite.showyou.android.screen.marcas.landscape.LandMarcasDetailPresenter;
import es.ulpgc.eite.showyou.android.screen.marcas.landscape.LandMarcasDetailView;
import es.ulpgc.eite.showyou.android.screen.marcas.landscape.LandMarcasMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.marcas.landscape.LandMarcasMasterView;
import es.ulpgc.eite.showyou.android.screen.marcas.master.model.MarcasMasterModel;
import es.ulpgc.eite.showyou.android.screen.marcas.portrait.PortraitMarcasDetailPresenter;
import es.ulpgc.eite.showyou.android.screen.marcas.portrait.PortraitMarcasDetailView;
import es.ulpgc.eite.showyou.android.screen.marcas.portrait.PortraitMarcasMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.marcas.portrait.PortraitMarcasMasterView;
import es.ulpgc.eite.showyou.android.screen.noticias.detail.model.NoticiasDetailModel;
import es.ulpgc.eite.showyou.android.screen.noticias.landscape.LandNoticiasDetailPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.landscape.LandNoticiasDetailView;
import es.ulpgc.eite.showyou.android.screen.noticias.landscape.LandNoticiasMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.landscape.LandscapeNoticiasMasterView;
import es.ulpgc.eite.showyou.android.screen.noticias.master.model.NoticiasMasterModel;
import es.ulpgc.eite.showyou.android.screen.noticias.portrait.PortraitNoticiasDetailPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.portrait.PortraitNoticiasDetailView;
import es.ulpgc.eite.showyou.android.screen.noticias.portrait.PortraitNoticiasMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.portrait.PortraitNoticiasMasterView;
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
        getScreens().add(new MediatorScreen(PortraitMarcasMasterView.class, PortraitMarcasMasterPresenter.class, MarcasMasterModel.class, ShowYouDatabase.class));
        getScreens().add(new MediatorScreen(LandMarcasMasterView.class, LandMarcasMasterPresenter.class, MarcasMasterModel.class, ShowYouDatabase.class));
        getScreens().add(new MediatorScreen(PortraitMarcasDetailView.class, PortraitMarcasDetailPresenter.class, MarcasDetailModel.class, ShowYouDatabase.class));
        getScreens().add(new MediatorScreen(LandMarcasDetailView.class, LandMarcasDetailPresenter.class, MarcasDetailModel.class, ShowYouDatabase.class));

        //SCREEN MEDIA
        getScreens().add(new MediatorScreen(PortraitMediaView.class, PortraitMediaPresenter.class, MediaModel.class));
        getScreens().add(new MediatorScreen(LandscapeMediaView.class, LandscapeMediaPresenter.class, MediaModel.class));

        //SCREEN EVENTOS
        getScreens().add(new MediatorScreen(PortraitEventosMasterView.class, PortraitEventosMasterPresenter.class, EventosMasterModel.class, ShowYouDatabase.class));
        getScreens().add(new MediatorScreen(LandEventosMasterView.class, LandEventosMasterPresenter.class, EventosMasterModel.class, ShowYouDatabase.class));
        getScreens().add(new MediatorScreen(PortraitEventosDetailView.class, PortraitEventosDetailPresenter.class, EventosDetailModel.class, ShowYouDatabase.class));
        getScreens().add(new MediatorScreen(LandEventosDetailView.class, LandEventosDetailPresenter.class, EventosDetailModel.class, ShowYouDatabase.class));

        //SCREEN NOTICIAS
        getScreens().add(new MediatorScreen(PortraitNoticiasMasterView.class, PortraitNoticiasMasterPresenter.class, NoticiasMasterModel.class, ShowYouDatabase.class));
        getScreens().add(new MediatorScreen(LandscapeNoticiasMasterView.class, LandNoticiasMasterPresenter.class, NoticiasMasterModel.class, ShowYouDatabase.class));
        getScreens().add(new MediatorScreen(PortraitNoticiasDetailView.class, PortraitNoticiasDetailPresenter.class, NoticiasDetailModel.class, ShowYouDatabase.class));
        getScreens().add(new MediatorScreen(LandNoticiasDetailView.class, LandNoticiasDetailPresenter.class, NoticiasDetailModel.class, ShowYouDatabase.class));

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
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandMarcasMasterView.class, ShowYouMediatorCode.MARCAS_MASTER_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitMediaView.class, ShowYouMediatorCode.MEDIA_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeMediaView.class, ShowYouMediatorCode.MEDIA_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitNoticiasMasterView.class, ShowYouMediatorCode.NOTICIAS_MASTER_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeNoticiasMasterView.class, ShowYouMediatorCode.NOTICIAS_MASTER_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitContactoView.class, ShowYouMediatorCode.CONTACTO_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeContactoView.class, ShowYouMediatorCode.CONTACTO_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitEventosMasterView.class, ShowYouMediatorCode.EVENTOS_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandEventosMasterView.class, ShowYouMediatorCode.EVENTOS_LANDSCAPE));


        //BIO
        getTransitions().add(new MediatorTransition(PortraitBioView.class, LandscapeBioView.class, ShowYouMediatorCode.BIO_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeBioView.class, PortraitBioView.class, ShowYouMediatorCode.BIO_PORTRAIT));

        //MARCAS
        getTransitions().add(new MediatorTransition(PortraitMarcasMasterView.class, LandMarcasMasterView.class, ShowYouMediatorCode.MARCAS_MASTER_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandMarcasMasterView.class, PortraitMarcasMasterView.class, ShowYouMediatorCode.MARCAS_MASTER_PORTRAIT));

        getTransitions().add(new MediatorTransition(PortraitMarcasMasterView.class, PortraitMarcasDetailView.class, ShowYouMediatorCode.MARCAS_SELECT_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandMarcasMasterView.class, LandMarcasDetailView.class, ShowYouMediatorCode.MARCAS_SELECT_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitMarcasDetailView.class, LandMarcasDetailView.class, ShowYouMediatorCode.MARCAS_SELECT_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandMarcasDetailView.class, PortraitMarcasDetailView.class, ShowYouMediatorCode.MARCAS_SELECT_PORTRAIT));

        //MEDIA
        getTransitions().add(new MediatorTransition(PortraitMediaView.class, LandscapeMediaView.class, ShowYouMediatorCode.MEDIA_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeMediaView.class, PortraitMediaView.class, ShowYouMediatorCode.MEDIA_PORTRAIT));

        //EVENTOS
        getTransitions().add(new MediatorTransition(PortraitEventosMasterView.class, LandEventosMasterView.class, ShowYouMediatorCode.EVENTOS_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandEventosMasterView.class, PortraitEventosMasterView.class, ShowYouMediatorCode.EVENTOS_PORTRAIT));

        getTransitions().add(new MediatorTransition(PortraitEventosMasterView.class, PortraitEventosDetailView.class, ShowYouMediatorCode.EVENTOS_SELECT_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandEventosMasterView.class, LandEventosDetailView.class, ShowYouMediatorCode.EVENTOS_SELECT_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitEventosDetailView.class, LandEventosDetailView.class, ShowYouMediatorCode.EVENTOS_SELECT_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandEventosDetailView.class, PortraitEventosDetailView.class, ShowYouMediatorCode.EVENTOS_SELECT_PORTRAIT));

        //NOTICIAS
        getTransitions().add(new MediatorTransition(PortraitNoticiasMasterView.class, LandscapeNoticiasMasterView.class, ShowYouMediatorCode.NOTICIAS_MASTER_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeNoticiasMasterView.class, PortraitNoticiasMasterView.class, ShowYouMediatorCode.NOTICIAS_MASTER_PORTRAIT));

        getTransitions().add(new MediatorTransition(PortraitNoticiasMasterView.class, PortraitNoticiasDetailView.class, ShowYouMediatorCode.NOTICIAS_SELECT_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeNoticiasMasterView.class, LandNoticiasDetailView.class, ShowYouMediatorCode.NOTICIAS_SELECT_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitNoticiasDetailView.class, LandNoticiasDetailView.class, ShowYouMediatorCode.MARCAS_SELECT_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandNoticiasDetailView.class, PortraitNoticiasDetailView.class, ShowYouMediatorCode.MARCAS_SELECT_PORTRAIT));

        //CONTACTO
        getTransitions().add(new MediatorTransition(PortraitContactoView.class, LandscapeContactoView.class, ShowYouMediatorCode.CONTACTO_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeContactoView.class, PortraitContactoView.class, ShowYouMediatorCode.CONTACTO_PORTRAIT));
    }
}
