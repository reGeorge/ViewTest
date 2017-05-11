package com.regeorge.viewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button gridbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView() {
        gridbtn = (Button)findViewById(R.id.gridbtn);
        gridbtn.setOnClickListener(new View.OnClickListener() {
            private Intent i;
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "gridview", Toast.LENGTH_SHORT).show();
                i = new Intent(MainActivity.this, GridViewExample.class);
                startActivity(i);
            }
        });
    }
}
