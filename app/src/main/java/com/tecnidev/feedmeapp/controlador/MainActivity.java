package com.tecnidev.feedmeapp.controlador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tecnidev.feedmeapp.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemReselectedListener {

    // Shared preferences to use application
    SharedPreferences sharedPreferences;
    Boolean loggedUser;

    // Fragments
    HomeFragment homeFragment = new HomeFragment();
    FoodsFragment foodsFragment = new FoodsFragment();
    AddFoodFragment addFoodFragment = new AddFoodFragment();
    UserFragment userFragment = new UserFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Load default fragment HomeFragment
        loadFragment(homeFragment);

        // Checking logged user
        sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);
        loggedUser = sharedPreferences.getBoolean(String.valueOf(R.bool.userLogged), false);

        // Load LoginActivity if not logged user yet
        if (!loggedUser){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }

    // Top menu behaviour
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.user, menu);
        return true;
    }

    // Top menu item selected
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        // Logout and finish App
        if (id==R.id.logout){
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(String.valueOf(R.bool.userLogged), "false");
            editor.apply();
            Toast.makeText(this, "Saliendo...", Toast.LENGTH_SHORT).show();
            finish();
        }
        return true;
    }

    // Swap selected fragment into RecyclerView
    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentView, fragment);
        transaction.commit();
    }

    @Override
    public void onNavigationItemReselected(@NonNull MenuItem item) {
        // Swap fragment according to clicked menu item
        switch (item.getItemId()){
            case R.id.home:
                loadFragment(homeFragment);
                break;

            case R.id.list:
                loadFragment(foodsFragment);
                break;

            case R.id.add:
                loadFragment(addFoodFragment);
                break;

            case R.id.userMenu:
                loadFragment(userFragment);
                break;
        }
    }
}