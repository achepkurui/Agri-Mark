package com.nashipaechepkurui.agri_mark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;



public class RegistrationActivity extends AppCompatActivity {

    private EditText inputName, inputPhone, inputPassword;
    private Button btnRegister;
     private TextView tvlink;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        tvlink = (TextView) findViewById(R.id.tvLinkToLoginScreen);
        inputName = (EditText) findViewById(R.id.name);
        inputPassword = (EditText) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistrationActivity.this, "Data has been sent to server", Toast.LENGTH_LONG).show();
                btnRegister.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
                    }
                });

               tvlink.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
                    }
                });
            }


        });
    }
}








