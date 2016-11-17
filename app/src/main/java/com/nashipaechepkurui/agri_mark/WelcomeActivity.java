package com.nashipaechepkurui.agri_mark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    private Button btnlinkfarmer, btnlinksupplier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        btnlinkfarmer = (Button) findViewById(R.id.btnfarmer);
        btnlinksupplier = (Button)findViewById(R.id.btnsupplier);


        btnlinkfarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WelcomeActivity.this, "Data has been sent to server", Toast.LENGTH_LONG).show();
                btnlinkfarmer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(WelcomeActivity.this,LoginActivity.class));
                    }
                });

                btnlinksupplier.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(WelcomeActivity.this, "data has been sent to server", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(WelcomeActivity.this, ListOfFarmsActivity.class));
                    }
                });
            }


        });





    }
}
