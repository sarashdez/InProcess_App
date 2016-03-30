package es.ulpgc.eite.showyou.android.screen.marcas.view;


import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;

public abstract class MarcasView extends AndroidScreenView implements I_MarcasView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }

}
