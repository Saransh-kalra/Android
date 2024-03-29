package com.example.saranshkalra.appnumber20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtModifiedArrayElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtOriginalValuesOfArray = findViewById(R.id.txtOriginalValuesOfArray);
        TextView txtValuesOfModifiedArray = findViewById(R.id.txtValuesOfModifiedArray);
        txtModifiedArrayElement = findViewById(R.id.txtModifiedArrayElement);
        TextView txtOriginalArrayElement = findViewById(R.id.txtOriginalArrayElement);
        TextView txtArrayElementValueAfterModification = findViewById(R.id.txtArrayElementValueAfterModification);

        String[] stringArray = { "A\n", "B\n", "C\n", "D\n", "E\n", "F\n", "G\n", "H\n", "I\n", "J\n",
                                "K\n", "L\n", "M\n", "N\n", "O\n", "P\n", "Q\n", "R\n", "S\n", "T\n",
                                "U\n", "V\n", "W\n", "X\n", "Y\n", "Z\n"};

        String totalOriginalValues = "";

        for (String value : stringArray ) {
            totalOriginalValues += value;
        }

        txtOriginalValuesOfArray.setText(totalOriginalValues);


        //Now we want to modify the array

        letsModifyTheArray(stringArray);

        String totalModifiedValues = "";

        for( String value : stringArray) {

            totalModifiedValues += value;
        }

        txtValuesOfModifiedArray.setText(totalModifiedValues);


        txtOriginalArrayElement.setText(stringArray[5]);

        letsModifyElement(stringArray[5]);

        txtArrayElementValueAfterModification.setText(stringArray[5]);



    }

    public void letsModifyTheArray(String[] array) {

        for(int index = 0; index <array.length; index++) {

            array[index] = "$" + array[index];

        }

    }

    public void letsModifyElement (String element) {

        element = "@#" + element;
        txtModifiedArrayElement.setText(element);

    }


}
