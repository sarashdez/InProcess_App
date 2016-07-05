package es.ulpgc.eite.showyou.android.screen.marcas.master.view;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.database.marcas_db.I_MarcasData;
import es.ulpgc.eite.showyou.android.screen.database.marcas_db.MarcasData;
import es.ulpgc.eite.showyou.android.screen.marcas.master.presenter.I_MarcasMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.master.view.MasterView;

import java.util.List;

public abstract class MarcasMasterView extends MasterView implements I_MarcasMasterView {

    private MarcasAdapter _adapter;

    private I_MarcasMasterPresenter getMarcasMasterPresenter(){
        return (I_MarcasMasterPresenter) getScreenPresenter();
    }

    public MarcasAdapter getAdapter() {
        return _adapter;
    }

    public void setAdapter(MarcasAdapter adapter) {
        this._adapter = adapter;
    }

    @Override
    public int getListView() {
        return R.id.marcas_list;
    }

    @Override
    public void setMarcasScreen(){
        setLayout();
        setList();
        setMarcasAdapter();
        setListAdapter();
        setMarcasListListener();
    }

    private void setMarcasAdapter(){
        debug("setMasterAdapter");

        setAdapter(new MarcasAdapter(this, getRowLayout()));
    }

    private void setListAdapter(){
        debug("setMasterListAdapter");

        getList().setAdapter(getAdapter());
    }

    private void setMarcasListListener(){

        debug("setMarcasListListener");

        getList().setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(
                    AdapterView<?> parent, View view, int position, long id) {

                getMarcasMasterPresenter().setListPosition(position);
            }
        });
    }

    @Override
    public void setMarcasCollection(List<? extends I_MarcasData> collection){
        debug("setMasterCollection", "collection", collection);

        getAdapter().clear();
        getAdapter().addAll(collection);
        getAdapter().notifyDataSetChanged();
    }

    private class MarcasAdapter extends ArrayAdapter<I_MarcasData> {

        private int _rowLayout;
        private MarcasMasterView _listView;

        private MarcasMasterView _getListView() {
            return _listView;
        }

        private int _getRowLayout() {
            return _rowLayout;
        }

        public void _setListView(MarcasMasterView view) {
            _listView = view;
        }

        public void _setRowLayout(int layout) {
            _rowLayout = layout;
        }

        public MarcasAdapter(MarcasMasterView _view, int _layout) {
            super(_view, _layout);

            _setListView(_view);
            _setRowLayout(_layout);
        }

        @Override
        public View getView(int position, View rowView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater)
                    _getListView().getSystemService(
                            (Context.LAYOUT_INFLATER_SERVICE));

            rowView = inflater.inflate(_getRowLayout(), parent, false);

            I_MarcasData data = getItem(position);
            TextView titleView = (TextView) rowView.findViewById(R.id.lbl_title);
            titleView.setText(data.getNombre());

            return rowView;
        }
    }
}
