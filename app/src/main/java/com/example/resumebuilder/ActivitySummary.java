package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitySummary extends AppCompatActivity {

    Button button5;
    EditText editText16;
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
    String st16;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_summary);
        button5 = findViewById(R.id.button5);
        editText16 = findViewById(R.id.editText16);


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {


                Intent receiveIntent = getIntent();
                st = receiveIntent.getStringExtra("Value");
                st1 = receiveIntent.getStringExtra("Value1");
                st2 = receiveIntent.getStringExtra("Value2");
                st3 = receiveIntent.getStringExtra("Value3");
                st4 = receiveIntent.getStringExtra("Value4");
                st5 = receiveIntent.getStringExtra("Value5");
                st6 = receiveIntent.getStringExtra("Value6");
                st7 = receiveIntent.getStringExtra("Value7");
                st8 = receiveIntent.getStringExtra("Value8");
                st9 = receiveIntent.getStringExtra("Value9");
                st10 = receiveIntent.getStringExtra("Value10");
                st11 = receiveIntent.getStringExtra("Value11");
                st12 = receiveIntent.getStringExtra("Value12");
                st13 = receiveIntent.getStringExtra("Value13");
                st14 = receiveIntent.getStringExtra("Value14");
                st15 = receiveIntent.getStringExtra("Value15");
                st16 = receiveIntent.getStringExtra("Value16");


                Intent summary = new Intent(ActivitySummary.this, SecondActivity.class);

                st16 = editText16.getText().toString();

                if(st16.length()==0)
                {
                    editText16.setError("THE FIELD IS EMPTY");
                    return;
                }

                summary.putExtra("Value", st);
                summary.putExtra("Value1", st1);
                summary.putExtra("Value2", st2);
                summary.putExtra("Value3", st3);
                summary.putExtra("Value4", st4);
                summary.putExtra("Value5", st5);
                summary.putExtra("Value6", st6);
                summary.putExtra("Value7", st7);
                summary.putExtra("Value8", st8);
                summary.putExtra("Value9", st9);
                summary.putExtra("Value10", st10);
                summary.putExtra("Value11", st11);
                summary.putExtra("Value12", st12);
                summary.putExtra("Value13", st13);
                summary.putExtra("Value14", st14);
                summary.putExtra("Value15", st15);
                summary.putExtra("Value16", st16);

                startActivity(summary);
                finish();


            }
        });
    }
}

