package es.ulpgc.eite.showyou.android.screen.contacto.view;


import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;

public abstract class ContactoView extends AndroidScreenView implements I_ContactoView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }

}
