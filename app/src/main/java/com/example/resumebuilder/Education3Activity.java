package com.example.resumebuilder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Education3Activity extends AppCompatActivity {

    Button b2;
    EditText e3;
    EditText e4;
    EditText e5;

    String s3;
    String s4;
    String s5;

    SharedPreferences sharedpreferences;
    FirebaseDatabase rootNode1;
    DatabaseReference reference1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Education Background");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_education3);

        b2 = findViewById(R.id.b2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);
        e5 = findViewById(R.id.e5);

        sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3){

                rootNode1=FirebaseDatabase.getInstance();
                reference1=rootNode1.getReference().child("Educational Info");

                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();

                EducationHelperClass educationHelperClass=new EducationHelperClass(s3,s4,s5);

                reference1.child(s4).setValue(educationHelperClass);

                if(s3.length()==0)
                {
                    e3.setError("THE FIELD IS EMPTY");
                    return;
                }

                if(s4.length()==0){
                    e4.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(s5.isEmpty()){

                    e5.setError("THE FIELD IS EMPTY");
                    return;
                }

                SharedPreferences.Editor editor=sharedpreferences.edit();

                editor.putString("InstName2",s3);
                editor.putString("Degree2",s4);
                editor.putString("Marks2",s5);
                editor.commit();
                Intent i=new Intent(Education3Activity.this,HomePageActivity.class);
                startActivity(i);

            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), Education2Activity.class);
        startActivityForResult(myIntent, 0);

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}
