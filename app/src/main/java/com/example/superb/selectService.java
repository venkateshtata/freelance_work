package com.example.superb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectService extends AppCompatActivity {

    Button basic_carwash, premium_carwash, internal_cleaning, paint_protection, rubbing_glaze, ac_sanitization, engine_coating, alloy_wheel, seat_treatment, headlight_restoration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_service);

        GlobalClass globalClass = (GlobalClass)getApplicationContext();

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

        basic_carwash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });


    }

    public void openDialog(){

        Dialog_basicwash dialog = new Dialog_basicwash();
        dialog.show(getSupportFragmentManager(), "example dialog");

    }
}
