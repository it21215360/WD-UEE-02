package com.example.chatapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView; // Import ImageView

import androidx.appcompat.app.AppCompatActivity;

import com.example.chatapp.activities.AllServices;

public class Home extends AppCompatActivity {
    Button elec;
    Button Customer;
    ImageView navMainPage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        elec = (Button) findViewById(R.id.elec);
        elec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String serviceType = getIntent().getStringExtra("serviceType");
                if ("plumbing".equals(serviceType)) {
                    Intent intent = new Intent(Home.this, PlumbingList.class);
                    startActivity(intent);
                } else if ("electrical".equals(serviceType)) {
                    Intent intent = new Intent(Home.this, ElecList.class);
                    startActivity(intent);
                }
            }
        });

        Customer = (Button) findViewById(R.id.Customer);
        Customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Home.this, MainActivityElec.class);
                startActivity(intent);
            }
        });

        navMainPage = (ImageView) findViewById(R.id.navMainPage);
        navMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the main page (add your code here)
                Intent intent = new Intent(Home.this, AllServices.class);
                startActivity(intent);
            }
        });
    }
}
