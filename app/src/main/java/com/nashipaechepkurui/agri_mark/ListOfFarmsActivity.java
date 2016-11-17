package com.nashipaechepkurui.agri_mark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ListOfFarmsActivity extends AppCompatActivity {

    private Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_farms);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListOfFarmsActivity.this, "Data has been sent to server", Toast.LENGTH_LONG).show();
                btnsubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(ListOfFarmsActivity.this, XFarmActivity.class));
                    }
                });

            }
        });
}

    }

