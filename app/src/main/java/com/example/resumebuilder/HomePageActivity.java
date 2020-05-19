package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("EasyRESUME");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_home_page);

        LinearLayout linearLayout1=findViewById(R.id.list1);
        LinearLayout linearLayout2=findViewById(R.id.list2);
        LinearLayout linearLayout3=findViewById(R.id.list3);
        LinearLayout linearLayout4=findViewById(R.id.list4);
        LinearLayout linearLayout5=findViewById(R.id.list5);
        LinearLayout linearLayout6=findViewById(R.id.list6);


        linearLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View resume) {


                Intent resumeper = new Intent(getApplicationContext(), ResumeActivity.class);
                startActivity(resumeper);
            }
        });

        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View about) {


                Intent resumeedu = new Intent(getApplicationContext(), EducationActivity.class);
                startActivity(resumeedu);
            }
        });

        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumework = new Intent(getApplicationContext(), ActivityWork.class);
                startActivity(resumework);
            }
        });

        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumeskills = new Intent(getApplicationContext(), SkillsActivity.class);
                startActivity(resumeskills);
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumesummary = new Intent(getApplicationContext(), ActivitySummary.class);
                startActivity(resumesummary);
            }
        });

        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RESUME) {


                Intent resume = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(resume);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}


