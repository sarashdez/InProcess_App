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
import es.ulpgc.eite.showyou.android.screen.bio.presenter.BioPresenter;
import es.ulpgc.eite.showyou.android.screen.bio.view.BioView;
import es.ulpgc.eite.showyou.android.screen.contacto.landscape.LandscapeContactoPresenter;
import es.ulpgc.eite.showyou.android.screen.contacto.landscape.LandscapeContactoView;
import es.ulpgc.eite.showyou.android.screen.contacto.model.ContactoModel;
import es.ulpgc.eite.showyou.android.screen.contacto.portrait.PortraitContactoPresenter;
import es.ulpgc.eite.showyou.android.screen.contacto.portrait.PortraitContactoView;
import es.ulpgc.eite.showyou.android.screen.contacto.presenter.ContactoPresenter;
import es.ulpgc.eite.showyou.android.screen.contacto.view.ContactoView;
import es.ulpgc.eite.showyou.android.screen.marcas.landscape.LandscapeMarcasPresenter;
import es.ulpgc.eite.showyou.android.screen.marcas.landscape.LandscapeMarcasView;
import es.ulpgc.eite.showyou.android.screen.marcas.model.MarcasModel;
import es.ulpgc.eite.showyou.android.screen.marcas.portrait.PortraitMarcasPresenter;
import es.ulpgc.eite.showyou.android.screen.marcas.portrait.PortraitMarcasView;
import es.ulpgc.eite.showyou.android.screen.marcas.presenter.MarcasPresenter;
import es.ulpgc.eite.showyou.android.screen.marcas.view.MarcasView;
import es.ulpgc.eite.showyou.android.screen.noticias.landscape.LandscapeNoticiasPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.landscape.LandscapeNoticiasView;
import es.ulpgc.eite.showyou.android.screen.noticias.model.NoticiasModel;
import es.ulpgc.eite.showyou.android.screen.noticias.portrait.PortraitNoticiasPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.portrait.PortraitNoticiasView;
import es.ulpgc.eite.showyou.android.screen.noticias.presenter.NoticiasPresenter;
import es.ulpgc.eite.showyou.android.screen.noticias.view.NoticiasView;
import es.ulpgc.eite.showyou.android.screen.servicios.landscape.LandscapeServiciosPresenter;
import es.ulpgc.eite.showyou.android.screen.servicios.landscape.LandscapeServiciosView;
import es.ulpgc.eite.showyou.android.screen.servicios.model.ServiciosModel;
import es.ulpgc.eite.showyou.android.screen.servicios.portrait.PortraitServiciosPresenter;
import es.ulpgc.eite.showyou.android.screen.servicios.portrait.PortraitServiciosView;
import es.ulpgc.eite.showyou.android.screen.servicios.presenter.ServiciosPresenter;
import es.ulpgc.eite.showyou.android.screen.servicios.view.ServiciosView;
import es.ulpgc.eite.showyou.android.screen.startPage.landscape.LandscapeStartpagePresenter;
import es.ulpgc.eite.showyou.android.screen.startPage.landscape.LandscapeStartpageView;
import es.ulpgc.eite.showyou.android.screen.startPage.model.StartPageModel;
import es.ulpgc.eite.showyou.android.screen.startPage.portrait.PortraitStartpagePresenter;
import es.ulpgc.eite.showyou.android.screen.startPage.portrait.PortraitStartpageView;
import es.ulpgc.eite.showyou.android.screen.startPage.presenter.StartPagePresenter;
import es.ulpgc.eite.showyou.android.screen.startPage.view.StartPageView;


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
        getScreens().add(new MediatorScreen(PortraitMarcasView.class, PortraitMarcasPresenter.class, MarcasModel.class));
        getScreens().add(new MediatorScreen(LandscapeMarcasView.class, LandscapeMarcasPresenter.class, MarcasModel.class));

        //SCREEN SERVICIOS
        getScreens().add(new MediatorScreen(PortraitServiciosView.class, PortraitServiciosPresenter.class, ServiciosModel.class));
        getScreens().add(new MediatorScreen(LandscapeServiciosView.class, LandscapeServiciosPresenter.class, ServiciosModel.class));

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

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitMarcasView.class, ShowYouMediatorCode.MARCAS_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeMarcasView.class, ShowYouMediatorCode.MARCAS_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitServiciosView.class, ShowYouMediatorCode.SERVICIOS_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeServiciosView.class, ShowYouMediatorCode.SERVICIOS_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitNoticiasView.class, ShowYouMediatorCode.NOTICIAS_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeNoticiasView.class, ShowYouMediatorCode.NOTICIAS_LANDSCAPE));

        getTransitions().add(new MediatorTransition(PortraitStartpageView.class, PortraitContactoView.class, ShowYouMediatorCode.CONTACTO_PORTRAIT));
        getTransitions().add(new MediatorTransition(LandscapeStartpageView.class, LandscapeContactoView.class, ShowYouMediatorCode.CONTACTO_LANDSCAPE));

        //BIO
        getTransitions().add(new MediatorTransition(PortraitBioView.class, LandscapeBioView.class, ShowYouMediatorCode.BIO_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeBioView.class, PortraitBioView.class, ShowYouMediatorCode.BIO_PORTRAIT));

        //MARCAS
        getTransitions().add(new MediatorTransition(PortraitMarcasView.class, LandscapeMarcasView.class, ShowYouMediatorCode.MARCAS_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeMarcasView.class, PortraitMarcasView.class, ShowYouMediatorCode.MARCAS_PORTRAIT));

        //SERVICIOS
        getTransitions().add(new MediatorTransition(PortraitServiciosView.class, LandscapeServiciosView.class, ShowYouMediatorCode.SERVICIOS_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeServiciosView.class, PortraitServiciosView.class, ShowYouMediatorCode.SERVICIOS_PORTRAIT));

        //NOTICIAS
        getTransitions().add(new MediatorTransition(PortraitNoticiasView.class, LandscapeNoticiasView.class, ShowYouMediatorCode.NOTICIAS_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeNoticiasView.class, PortraitNoticiasView.class, ShowYouMediatorCode.NOTICIAS_PORTRAIT));

        //CONTACTO
        getTransitions().add(new MediatorTransition(PortraitContactoView.class, LandscapeContactoView.class, ShowYouMediatorCode.BIO_LANDSCAPE));
        getTransitions().add(new MediatorTransition(LandscapeContactoView.class, PortraitContactoView.class, ShowYouMediatorCode.BIO_PORTRAIT));

    }
}
