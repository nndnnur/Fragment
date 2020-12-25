package com.example.fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.fragment.ui.dashboard.DashboardFragment;
import com.example.fragment.ui.home.HomeFragment;
import com.example.fragment.ui.notifications.NotificationsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class tombol_fragment extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tombol_fragment);

        loadFragment(new HomeFragment());
        BottomNavigationView nv = findViewById(R.id.navigation);
        nv.setOnNavigationItemSelectedListener(this);

    }

    private boolean loadFragment(Fragment frg) {

        if(frg!=null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frag_cont, frg)
                    .commit();
            return true;
        }
        return false;

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch(menuItem.getItemId()){
            case R.id.navigation_home:
                fragment = new HomeFragment();
                break;
            case R.id.navigation_dashboard:
                fragment = new DashboardFragment();
                break;
            case R.id.navigation_notifications:
                fragment = new NotificationsFragment();
                break;
//            case R.id.navigation_profile:
//                fragment = new Profile();
//                break;
        }
        return loadFragment(fragment);
    }
}