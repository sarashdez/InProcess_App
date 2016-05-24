package es.ulpgc.eite.showyou.android.screen.marcas.master.view;


import es.ulpgc.eite.framework.android.AndroidScreenView;

public abstract class MarcasMasterView extends AndroidScreenView implements I_MarcasMasterView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }


}
