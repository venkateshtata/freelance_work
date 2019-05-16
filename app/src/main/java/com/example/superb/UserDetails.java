package com.example.superb;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;

public class UserDetails extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    EditText edt_name, edt_phone, edt_email, edt_address;

    TextView txt_date, txt_time;
    private DatePickerDialog.OnDateSetListener mDatesetListener;


    Button btn_back, btn_proceed;

    String Str_Name, Str_Phone, Str_Email, Str_Address, Str_Date, Str_Time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);



        edt_name = (EditText)findViewById(R.id.edt_name);
        edt_phone = (EditText)findViewById(R.id.edt_phone);
        edt_email = (EditText)findViewById(R.id.edt_email);
        edt_address = (EditText)findViewById(R.id.edt_address);

        txt_date = (TextView)findViewById(R.id.txt_date);
        txt_time = (TextView)findViewById(R.id.txt_time);

        btn_proceed = (Button)findViewById(R.id.btn_proceed);
        btn_back = (Button) findViewById(R.id.btn_back);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalClass global = (GlobalClass)getApplication();
                global.clearTotal();
                global.clearAllServices();

                Intent intent = new Intent(UserDetails.this, selectModel.class);
                startActivity(intent);
            }
        });

        btn_proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Str_Name = edt_name.getText().toString().trim();
                Str_Phone = edt_phone.getText().toString().trim();
                Str_Email = edt_email.getText().toString().trim();
                Str_Address = edt_address.getText().toString().trim();

                if(Str_Name.isEmpty() == true ||Str_Phone.isEmpty() == true ||Str_Email.isEmpty() == true ||Str_Address.isEmpty() == true ||Str_Date.isEmpty() == true ||Str_Time.isEmpty() == true){
                    Toast.makeText(UserDetails.this, "Please fill all the details before proceeding", Toast.LENGTH_SHORT).show();
                }else {

                    GlobalClass global = (GlobalClass) getApplication();

                    global.setName(Str_Name);
                    global.setPhone(Str_Phone);
                    global.setEmail(Str_Email);
                    global.setAddress(Str_Address);
                    global.setDate(Str_Date);
                    global.setTime(Str_Time);



                    String phoneNumber = "+91" + Str_Phone;

                    Intent intent = new Intent(UserDetails.this, VerifyNumber.class);
                    intent.putExtra("phonenumber", phoneNumber);
                    Toast.makeText(UserDetails.this, "number entered : "+phoneNumber, Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }


            }
        });


        mDatesetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                month = month+1;

                String Date = "Date: " + dayOfMonth + "/" + month + "/" + year ;
                txt_date.setText(Date);

                Str_Date = Date;
            }
        };

        txt_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        UserDetails.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDatesetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        txt_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment timePicker = new TimePickerFragment();
                timePicker.show(getSupportFragmentManager(), "time picker");
            }
        });
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        String time = hourOfDay + ":" + minute;
        txt_time.setText(time);
        Str_Time = time;
    }
}
