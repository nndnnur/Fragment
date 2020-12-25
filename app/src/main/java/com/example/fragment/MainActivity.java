package com.example.fragment;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item){
//        Fragment fragment = null;
//
//        switch (item.getItemId()){
//            case R.id.navigation_home:
//                fragment = new HomeFragment();
//                break;
//
//            case R.id.navigation_dashboard:
//                fragment = new DashboardFragment();
//                break;
//
//            case R.id.navigation_notifications:
//                fragment = new NotificationsFragment();
//                break;
//
//            case R.id.navigation_profile:
//                fragment = new ProfileFragment();
//                break;
//        }
//        return loadFragment(fragment);
//    }
//
//    private boolean loadFragment(Fragment fragment) {
//        if(fragment !=null){
//            getSupportFragmentManager()
//                    .beginTransaction()
//                    .replace(R.id.fragment_container, fragment)
//                    .commit();
//            return true;
//        }
//        return false;
//    }
//}