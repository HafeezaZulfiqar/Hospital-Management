package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class doctor3page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor3page);
    }
    public void onClick(View view){
        if(view.getId() == R.id.doc3back) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }}
