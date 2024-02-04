package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    public static EditText Username;
    public static EditText password;
    public static String user;
    public static String pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }
    public void onClick(View view){
        user = Username.getText().toString();
        pass = password.getText().toString();

        if(view.getId() == R.id.login){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        if(view.getId()== R.id.signup){
            Intent intent = new Intent(this, Signup.class);
            startActivity(intent);
        }
    }

}