package com.example.superb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class selectService extends AppCompatActivity {

    Button basic_carwash, premium_carwash, internal_cleaning, paint_protection, rubbing_glaze, ac_sanitization, engine_coating, alloy_wheel, seat_treatment, headlight_restoration;

    Button btn_continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_service);


        basic_carwash = (Button)findViewById(R.id.basic_wash);
        premium_carwash = (Button)findViewById(R.id.premium_wash);
        internal_cleaning = (Button)findViewById(R.id.internal_cleaning);
        paint_protection = (Button)findViewById(R.id.paint_protection);
        rubbing_glaze = (Button)findViewById(R.id.rubbing_glaze);
        ac_sanitization = (Button)findViewById(R.id.ac_sanitization);
        engine_coating = (Button)findViewById(R.id.engine_coating);
        alloy_wheel = (Button)findViewById(R.id.alloy_wheel);
        seat_treatment = (Button)findViewById(R.id.seat_treatment);
        headlight_restoration = (Button)findViewById(R.id.headlight_restoration);

        btn_continue = (Button)findViewById(R.id.btn_continue);






        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();

                final int basicwash = global.getBasicwash();
                final int premiumwash = global.getPremiumwash();
                final int internalwash = global.getInternalcleaning();
                final int paintprotecton = global.getPaintprotection();
                final int rubbingglaze = global.getRubbingglaze();
                final int acsanitization = global.getAcsanitization();
                final int enginecoating = global.getEnginecoating();
                final int alloywheel = global.getAlloywheel();
                final int seattreatment = global.getSeattreatment();
                final int headlight = global.getHeadlightrestoration();

                if(basicwash == 0 && premiumwash == 0 && internalwash == 0 && paintprotecton == 0 && rubbingglaze == 0 && acsanitization == 0 && enginecoating == 0 && alloywheel == 0 && seattreatment == 0 && headlight == 0){
                    Toast.makeText(selectService.this, "Select a service", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(selectService.this, "Thank you !", Toast.LENGTH_SHORT).show();
                }



            }
        });

        basic_carwash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, BasicCarWash.class);
                startActivity(intent);
            }
        });

        premium_carwash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, PremiumCarWash.class);
                startActivity(intent);

            }
        });

        internal_cleaning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, InternalCleaning.class);
                startActivity(intent);

            }
        });

        paint_protection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, PaintProtection.class);
                startActivity(intent);
            }
        });

        rubbing_glaze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, RubbingGlaze.class);
                startActivity(intent);
            }
        });

        ac_sanitization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, AcSanitization.class);
                startActivity(intent);
            }
        });

        engine_coating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, EngineCoating.class);
                startActivity(intent);
            }
        });

        alloy_wheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, AlloyWheel.class);
                startActivity(intent);
            }
        });

        seat_treatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, UpholsteryCorrection.class);
                startActivity(intent);
            }
        });

        headlight_restoration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(selectService.this, HeadlightRestoration.class);
                startActivity(intent);
            }
        });


    }

}
