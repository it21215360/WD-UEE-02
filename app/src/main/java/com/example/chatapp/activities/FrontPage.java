package com.example.chatapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.chatapp.R;
/*import com.example.chatapp.activities.Login;*/

import java.util.Timer;
import java.util.TimerTask;

public class FrontPage extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Create an Intent to start the Login activity.
                Intent intent = new Intent(FrontPage.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        }, 5000);


    }
}
