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

public class ActivitySummary extends AppCompatActivity {

    Button button5;
    EditText editText16;

    String st16;
    FirebaseDatabase rootNode;
    DatabaseReference reference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Professional Summary");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_summary);
        button5 = findViewById(R.id.button5);
        editText16 = findViewById(R.id.editText16);

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {


                Intent summary = new Intent(ActivitySummary.this, Template1Activity.class);
                rootNode=FirebaseDatabase.getInstance();
                reference=rootNode.getReference().child("Professional Summary Info");
                st16 = editText16.getText().toString();

                SummaryHelperClass summaryHelperClass=new SummaryHelperClass(st16);

                reference.child(st16).setValue(summaryHelperClass);

                if(st16.length()==0)
                {
                    editText16.setError("THE FIELD IS EMPTY");
                    return;
                }

                SharedPreferences sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("summary", st16);

                editor.apply();
                Intent i = new Intent(ActivitySummary.this, HomePageActivity.class);
                startActivity(i);



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
