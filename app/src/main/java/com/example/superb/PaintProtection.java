package com.example.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PaintProtection extends AppCompatActivity {

    TextView head, description, price;

    Typeface myFont;

    Button back, add;

    int service_charge = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint_protection);

        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);


        price = (TextView)findViewById(R.id.price);


        GlobalClass global_for_car = (GlobalClass)getApplication();
        String selected_car = global_for_car.getSelectedCar();

        if(selected_car.contains("Premium")){
            service_charge = 4000;

        }else if(selected_car.contains("MUV")){
            service_charge = 3600;
        }else if(selected_car.contains("SUV")){
            service_charge = 3600;
        }else if(selected_car.contains("Sedan")){
            service_charge = 3300;
        }else if(selected_car.contains("Hatchback")){
            service_charge = 3000;
        }

        price.setText("Price : "+service_charge);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("Our PTFE based Polymer paint sealant creates slippery, slick barrier that protects the paint finishes, reduces fading & oxidation of paint. It repels dirt & grime, accelerates water run-off to reduce spotting, smoothness weathered surface and removes scratches giving depth to the paint.\n");


        GlobalClass global = (GlobalClass)getApplication();
        if(global.getPaintprotection()==1){

            add.setText("remove");

        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaintProtection.this, selectService.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();
                if(global.getInternalcleaning()==1){


                    global.setPaintprotection(0);
                    global.subFromTotal(service_charge);

                    Toast.makeText(PaintProtection.this, "Paint Protection removed !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(PaintProtection.this, selectService.class);
                    startActivity(intent);
                }else{


                    global.setPaintprotection(1);
                    global.addToTotal(service_charge);

                    Toast.makeText(PaintProtection.this, "Paint Protecton added !", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(PaintProtection.this, selectService.class);
                    startActivity(intent);
                }



            }
        });

    }
}
