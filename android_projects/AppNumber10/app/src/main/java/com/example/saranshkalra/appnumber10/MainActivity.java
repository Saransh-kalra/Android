package com.example.saranshkalra.appnumber10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    SecureRandom secureRandomNumbers = new SecureRandom();
    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0;
    int number6 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final TextView txtNumber1 = (TextView) findViewById(R.id.txtNumber1);
        final TextView txtNumber2 = (TextView) findViewById(R.id.txtNumber2);
        final TextView txtNumber3 = (TextView) findViewById(R.id.txtNumber3);
        final TextView txtNumber4 = (TextView) findViewById(R.id.txtNumber4);
        final TextView txtNumber5 = (TextView) findViewById(R.id.txtNumber5);
        final TextView txtNumber6 = (TextView) findViewById(R.id.txtNumber6);

        ImageView imgDice = (ImageView) findViewById(R.id.imgDice);
        final ImageView imgDiceNumber1 = (ImageView) findViewById(R.id.imgDiceNumber1);
        final ImageView imgDiceNumber2 = (ImageView) findViewById(R.id.imgDiceNumber2);
        final ImageView imgDiceNumber3 = (ImageView) findViewById(R.id.imgDiceNumber3);
        final ImageView imgDiceNumber4 = (ImageView) findViewById(R.id.imgDiceNumber4);
        final ImageView imgDiceNumber5 = (ImageView) findViewById(R.id.imgDiceNumber5);
        final ImageView imgDiceNumber6 = (ImageView) findViewById(R.id.imgDiceNumber6);


        Button btnRollTheDice = (Button) findViewById(R.id.btnRollTheDice);



        btnRollTheDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int rollTimes=0 ; rollTimes <= 5000000 ; rollTimes++){

                    int faceNumber = 1 + secureRandomNumbers.nextInt(6);

                    switch (faceNumber){

                        case 1:
                            ++number1;
                            break;

                        case 2:
                            ++number2;
                            break;

                        case 3:
                            ++number3;
                            break;

                        case 4:
                            ++number4;
                            break;

                        case 5:
                            ++number5;
                            break;

                        case 6:
                            ++number6;
                            break;

                    }

                }

                txtNumber1.setText(number1 +"");
                txtNumber2.setText(number2 +"");
                txtNumber3.setText(number3 +"");
                txtNumber4.setText(number4 +"");
                txtNumber5.setText(number5 +"");
                txtNumber6.setText(number6 +"");

                imgDiceNumber1.setImageResource(R.drawable.dice1);
                imgDiceNumber2.setImageResource(R.drawable.dice2);
                imgDiceNumber3.setImageResource(R.drawable.dice3);
                imgDiceNumber4.setImageResource(R.drawable.dice4);
                imgDiceNumber5.setImageResource(R.drawable.dice5);
                imgDiceNumber6.setImageResource(R.drawable.dice6);

            }
        });






    }


}
