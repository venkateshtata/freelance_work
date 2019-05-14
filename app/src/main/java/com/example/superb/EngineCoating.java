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


    TextView head, description;

    Typeface myFont;

    Button back, add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engine_coating);

        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("This treatment is designed to provide a high gloss and slippery coating on to the engine parts, hoses etc. The primary advantage of this treatment is to prevent the hoses and electrical wiring from getting bitten by rats so that a vehicle parked for a long duration is not a victim of such untoward incidents. Leaves a high, glossy, transparent surface finish\n" +
                "\n" +
                "Excellent resistance to:\n" +
                "\n" +
                "Petrol/Diesel+ Engine Oil + High Pressure water + Road grime + Avoids corrosion + Can be washed easily + Does not blister, crack, peel or yellow.\n");

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

                global.setEnginecoating(1);

                Toast.makeText(EngineCoating.this, "Engine Coating added !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(EngineCoating.this, selectService.class);
                startActivity(intent);


            }
        });
    }
}
