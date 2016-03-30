package es.ulpgc.eite.showyou.android.screen.noticias.view;


import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;

public abstract class NoticiasView extends AndroidScreenView implements I_NoticiasView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }
}
