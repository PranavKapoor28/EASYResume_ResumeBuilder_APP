package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ActivityWork extends AppCompatActivity {

    Button button2;
    Button button10;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;
    EditText editText9;

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
    DatabaseReference reff;
    ResumeModel resume;
    long maxid=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_work);

/*

        education.putExtra("page 1 info",bundl);
        education.putExtra("page 2 info","This is from page2");

        startActivity(education);
        finish();

       st = receiveIntent.getExtras().getString("Value");
       */

        button2 = findViewById(R.id.button2);
        button10 = findViewById(R.id.button10);
        editText5 = findViewById(R.id.editText5);
        editText6 = findViewById(R.id.editText6);
        editText7 = findViewById(R.id.editText7);
        editText8 = findViewById(R.id.editText8);
        editText9 = findViewById(R.id.editText9);
        resume=new ResumeModel();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");


        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    maxid=dataSnapshot.getChildrenCount();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view10) {
                Intent repeat=new Intent(getApplicationContext(),ActivityWork.class);
                startActivity(repeat);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {

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

                Intent work = new Intent(getApplicationContext(), EducationActivity.class);

                st5 = editText5.getText().toString();
                st6 = editText6.getText().toString();
                st7 = editText7.getText().toString();
                st8 = editText8.getText().toString();
                st9 = editText9.getText().toString();

                resume.setName(st5);
                resume.setPhone(st6);
                resume.setEmail(st7);
                resume.setAddress(st8);
                resume.setLanguage(st9);


                if(st5.length()==0)
                {
                    editText5.setError("ENTER A VALID COMPANY NAME");
                    return;
                }

                if(st6.length()==0){
                    editText6.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(st7.isEmpty())
                {

                    editText7.setError("ENTER A VALID DATE");
                    return;
                }
                if(st8.isEmpty())
                {
                    editText8.setError("ENTER A VALID DATE");
                    return;
                }
                if (st9.isEmpty()){
                    editText9.setError("THE FIELD IS EMPTY");
                    return;
                }

                work.putExtra("Value", st);
                work.putExtra("Value1", st1);
                work.putExtra("Value2", st2);
                work.putExtra("Value3", st3);
                work.putExtra("Value4", st4);
                work.putExtra("Value5", st5);
                work.putExtra("Value6", st6);
                work.putExtra("Value7", st7);
                work.putExtra("Value8", st8);
                work.putExtra("Value9", st9);


      /*  button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view1) {


                Intent i = new Intent(ActivityWork.this, SecondActivity.class);


        /*
                i.putExtra("Value", st);
                i.putExtra("Value1", st1);
                i.putExtra("Value2", st2);
                i.putExtra("Value3", st3);
        /*i.putExtra("Value5", st5);
        i.putExtra("Value6", st6);
        i.putExtra("Value7", st7);
        i.putExtra("Value8", st8);
        i.putExtra("Value9", st9);

*/
                startActivity(work);

            }
        });
    }
}