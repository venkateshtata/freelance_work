package com.example.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UpholsteryCorrection extends AppCompatActivity {


    TextView head, description;

    Typeface myFont;

    Button back, add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upholstery_correction);

        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("In this treatment, a thorough cleaning of the fabric is carried out by a proprietary chemical. This removes the dirt, dust & grime including very tough stains like chocolates, coffee/ tea etc. The aerosol used to clean the surface dries very quickly, hence leaving no bad odors and making the interiors fresh. Cleans & Protects: Carpets + Interior Vinyl + Fabric + Plastics + Rubber surfaces + Removes all dirt and restores leather seats and side padding + Produces a true color of fabric giving a natural and rich appearance.\n");

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

                global.setSeattreatment(1);

                Toast.makeText(UpholsteryCorrection.this, "Upholstery Correction added !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(UpholsteryCorrection.this, selectService.class);
                startActivity(intent);


            }
        });

    }
}
