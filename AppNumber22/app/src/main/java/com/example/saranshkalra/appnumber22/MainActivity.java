package com.example.saranshkalra.appnumber22;

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

        TextView txtIntArray1 = findViewById(R.id.txtArray1);
        TextView txtIntArray2 = findViewById(R.id.txtArray2);

        int [][] intArray1 = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12},
                {13,14,15}, {16,17,18}, {19,20,21}, {22,23,24}};

        int [][] intArray2 = {{100,101}, {102}, {103,104,105}, {106,107,108}, {109,110,111},
                            {112,113,114,115,116,117}, {118,119,120}};


        letsOutputTheArrayToTheScreen(intArray1, txtIntArray1);
        letsOutputTheArrayToTheScreen(intArray2, txtIntArray2);

    }

    public void letsOutputTheArrayToTheScreen(int[][] intArray, TextView textView) {

        String oldColumnsValue;

        for (int row = 0; row < intArray.length; row++){

            for(int column = 0; column < intArray[row].length; column++) {

                oldColumnsValue = textView.getText().toString();
                textView.setText(oldColumnsValue + intArray[row][column] + " - ");
            }
        }
    }


}
