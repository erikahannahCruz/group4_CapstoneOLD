package com.example.group4_capstone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem ;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //Bottom Button Navigation

        //Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        //Set Map selected
        bottomNavigationView.setSelectedItemId(R.id.Profile);

        //Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.Schedule:
                        startActivity (new Intent (getApplicationContext(), Schedule.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Map:
                        startActivity (new Intent (getApplicationContext(), Map_MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Profile:
                        startActivity (new Intent (getApplicationContext(), Profile.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.Settings:
                        startActivity (new Intent (getApplicationContext(), Settings.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false ;
            }

        });


    }
}