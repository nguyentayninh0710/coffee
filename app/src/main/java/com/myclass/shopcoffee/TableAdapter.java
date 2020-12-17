package com.myclass.shopcoffee;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TableAdapter extends BaseAdapter {
    private ArrayList<Table> arrayList;
    public TableAdapter(ArrayList<Table> arrayList){
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView==null){
            view = View.inflate(parent.getContext(), R.layout.table_item, null);
        }else view = convertView;
        Table table = (Table)getItem(position);
        ((TextView) view.findViewById(R.id.idTable)).setText(table.id + "");
        return view;
    }
}

