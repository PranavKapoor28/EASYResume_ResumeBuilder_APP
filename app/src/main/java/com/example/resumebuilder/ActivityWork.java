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

public class ActivityWork extends AppCompatActivity {

    Button button2;
    Button button10;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;
    EditText editText9;


    String st5;
    String st6;
    String st7;
    String st8;
    String st9;
    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("WORK EXPERIENCE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_work);

/*

        education.putExtra("page 1 info",bundl);
        education.putExtra("page 2 info","This is from page2");

        startActivity(education);
        finish();

       st = receiveIntent.getExtras().getString("Value");
       */

        button2 = findViewById(R.id.button2);
        button10 = findViewById(R.id.button10);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        editText7 = findViewById(R.id.editText7);
        editText8 = findViewById(R.id.editText8);
        editText9 = findViewById(R.id.editText9);




        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view10) {
                st5 = editText5.getText().toString();
                st6 = editText6.getText().toString();
                st7 = editText7.getText().toString();
                st8 = editText8.getText().toString();
                st9 = editText9.getText().toString();



                if(st5.length()==0)
                {
                    editText5.setError("ENTER A VALID COMPANY NAME");
                    return;
                }

                if(st6.length()==0){
                    editText6.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(st7.isEmpty())
                {

                    editText7.setError("ENTER A VALID DATE");
                    return;
                }
                if(st8.isEmpty())
                {
                    editText8.setError("ENTER A VALID DATE");
                    return;
                }
                if (st9.isEmpty()){
                    editText9.setError("THE FIELD IS EMPTY");
                    return;
                }

                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("cname", st5);
                editor.putString("role", st6);
                editor.putString("sdate", st7);
                editor.putString("eDate", st8);
                editor.putString("Position", st9);
                editor.apply();
                Intent i = new Intent(ActivityWork.this, Work2Activity.class);
                startActivity(i);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {


                st5 = editText5.getText().toString();
                st6 = editText6.getText().toString();
                st7 = editText7.getText().toString();
                st8 = editText8.getText().toString();
                st9 = editText9.getText().toString();



                if(st5.length()==0)
                {
                    editText5.setError("ENTER A VALID COMPANY NAME");
                    return;
                }

                if(st6.length()==0){
                    editText6.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(st7.isEmpty())
                {

                    editText7.setError("ENTER A VALID DATE");
                    return;
                }
                if(st8.isEmpty())
                {
                    editText8.setError("ENTER A VALID DATE");
                    return;
                }
                if (st9.isEmpty()){
                    editText9.setError("THE FIELD IS EMPTY");
                    return;
                }

                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("cname", st5);
                editor.putString("role", st6);
                editor.putString("sdate", st7);
                editor.putString("eDate", st8);
                editor.putString("Position", st9);
                editor.apply();
                Intent i = new Intent(ActivityWork.this, HomePageActivity.class);
                startActivity(i);


            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), HomePageActivity.class);
        startActivityForResult(myIntent, 0);

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}