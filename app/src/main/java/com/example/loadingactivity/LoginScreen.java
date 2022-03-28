package com.example.loadingactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity implements View.OnClickListener{

    public Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        login = (Button) findViewById(R.id.loginb);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }
}