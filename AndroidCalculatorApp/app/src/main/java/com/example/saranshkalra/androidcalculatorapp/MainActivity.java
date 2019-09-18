package com.example.saranshkalra.androidcalculatorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String oldCalculationText = "";
    String currentDisplay = "";
    String currentNumber = "";
    boolean operation = false;
    char last_operation = 'a';


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtExpression = (TextView) findViewById(R.id.txtExpression);
        final TextView txtDisplay = (TextView) findViewById(R.id.txtDisplay);

        ImageView img1 = (ImageView) findViewById(R.id.img1);
        ImageView img2 = (ImageView) findViewById(R.id.img2);
        ImageView img3 = (ImageView) findViewById(R.id.img3);
        ImageView img4 = (ImageView) findViewById(R.id.img4);
        ImageView img5 = (ImageView) findViewById(R.id.img5);
        ImageView img6 = (ImageView) findViewById(R.id.img6);
        ImageView img7 = (ImageView) findViewById(R.id.img7);
        ImageView img8 = (ImageView) findViewById(R.id.img8);
        ImageView img9 = (ImageView) findViewById(R.id.img9);
        ImageView img0 = (ImageView) findViewById(R.id.img0);
        ImageView imgMultiply = (ImageView) findViewById(R.id.imgMultiply);
        ImageView imgDivide = (ImageView) findViewById(R.id.imgDivide);
        ImageView imgAdd = (ImageView) findViewById(R.id.imgAdd);
        ImageView imgSubtract = (ImageView) findViewById(R.id.imgSubtract);
        ImageView imgEqual = (ImageView) findViewById(R.id.imgEqual);

        Button btnClear = (Button) findViewById(R.id.btnClear);

        img0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "0";
                currentNumber = currentNumber + "0";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "0");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "1";
                currentNumber = currentNumber + "1";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "1");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "2";
                currentNumber = currentNumber + "2";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "2");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "3";
                currentNumber = currentNumber + "3";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "3");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "4";
                currentNumber = currentNumber + "4";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "4");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "5";
                currentNumber = currentNumber + "5";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "5");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "6";
                currentNumber = currentNumber + "6";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "6");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "7";
                currentNumber = currentNumber + "7";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "7");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "8";
                currentNumber = currentNumber + "8";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "8");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (operation==true){
                    currentDisplay = "";
                    operation = false;
                }
                currentDisplay = currentDisplay + "9";
                currentNumber = currentNumber + "9";
                txtDisplay.setText(currentDisplay);
                txtExpression.setText(oldCalculationText + "9");
                oldCalculationText = txtExpression.getText().toString();

            }
        });

        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtExpression.setText(oldCalculationText + " + ");
                oldCalculationText = txtExpression.getText().toString();
                operation = true;
                currentNumber = "";
                last_operation = '+';


            }
        });

        imgSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtExpression.setText(oldCalculationText + " - ");
                oldCalculationText = txtExpression.getText().toString();
                operation = true;
                currentNumber = "";
                last_operation = '-';

            }
        });

        imgMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtExpression.setText(oldCalculationText + " * ");
                oldCalculationText = txtExpression.getText().toString();
                operation = true;
                currentNumber = "";
                last_operation = '*';

            }
        });

        imgDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtExpression.setText(oldCalculationText + " / ");
                oldCalculationText = txtExpression.getText().toString();
                operation = true;
                currentNumber = "";
                last_operation = '/';

            }
        });

        imgEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
