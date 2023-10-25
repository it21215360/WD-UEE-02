package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlumbingList extends AppCompatActivity {
    Button buttonuser2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumbing_list);
        buttonuser2 = (Button) findViewById(R.id.buttonuser2);
        buttonuser2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlumbingList.this,ScheduleAppointMainTwo.class);
                startActivity(intent);
            }
        });
    }

}