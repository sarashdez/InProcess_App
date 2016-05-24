package es.ulpgc.eite.showyou.android.screen.eventos.view;


import es.ulpgc.eite.framework.android.AndroidScreenView;

public abstract class EventosView extends AndroidScreenView implements I_EventosView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }


}
