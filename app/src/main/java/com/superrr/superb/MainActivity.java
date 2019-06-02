package com.superrr.superb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btn_doorstep, btn_studio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_doorstep = (Button)findViewById(R.id.btn_doorstep);
        btn_studio = (Button)findViewById(R.id.btn_studio);

        btn_doorstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();

                global.setModel("Doorstep");

                Intent intent = new Intent(MainActivity.this, selectModel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);




            }
        });

        btn_studio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GlobalClass global = (GlobalClass)getApplication();

                global.setModel("Studio");

                Intent intent = new Intent(MainActivity.this, selectModel.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });
    }
}
