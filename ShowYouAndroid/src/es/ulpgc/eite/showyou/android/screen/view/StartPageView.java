package es.ulpgc.eite.showyou.android.screen.view;


import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;

public class StartPageView extends AndroidScreenView implements I_StartPageView {

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(R.layout.startpage_view);
    }
}
