package com.nashipaechepkurui.agri_mark;

import android.content.Intent;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class XFarmActivity extends AppCompatActivity {
    EditText transport;
    Button btnorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xfarm);
        btnorder = (Button) findViewById(R.id.btnorder);

        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(XFarmActivity.this, "order has been recieved and is being processed", Toast.LENGTH_LONG).show();
                btnorder.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(XFarmActivity.this, MapActivity.class));
                    }
                });


                Spinner transportView = (Spinner) findViewById(R.id.transport);


                ArrayAdapter<CharSequence> adapter;
                adapter = ArrayAdapter.createFromResource(XFarmActivity.this, R.array.transport_array, android.R.layout.simple_spinner_item);


                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                transportView.setAdapter(adapter);


                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

// Create the list view and bind the adapter
                transportView.setAdapter(adapter);

                String transport = transportView.getSelectedItem().toString().trim();

                transportView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        String transport = parent.getItemAtPosition(position).toString();

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

            }

        });
        }

    };

