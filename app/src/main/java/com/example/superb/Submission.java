package com.example.superb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

import java.util.ArrayList;
import java.util.Arrays;

public class Submission extends AppCompatActivity {

     Firebase mRef;


     Button btn_home;

    String Str_Name, Str_Phone, Str_Email, Str_Address, Str_Date, Str_Time, Str_Car, Str_service;

    int Str_Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submission);
        Firebase.setAndroidContext(this);

        btn_home = (Button)findViewById(R.id.btn_home);

        mRef = new Firebase("https://superb-e3083.firebaseio.com/requests");

        GlobalClass global = (GlobalClass) getApplication();

        ArrayList<String> services_selected = global.getList();

        Str_service = (String) Arrays.toString(new ArrayList[]{services_selected});

        Str_Name = global.getName();
        Str_Phone = global.getPhone();
        Str_Email = global.getEmail();
        Str_Address = global.getAddress();
        Str_Date = global.getDate();
        Str_Time = global.getTime();
        Str_Car = global.getSelectedCar();
        Str_Total = global.getTotal();
        String Str_Model = global.getModel();

        String final_string = "Name : "+Str_Name+"\n"+"Phone : "+Str_Phone+"\n"+"Address : "+Str_Address+"\n"+"Email : "+Str_Email+"\n"+"Date : "+Str_Date+"\n"+"Time : "+Str_Time+"\n"+"Car Model : "+Str_Car+"\n"+"Service : "+Str_service+"\n"+"Servie Model : "+Str_Model+"\n"+"Total Amount : "+Str_Total;




        mRef.child(Str_Phone).setValue(final_string);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalClass global = (GlobalClass)getApplication();
                global.clearAllServices();
                global.clearTotal();
                Intent intent = new Intent(Submission.this, selectModel.class);
                startActivity(intent);
                finish();
            }
        });





    }
}
