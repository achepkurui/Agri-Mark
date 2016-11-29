package com.nashipaechepkurui.agri_mark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class AFarmActivity extends AppCompatActivity {
    EditText transport;
    Button btnorder;
    RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afarm);
        btnorder = (Button) findViewById(R.id.btnorder);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb6 = (RadioButton) findViewById(R.id.rb6);
        rb7 = (RadioButton) findViewById(R.id.rb7);
        EditText editText=new EditText(this);



        btnorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AFarmActivity.this, "order has been recieved and is being processed", Toast.LENGTH_LONG).show();
                btnorder.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(AFarmActivity.this, MapActivity.class));
                    }
                });



//                Spinner transportView = (Spinner) findViewById(R.id.transport);
//
//
//                ArrayAdapter<CharSequence> adapter;
//                adapter = ArrayAdapter.createFromResource(AFarmActivity.this, R.array.transport_array, android.R.layout.simple_spinner_item);
//
//
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//                transportView.setAdapter(adapter);
//
//
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//// Create the list view and bind the adapter
//                transportView.setAdapter(adapter);
//
//                String transport = transportView.getSelectedItem().toString().trim();
//
//                transportView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//                    @Override
//                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                        String transport = parent.getItemAtPosition(position).toString();
//
//                    }
//
//                    @Override
//                    public void onNothingSelected(AdapterView<?> parent) {
//
//                    }
//                });
//
//            }
//
        }


   });
}
}

