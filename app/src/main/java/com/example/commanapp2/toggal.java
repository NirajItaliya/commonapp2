package com.example.commanapp2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class toggal extends AppCompatActivity {
    Switch switch1, switch2, switch3;
    ToggleButton toggle, toggle1, toggle2;

    public static final String SHARED_PREFS = "sharedPrefs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        setContentView(R.layout.activity_toggal);
        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        switch3 = findViewById(R.id.switch3);

        toggle = findViewById(R.id.toggle);
        toggle1 = findViewById(R.id.toggle1);
        toggle2 = findViewById(R.id.toggle2);
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("toggle", toggle.isChecked());
                editor.apply();
                Toast.makeText(toggal.this, "toggle1 data save", Toast.LENGTH_SHORT).show();
            }
        });

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("switch1", switch1.isChecked());
                editor.apply();
                Toast.makeText(toggal.this, "switch1 Data saved", Toast.LENGTH_SHORT).show();
            }
        });
        switch1.setChecked(sharedPreferences.getBoolean("switch1", false));
        toggle.setChecked(sharedPreferences.getBoolean("toggle", false));
        toggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("toggle1", toggle1.isChecked());
                editor.apply();
                Toast.makeText(toggal.this, "toggle2 data save", Toast.LENGTH_SHORT).show();
            }
        });

        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("switch2", switch2.isChecked());
                editor.apply();
                Toast.makeText(toggal.this, "switch2 Data saved", Toast.LENGTH_SHORT).show();
            }
        });
        switch2.setChecked(sharedPreferences.getBoolean("switch2", false));
        toggle1.setChecked(sharedPreferences.getBoolean("toggle1", false));
        toggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("toggle2", toggle2.isChecked());
                editor.apply();
                Toast.makeText(toggal.this, "toggle3 data save", Toast.LENGTH_SHORT).show();
            }
        });

        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putBoolean("switch3", switch3.isChecked());
                editor.apply();
                Toast.makeText(toggal.this, "switch3 Data saved", Toast.LENGTH_SHORT).show();
            }
        });
        switch3.setChecked(sharedPreferences.getBoolean("switch3", false));
        toggle2.setChecked(sharedPreferences.getBoolean("toggle2", false));

    }
}
