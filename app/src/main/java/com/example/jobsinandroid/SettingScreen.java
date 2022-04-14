package com.example.jobsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingScreen extends AppCompatActivity {

    private TextView backbtn;
    private Button editProfilrBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_screen);

        backbtn = findViewById(R.id.backBtn);
        editProfilrBtn = findViewById(R.id.editprofileBtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AccountScreen.class);
                startActivity(intent);
            }
        });

        editProfilrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), EditaccountScreen.class);
                startActivity(intent);
            }
        });
    }
}