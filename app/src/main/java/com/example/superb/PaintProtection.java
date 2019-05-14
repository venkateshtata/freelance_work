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

    TextView head, description;

    Typeface myFont;

    Button back, add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint_protection);

        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("Our PTFE based Polymer paint sealant creates slippery, slick barrier that protects the paint finishes, reduces fading & oxidation of paint. It repels dirt & grime, accelerates water run-off to reduce spotting, smoothness weathered surface and removes scratches giving depth to the paint.\n");

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

                global.setPaintprotection(1);

                Toast.makeText(PaintProtection.this, "Paint Protection added !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(PaintProtection.this, selectService.class);
                startActivity(intent);


            }
        });

    }
}
