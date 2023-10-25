package com.example.chatapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.Intent; // Import the Intent class

import com.example.chatapp.activities.MainActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.HashMap;
import java.util.Map;

public class SPP_MainActivity extends AppCompatActivity {

    BottomNavigationView btmnavview;
    Prof_Home homefrag = new Prof_Home();
    Prof_Calendar calendarfrag = new Prof_Calendar();
    Prof_Profile profilefrag = new Prof_Profile();


    private Map<Integer, Fragment> fragmentMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spp_main);

        btmnavview = findViewById(R.id.navbar101);

        // Map your menu items to the corresponding fragments
        fragmentMap.put(R.id.Home, homefrag);
        fragmentMap.put(R.id.calendar, calendarfrag);
        fragmentMap.put(R.id.u_acc, profilefrag);

        getSupportFragmentManager().beginTransaction().replace(R.id.spflFragment, homefrag).commit();

        btmnavview.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.chat) {
                    // Create an Intent to start the ChatActivity
                    Intent intent = new Intent(SPP_MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    return true;
                } else {
                    // Handle other menu items here
                    Fragment selectedFragment = fragmentMap.get(item.getItemId());
                    if (selectedFragment != null) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.spflFragment, selectedFragment).commit();
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
