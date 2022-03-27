package com.example.loadingactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class home extends AppCompatActivity implements View.OnClickListener{

    public CardView cardShirts, cardPants, cardDresses, cardCam, cardSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cardShirts = (CardView) findViewById(R.id.cshirt);
        cardPants = (CardView) findViewById(R.id.cpant);
        cardDresses = (CardView) findViewById(R.id.cdress);
        cardCam = (CardView) findViewById(R.id.ccamera);
        cardSet = (CardView) findViewById(R.id.csetting);

        cardShirts.setOnClickListener(this);
        cardPants.setOnClickListener(this);
        cardDresses.setOnClickListener(this);
        cardCam.setOnClickListener(this);
        cardSet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()){
            case R.id.cshirt:
                i = new Intent(this, shirts.class);
                startActivity(i);
                break;
            case R.id.cpant:
                i = new Intent(this, pants.class);
                startActivity(i);
                break;
            case R.id.cdress:
                i = new Intent(this, dresses.class);
                startActivity(i);
                break;
        }
    }
}