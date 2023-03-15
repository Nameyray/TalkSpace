package com.moringaschool.talkspace.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.moringaschool.talkspace.Auth.SignInActivity;
import com.moringaschool.talkspace.R;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000; // Time to display the splash screen in milliseconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app's main activity
                Intent i = new Intent(SplashScreen.this, SignInActivity.class);
                startActivity(i);

                // Close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}