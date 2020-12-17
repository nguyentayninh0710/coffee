package com.myclass.shopcoffee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class activity_choose_table extends AppCompatActivity {

    private GridView gridView;
    private final int numberTable = 10;

    private RadioGroup rgFilter;
    int[] tableId = {1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_table);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Chọn bàn");
        actionBar.setDisplayHomeAsUpEnabled(true);

        ArrayList<Table> listTable = new ArrayList<Table>();
        for(int i = 0; i<numberTable; i++){
            listTable.add( new Table(i + 1, false));
        }

        TableAdapter tableAdapter = new TableAdapter(listTable);

        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(tableAdapter);

        rgFilter = (RadioGroup) findViewById(R.id.rgFilter);
        rgFilter.check(R.id.rbAll);
    }
    public class CusAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}