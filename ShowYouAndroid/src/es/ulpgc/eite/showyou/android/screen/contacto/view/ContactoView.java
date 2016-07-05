package es.ulpgc.eite.showyou.android.screen.contacto.view;


import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
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

    @Override
    public void setListener() {
        debug("setListener");

        debug("FacebookButtonSetListener");
        ImageButton llamarBtn = (ImageButton) findViewById(R.id.llamarButton);
        llamarBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                llamarButtonClicked();
            }
        });
    }

    private Boolean _llamarBtnClicked;
    public Boolean getLlamarBtnClicked() {
        return _llamarBtnClicked;
    }
    public void setLlamarBtnClicked(Boolean btnClicked) {
        _llamarBtnClicked = btnClicked;
    }

    public void llamarButtonClicked() {
        setLlamarBtnClicked(true);

        debug("llamarButtonClicked", "clicked", getLlamarBtnClicked());

        String telefono = "690 951 675";

        String uri = "tel:" + telefono.trim() ;
        Intent intentLlamar = new Intent(Intent.ACTION_DIAL);
        intentLlamar.setData(Uri.parse(uri));

        startActivity(intentLlamar);
    }






}
