package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
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

        Intent receiveIntent=getIntent();

        Bundle extras=receiveIntent.getExtras();
        st   = receiveIntent.getStringExtra("Value");
        st1  = receiveIntent.getStringExtra("Value1");
        st2  = receiveIntent.getStringExtra("Value2");
        st3  = receiveIntent.getStringExtra("Value3");
        st4  = receiveIntent.getStringExtra("Value4");
        st5  = receiveIntent.getStringExtra("Value5");
        st6  = receiveIntent.getStringExtra("Value6");
        st7  = receiveIntent.getStringExtra("Value7");
        st8  = receiveIntent.getStringExtra("Value8");
        st9  = receiveIntent.getStringExtra("Value9");
        st10 = receiveIntent.getStringExtra("Value10");
        st11 = receiveIntent.getStringExtra("Value11");
        st12 = receiveIntent.getStringExtra("Value12");
        st13 = receiveIntent.getStringExtra("Value13");
        st14 = receiveIntent.getStringExtra("Value14");
        st15 = receiveIntent.getStringExtra("Value15");
        st16 = receiveIntent.getStringExtra("Value16");

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
        tv13.setText(st13);
        tv14.setText(st14);
        tv15.setText(st15);
        tv16.setText(st16);
    }
}