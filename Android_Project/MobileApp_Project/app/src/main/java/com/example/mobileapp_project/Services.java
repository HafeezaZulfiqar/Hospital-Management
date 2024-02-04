package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
    }
    public void onClick(View view){
        if(view.getId()==R.id.button5) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }}
