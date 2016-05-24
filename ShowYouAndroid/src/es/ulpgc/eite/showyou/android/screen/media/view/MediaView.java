package es.ulpgc.eite.showyou.android.screen.media.view;

import es.ulpgc.eite.framework.android.AndroidScreenView;


public abstract class MediaView extends AndroidScreenView implements I_MediaView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }

}
