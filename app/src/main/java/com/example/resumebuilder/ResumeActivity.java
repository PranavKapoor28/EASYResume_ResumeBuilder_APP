package com.example.resumebuilder;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ResumeActivity extends AppCompatActivity {
    Button button;
    Context mContext;
    String st;
    String st1;
    String st2;
    String st3;
    String st4;

    EditText editText = findViewById(R.id.editText);
    EditText editText1 = findViewById(R.id.editText1);
    EditText editText2 = findViewById(R.id.editText2);
    EditText editText4 = findViewById(R.id.editText3);
    EditText editText3 = findViewById(R.id.editText4);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mContext = getBaseContext();
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();

        //enable full screen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_resume);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                st = editText.getText().toString();
                st1 = editText1.getText().toString();
                st2 = editText2.getText().toString();
                st3 = editText3.getText().toString();
                st4 = editText4.getText().toString();

                Intent i=new Intent(getApplicationContext(),EducationActivity.class);
                i.putExtra(st,"value");
                i.putExtra(st1,"value1");
                i.putExtra(st2,"value2");
                i.putExtra(st3,"value3");
                i.putExtra(st4,"value4");



               startActivity(i);



/*
                writeToSharedPreferences(resume.getName(), resume.toString());

                startActivity(new Intent(getApplicationContext(), SecondActivity.class));*/
            }
        });
    }
/*
    public void writeToSharedPreferences(String key, String value) {
        SharedPreferences sharedPref = mContext.getSharedPreferences("ResumeModel", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public void validateInput(ResumeModel resume) {
        if(resume.getName().length()==0 || resume.getName().contains("(?=.*[0-9])+(?=.*[@#$%^&+=]) +(?=\\\\S+$)"))
        {
            editText.setError("ENTER A VALID NAME");
            return;
        }

        if(!Patterns.PHONE.matcher(resume.getPhone()).matches()){
            editText1.setError("ENTER A VALID PHONE NUMBER");
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(resume.getEmail()).matches()){
            editText2.setError("ENTER A VALID EMAIL ADDRESS");
            return;
        }
        if(resume.getAddress().isEmpty())
        {
            editText3.setError("ENTER A VALID ADDRESS");
            return;
        }
        if (resume.getLanguage().isEmpty()){
            editText4.setError("ENTER A VALID LANGUAGE");
            return;
        }
    }*/
}