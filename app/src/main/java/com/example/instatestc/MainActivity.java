package com.example.instatestc;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.instatestc.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView cameraToolbar = toolbar.findViewById(R.id.camera);

        cameraToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Camera is clicked", Toast.LENGTH_SHORT).show();
            }
        });




        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                if(item.getItemId() == R.id.navigation_home)
                {
                    HomeFragment homeFragment = new HomeFragment();
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.nav_host_fragment , homeFragment);
                    transaction.commit();
                }

                if(item.getItemId() == R.id.search)
                {
                    Toast.makeText(MainActivity.this, "Clicked on search", Toast.LENGTH_SHORT).show();
                }


                if(item.getItemId() == R.id.plus)
                {
                    Toast.makeText(MainActivity.this, "Clicked on plus", Toast.LENGTH_SHORT).show();
                }


                if(item.getItemId() == R.id.heart)
                {
                    Toast.makeText(MainActivity.this, "Clicked on heart", Toast.LENGTH_SHORT).show();
                }


                if(item.getItemId() == R.id.user)
                {
                    Toast.makeText(MainActivity.this, "Clicked on user", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });






    }

}