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

    TextView head, description;

    Typeface myFont;

    Button back, add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubbing_glaze);



        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("Over the time cars paint erodes due to the effects of sunlight, UV radiation, acid rain, salt, dirt, bird droppings and Air pollution. We give NEW LOOK TO PAINTED SURFACES by repairing the paint scratches, swirls marks, dullness, etc by using special rubbing compounds and imported polishes approved by the car manufacturers.\n");

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

                global.setRubbingglaze(1);

                Toast.makeText(RubbingGlaze.this, "Rubbing and Glaze added !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RubbingGlaze.this, selectService.class);
                startActivity(intent);


            }
        });

    }
}
