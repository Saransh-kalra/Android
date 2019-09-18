package com.example.saranshkalra.appnumber5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtVehicle = (TextView) findViewById(R.id.txtVehicle);
        TextView txtCar = (TextView) findViewById(R.id.txtCar);
        TextView txtMotorcycle = (TextView) findViewById(R.id.txtMotorcycle);
        final TextView txtResult = (TextView) findViewById(R.id.txtResult);


        Button btnGo = (Button) findViewById(R.id.btnGo);

        Vehicle myVehicle = new Vehicle(45,true, 4);
        myVehicle.ride();
        txtVehicle.setText(myVehicle.toString());

        Car myCar = new Car(90, true, 4);
        myCar.ride();
        txtCar.setText(myCar.toString());

        Motorcycle myMotorCycle = new Motorcycle(500,true,2);
        myMotorCycle.ride();
        txtMotorcycle.setText(myMotorCycle.toString());

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("Button Clicked");
            }
        });

    }

}
