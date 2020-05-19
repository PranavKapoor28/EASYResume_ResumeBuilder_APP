package com.example.resumebuilder;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("EasyRESUME");

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_main);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View resume) {


                Intent resumecreate = new Intent(getApplicationContext(), HomePageActivity.class);
                startActivity(resumecreate);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View about) {


                Intent resumeabout = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(resumeabout);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CONTACT) {


                Intent resumecontact = new Intent(getApplicationContext(), ContactResume.class);
                startActivity(resumecontact);
            }
        });

button9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View delete) {

alertMessage();
        }
    });
}



    public void alertMessage() {
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case DialogInterface.BUTTON_POSITIVE:
                        // Yes button clicked
                        SharedPreferences preferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);

                        SharedPreferences.Editor editor = preferences.edit();
                        editor.clear().apply(); //remove all
                        Toast.makeText(MainActivity.this, "Your Resume Has Been Deleted",
                                Toast.LENGTH_LONG).show();
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        // No button clicked
                        // do nothing


                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to delete? All your data will be lost.")
                .setPositiveButton("Yes", dialogClickListener)
                .setNegativeButton("No", dialogClickListener).show();
    }


}