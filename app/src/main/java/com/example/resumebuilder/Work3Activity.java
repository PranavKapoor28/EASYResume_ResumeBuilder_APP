package com.example.resumebuilder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Work3Activity extends AppCompatActivity {

    Button b5;

    EditText e11;
    EditText e12;
    EditText e13;
    EditText e14;
    EditText e15;


    String s11;
    String s12;
    String s13;
    String s14;
    String s15;
    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Work Experience");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_work3);


        b5 = findViewById(R.id.b5);

        e11 = findViewById(R.id.e11);
        e12 = findViewById(R.id.e12);
        e13 = findViewById(R.id.e13);
        e14 = findViewById(R.id.e14);
        e15 = findViewById(R.id.e15);




        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s11 = e11.getText().toString();
                s12 = e12.getText().toString();
                s13 = e13.getText().toString();
                s14 = e14.getText().toString();
                s15 = e15.getText().toString();


                if (s11.length() == 0) {
                    e11.setError("ENTER A VALID COMPANY NAME");
                    return;
                }

                if (s12.length() == 0) {
                    e12.setError("THE FIELD IS EMPTY");
                    return;
                }
                if (s13.isEmpty()) {

                    e13.setError("ENTER A VALID DATE");
                    return;
                }
                if (s14.isEmpty()) {
                    e14.setError("ENTER A VALID DATE");
                    return;
                }
                if (s15.isEmpty()) {
                    e15.setError("THE FIELD IS EMPTY");
                    return;
                }

                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("cname2", s11);
                editor.putString("role2", s12);
                editor.putString("sdate2", s13);
                editor.putString("eDate2", s14);
                editor.putString("Position2", s15);
                editor.apply();
                Intent i = new Intent(Work3Activity.this, HomePageActivity.class);
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), Work2Activity.class);
        startActivityForResult(myIntent, 0);

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}