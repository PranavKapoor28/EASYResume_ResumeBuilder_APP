/*package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {


    private int SLEEP_TIMER=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        LogoLauncher logoLauncher=new LogoLauncher();
        logoLauncher.start();

 }

 private class LogoLauncher extends Thread{
        public void run(){
            try {
                sleep(1000*SLEEP_TIMER);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Intent splash=new Intent(SplashActivity.this,MainActivity.class);
            startActivity(splash);
            SplashActivity.this.finish();
     }
     }
 }*/
