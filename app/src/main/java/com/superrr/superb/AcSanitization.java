package com.superrr.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AcSanitization extends AppCompatActivity {


    TextView head, description, price;

    Typeface myFont;

    Button back, add;

    int service_charge = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_sanitization);


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
                service_charge = 2000;

            } else if (selected_car.contains("MUV")) {
                service_charge = 1500;
            } else if (selected_car.contains("SUV")) {
                service_charge = 1500;
            } else if (selected_car.contains("Sedan")) {
                service_charge = 1200;
            } else if (selected_car.contains("Hatchback")) {
                service_charge = 1000;
            }
        } else{


            if (selected_car.contains("Premium")) {
                service_charge = 1000;

            } else if (selected_car.contains("MUV")) {
                service_charge = 1200;
            } else if (selected_car.contains("SUV")) {
                service_charge = 1500;
            } else if (selected_car.contains("Sedan")) {
                service_charge = 1500;
            } else if (selected_car.contains("Hatchback")) {
                service_charge = 2000;

        }
        }

        price.setText("Price : "+service_charge);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("This protection is designed to disinfect the Air conditioner ducts and to improve air quality\n" +
                "Cleans the Air conditioner coils and ducts \n" +
                "Disinfects the ducts and helps to stop build up of mould Removes all bad and foul odors from the ducts\n" +
                "Improves in-car air quality for the well being of driver and passengers.\n");


        GlobalClass global = (GlobalClass)getApplication();
        if(global.getAcsanitization()==1){

            add.setText("remove");

        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcSanitization.this, selectService.class);
                startActivity(intent);
                finish();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();
                if(global.getAcsanitization()==1){


                    global.setAcsanitization(0);
                    global.subFromTotal(service_charge);

                    Toast.makeText(AcSanitization.this, "A.C Sanitization removed !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AcSanitization.this, selectService.class);
                    startActivity(intent);
                    finish();
                }else{


                    global.setAcsanitization(1);
                    global.addToTotal(service_charge);

                    Toast.makeText(AcSanitization.this, "A.C Sanitization added !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AcSanitization.this, selectService.class);
                    startActivity(intent);
                    finish();
                }


            }
        });



    }
}
