package com.example.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AlloyWheel extends AppCompatActivity {


    TextView head, description;

    Typeface myFont;

    Button back, add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alloy_wheel);


        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("This treatment is designed for cleaning and protection of the alloy wheels. One of the biggest challenges being faced is in protecting alloy wheels from brake dust and grime. This, in-turn leaves spider web cracks on the alloy wheels and cannot be repaired. The beauty and sheen of the alloy wheels is lost in the process. This application is aimed at restoring the lost sheen of the alloy wheels and also ensuring long-term protection.\n" +
                "\n" +
                "-Grime\n" +
                "-Only regular washing needed after Protection\n" +
                "-No need for expensive alloy wheel cleaners\n" +
                "-No cracking or scaling off of the Alloy coating.\n");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlloyWheel.this, selectService.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();

                global.setAlloywheel(1);

                Toast.makeText(AlloyWheel.this, "Alloy Wheel Treatment added !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AlloyWheel.this, selectService.class);
                startActivity(intent);


            }
        });
    }
}