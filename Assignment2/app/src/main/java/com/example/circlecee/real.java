package com.example.circlecee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class real extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);
       // Toolbar tool=findViewById(R.layout.toolbar);
        //setActionBar(tool);
        BottomNavigationView navigationView= findViewById(R.id.bottom_nav);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment sel=null;
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        sel=new Home();
                        break;
                    case R.id.nav_prof:
                        sel=new profile();
                        break;
                    case R.id.nav_search:
                        sel=new Search();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,sel).commit();
                return true;
            }
        });
    }
}
