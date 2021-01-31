package com.example.commanapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class popup extends AppCompatActivity {
    Button popup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);
        popup = findViewById(R.id.idPopMenu);

        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(popup.this, popup);
                popupMenu.getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(getApplicationContext(), "Item Clicked: " + item.getTitle(), Toast.LENGTH_LONG).show();
                        return true;
                    }
                });
                popupMenu.show();
            }
        });

    }
}