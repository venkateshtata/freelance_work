package com.example.superb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebase.client.Firebase;

public class Submission extends AppCompatActivity {

     Firebase mRef;

    String Str_Name, Str_Phone, Str_Email, Str_Address, Str_Date, Str_Time, Str_service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission);
        Firebase.setAndroidContext(this);

        mRef = new Firebase("https://superb-e3083.firebaseio.com/requests");

        GlobalClass global = (GlobalClass) getApplication();

        Str_Name = global.getName();
        Str_Phone = global.getPhone();
        Str_Email = global.getEmail();
        Str_Address = global.getAddress();
        Str_Date = global.getDate();
        Str_Time = global.getTime();

        mRef.child(Str_Phone).child("Name").setValue(Str_Name);
        mRef.child(Str_Phone).child("Email").setValue(Str_Email);
        mRef.child(Str_Phone).child("Address").setValue(Str_Address);
        mRef.child(Str_Phone).child("Date").setValue(Str_Date);
        mRef.child(Str_Phone).child("Time").setValue(Str_Time);





    }
}
