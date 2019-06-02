package com.superrr.superb;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.superrr.superb.R;

public class BasicCarWash extends AppCompatActivity {

    TextView head, description, price;

    Typeface myFont;

    Button back, add;

    int service_charge = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_car_wash);


        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        price = (TextView)findViewById(R.id.price);


        GlobalClass global_for_car = (GlobalClass)getApplication();

        String selected_car = global_for_car.getSelectedCar();

        String mod = global_for_car.getModel();

        if(mod == "Doorstep") {

            if (selected_car.contains("Premium")) {
                service_charge = 800;

            } else if (selected_car.contains("MUV")) {
                service_charge = 700;
            } else if (selected_car.contains("SUV")) {
                service_charge = 700;
            } else if (selected_car.contains("Sedan")) {
                service_charge = 650;
            } else if (selected_car.contains("Hatchback")) {
                service_charge = 550;
            }
        }else{

            if (selected_car.contains("Premium")) {
                service_charge = 800;

            } else if (selected_car.contains("MUV")) {
                service_charge = 700;
            } else if (selected_car.contains("SUV")) {
                service_charge = 700;
            } else if (selected_car.contains("Sedan")) {
                service_charge = 600;
            } else if (selected_car.contains("Hatchback")) {
                service_charge = 500;
            }

        }

        price.setText("Price : "+service_charge);



        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("Complete vacuuming of cars incl. seats and boot + Washing and cleaning of foot mats + Body Shampooing and pre-wash + Door frames cleaning & Polishing + Tyre arches cleaning + Underbody wash + Side doors cleaning + Dash board cleaning and polishing + tire wash and polishing + Car perfume spray.\n");

        GlobalClass global = (GlobalClass)getApplication();
        if(global.getBasicwash()==1){

            add.setText("remove");

        }


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BasicCarWash.this, selectService.class);
                startActivity(intent);
                finish();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();
                if(global.getBasicwash()==1){


                    global.setBasicwash(0);
                    global.subFromTotal(service_charge);

                    Toast.makeText(BasicCarWash.this, "Basic Car Wash removed !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(BasicCarWash.this, selectService.class);
                    startActivity(intent);
                    finish();
                }else{


                    global.setBasicwash(1);
                    global.addToTotal(service_charge);

                    Toast.makeText(BasicCarWash.this, "Basic Car Wash added !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(BasicCarWash.this, selectService.class);
                    startActivity(intent);
                    finish();
                }


            }
        });


    }
}
