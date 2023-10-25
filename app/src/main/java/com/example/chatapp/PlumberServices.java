package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlumberServices extends AppCompatActivity {


    Button back;
    Button buttonview;
    Button notificationButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumber_services);


        buttonview = (Button) findViewById(R.id.buttonview);
        buttonview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlumberServices.this, Home.class);
                startActivity(intent);
            }
        });

        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlumberServices.this, PlumbingList.class);
                startActivity(intent);
            }
        });
    }
}