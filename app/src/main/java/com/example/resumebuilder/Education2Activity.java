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

public class Education2Activity extends AppCompatActivity {

    Button b;
    Button b1;
    EditText e;
    EditText e1;
    EditText e2;

    String s;
    String s1;
    String s2;

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
        setContentView(R.layout.activity_education2);

        b = findViewById(R.id.b);
        b1 = findViewById(R.id.b1);
        e = findViewById(R.id.e);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);

        sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view11) {


                rootNode1=FirebaseDatabase.getInstance();
                reference1=rootNode1.getReference().child("Educational Info");
                s = e.getText().toString();
                s1 = e1.getText().toString();
                s2= e2.getText().toString();

                EducationHelperClass educationHelperClass=new EducationHelperClass(s,s1,s2);

                reference1.child(s1).setValue(educationHelperClass);


                if(s.length()==0)
                {
                    e.setError("THE FIELD IS EMPTY");
                    return;
                }

                if(s1.length()==0){
                    e1.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(s2.isEmpty()) {

                    e2.setError("THE FIELD IS EMPTY");
                    return;
                }

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("InstName1", s);
                editor.putString("Degree1", s1);
                editor.putString("Marks1", s2);
                editor.apply();
                Intent in = new Intent(Education2Activity.this, HomePageActivity.class);
                startActivity(in);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {

                rootNode1=FirebaseDatabase.getInstance();
                reference1=rootNode1.getReference().child("Educational Info");
                s = e.getText().toString();
                s1 = e1.getText().toString();
                s2= e2.getText().toString();

                EducationHelperClass educationHelperClass=new EducationHelperClass(s,s1,s2);

                reference1.child(s1).setValue(educationHelperClass);

                if(s.length()==0)
                {
                    e.setError("THE FIELD IS EMPTY");
                    return;
                }

                if(s1.length()==0){
                    e1.setError("THE FIELD IS EMPTY");
                    return;
                }
                if(s2.isEmpty()) {

                    e2.setError("THE FIELD IS EMPTY");
                    return;
                }

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("InstName1", s);
                editor.putString("Degree1", s1);
                editor.putString("Marks1", s2);
                editor.commit();
                Intent i = new Intent(getApplicationContext(), Education3Activity.class);
                startActivity(i);

            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), EducationActivity.class);
        startActivityForResult(myIntent, 0);

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}
