package com.example.dressify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class LoadingScreen extends AppCompatActivity {
    private long loading_time = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        final Runnable r = new Runnable() {
            public void run() {
                startActivity(this, MainActivity);
            }
        };

        }
//        Handler.postDelayed({
//                startActivity(Intent (this, MainActivity));
//                finish();
//        }, loading_time)
    }

}