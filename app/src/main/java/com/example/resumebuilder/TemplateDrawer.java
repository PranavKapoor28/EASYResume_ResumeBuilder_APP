package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class TemplateDrawer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Select Your Templates");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_template_drawer);

        CardView cardView1 =findViewById(R.id.cardView2);
        CardView cardView2=findViewById(R.id.cardView3);
        CardView cardView3=findViewById(R.id.cardView4);
        CardView cardView4=findViewById(R.id.cardView5);
        CardView cardView5=findViewById(R.id.cardView6);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View resume) {


                Intent resumeper = new Intent(getApplicationContext(),Template2Activity.class);
                startActivity(resumeper);
            }
        });



        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View about) {


                Intent resumeedu = new Intent(getApplicationContext(), Template1Activity.class);
                startActivity(resumeedu);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumework = new Intent(getApplicationContext(), Template3Activity.class);
                startActivity(resumework);
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumeskills = new Intent(getApplicationContext(), Template5Activity.class);
                startActivity(resumeskills);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumesummary = new Intent(getApplicationContext(), Template4Activity.class);
                startActivity(resumesummary);
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


