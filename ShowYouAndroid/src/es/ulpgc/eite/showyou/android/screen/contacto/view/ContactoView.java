package es.ulpgc.eite.showyou.android.screen.contacto.view;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.contacto.presenter.I_ContactoPresenter;

public abstract class ContactoView extends AndroidScreenView implements I_ContactoView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }





}
