package com.example.saranshkalra.appnumber3;

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


        TextView txt1 = (TextView)findViewById(R.id.txt1);
        TextView txt2 = (TextView)findViewById(R.id.txt2);
        TextView txt3 = (TextView)findViewById(R.id.txt3);
        TextView txt4 = (TextView)findViewById(R.id.txt4);
        TextView txt5 = (TextView)findViewById(R.id.txt5);

        /*
        String myStringValue = "Android Programming is Fun!" ;

        txt1.setText(myStringValue);

        txt2.setText(myStringValue.charAt(0) + "");

        txt3.setText(myStringValue.substring(2));
        txt4.setText(myStringValue.substring(5,9));
        txt5.setText(myStringValue.indexOf("Programming") + "");
        */

        


    }


}
