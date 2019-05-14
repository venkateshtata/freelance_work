package com.example.superb;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

public class getLocation extends AppCompatActivity {

    Button btn_getlocation, btn_continue;

    EditText edt_location;

    int PLACE_PICKER_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_location);

        btn_getlocation = (Button)findViewById(R.id.btn_getlocation);

        btn_continue = (Button)findViewById(R.id.btn_continue);

        edt_location = (EditText)findViewById(R.id.edt_location);



        final PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getLocation.this, selectModel.class);
                startActivity(intent);
            }
        });

        btn_getlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                try {



                    startActivityForResult(builder.build(getLocation.this),PLACE_PICKER_REQUEST);


                } catch (GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                } catch (GooglePlayServicesNotAvailableException e) {
                    e.printStackTrace();
                }

            }
        });

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data){

        if(requestCode == PLACE_PICKER_REQUEST){
            if(resultCode==RESULT_OK){
                Place place = PlacePicker.getPlace(data, getLocation.this);
                String address = String.format("Place: %s", place.getName());
                edt_location.setText(address);

            }
        }

    }
}
