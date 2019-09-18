package com.example.saranshkalra.appnumber16;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtDiceNumber1 = findViewById(R.id.txtDiceNumber1);
        final TextView txtDiceNumber2 = findViewById(R.id.txtDiceNumber2);
        final TextView txtDiceNumber3 = findViewById(R.id.txtDiceNumber3);
        final TextView txtDiceNumber4 = findViewById(R.id.txtDiceNumber4);
        final TextView txtDiceNumber5 = findViewById(R.id.txtDiceNumber5);
        final TextView txtDiceNumber6 = findViewById(R.id.txtDiceNumber6);

        Button btnRollTheDice = findViewById(R.id.btnRollTheDice);

        final SecureRandom secureRandomNumbers = new SecureRandom();
        final int[] occurence = new int[7];

        btnRollTheDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int times = 0; times < 5000000; times++) {

                    int randNum = 1 + secureRandomNumbers.nextInt(6);
                    ++occurence[randNum];

                }

                for (int faceNum = 1; faceNum < occurence.length; faceNum++) {

//                    if(faceNum == 1) {
//                        txtDiceNumber1.setText(occurence[faceNum] + "");
//                    }
//
//                    if(faceNum == 2) {
//                        txtDiceNumber2.setText(occurence[faceNum] + "");
//                    }
//
//                    if(faceNum == 3) {
//                        txtDiceNumber3.setText(occurence[faceNum] + "");
//                    }
//
//                    if(faceNum == 4) {
//                        txtDiceNumber4.setText(occurence[faceNum] + "");
//                    }
//
//                    if(faceNum == 5) {
//                        txtDiceNumber5.setText(occurence[faceNum] + "");
//                    }
//
//                    if(faceNum == 6) {
//                        txtDiceNumber6.setText(occurence[faceNum] + "");
//                    }

//                      switch (faceNum) {
//
//                          case 1:
//                              txtDiceNumber1.setText(occurence[faceNum] + "");
//                              break;
//
//                          case 2:
//                              txtDiceNumber2.setText(occurence[faceNum] + "");
//                              break;
//
//                          case 3:
//                              txtDiceNumber3.setText(occurence[faceNum] + "");
//                              break;
//
//                          case 4:
//                              txtDiceNumber4.setText(occurence[faceNum] + "");
//                              break;
//
//                          case 5:
//                              txtDiceNumber5.setText(occurence[faceNum] + "");
//                              break;
//
//                          case 6:
//                              txtDiceNumber6.setText(occurence[faceNum] + "");
//                              break;
//
//
                    switch (faceNum) {

                        case 1:
                            putTheRightValueToTheTextView(txtDiceNumber1, occurence, faceNum);
                            break;

                        case 2:
                            putTheRightValueToTheTextView(txtDiceNumber2, occurence, faceNum);
                            break;

                        case 3:
                            putTheRightValueToTheTextView(txtDiceNumber3, occurence, faceNum);
                            break;

                        case 4:
                            putTheRightValueToTheTextView(txtDiceNumber4, occurence, faceNum);
                            break;

                        case 5:
                            putTheRightValueToTheTextView(txtDiceNumber5, occurence, faceNum);
                            break;

                        case 6:
                            putTheRightValueToTheTextView(txtDiceNumber6, occurence, faceNum);
                            break;

                    }


                }

            }
        });


    }

    private void putTheRightValueToTheTextView(TextView txtDiceNumber, int[] occurence, int index) {

        txtDiceNumber.setText(occurence[index] + "");

    }


}
