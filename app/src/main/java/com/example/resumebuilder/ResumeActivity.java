package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
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

import java.util.regex.Pattern;

public class ResumeActivity extends AppCompatActivity {

    private static final Pattern PHONE_NUMBER =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{5,}" +               //at least 4 characters
                    "$");
    Button button;
    EditText editText1;
    EditText editText;
    EditText editText2;
    EditText editText4;
    EditText editText3;
    String st;
    String st1;
    String st2;
    String st3;
    String st4;
    DatabaseReference reff;
    Member member;
    long maxid=0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_resume);


        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
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

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent(getApplicationContext(), SecondActivity.class);

                st = editText.getText().toString();
                st1 = editText1.getText().toString();
                st2 = editText2.getText().toString();
                st3 = editText3.getText().toString();
                st4 = editText4.getText().toString();

                member.setName(st);
                member.setPh(st1);
                member.setEmail(st2);
                member.setAdd(st3);
                member.setLang(st4);
                reff.push().setValue(member);
                Toast.makeText(ResumeActivity.this,"data inserted successfully",Toast.LENGTH_LONG).show();
                reff.child(String.valueOf(maxid+1)).setValue("member");

                if(st.length()==0 || st.contains("(?=.*[0-9])+(?=.*[@#$%^&+=]) +(?=\\\\S+$)"))
                {
                    editText.setError("ENTER A VALID NAME");
                    return;
                }

                if(!Patterns.PHONE.matcher(st1).matches()){
                    editText1.setError("ENTER A VALID PHONE NUMBER");
                    return;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(st2).matches()){
                    editText2.setError("ENTER A VALID EMAIL ADDRESS");
                    return;
                }
                if(st3.isEmpty())
                {
                    editText3.setError("ENTER A VALID ADDRESS");
                    return;
                }
                if (st4.isEmpty()){
                    editText4.setError("ENTER A VALID LANGUAGE");
                    return;
                }

                in.putExtra("Value", st);
                in.putExtra("Value1", st1);
                in.putExtra("Value2", st2);
                in.putExtra("Value3", st3);
                in.putExtra("Value4", st4);
                startActivity(in);

               /*Intent i=new Intent(MainActivity.this,SecondActivity.class);


                st=editText.getText().toString();
                st1=editText1.getText().toString();
                st2=editText2.getText().toString();
                st3=editText3.getText().toString();
                st4=editText4.getText().toString();
                i.putExtra("Value",st);
                i.putExtra("Value1",st1);
                i.putExtra("Value2",st2);
                i.putExtra("Value3",st3);


                startActivity(i);
                finish();*/
            }
        });


    }

}


