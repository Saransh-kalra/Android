package com.example.saranshkalra.mynumbergame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int clickCount=0;
    Random r = new Random();
    int randomNum = r.nextInt(100 - 1) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        final EditText editNumber = (EditText) findViewById(R.id.editNumber);
        Button btnGuess = (Button) findViewById(R.id.btnGuess);
        Button btnReset = (Button) findViewById(R.id.btnReset);

        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                int intValue = Integer.parseInt(editNumber.getText().toString());
                if(intValue<101 && intValue>0){
                    if (intValue<randomNum) {
                        txtResult.setText("Your Number Is Lower Than The Winning number");
                    }
                    else if (intValue>randomNum){
                        txtResult.setText("Your Number Is Higher Than The Winning number");
                    }
                    else if (intValue==randomNum){
                        txtResult.setText("You Guessed The Winning number in " + clickCount + " Trials, Congrats!");
                        randomNum = r.nextInt(100 - 1) + 1;
                        clickCount = 0;
                    }
                }
                else {
                    txtResult.setText("Your Number Is Not In The Range 1 to 100, Try Again!");
                }

            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResult.setText("The Game Is Reset");
                randomNum = r.nextInt(100 - 1) + 1;
                clickCount = 0;

            }
        });



    }

}

