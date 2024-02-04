package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {
    public static EditText fname;
    public static EditText lname;
    public static EditText email1;

    public static EditText password;
    public static EditText confrimpass;
    public static EditText number;
    public static String firstname;
    public static String lastname;
    public static String email;
    public static String paswd;
    public static String conpass;
    public static String phone_num;
    private CheckBox myCheckbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        fname = (EditText) findViewById(R.id.fname);
        lname = (EditText) findViewById(R.id.lname);
        email1 = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.pass);
        confrimpass = (EditText) findViewById(R.id.confrimpass);
        number = (EditText) findViewById(R.id.phone);
        myCheckbox = findViewById(R.id.checkBox);

    }
    public void onclick(View view) {

        if (view.getId() == R.id.signup1) {

            firstname = fname.getText().toString();
            lastname = lname.getText().toString();
            email = email1.getText().toString();
            paswd = password.getText().toString();
            conpass = confrimpass.getText().toString();
            phone_num = number.getText().toString();


            if (myCheckbox.isChecked()) {

                Toast.makeText(Signup.this, "Checkbox is checked", Toast.LENGTH_SHORT).show();
            } else {

                Toast.makeText(Signup.this, "Checkbox is unchecked", Toast.LENGTH_SHORT).show();
            }



            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }
}