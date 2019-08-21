package com.apk.fragment;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadFragment(new fragment_home());
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
        Fragment fragment = null;

        switch(Item.getItemId()){
            case R.id.navigation_home:
                fragment = new fragment_home();
                break;

            case R.id.navigation_dashboard:
                fragment = new fragment_dashboard();
                break;

            case R.id.navigation_notifications:
                fragment = new fragment_notification();
                break;
            case R.id.navigation_profile:
                fragment = new fragment_profile();
                break;
        }
        return loadFragment(fragment);
    }

    private boolean loadFragment (Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container,fragment)
                    .commit();
            return true;
        }
        return false;
    }


}
