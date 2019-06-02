package com.superrr.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UpholsteryCorrection extends AppCompatActivity {


    TextView head, description, price;

    Typeface myFont;

    Button back, add;

    int service_charge = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upholstery_correction);

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
                service_charge = 1300;

            } else if (selected_car.contains("MUV")) {
                service_charge = 1100;
            } else if (selected_car.contains("SUV")) {
                service_charge = 1100;
            } else if (selected_car.contains("Sedan")) {
                service_charge = 900;
            } else if (selected_car.contains("Hatchback")) {
                service_charge = 700;
            }

        } else{


            if (selected_car.contains("Premium")) {
                service_charge = 1100;

            } else if (selected_car.contains("MUV")) {
                service_charge = 1000;
            } else if (selected_car.contains("SUV")) {
                service_charge = 800;
            } else if (selected_car.contains("Sedan")) {
                service_charge = 800;
            } else if (selected_car.contains("Hatchback")) {
                service_charge = 700;
            }


        }
        price.setText("Price : "+service_charge);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("In this treatment, a thorough cleaning of the fabric is carried out by a proprietary chemical. This removes the dirt, dust & grime including very tough stains like chocolates, coffee/ tea etc. The aerosol used to clean the surface dries very quickly, hence leaving no bad odors and making the interiors fresh. Cleans & Protects: Carpets + Interior Vinyl + Fabric + Plastics + Rubber surfaces + Removes all dirt and restores leather seats and side padding + Produces a true color of fabric giving a natural and rich appearance.\n");

        GlobalClass global = (GlobalClass)getApplication();
        if(global.getSeattreatment()==1){

            add.setText("remove");

        }


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpholsteryCorrection.this, selectService.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();
                if(global.getSeattreatment()==1){


                    global.setSeattreatment(0);
                    global.subFromTotal(service_charge);

                    Toast.makeText(UpholsteryCorrection.this, "Upholstery Restoration removed !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(UpholsteryCorrection.this, selectService.class);
                    startActivity(intent);
                }else{


                    global.setSeattreatment(1);
                    global.addToTotal(service_charge);

                    Toast.makeText(UpholsteryCorrection.this, "Upholstery Restoration added !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(UpholsteryCorrection.this, selectService.class);
                    startActivity(intent);
                }


            }
        });

    }
}
