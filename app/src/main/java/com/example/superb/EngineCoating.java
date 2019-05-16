package com.example.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EngineCoating extends AppCompatActivity {


    TextView head, description, price;

    Typeface myFont;

    Button back, add;

    int service_charge = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engine_coating);

        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);

        price = (TextView)findViewById(R.id.price);


        GlobalClass global_for_car = (GlobalClass)getApplication();
        String selected_car = global_for_car.getSelectedCar();

        if(selected_car.contains("Premium")){
            service_charge = 1000;

        }else if(selected_car.contains("MUV")){
            service_charge = 700;
        }else if(selected_car.contains("SUV")){
            service_charge = 700;
        }else if(selected_car.contains("Sedan")){
            service_charge = 600;
        }else if(selected_car.contains("Hatchback")){
            service_charge = 500;
        }

        price.setText("Price : "+service_charge);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("This treatment is designed to provide a high gloss and slippery coating on to the engine parts, hoses etc. The primary advantage of this treatment is to prevent the hoses and electrical wiring from getting bitten by rats so that a vehicle parked for a long duration is not a victim of such untoward incidents. Leaves a high, glossy, transparent surface finish\n" +
                "\n" +
                "Excellent resistance to:\n" +
                "\n" +
                "Petrol/Diesel+ Engine Oil + High Pressure water + Road grime + Avoids corrosion + Can be washed easily + Does not blister, crack, peel or yellow.\n");


        GlobalClass global = (GlobalClass)getApplication();
        if(global.getEnginecoating()==1){

            add.setText("remove");

        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EngineCoating.this, selectService.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                GlobalClass global = (GlobalClass)getApplication();
                if(global.getEnginecoating()==1){


                    global.setEnginecoating(0);
                    global.subFromTotal(service_charge);

                    Toast.makeText(EngineCoating.this, "Engine Coating removed !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(EngineCoating.this, selectService.class);
                    startActivity(intent);
                }else{


                    global.setEnginecoating(1);
                    global.addToTotal(service_charge);

                    Toast.makeText(EngineCoating.this, "Engine Coating added !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(EngineCoating.this, selectService.class);
                    startActivity(intent);
                }



            }
        });
    }
}
