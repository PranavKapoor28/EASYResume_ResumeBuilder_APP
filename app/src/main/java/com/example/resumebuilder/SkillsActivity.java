package com.example.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class SkillsActivity extends AppCompatActivity {
    Button button4;
    EditText editText13;
    EditText editText14;
    EditText editText15;
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
        setContentView(R.layout.activity_skills);
        button4 = findViewById(R.id.button4);
        editText13 = findViewById(R.id.editText13);
        editText14 = findViewById(R.id.editText14);
        editText15 = findViewById(R.id.editText15);


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {

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

                Intent skills = new Intent(SkillsActivity.this, ActivitySummary.class);

                st13 = editText13.getText().toString();
                st14 = editText14.getText().toString();
                st15= editText15.getText().toString();

                if(st13.length()==0)
                {
                    editText13.setError("THE FIELD IS EMPTY");
                    return;
                }

                if(st14.length()==0){
                    editText14.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(st15.isEmpty()) {

                    editText15.setError("THE FIELD IS EMPTY");
                    return;
                }


                skills.putExtra("Value", st);
                skills.putExtra("Value1", st1);
                skills.putExtra("Value2", st2);
                skills.putExtra("Value3", st3);
                skills.putExtra("Value4", st4);
                skills.putExtra("Value5", st5);
                skills.putExtra("Value6", st6);
                skills.putExtra("Value7", st7);
                skills.putExtra("Value8", st8);
                skills.putExtra("Value9", st9);
                skills.putExtra("Value10", st10);
                skills.putExtra("Value11", st11);
                skills.putExtra("Value12", st12);
                skills.putExtra("Value13", st13);
                skills.putExtra("Value14", st14);
                skills.putExtra("Value15", st15);

                startActivity(skills);

            }
        });
    }
}
