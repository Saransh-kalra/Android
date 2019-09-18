package com.example.saranshkalra.appnumber14;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtCalculations = (TextView) findViewById(R.id.txtCalculations);
        TextView txtTotal = (TextView) findViewById(R.id.txtTotal);

        String oldText;

        int[] integerArray = {2,54,34,76,23,4,7,86,4,65};
        int totalValue = 0;

        for (int index = 0; index<integerArray.length; index++){

            //totalValue = totalValue + integerArray[index];
            //totalValue += integerArray[index];

            oldText = txtCalculations.getText().toString();

            txtCalculations.setText(oldText + " " + totalValue + "+" + integerArray[index] + "=" +
                    (totalValue += integerArray[index]) +"\n");

        }

        txtTotal.setText(totalValue + "");








    }

}
