package com.moringaschool.talkspace.Auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.moringaschool.talkspace.Activities.MainActivity;
import com.moringaschool.talkspace.R;

public class SignInActivity extends AppCompatActivity {
    AppCompatButton loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        loginBtn = findViewById(R.id.signin);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this, MainActivity.class));
                finish();
            }
        });

    }

    public void register(View view) {
        startActivity(new Intent(SignInActivity.this, RegisterActivity.class));
        finish();
    }

}