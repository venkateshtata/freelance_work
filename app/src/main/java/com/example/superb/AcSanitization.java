package com.example.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AcSanitization extends AppCompatActivity {


    TextView head, description;

    Typeface myFont;

    Button back, add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_sanitization);


        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("This protection is designed to disinfect the Air conditioner ducts and to improve air quality\n" +
                "Cleans the Air conditioner coils and ducts \n" +
                "Disinfects the ducts and helps to stop build up of mould Removes all bad and foul odors from the ducts\n" +
                "Improves in-car air quality for the well being of driver and passengers.\n");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcSanitization.this, selectService.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();

                global.setAcsanitization(1);

                Toast.makeText(AcSanitization.this, "A.C Sanitization added !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AcSanitization.this, selectService.class);
                startActivity(intent);


            }
        });



    }
}
