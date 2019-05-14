package com.example.superb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HeadlightRestoration extends AppCompatActivity {


    TextView head, description;

    Typeface myFont;

    Button back, add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headlight_restoration);


        head = (TextView) findViewById(R.id.head);
        description = (TextView) findViewById(R.id.description);

        back = (Button)findViewById(R.id.back);
        add = (Button)findViewById(R.id.add);


        myFont = Typeface.createFromAsset(this.getAssets(),"fonts/proxima.ttf");

        head.setTypeface(myFont);
        description.setTypeface(myFont);

        description.setText("This treatment radically improves the visibility of headlights by giving a new life to the head light cover. It clears all hard water and oxidation from the glass, thereby letting the headlights shine bright.\n" +
                "\n" +
                "-Removes all dirt, dust, hard water marks from the glass.\n" +
                "-Removes the oxidation formed which clears the passage of light.\n" +
                "-Makes night driving safer.");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HeadlightRestoration.this, selectService.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();

                global.setHeadlightrestoration(1);

                Toast.makeText(HeadlightRestoration.this, "Headlight Restoration added !", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HeadlightRestoration.this, selectService.class);
                startActivity(intent);


            }
        });

    }
}
