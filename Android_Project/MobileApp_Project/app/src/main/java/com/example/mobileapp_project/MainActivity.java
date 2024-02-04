package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onClick(View view) {

        if (view.getId() == R.id.contact_Us) {
            Intent intent = new Intent(this, ContactUs.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.aboutus) {
            Intent intent = new Intent(this, AboutUs.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.term_btn) {
            Intent intent = new Intent(this, TermsAndConditions.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.doc_btn) {
            Intent intent = new Intent(this, Doctors.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.services) {
            Intent intent = new Intent(this, Services.class);
            startActivity(intent);
        }


    }


}


