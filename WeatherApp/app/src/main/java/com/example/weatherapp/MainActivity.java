package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button settings;
    private Button showWeather;
    private View.OnClickListener listenerClickShowWeather;
    private View.OnClickListener listenerClickSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            Toast.makeText(getApplicationContext(), R.string.startToast, Toast.LENGTH_SHORT).show();
        }
        settings = findViewById(R.id.buttonSettings);
        showWeather = findViewById(R.id.buttonShowWeather);
        listenerClickShowWeather = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScreenMainActivity.class);
                startActivity(intent);
            }
        };
        listenerClickSettings = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SettingsScreenActivity.class);
                startActivity(intent);
            }
        };
        showWeather.setOnClickListener(listenerClickShowWeather);
        settings.setOnClickListener(listenerClickSettings);
    }
}

