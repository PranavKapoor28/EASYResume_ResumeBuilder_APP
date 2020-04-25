package com.example.resumebuilder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.resumebuilder.model.ResumeData;

public class ResumeActivity extends AppCompatActivity {
    Button button;
    Context mContext;

    EditText editText = findViewById(R.id.editText);
    EditText editText1 = findViewById(R.id.editText1);
    EditText editText2 = findViewById(R.id.editText2);
    EditText editText4 = findViewById(R.id.editText3);
    EditText editText3 = findViewById(R.id.editText4);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mContext = getBaseContext();
        super.onCreate(savedInstanceState);

        //will hide the title
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        // hide the title bar
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
                ResumeData resume = new ResumeData();

                resume.setName(editText.getText().toString());
                resume.setPhone(editText1.getText().toString());
                resume.setEmail(editText2.getText().toString());
                resume.setAddress(editText3.getText().toString());
                resume.setLanguage(editText4.getText().toString());

                validateInput(resume);

                writeToSharedPreferences(resume.getName(), resume.toString());

                startActivity(new Intent(getApplicationContext(), SecondActivity.class));
            }
        });
    }

    public void writeToSharedPreferences(String key, String value) {
        SharedPreferences sharedPref = mContext.getSharedPreferences("ResumeData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString(key, value);
        editor.commit();
    }

    public void validateInput(ResumeData resume) {
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
    }
}