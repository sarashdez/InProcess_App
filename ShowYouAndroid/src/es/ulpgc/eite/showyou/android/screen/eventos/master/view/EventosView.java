package es.ulpgc.eite.showyou.android.screen.eventos.master.view;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import es.ulpgc.eite.framework.android.AndroidScreenView;
import es.ulpgc.eite.showyou.android.R;
import es.ulpgc.eite.showyou.android.screen.database.eventos_db.I_EventosData;
import es.ulpgc.eite.showyou.android.screen.eventos.master.presenter.I_EventosPresenter;

import java.util.List;

public abstract class EventosView extends AndroidScreenView implements I_EventosView {

    private ListView _list;
    private EventosAdapter _adapter;

    private I_EventosPresenter getEventosPresenter(){
        return (I_EventosPresenter) getScreenPresenter();
    }

    public abstract int getLayout();

    @Override
    public void setLayout(){
        setContentView(getLayout());
    }

    public ListView getList() {
        return _list;
    }

    public void setList(ListView list) {
        this._list = list;
    }

    public EventosAdapter getAdapter() {
        return _adapter;
    }

    public void setAdapter(EventosAdapter adapter) {
        this._adapter = adapter;
    }

    public int getListView() {
        return R.id.eventos_list;
    }

    private int getRowLayout(){
        return R.layout.master_row;
    }

    @Override
    public void setEventosScreen(){
        setLayout();
        setEventosList();
        setEventosAdapter();
        setEventosListAdapter();
        setEventosListListener();
    }


    private void setEventosList(){
        debug("setEventosList");

        setList((ListView) findViewById(getListView()));
    }

    private void setEventosAdapter(){
        debug("setMasterAdapter");

        setAdapter(new EventosAdapter(this, getRowLayout()));
    }

    private void setEventosListAdapter(){
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

    @Override
    public void setListPosition(int position){
        debug("setListPosition", "position", position);

        getList().setSelection(position);
    }

    private class EventosAdapter extends ArrayAdapter<I_EventosData> {

        private int _rowLayout;
        private EventosView _listView;

        private EventosView _getListView() {
            return _listView;
        }

        private int _getRowLayout() {
            return _rowLayout;
        }

        public void _setListView(EventosView view) {
            _listView = view;
        }

        public void _setRowLayout(int layout) {
            _rowLayout = layout;
        }

        public EventosAdapter(EventosView _view, int _layout) {
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
