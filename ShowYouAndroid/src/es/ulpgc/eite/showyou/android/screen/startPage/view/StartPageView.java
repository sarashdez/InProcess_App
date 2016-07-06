package es.ulpgc.eite.showyou.android.screen.startPage.view;


import android.view.View;
import android.widget.ImageButton;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.startPage.presenter.I_StartPagePresenter;

public abstract class StartPageView extends AndroidScreenView implements I_StartPageView {

    public abstract int getLayout();

    private I_StartPagePresenter getStartPagePresenter(){
        return (I_StartPagePresenter) getScreenPresenter();
    }

    @Override
    public void setLayout(){
        debug("setLayout_Startpage");

        setContentView(getLayout());
    }

    @Override
    public void setListener() {
        debug("setListener_Startpage");

        debug("MarcasButtonSetListener");
        ImageButton marcasBtn = (ImageButton) findViewById(R.id.marcas_button);
        marcasBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().marcasButtonClicked();
            }
        });

        debug("EventosButtonSetListener");
        ImageButton eventosBtn = (ImageButton) findViewById(R.id.eventos_button);
        eventosBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().eventosButtonClicked();
            }
        });

        debug("BioButtonSetListener");
        ImageButton bioBtn = (ImageButton) findViewById(R.id.bio_button);
        bioBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().bioButtonClicked();
            }
        });

        debug("MediaButtonSetListener");
        ImageButton mediaBtn = (ImageButton) findViewById(R.id.media_button);
        mediaBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().mediaButtonClicked();
            }
        });

        debug("NoticiasButtonSetListener");
        ImageButton noticiasBtn = (ImageButton) findViewById(R.id.noticias_button);
        noticiasBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().noticiasButtonClicked();
            }
        });

        debug("ContactoButtonSetListener");
        ImageButton contactoBtn = (ImageButton) findViewById(R.id.contacto_button);
        contactoBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().contactoButtonClicked();
            }
        });
    }
}
