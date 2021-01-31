package com.example.commanapp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class drawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public Toolbar toolbar;
    /* Button Button1;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        toolbar = findViewById(R.id.toolbar);
    /*    Button1 = findViewById(R.id.buton1);*/
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();
       /* Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                            }
        });
*/
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.idItem1) {
            //Write Your Logic Here
           startActivity(new Intent(drawer.this,email.class));
        } else if (id == R.id.idItem2) {
            //Write Your Logic Here
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();

        } else if (id == R.id.idItem3) {
            //Write Your Logic Here
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.idItem4) {
            //Write Your Logic Here
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.idItem5) {
            //Write Your Logic Here
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.idItem6) {
            //Write Your Logic Here
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        } else if (id == R.id.idItem7) {
            //Write Your Logic Here
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
