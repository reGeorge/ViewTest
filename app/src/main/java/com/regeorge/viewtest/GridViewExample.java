package com.regeorge.viewtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;

import com.daimajia.swipe.util.Attributes;
import com.regeorge.adapter.GridViewAdapter;

public class GridViewExample extends Activity{
    private Button shiftbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shiftview);
        GridView gridView = (GridView) findViewById(R.id.include);
        GridViewAdapter adapter = new GridViewAdapter(this);
        adapter.setMode(Attributes.Mode.Multiple);
        gridView.setAdapter(adapter);
        gridView.setSelected(false);
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("onItemLongClick","onItemLongClick:" + position);
                return false;
            }
        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("onItemClick","onItemClick:" + position);
            }
        });


        gridView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.e("onItemSelected","onItemSelected:" + position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        shiftbtn = (Button) findViewById(R.id.shift);
        shiftbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.textview);
            }
        });
    }
}