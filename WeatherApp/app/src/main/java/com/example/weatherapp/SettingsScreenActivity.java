package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsScreenActivity extends AppCompatActivity {
    public static final String MY_LOG = "MyLog";
    private Button saveChanges;
    private View.OnClickListener listenerSaveChanges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_settings);
        Log.d(MY_LOG, "SettingsScreenActivity onCreate()");
        saveChanges = findViewById(R.id.buttonSaveChanges);
        listenerSaveChanges = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingsScreenActivity.this, ScreenMainActivity.class);
                startActivity(intent);
                Log.d(MY_LOG, "SettingsScreenActivity onClick() SaveChanges");
            }
        };
        saveChanges.setOnClickListener(listenerSaveChanges);
    }


}
