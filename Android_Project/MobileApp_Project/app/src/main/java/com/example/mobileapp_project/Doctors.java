package com.example.mobileapp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Doctors extends AppCompatActivity {
    public ListView mylist;
    public ArrayList<String> Doctors;
    public ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        mylist = (ListView) findViewById(R.id.DoctorsList);
        Doctors = new ArrayList<>();
        Doctors.add("Dr Sadia");
        Doctors.add("Dr Umer");
        Doctors.add("Dr Uzair");
        Doctors.add("Dr Ayesha");


        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Doctors);
        mylist.setAdapter(arrayAdapter);
    }
    public void onClick(View view){

        if(view.getId() == R.id.doc1details){
            Intent intent = new Intent(this,doctor1page.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.doc2details){
            Intent intent = new Intent(this,doctor2page.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.doc3details){
            Intent intent = new Intent(this,doctor3page.class);
            startActivity(intent);
        }

        if(view.getId() == R.id.doc4details){
            Intent intent = new Intent(this,doctor4page.class);
            startActivity(intent);
        }
    }
}
