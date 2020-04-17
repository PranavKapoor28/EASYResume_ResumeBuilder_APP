package com.example.resumebuilder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button button6;
    Button button7;
    Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"FireBase connection success",Toast.LENGTH_LONG).show();

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