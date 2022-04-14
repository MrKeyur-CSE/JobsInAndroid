package com.example.jobsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AccountScreen extends AppCompatActivity {

    public BottomNavigationView accountScreenNavBar;
    private Button appliedBtn;
    private Button settingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_screen);

        accountScreenNavBar = findViewById(R.id.accountScreenNavbar);
        appliedBtn = findViewById(R.id.appliedbtn);
        settingBtn = findViewById(R.id.settingbtn);

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

        appliedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AppliedScreen.class);
                startActivity(intent);
            }
        });

        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SettingScreen.class);
                startActivity(intent);
            }
        });
    }
}