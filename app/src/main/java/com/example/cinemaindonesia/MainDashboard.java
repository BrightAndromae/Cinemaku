package com.example.cinemaindonesia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.cinemaindonesia.fragments.FragmentDashboardPage;
import com.example.cinemaindonesia.fragments.FragmentPoint;
import com.example.cinemaindonesia.fragments.FragmentProfile;
import com.example.cinemaindonesia.fragments.FragmentTiketku;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainDashboard extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);


        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        bottomNavigationView.setSelectedItemId(R.id.navigation_home);

    }

    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment selectedFragment = null;

        switch (item.getItemId()) {
//            Log.i("Info", String.o);

            case R.id.navigation_home:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new FragmentDashboardPage())
                        .commit();
                return true;
            case R.id.navigation_add_buku:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new FragmentTiketku())
                        .commit();
                return true;
            case R.id.navigation_borrowed:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new FragmentPoint())
                        .commit();
                return true;
            case R.id.navigation_profile:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, new FragmentProfile())
                        .commit();
                return true;
        }
        return false;
    }
}