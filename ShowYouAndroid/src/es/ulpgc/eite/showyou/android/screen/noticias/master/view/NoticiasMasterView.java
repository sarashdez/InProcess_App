package es.ulpgc.eite.showyou.android.screen.noticias.master.view;


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
import es.ulpgc.eite.showyou.android.screen.database.noticias_db.I_NoticiasData;
import es.ulpgc.eite.showyou.android.screen.master.view.MasterView;
import es.ulpgc.eite.showyou.android.screen.noticias.master.presenter.I_NoticiasMasterPresenter;

import java.util.List;

public abstract class NoticiasMasterView extends MasterView implements I_NoticiasMasterView {

    private NoticiasAdapter _adapter;

    private I_NoticiasMasterPresenter getNoticiasMasterPresenter(){
        return (I_NoticiasMasterPresenter) getScreenPresenter();
    }

    public NoticiasAdapter getAdapter() {
        return _adapter;
    }

    public void setAdapter(NoticiasAdapter adapter) {
        this._adapter = adapter;
    }

    @Override
    public int getListView() {
        return R.id.noticias_list;
    }

    @Override
    public void setNoticiasScreen(){
        setLayout();
        setList();
        setNoticiasAdapter();
        setListAdapter();
        setNoticiasListListener();
    }

    private void setNoticiasAdapter(){
        debug("setNoticiasAdapter");

        setAdapter(new NoticiasAdapter(this, getRowLayout()));
    }

    private void setListAdapter(){
        debug("setMasterListAdapter");

        getList().setAdapter(getAdapter());
    }

    private void setNoticiasListListener(){

        debug("setNoticiasListListener");

        getList().setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(
                    AdapterView<?> parent, View view, int position, long id) {

                getNoticiasMasterPresenter().setListPosition(position);
            }
        });
    }

    @Override
    public void setNoticiasCollection(List<? extends I_NoticiasData> collection){
        debug("setMasterCollection", "collection", collection);

        getAdapter().clear();
        getAdapter().addAll(collection);
        getAdapter().notifyDataSetChanged();
    }

    private class NoticiasAdapter extends ArrayAdapter<I_NoticiasData> {

        private int _rowLayout;
        private NoticiasMasterView _listView;

        private NoticiasMasterView _getListView() {
            return _listView;
        }

        private int _getRowLayout() {
            return _rowLayout;
        }

        public void _setListView(NoticiasMasterView view) {
            _listView = view;
        }

        public void _setRowLayout(int layout) {
            _rowLayout = layout;
        }

        public NoticiasAdapter(NoticiasMasterView _view, int _layout) {
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

            I_NoticiasData data = getItem(position);
            TextView titleView = (TextView) rowView.findViewById(R.id.lbl_title);
            titleView.setText(data.getNombre());

            return rowView;
        }
    }
}
