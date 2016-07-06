package es.ulpgc.eite.showyou.android.screen.bio.view;


import es.ulpgc.eite.framework.android.AndroidScreenView;

public abstract class BioView extends AndroidScreenView implements I_BioView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }
}
