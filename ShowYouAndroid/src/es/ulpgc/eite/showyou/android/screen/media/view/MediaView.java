package es.ulpgc.eite.showyou.android.screen.media.view;


import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.media.presenter.I_MediaPresenter;


public abstract class MediaView extends AndroidScreenView implements I_MediaView {

    public abstract int getLayout();

    @Override
    public void setLayout(){
        debug("setLayout");

        setContentView(getLayout());
    }

    @Override
    public void setListener() {
        debug("setListener");

        debug("FacebookButtonSetListener");
        ImageButton facebookBtn = (ImageButton) findViewById(R.id.facebookButton);
        facebookBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                facebookButtonClicked();
            }
        });

    }

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

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlFb));

        /*
        final PackageManager packageManager = getPackageManager();
        List<ResolveInfo> list =
                packageManager.queryIntentActivities(intent,
                        PackageManager.MATCH_DEFAULT_ONLY);
        if (list.size() == 0) {*/
        final String urlBrowser = "https://www.facebook.com/pages/"+facebookPage;
        intent.setData(Uri.parse(urlBrowser));

        startActivity(intent);
    }





}
