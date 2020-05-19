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

public class Work2Activity extends AppCompatActivity {

    Button b3;
    Button b4;
    EditText e6;
    EditText e7;
    EditText e8;
    EditText e9;
    EditText e10;


    String s7;
    String s8;
    String s9;
    String s10;
    String s11;
    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Work Experience");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_work2);

/*

        education.putExtra("page 1 info",bundl);
        education.putExtra("page 2 info","This is from page2");

        startActivity(education);
        finish();

       st = receiveIntent.getExtras().getString("Value");
       */

        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        e6 = findViewById(R.id.e6);
        e7 = findViewById(R.id.e7);
        e8 = findViewById(R.id.e8);
        e9 = findViewById(R.id.e9);
        e10 = findViewById(R.id.e10);




        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s7 = e6.getText().toString();
                s8 = e7.getText().toString();
                s9 = e8.getText().toString();
                s10 = e9.getText().toString();
                s11 = e10.getText().toString();


                if (s7.length() == 0) {
                    e6.setError("ENTER A VALID COMPANY NAME");
                    return;
                }

                if (s8.length() == 0) {
                    e7.setError("THE FIELD IS EMPTY");
                    return;
                }
                if (s9.isEmpty()) {

                    e8.setError("ENTER A VALID DATE");
                    return;
                }
                if (s10.isEmpty()) {
                    e9.setError("ENTER A VALID DATE");
                    return;
                }
                if (s11.isEmpty()) {
                    e10.setError("THE FIELD IS EMPTY");
                    return;
                }

                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("cname1", s7);
                editor.putString("role1", s8);
                editor.putString("sdate1", s9);
                editor.putString("eDate1", s10);
                editor.putString("Position1", s11);
                editor.apply();
                Intent i = new Intent(Work2Activity.this, Work3Activity.class);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                s7 = e6.getText().toString();
                s8 = e7.getText().toString();
                s9 = e8.getText().toString();
                s10 = e9.getText().toString();
                s11 = e10.getText().toString();


                if (s7.length() == 0) {
                    e6.setError("ENTER A VALID COMPANY NAME");
                    return;
                }

                if (s8.length() == 0) {
                    e7.setError("THE FIELD IS EMPTY");
                    return;
                }
                if (s9.isEmpty()) {

                    e8.setError("ENTER A VALID DATE");
                    return;
                }
                if (s10.isEmpty()) {
                    e9.setError("ENTER A VALID DATE");
                    return;
                }
                if (s11.isEmpty()) {
                    e10.setError("THE FIELD IS EMPTY");
                    return;
                }

                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("cname1", s7);
                editor.putString("role1", s8);
                editor.putString("sdate1", s9);
                editor.putString("eDate1", s10);
                editor.putString("Position1", s11);
                editor.apply();
                Intent i = new Intent(Work2Activity.this, HomePageActivity.class);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), ActivityWork.class);
        startActivityForResult(myIntent, 0);

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}