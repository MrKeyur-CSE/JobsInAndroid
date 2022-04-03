package com.example.jobsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AccountScreen extends AppCompatActivity {

    public BottomNavigationView accountScreenNavBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_screen);

        accountScreenNavBar = findViewById(R.id.accountScreenNavbar);

        accountScreenNavBar.setSelectedItemId(R.id.account);
        accountScreenNavBar.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {

                case R.id.home: startActivity(new Intent(getApplicationContext(), HomeScreen.class));
                    break;

                case R.id.search: startActivity(new Intent(getApplicationContext(), SearchScreen.class));
                    break;

                case R.id.account:
                    break;

            }

            return true;
        });
    }
}