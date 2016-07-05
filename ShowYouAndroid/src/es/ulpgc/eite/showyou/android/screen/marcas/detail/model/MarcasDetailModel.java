package es.ulpgc.eite.showyou.android.screen.marcas.detail.model;


import es.ulpgc.eite.framework.android.AndroidScreenModel;
import es.ulpgc.eite.showyou.android.screen.database.marcas_db.MarcasData;

public class MarcasDetailModel extends AndroidScreenModel implements I_MarcasDetailModel {

    private MarcasData _data;

    @Override
    public MarcasData getData() {
        debug("EventosDetail getData");

        return _data;
    }

    @Override
    public void setData(MarcasData data) {
        debug("EventosDetail setData");

        _data = data;
    }

}
