package com.example.resumebuilder;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private static final int STORAGE_CODE = 1000;

    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;
    TextView tv10;
    TextView tv11;
    TextView tv12;
    TextView tv13;
    TextView tv14;
    TextView tv15;
    TextView tv16;
    TextView tv17;
    TextView tv18;
    TextView tv19;
    TextView tv20;
    TextView tv21;
    TextView tv22;
    TextView tv23;
    TextView tv24;
    TextView tv25;
    TextView tv26;
    TextView tv27;
    TextView tv28;
    TextView tv29;
    TextView tv30;
    TextView tv31;
    TextView tv32;

    String st16;
    String st;
    String st1;
    String st2;
    String st3;
    String st4;
    String st5;
    String st6;
    String st7;
    String st8;
    String st9;
    String st10;
    String st11;
    String st12;
    String st13;
    String st14;
    String st15;
    String s;
    String s1;
    String s2;
    String s3;
    String s4;
    String s5;
    String s6;
    String s7;
    String s8;
    String s9;
    String s10;
    String s11;
    String s12;
    String s13;
    String s14;
    String s15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("FINAL RESUME");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_);



        tv = findViewById(R.id.textView);
        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView30);
        tv5 = findViewById(R.id.textView19);
        tv8 = findViewById(R.id.textView15);
        tv6 = findViewById(R.id.textView18);
        tv7 = findViewById(R.id.textView17);
        tv9 = findViewById(R.id.textView22);
        tv10 = findViewById(R.id.textView24);
        tv11 = findViewById(R.id.textView26);
        tv12 = findViewById(R.id.textView25);
        tv13 = findViewById(R.id.textView14);
        tv14 = findViewById(R.id.textView13);
        tv15 = findViewById(R.id.textView20);
        tv16 = findViewById(R.id.textView27);
        tv17 = findViewById(R.id.textView44);
        tv18 = findViewById(R.id.textView45);
        tv19 = findViewById(R.id.textView46);
        tv20 = findViewById(R.id.textView47);
        tv21 = findViewById(R.id.textView48);
        tv22 = findViewById(R.id.textView49);

        tv23 = findViewById(R.id.textView50);
        tv24 = findViewById(R.id.textView51);
        tv25 = findViewById(R.id.textView52);
        tv26 = findViewById(R.id.textView53);
        tv27 = findViewById(R.id.textView54);
        tv28 = findViewById(R.id.textView55);
        tv29 = findViewById(R.id.textView56);
        tv30 = findViewById(R.id.textView57);
        tv31 = findViewById(R.id.textView58);
        tv32 = findViewById(R.id.textView59);

        SharedPreferences sharedPreferences = getSharedPreferences("MyData", MODE_PRIVATE);
        st5 = sharedPreferences.getString("cname","");
        st6 = sharedPreferences.getString("role","");
        st7 = sharedPreferences.getString("sdate","");
        st8 = sharedPreferences.getString("eDate","");
        st9 = sharedPreferences.getString("Position","");
        st10 = sharedPreferences.getString("InstName","");
        st11 = sharedPreferences.getString("Degree","");
        st12 = sharedPreferences.getString("Marks","");
        st = sharedPreferences.getString("name","");
        st1 = sharedPreferences.getString("phone","");
        st2 = sharedPreferences.getString("email","");
        st3 = sharedPreferences.getString("address","");
        st4 = sharedPreferences.getString("language","");
        st13 = sharedPreferences.getString("perskills","");
        st14 = sharedPreferences.getString("techskills","");
        st15 = sharedPreferences.getString("funcskills","");
        st16 = sharedPreferences.getString("summary","");
        s = sharedPreferences.getString("InstName1","");
        s1 = sharedPreferences.getString("Degree1","");
        s2 = sharedPreferences.getString("Marks1","");
        s3 = sharedPreferences.getString("InstName2","");
        s4 = sharedPreferences.getString("Degree2","");
        s5 = sharedPreferences.getString("Marks2","");
        s6 = sharedPreferences.getString("cname1","");
        s7 = sharedPreferences.getString("role1","");
        s8 = sharedPreferences.getString("sdate1","");
        s9 = sharedPreferences.getString("eDate1","");
        s10 = sharedPreferences.getString("Position1","");
        s11 = sharedPreferences.getString("cname2","");
        s12 = sharedPreferences.getString("role2","");
        s13 = sharedPreferences.getString("sdate2","");
        s14 = sharedPreferences.getString("eDate2","");
        s15 = sharedPreferences.getString("Position2","");


/*
        if(st.length() == 0 || st.equals(""))
        {
            mTel1.setVisibility(View.GONE);
        } else {
            mTel1.setVisibility(View.VISIBLE);
        }*/

        tv.setText(st);
        tv1.setText(st1);
        tv2.setText(st2);
        tv3.setText(st3);
        tv4.setText(st4);
        tv5.setText(st5);
        tv6.setText(st6);
        tv7.setText(st7);
        tv8.setText(st8);
        tv9.setText(st9);
        tv10.setText(st10);
        tv11.setText(st11);
        tv12.setText(st12);
        tv16.setText(st16);
        tv13.setText(st13);
        tv14.setText(st14);
        tv15.setText(st15);
        tv17.setText(s);
        tv18.setText(s1);
        tv19.setText(s2);
        tv20.setText(s3);
        tv21.setText(s4);
        tv22.setText(s5);

        if(s6.length() == 0 || s6.equals("") || s6 == null)
        {
            tv23.setVisibility(View.GONE);

        }
        else {
            tv23.setVisibility(View.VISIBLE);
            tv23.setText(s6);
        }
        if(s7.length() == 0 || s7.equals("") || s7 == null)
        {
            tv24.setVisibility(View.GONE);

        }
        else {
            tv24.setVisibility(View.VISIBLE);
            tv24.setText(s7);
        }
        if(s8.length() == 0 || s8.equals("") || s8 == null)
        {
            tv25.setVisibility(View.GONE);

        }
        else {
            tv25.setVisibility(View.VISIBLE);
            tv25.setText(s8);
        }
        if(s9.length() == 0 || s9.equals("") || s9 == null)
        {
            tv26.setVisibility(View.GONE);

        }
        else {
            tv26.setVisibility(View.VISIBLE);
            tv26.setText(s9);
        }

        tv27.setText(s10);
        tv28.setText(s11);
        tv29.setText(s12);
        tv30.setText(s13);
        tv31.setText(s14);
        tv32.setText(s15);

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