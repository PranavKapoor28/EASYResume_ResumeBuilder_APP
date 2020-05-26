package com.example.resumebuilder;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ResumeActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;

    String st;
    String st1;
    String st2;
    String st3;
    String st4;
    SharedPreferences sharedpreferences;
    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("PERSONAL INFORMATION");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_resume);


        button = findViewById(R.id.button);

        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);

/*
        Cursor cursor=database.rawQuery("SELECT * FROM personal_table",new String[]{});
        if(cursor!=null){
            cursor.moveToFirst();
        }
            StringBuilder builder=new StringBuilder();
        do{
            String Name=cursor.getString(0);
            String Phone=cursor.getString(1);
            String Email=cursor.getString(2);
            String Address=cursor.getString(3);
            String Language=cursor.getString(4);

            builder.append("NAME -" + Name + "PHONE -" + Phone + "EMAIL -"+ Email + "ADDRESS" + Address + "LANGUAGE" + Language);

        }
        while
        (
                cursor.moveToFirst()
        );
*/
        sharedpreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view10) {
                rootNode=FirebaseDatabase.getInstance();
                reference=rootNode.getReference().child("Personal Info");

                st = editText.getText().toString();
                st1 = editText1.getText().toString();
                st2 = editText2.getText().toString();
                st3 = editText3.getText().toString();
                st4 = editText4.getText().toString();

                ResumeHelperClass resumeHelperClass=new ResumeHelperClass(st,st1,st2,st3,st4);

                reference.child(st1).setValue(resumeHelperClass);


                /*boolean isInserted =db.insertData(editText.getText().toString(),editText1.getText().toString(),editText2.getText().toString(),editText3.getText().toString());
                if(isInserted==true)
                {
                    Toast.makeText(ResumeActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                }
                    db.insertData(st,st1,st2,st3,st4);
                        Toast.makeText(ResumeActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();*/



                if (st.length() == 0 || st.contains("(?=.*[0-9])+(?=.*[@#$%^&+=]) +(?=\\\\S+$)")) {
                    editText.setError("ENTER A VALID NAME");
                    return;
                }

                if (!Patterns.PHONE.matcher(st1).matches()) {
                    editText1.setError("Enter  Valid Phone Number");
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(st2).matches()) {
                    editText2.setError("ENTER A VALID EMAIL ADDRESS");
                    return;
                }
                if (st3.isEmpty()) {
                    editText3.setError("ENTER A VALID ADDRESS");
                    return;
                }
                if (st4.isEmpty()) {
                    editText4.setError("ENTER A VALID LANGUAGE");
                    return;
                }

                SharedPreferences.Editor editor = sharedpreferences.edit();

                editor.putString("name", st);
                editor.putString("phone", st1);
                editor.putString("email", st2);
                editor.putString("address", st3);
                editor.putString("language", st4);
                editor.apply();
                Intent i = new Intent(ResumeActivity.this, HomePageActivity.class);
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