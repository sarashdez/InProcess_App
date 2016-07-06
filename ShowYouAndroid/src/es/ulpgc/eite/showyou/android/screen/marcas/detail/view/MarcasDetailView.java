package es.ulpgc.eite.showyou.android.screen.marcas.detail.view;


import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.database.marcas_db.MarcasData;

public abstract class MarcasDetailView extends AndroidScreenView implements I_MarcasDetailView {

    public abstract int getLayout();

    @Override
    public void setMarcasDetailScreen(){
        debug("setEventosDetailLayout");

        setContentView(getLayout());
    }

    @Override
    public void setMarcasDetailData(MarcasData data) {

        debug("MarcasDetail_Imagen");
        ImageView logoView = (ImageView) findViewById(R.id.marcas_image);
        String imagen = data.getImagen();
        int id = getResources().getIdentifier(imagen, "drawable", getPackageName());
        logoView.setImageResource(id);

        debug("MarcasDetail_Descripcion");
        TextView descripcionView = (TextView) findViewById(R.id.marcas_descripcion);
        descripcionView.setText(data.getDescripcion());

        debug("MarcasDetail_WebButton");
        String urlWeb = data.getWeb();

        ImageButton webBtn = (ImageButton) findViewById(R.id.web_button);
        webBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                webButtonClicked(urlWeb);
            }
        });

    }

    //WEB BUTTON
    private Boolean _webBtnClicked;
    public Boolean getWebBtnClicked() {
        return _webBtnClicked;
    }
    public void setWebBtnClicked(Boolean btnClicked) {
        _webBtnClicked = btnClicked;
    }

    public void webButtonClicked(String urlWeb) {
        setWebBtnClicked(true);

        debug("webButtonClicked", "clicked", getWebBtnClicked());

        Intent intentWeb = new Intent(Intent.ACTION_VIEW);
        intentWeb.setData(Uri.parse(urlWeb));

        startActivity(intentWeb);
    }

}
