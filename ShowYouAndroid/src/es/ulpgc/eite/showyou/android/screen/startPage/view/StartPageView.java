package es.ulpgc.eite.showyou.android.screen.startPage.view;


import android.view.View;
import android.widget.Button;
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
        debug("setLayout");

        setContentView(getLayout());
    }

    @Override
    public void setListener() {
        debug("setListener");

        Button marcasBtn = (Button) findViewById(R.id.marcas_button);
        marcasBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().marcasButtonClicked();
            }
        });

        Button bioBtn = (Button) findViewById(R.id.bio_button);
        bioBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().bioButtonClicked();
            }
        });

        Button serviciosBtn = (Button) findViewById(R.id.servicios_button);
        serviciosBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().serviciosButtonClicked();
            }
        });

        Button noticiasBtn = (Button) findViewById(R.id.noticias_button);
        noticiasBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().noticiasButtonClicked();
            }
        });

        Button contactoBtn = (Button) findViewById(R.id.contacto_button);
        contactoBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getStartPagePresenter().contactoButtonClicked();
            }
        });
    }
}
