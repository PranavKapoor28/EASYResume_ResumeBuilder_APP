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

public class SkillsActivity extends AppCompatActivity {
    Button button4;
    EditText editText13;
    EditText editText14;
    EditText editText15;

    String st13;
    String st14;
    String st15;
    FirebaseDatabase rootNode1;
    DatabaseReference reference1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("SKILLS");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
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

                Intent skills = new Intent(SkillsActivity.this, HomePageActivity.class);


                rootNode1=FirebaseDatabase.getInstance();
                reference1=rootNode1.getReference().child("Skills Info");
                st13 = editText13.getText().toString();
                st14 = editText14.getText().toString();
                st15= editText15.getText().toString();

                SkillsHelperActivity skillsHelperActivity =new SkillsHelperActivity(st13,st14,st15);

                reference1.child(st13).setValue(skillsHelperActivity);

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

                SharedPreferences sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("perskills", st13);
                editor.putString("techskills", st14);
                editor.putString("funcskills", st15);

                editor.apply();


                startActivity(skills);

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
