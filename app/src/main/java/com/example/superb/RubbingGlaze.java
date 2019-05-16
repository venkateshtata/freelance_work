package com.example.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RubbingGlaze extends AppCompatActivity {

    TextView head, description, price;

    Typeface myFont;

    Button back, add;

    int service_charge = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubbing_glaze);



        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);

        price = (TextView)findViewById(R.id.price);


        GlobalClass global_for_car = (GlobalClass)getApplication();
        String selected_car = global_for_car.getSelectedCar();

        if(selected_car.contains("Premium")){
            service_charge = 2800;

        }else if(selected_car.contains("MUV")){
            service_charge = 2400;
        }else if(selected_car.contains("SUV")){
            service_charge = 2400;
        }else if(selected_car.contains("Sedan")){
            service_charge = 2100;
        }else if(selected_car.contains("Hatchback")){
            service_charge = 1800;
        }

        price.setText("Price : "+service_charge);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("Over the time cars paint erodes due to the effects of sunlight, UV radiation, acid rain, salt, dirt, bird droppings and Air pollution. We give NEW LOOK TO PAINTED SURFACES by repairing the paint scratches, swirls marks, dullness, etc by using special rubbing compounds and imported polishes approved by the car manufacturers.\n");

        GlobalClass global = (GlobalClass)getApplication();
        if(global.getRubbingglaze()==1){

            add.setText("remove");

        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RubbingGlaze.this, selectService.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();
                if(global.getRubbingglaze()==1){


                    global.setRubbingglaze(0);
                    global.subFromTotal(service_charge);

                    Toast.makeText(RubbingGlaze.this, "Superb Rubbing and Glaze removed !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RubbingGlaze.this, selectService.class);
                    startActivity(intent);
                }else{


                    global.setRubbingglaze(1);
                    global.addToTotal(service_charge);

                    Toast.makeText(RubbingGlaze.this, "Superb Rubbing and Glaze added !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RubbingGlaze.this, selectService.class);
                    startActivity(intent);
                }


            }
        });

    }
}
