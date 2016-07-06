package es.ulpgc.eite.showyou.android.screen.media.view;


import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;


public abstract class MediaView extends AndroidScreenView implements I_MediaView {

    public abstract int getLayout();


    @Override
    public void setLayout(){
        debug("setLayout_Media");

        setContentView(getLayout());
    }

    @Override
    public void setListener() {
        debug("setListener_Media");

        debug("FacebookButtonSetListener");
        ImageButton facebookBtn = (ImageButton) findViewById(R.id.facebookButton);
        facebookBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                facebookButtonClicked();
            }
        });

        debug("InstagramButtonSetListener");
        ImageButton instagramBtn = (ImageButton) findViewById(R.id.instagramButton);
        instagramBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                instagramButtonClicked();
            }
        });

    }

    //FACEBOOK BUTTON
    private Boolean _facebookBtnClicked;
    public Boolean getFacebookBtnClicked() {
        return _facebookBtnClicked;
    }
    public void setFacebookBtnClicked(Boolean btnClicked) {
        _facebookBtnClicked = btnClicked;
    }

    public void facebookButtonClicked() {
        setFacebookBtnClicked(true);

        debug("facebookButtonClicked", "clicked", getFacebookBtnClicked());

        String facebookPage = "InProcessCompany";
        final String urlFb = "https://www.facebook.com/"+ facebookPage;

        Intent intentFacebook = new Intent(Intent.ACTION_VIEW);
        intentFacebook.setData(Uri.parse(urlFb));

        startActivity(intentFacebook);
    }

    //INSTAGRAM BUTTON
    private Boolean _instagramBtnClicked;
    public Boolean getInstagramBtnClicked() {
        return _instagramBtnClicked;
    }
    public void setInstagramBtnClicked(Boolean btnClicked) {
        _instagramBtnClicked = btnClicked;
    }

    public void instagramButtonClicked() {
        setInstagramBtnClicked(true);

        debug("instagramButtonClicked", "clicked", getInstagramBtnClicked());

        final String urlInstagram = "https://www.instagram.com/in_process/";

        Intent intentInstagram = new Intent(Intent.ACTION_VIEW);
        intentInstagram.setData(Uri.parse(urlInstagram));

        startActivity(intentInstagram);
    }





}
