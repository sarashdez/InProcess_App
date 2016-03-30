package es.ulpgc.eite.showyou.android.screen.servicios.view;

import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;


public abstract class ServiciosView extends AndroidScreenView implements I_ServiciosView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }

}
