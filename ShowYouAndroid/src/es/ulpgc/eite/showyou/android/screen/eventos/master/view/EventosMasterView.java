package es.ulpgc.eite.showyou.android.screen.eventos.master.view;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.database.eventos_db.I_EventosData;
import es.ulpgc.eite.showyou.android.screen.eventos.master.presenter.I_EventosMasterPresenter;
import es.ulpgc.eite.showyou.android.screen.master.view.MasterView;

import java.util.List;

public abstract class EventosMasterView extends MasterView implements I_EventosMasterView {

    private EventosAdapter _adapter;

    private I_EventosMasterPresenter getEventosPresenter(){
        return (I_EventosMasterPresenter) getScreenPresenter();
    }

    public EventosAdapter getAdapter() {
        return _adapter;
    }

    public void setAdapter(EventosAdapter adapter) {
        this._adapter = adapter;
    }

    @Override
    public int getListView() {
        return R.id.eventos_list;
    }

    @Override
    public void setEventosScreen(){
        setLayout();
        setList();
        setEventosAdapter();
        setListAdapter();
        setEventosListListener();
    }

    private void setEventosAdapter(){
        debug("setMasterAdapter");

        setAdapter(new EventosAdapter(this, getRowLayout()));
    }

    public void setListAdapter(){
        debug("setMasterListAdapter");

        getList().setAdapter(getAdapter());
    }

    private void setEventosListListener(){

        debug("setEventosListListener");

        getList().setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(
                    AdapterView<?> parent, View view, int position, long id) {

                getEventosPresenter().setListPosition(position);
            }
        });
    }


    @Override
    public void setEventosCollection(List<? extends I_EventosData> collection){
        debug("setMasterCollection", "collection", collection);

        getAdapter().clear();
        getAdapter().addAll(collection);
        getAdapter().notifyDataSetChanged();
    }

    private class EventosAdapter extends ArrayAdapter<I_EventosData> {

        private int _rowLayout;
        private EventosMasterView _listView;

        private EventosMasterView _getListView() {
            return _listView;
        }

        private int _getRowLayout() {
            return _rowLayout;
        }

        public void _setListView(EventosMasterView view) {
            _listView = view;
        }

        public void _setRowLayout(int layout) {
            _rowLayout = layout;
        }

        public EventosAdapter(EventosMasterView _view, int _layout) {
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

            I_EventosData data = getItem(position);
            TextView titleView = (TextView) rowView.findViewById(R.id.lbl_title);
            titleView.setText(data.getNombre());

            return rowView;
        }
    }
}
