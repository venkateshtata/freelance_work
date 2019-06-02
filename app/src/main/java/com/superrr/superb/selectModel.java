package com.superrr.superb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

public class selectModel extends AppCompatActivity {

    ArrayList<String> items = new ArrayList<>();

    SpinnerDialog spinnerDailog;
    Button btn_search, btn_continue;
    String car_selected;

    TextView txt_selectedCar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_model);

        btn_search = (Button)findViewById(R.id.btn_search);

        btn_continue = (Button)findViewById(R.id.btn_continue);

        txt_selectedCar = (TextView)findViewById(R.id.txt_selectedCar);

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(selectModel.this, selectService.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });

        initItems();
        spinnerDailog = new SpinnerDialog(selectModel.this, items, "Select Car Model");
        spinnerDailog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(String item, int position) {

                Toast.makeText(selectModel.this, "Selected : "+item, Toast.LENGTH_SHORT).show();

                car_selected = item;

                GlobalClass global = (GlobalClass)getApplication();

                global.setSelectedCar(car_selected);

                txt_selectedCar.setText(car_selected);


            }
        });

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerDailog.showSpinerDialog();
            }
        });

    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

    }

    private void initItems(){
        items.add("Aston Martin(Premium)");
        items.add("Audi(Premium)");
        items.add("Bentley(Premium)");
        items.add("Benz(Premium)");
        items.add("BMW(Premium)");
        items.add("BMW 250C (Premium)");
        items.add("Chevrolet Beat (Hatchback)");
        items.add("Chevrolet Cruze (Sedan)");
        items.add("Chevrolet Enjoy (SUV)");
        items.add("Chevrolet Sail (Sedan)");
        items.add("Chevrolet Tavera (SUV)");
        items.add("Chevrolet TrailBlazer (Premium)");
        items.add("Chevrolet Camero (Sedan)");
        items.add("Dastun GO (Hatchback)");
        items.add("Eicher Polaris (Premium)");
        items.add("Ferrari (Premium)");
        items.add("Fiat Avventura (Hatchback)");
        items.add("Fiat Linea (Sedan)");
        items.add("Fiat Punto (Hatchback)");
        items.add("Fiat Urban Cross (Hatchback)");
        items.add("Force Motors (Premium)");
        items.add("Ford Aspire (Sedan)");
        items.add("Ford EcoSport (SUV)");
        items.add("Ford Endeavor (Premium)");
        items.add("Ford Figo (Hatchback)");
        items.add("Ford Kuga (SUV)");
        items.add("Ford Mustang (SUV)");
        items.add("Honda Accord (Premium)");
        items.add("Honda Amaze (Sedan)");
        items.add("Honda BR V (SUV)");
        items.add("Honda Brio (Hatchback)");
        items.add("Honda City (Sedan)");
        items.add("Honda CR-V (SUV)");
        items.add("Honda Jazz (Hatchback)");
        items.add("Honda WR V (Hatchback)");
        items.add("Hyundai Tuscon (Premium)");
        items.add("Hyundai Creta (SUV)");
        items.add("Hyundai Elantra (Sedan)");
        items.add("Hyundai i10 (Hatchback)");
        items.add("Hyundai i20 (Hatchback)");
        items.add("Hyundai Verna (Sedan)");
        items.add("Hyundai Xcent (Sedan)");
        items.add("Isuzu (Premium)");
        items.add("Jaguar (Premium)");
        items.add("Jeep (Premium)");
        items.add("Lamborghini (Premium)");
        items.add("Land Rover (Premium)");
        items.add("Lexus (Premium)");
        items.add("Mahindra Bolero (SUV)");
        items.add("Mahindra E20 Plus (Hatchback)");
        items.add("Mahindra KUV100 (Hatchback)");
        items.add("Mahindra Nuvo Sports (SUV)");
        items.add("Mahindra Scorpio (SUV)");
        items.add("Mahindra Thar (SUV)");
        items.add("Mahindra TUV 300 (SUV)");
        items.add("Mahindra Verito (Sedan)");
        items.add("Mahindra XUV 500 (SUV)");
        items.add("Mahindra Xylo (SUV)");
        items.add("Maruthi Suzuki Alto (Hatchback)");
        items.add("Maruthi Suzuki Celerio (Hatchback)");
        items.add("Maruthi Suzuki Ciaz (Sedan)");
        items.add("Maruthi Suzuki Eeco (SUV)");
        items.add("Maruthi Suzuki Ignis (Hatchback)");
        items.add("Maruthi Suzuki Omni (SUV)");
        items.add("Maruthi Suzuki S Cross (Sedan)");
        items.add("Maruthi Suzuki Swift (Hatchback)");
        items.add("Maruthi Suzuki Vitara Brezza (SUV)");
        items.add("Maruthi Suzuki Wagon R (Hatchback)");
        items.add("Maruthi Suzuki Baleno (Hatchback)");
        items.add("Maruthi Suzuki Dzire (Sedan)");
        items.add("Maserati (Premium)");
        items.add("Mini (Premium)");
        items.add("Mitsubishi (Premium)");
        items.add("Nissan GT-R (Premium)");
        items.add("Nissan Micra (Hatchback)");
        items.add("Nissan Terrano (SUV)");
        items.add("Porsche (Premium)");
        items.add("Renault Duster (SUV)");
        items.add("Renault Kwid (Hatchback)");
        items.add("Renault Lodgy (SUV)");
        items.add("Rolls-Royce (Premium)");
        items.add("Skoda Octavia (Sedan)");
        items.add("Skoda Rapid (Sedan)");
        items.add("Skoda Superb (Premium)");
        items.add("Ssangyong (Premium)");
        items.add("Tata Bolt (Hatchback)");
        items.add("Tata GenX (Hatchback)");
        items.add("Tata Hexa (SUV)");
        items.add("Mahindra Bolero (SUV)");
        items.add("Tata Indica (Hatchback)");
        items.add("Tata Indigo (Sedan)");
        items.add("Tata Nano (Hatchback)");
        items.add("Tata Nexon (Hatchback)");
        items.add("Tata Safari (Premium)");
        items.add("Tata Sumo (SUV)");
        items.add("Tata Tiago (Hatchback)");
        items.add("Tata Venture (SUV)");
        items.add("Tata Zest (Sedan)");
        items.add("Toyota Camry (Premium)");
        items.add("Toyota Corolla (Sedan)");
        items.add("Toyota Etios (Sedan)");
        items.add("Toyota Etios Liva (Hatchback)");
        items.add("Toyota Fortuner (Premium)");
        items.add("Toyota Innova (SUV)");
        items.add("Toyota Land Crusier (Premium)");
        items.add("Toyota Prius (Premium)");
        items.add("Volkswagen Beetle (Premium)");
        items.add("Volkswagen GTI (Premium)");
        items.add("Volkswagen Jetta (Sedan)");
        items.add("Volkswagen Passat (Sedan)");
        items.add("Volkswagen Polo (Hatchback)");
        items.add("Volkswagen Tiguan (Premium)");
        items.add("Volkswagen Vento (Sedan)");
        items.add("Volvo (Premium)");
        items.add("Volvo Country V40 (Premium)");
        items.add("Volvo XC 90 (Premium)");




        }
    }

