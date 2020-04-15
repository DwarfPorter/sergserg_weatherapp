package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsScreenActivity extends AppCompatActivity {
    private Button saveChanges;
    private View.OnClickListener listenerSaveChanges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_settings);

        saveChanges = findViewById(R.id.buttonSaveChanges);
        listenerSaveChanges = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsScreenActivity.this, SettingsScreenActivity.class);
                startActivity(intent);
            }
        };
        saveChanges.setOnClickListener(listenerSaveChanges);
    }
}
