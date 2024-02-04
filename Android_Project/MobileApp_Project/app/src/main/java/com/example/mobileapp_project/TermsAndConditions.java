package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TermsAndConditions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);
    }
    public void onClick(View view){
        if(view.getId() == R.id.button) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}