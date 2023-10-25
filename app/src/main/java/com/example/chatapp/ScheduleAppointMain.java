package com.example.chatapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ScheduleAppointMain extends AppCompatActivity {
    Button buttonview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_appoint_main);

        buttonview = (Button) findViewById(R.id.buttonview);
        buttonview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScheduleAppointMain.this,Equipment.class);
                startActivity(intent);
            }
        });

    }
}