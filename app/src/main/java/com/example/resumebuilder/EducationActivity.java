package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class EducationActivity extends AppCompatActivity {

    Button button3;
    Button button11;
    EditText editText10;
    EditText editText11;
    EditText editText12;
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
    DatabaseReference reff;
    Member member;
    long maxid=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_education);

        button3 = findViewById(R.id.button3);
        button11 = findViewById(R.id.button12);
        editText10 = findViewById(R.id.editText10);
        editText11 = findViewById(R.id.editText11);
        editText12 = findViewById(R.id.editText12);
        member=new Member();
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


        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view11) {
                Intent repeat1=new Intent(getApplicationContext(),EducationActivity.class);
                startActivity(repeat1);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {

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

               Intent education = new Intent(EducationActivity.this, SkillsActivity.class);

                st10 = editText10.getText().toString();
                st11 = editText11.getText().toString();
                st12= editText12.getText().toString();
                member.setName(st10);
                member.setPh(st11);
                member.setEmail(st12);

                reff.push().setValue(member);
                Toast.makeText(EducationActivity.this,"data inserted successfully",Toast.LENGTH_LONG).show();
                reff.child(String.valueOf(maxid+1)).setValue("member");

                if(st10.length()==0)
                {
                    editText10.setError("THE FIELD IS EMPTY");
                    return;
                }

                if(st11.length()==0){
                    editText11.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(st12.isEmpty()) {

                    editText12.setError("THE FIELD IS EMPTY");
                    return;
                }

                education.putExtra("Value", st);
                education.putExtra("Value1", st1);
                education.putExtra("Value2", st2);
                education.putExtra("Value3", st3);
                education.putExtra("Value4", st4);
                education.putExtra("Value5", st5);
                education.putExtra("Value6", st6);
                education.putExtra("Value7", st7);
                education.putExtra("Value8", st8);
                education.putExtra("Value9", st9);
                education.putExtra("Value10", st10);
                education.putExtra("Value11", st11);
                education.putExtra("Value12", st12);

                startActivity(education);

            }
        });
    }


}
