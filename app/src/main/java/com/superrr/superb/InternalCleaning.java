package com.superrr.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class InternalCleaning extends AppCompatActivity {

    TextView head, description, price;

    Typeface myFont;

    Button back, add;

    int service_charge = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_cleaning);

        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);

        price = (TextView)findViewById(R.id.price);


        GlobalClass global_for_car = (GlobalClass)getApplication();
        String selected_car = global_for_car.getSelectedCar();

        String mod = global_for_car.getModel();

        if(mod == "Doorstep") {

            if (selected_car.contains("Premium")) {
                service_charge = 1900;

            } else if (selected_car.contains("MUV")) {
                service_charge = 1700;
            } else if (selected_car.contains("SUV")) {
                service_charge = 1700;
            } else if (selected_car.contains("Sedan")) {
                service_charge = 1500;
            } else if (selected_car.contains("Hatchback")) {
                service_charge = 1300;
            }
        } else {

            if (selected_car.contains("Premium")) {
                service_charge = 1800;

            } else if (selected_car.contains("MUV")) {
                service_charge = 1700;
            } else if (selected_car.contains("SUV")) {
                service_charge = 1350;
            } else if (selected_car.contains("Sedan")) {
                service_charge = 1350;
            } else if (selected_car.contains("Hatchback")) {
                service_charge = 1150;
            }

        }

        price.setText("Price : "+service_charge);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("Complete dry cleaning of a interior including seats (carpet/leather), roof, mats and boot, Dressings to all vinyl, plastic, rubber giving your car spotless, shiny, glossy interior.");

        GlobalClass global = (GlobalClass)getApplication();
        if(global.getInternalcleaning()==1){

            add.setText("remove");

        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InternalCleaning.this, selectService.class);
                startActivity(intent);
                finish();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                GlobalClass global = (GlobalClass)getApplication();
                if(global.getInternalcleaning()==1){


                    global.setInternalcleaning(0);
                    global.subFromTotal(service_charge);

                    Toast.makeText(InternalCleaning.this, "Internal Cleaning removed !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(InternalCleaning.this, selectService.class);
                    startActivity(intent);
                    finish();
                }else{


                    global.setInternalcleaning(1);
                    global.addToTotal(service_charge);

                    Toast.makeText(InternalCleaning.this, "Internal Cleaning added !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(InternalCleaning.this, selectService.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }
}
