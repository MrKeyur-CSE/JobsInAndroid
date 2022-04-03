package com.example.jobsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {

    public BottomNavigationView homeScreenNavBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        homeScreenNavBar = findViewById(R.id.homeScreenNavbar);

        homeScreenNavBar.setSelectedItemId(R.id.home);
        homeScreenNavBar.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {

                case R.id.home:
                    break;

                case R.id.search: startActivity(new Intent(getApplicationContext(), SearchScreen.class));
                    break;

                case R.id.account: startActivity(new Intent(getApplicationContext(), AccountScreen.class));
                    break;

            }

            return true;
        });
    }
}