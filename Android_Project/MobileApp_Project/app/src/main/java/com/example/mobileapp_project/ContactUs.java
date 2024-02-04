package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ContactUs extends AppCompatActivity {
    public static EditText name1;
    public static EditText phone1;
    public static EditText message1;
    public static String Name;
    public static String Phone;
    public static String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        name1 = (EditText) findViewById(R.id.name1);
        phone1 = (EditText) findViewById(R.id.phone1);
        message1 = (EditText) findViewById(R.id.message1);

    }
    public void onclick(View view) {

        if (view.getId() == R.id.button3) {

            Name = name1.getText().toString();
            Phone = phone1.getText().toString();
            message = message1.getText().toString();

            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }}
}
