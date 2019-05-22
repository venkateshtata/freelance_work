package com.example.superb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ServicesSummary extends AppCompatActivity {

    Button btn_proceed, btn_reselect;

    TextView total;

    ListView list;

    int tot;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_summary);


        btn_reselect = (Button)findViewById(R.id.btn_reselect);
        btn_proceed = (Button)findViewById(R.id.btn_proceed);

        btn_proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ServicesSummary.this, UserDetails.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);



            }
        });

        btn_reselect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                GlobalClass global = (GlobalClass)getApplication();
//                global.clearTotal();
//                global.clearAllServices();
                Intent intent = new Intent(ServicesSummary.this, selectService.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);


            }
        });

        GlobalClass global = (GlobalClass)getApplication();

        tot = global.getTotal();

        ArrayList<String> services_selected = global.getList();

        ArrayAdapter adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.simplerow,R.id.forAdapter,services_selected);




        btn_proceed = (Button)findViewById(R.id.btn_proceed);
        btn_reselect = (Button)findViewById(R.id.btn_reselect);

        total = (TextView)findViewById(R.id.txt_total);

        total.setText("TOTAL AMOUNT : "+String.valueOf(tot));

        list = (ListView) findViewById(R.id.listView);

        list.setAdapter(adapter);



    }

}
