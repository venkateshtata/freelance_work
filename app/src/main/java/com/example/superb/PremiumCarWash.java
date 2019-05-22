package com.example.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PremiumCarWash extends AppCompatActivity {

    TextView head, description, price;

    Typeface myFont;

    Button back, add;

    int service_charge = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premium_car_wash);

        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);

        price = (TextView)findViewById(R.id.price);


        GlobalClass global_for_car = (GlobalClass)getApplication();
        String selected_car = global_for_car.getSelectedCar();

        if(selected_car.contains("Premium")){
            service_charge = 2000;

        }else if(selected_car.contains("MUV")){
            service_charge = 2000;
        }else if(selected_car.contains("SUV")){
            service_charge = 2000;
        }else if(selected_car.contains("Sedan")){
            service_charge = 1800;
        }else if(selected_car.contains("Hatchback")){
            service_charge = 1600;
        }

        price.setText("Price : "+service_charge);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("Complete dry cleaning of a interior including seats (carpet/leather), roof, mats and boot + Complete vacuuming of cars incl. seats and boot + Washing and cleaning of foot mats + Pre washing of car + Foam cleaning of exterior + Tyre arches cleaning + Underbody wash + Engine hot water wash and dressing + Washing and cleaning of door frames + Side doors cleaning and polishing + Body liquid polishing and waxing + Dash board cleaning and polishing + Tyre and alloy polishing + Scratch proof windshield spray + Car perfume spray\n");

        GlobalClass global = (GlobalClass)getApplication();
        if(global.getPremiumwash()==1){

            add.setText("remove");

        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PremiumCarWash.this, selectService.class);
                startActivity(intent);
                finish();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();
                if(global.getPremiumwash()==1){


                    global.setPremiumwash(0);
                    global.subFromTotal(service_charge);

                    Toast.makeText(PremiumCarWash.this, "Premium Car Wash removed !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(PremiumCarWash.this, selectService.class);
                    startActivity(intent);
                    finish();
                }else{


                    global.setPremiumwash(1);
                    global.addToTotal(service_charge);


                    Toast.makeText(PremiumCarWash.this, "Premium Car Wash added !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(PremiumCarWash.this, selectService.class);
                    startActivity(intent);
                    finish();
                }


            }
        });
    }
}
