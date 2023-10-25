package com.example.chatapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Equipment extends AppCompatActivity {

    Button back;
    Button buttonview;
    Button notificationButton;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment);


        buttonview = (Button) findViewById(R.id.buttonview);
        buttonview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Equipment.this,Home.class);
                startActivity(intent);
            }
        });

        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Equipment.this,ElecList.class);
                startActivity(intent);
            }
        });

      /*  notificationButton = (Button) findViewById(R.id.notificationButton);
        notificationButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Equipment.this,ViewNotifi.class);
                startActivity(intent);
            }
        });
*/

    }

}
