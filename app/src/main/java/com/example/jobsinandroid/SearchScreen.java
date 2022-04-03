package com.example.jobsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SearchScreen extends AppCompatActivity {

    public BottomNavigationView searchScreenNavBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_screen);

        searchScreenNavBar = findViewById(R.id.searchScreenNavbar);

        searchScreenNavBar.setSelectedItemId(R.id.search);
        searchScreenNavBar.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {

                case R.id.home: startActivity(new Intent(getApplicationContext(), HomeScreen.class));
                    break;

                case R.id.search:
                    break;

                case R.id.account: startActivity(new Intent(getApplicationContext(), AccountScreen.class));
                    break;

            }

            return true;
        });
    }
}