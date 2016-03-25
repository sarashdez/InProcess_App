package es.ulpgc.eite.showyou.android.mediator;

import es.ulpgc.eite.framework.core.mediator.I_MediatorSingleton;
import es.ulpgc.eite.framework.core.mediator.MediatorConfig;
import es.ulpgc.eite.framework.core.mediator.MediatorScreen;
import es.ulpgc.eite.framework.core.mediator.MediatorTransition;
import es.ulpgc.eite.showyou.android.screen.model.StartPageModel;
import es.ulpgc.eite.showyou.android.screen.presenter.StartPagePresenter;
import es.ulpgc.eite.showyou.android.screen.view.StartPageView;


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
        getScreens().add(new MediatorScreen(StartPageView.class, StartPagePresenter.class, StartPageModel.class));
    }

    private void setShowYouTransitionCollection() {
        getTransitions().add(new MediatorTransition(StartPageView.class, null, ShowYouMediatorCode.CLICK));
    }
}
