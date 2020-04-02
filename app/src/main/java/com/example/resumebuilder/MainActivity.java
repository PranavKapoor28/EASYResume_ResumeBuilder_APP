package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button6;
    Button button7;
    Button button8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Firebase connection success",Toast.LENGTH_LONG).show();

        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View resume) {


                Intent resumecreate = new Intent(getApplicationContext(), ResumeActivity.class);
                startActivity(resumecreate);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View about) {


                Intent resumeabout = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(resumeabout);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumecontact = new Intent(getApplicationContext(), ContactResume.class);
                startActivity(resumecontact);
            }
        });
    }

}