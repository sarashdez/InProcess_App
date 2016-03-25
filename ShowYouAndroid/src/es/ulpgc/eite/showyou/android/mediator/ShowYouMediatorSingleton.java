package es.ulpgc.eite.showyou.android.mediator;


import es.ulpgc.eite.framework.android.AndroidMediatorSingleton;

public class ShowYouMediatorSingleton extends AndroidMediatorSingleton {

    @Override
    public void createMediator() {
        setCustomConfig(new ShowYouMediatorConfig(this));
    }
}
