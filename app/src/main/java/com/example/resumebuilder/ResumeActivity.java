package com.example.resumebuilder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ResumeActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;


    String st;
    String st1;
    String st2;
    String st3;
    String st4;
    SharedPreferences sharedpreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Personal Information");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_resume);

/*

        education.putExtra("page 1 info",bundl);
        education.putExtra("page 2 info","This is from page2");

        startActivity(education);
        finish();

       st = receiveIntent.getExtras().getString("Value");
       */

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {


                st = editText.getText().toString();
                st1 = editText1.getText().toString();
                st2 = editText2.getText().toString();
                st3 = editText3.getText().toString();
                st4 = editText4.getText().toString();


                sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();


                if(st.length()==0 || st.contains("(?=.*[0-9])+(?=.*[@#$%^&+=]) +(?=\\\\S+$)"))
                {
                    editText.setError("ENTER A VALID NAME");
                    return;
                }

                if(!Patterns.PHONE.matcher(st1).matches()){
                    editText1.setError("ENTER A VALID PHONE NUMBER");
                    return;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(st2).matches()){
                    editText2.setError("ENTER A VALID EMAIL ADDRESS");
                    return;
                }
                if(st3.isEmpty())
                {
                    editText3.setError("ENTER A VALID ADDRESS");
                    return;
                }
                if (st4.isEmpty()){
                    editText4.setError("ENTER A VALID LANGUAGE");
                    return;
                }

                editor.putString("name", st);
                editor.putString("phone", st1);
                editor.putString("email", st2);
                editor.putString("address", st3);
                editor.putString("language", st4);
                editor.apply();
                Intent i = new Intent(getApplicationContext(), HomePageActivity.class);
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