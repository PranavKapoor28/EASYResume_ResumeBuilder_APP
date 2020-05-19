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

public class EducationActivity extends AppCompatActivity {

    Button button3;
    Button button12;
    EditText editText10;
    EditText editText11;
    EditText editText12;

    String st10;
    String st11;
    String st12;

    SharedPreferences sharedpreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Education Background");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_education);

        button3 = findViewById(R.id.button3);
        button12 = findViewById(R.id.button12);
        editText10 = findViewById(R.id.editText10);
        editText11 = findViewById(R.id.editText11);
        editText12 = findViewById(R.id.editText12);

        sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);



        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view11) {

                st10 = editText10.getText().toString();
                st11 = editText11.getText().toString();
                st12= editText12.getText().toString();


                if(st10.length()==0)
                {
                    editText10.setError("THE FIELD IS EMPTY");
                    return;
                }

                if(st11.length()==0){
                    editText11.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(st12.isEmpty()) {

                    editText12.setError("THE FIELD IS EMPTY");
                    return;
                }

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("InstName", st10);
                editor.putString("Degree", st11);
                editor.putString("Marks", st12);
                editor.commit();
                Intent in = new Intent(getApplicationContext(),Education2Activity.class);
                startActivity(in);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {


                st10 = editText10.getText().toString();
                st11 = editText11.getText().toString();
                st12= editText12.getText().toString();


                if(st10.length()==0)
                {
                    editText10.setError("THE FIELD IS EMPTY");
                    return;
                }

                if(st11.length()==0){
                    editText11.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(st12.isEmpty()) {

                    editText12.setError("THE FIELD IS EMPTY");
                    return;
                }

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("InstName", st10);
                editor.putString("Degree", st11);
                editor.putString("Marks", st12);
                editor.commit();
                Intent i = new Intent(EducationActivity.this, HomePageActivity.class);
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
