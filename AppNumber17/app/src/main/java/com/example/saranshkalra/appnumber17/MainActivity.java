package com.example.saranshkalra.appnumber17;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtRates = findViewById(R.id.txtRates);
        TextView txtNumberOfStars = findViewById(R.id.txtNumberOfStars);
        String oldTxtRatesValue;
        String oldTxtNumberOfStarsValue;


        int[] peopleRates = {1, 4, 3, 5, 2, 5, 1, 3, 4, 5, 2, 4, 5, 6 };
        int[] occurence = new int[6]; // 0, 1, 2, 3, 4, 5

        for (int respond = 0; respond < peopleRates.length; respond++) {

            // ++occurence[peopleRates[respond]];

            try {

                ++occurence[peopleRates[respond]];

            }catch(Exception e) {

                Log.i("LOG", e.toString());

            }

        }

        for (int amount = 1; amount < occurence.length; amount++) {

            oldTxtRatesValue = txtRates.getText().toString();
            oldTxtNumberOfStarsValue = txtNumberOfStars.getText().toString();

            txtRates.setText(oldTxtRatesValue + amount + "\n");
            txtNumberOfStars.setText(oldTxtNumberOfStarsValue +occurence[amount] + "\n");



        }

    }

}
