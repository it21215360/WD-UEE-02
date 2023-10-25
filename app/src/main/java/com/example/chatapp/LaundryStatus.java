package com.example.chatapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chatapp.utilities.PreferenceManager;

public class LaundryStatus extends AppCompatActivity {

    private PreferenceManager preferenceManager;
    Button btnFeed;
    ImageView navStatus;
    TextView txtMainStatus2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry_status);



        // Retrieve the status information from the intent
        String status = getIntent().getStringExtra("status");
        String userEmail = getIntent().getStringExtra("userEmail");

        TextView userEmailTextView = findViewById(R.id.userEmail);
        userEmailTextView.setText(userEmail);
        btnFeed = findViewById(R.id.btnFeed);
        navStatus = findViewById(R.id.navStatus);
        txtMainStatus2 = findViewById(R.id.txtMainStatus2);
        txtMainStatus2.setText(status);

        btnFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LaundryFeedback.class);
                startActivity(intent);
                finish();
            }
        });

        navStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LaundryMain.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
