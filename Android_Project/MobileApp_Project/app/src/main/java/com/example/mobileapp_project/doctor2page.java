package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class doctor2page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor2page);
    }
    public void onClick(View view){
        if(view.getId() == R.id.doc2back) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}