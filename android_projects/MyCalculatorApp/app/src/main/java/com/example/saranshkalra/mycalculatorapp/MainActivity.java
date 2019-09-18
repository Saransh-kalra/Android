package com.example.saranshkalra.mycalculatorapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.addbtn);
        subtract = (Button) findViewById(R.id.subtractbtn);
        multiply = (Button) findViewById(R.id.multiplybtn);
        divide = (Button) findViewById(R.id.dividebtn);
        result=(TextView) findViewById(R.id.resultTxt);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1val =
                        Float.parseFloat(num1.getText().toString());
                float num2val =
                        Float.parseFloat(num2.getText().toString());
                float result1 =  num1val+num2val;
                result.setText(Float.toString(result1));
            }

        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1val =
                        Float.parseFloat(num1.getText().toString());
                float num2val =
                        Float.parseFloat(num2.getText().toString());
                float result1 =  num1val-num2val;
                result.setText(Float.toString(result1));
            }

        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1val =
                        Float.parseFloat(num1.getText().toString());
                float num2val =
                        Float.parseFloat(num2.getText().toString());
                float result1 =  num1val*num2val;
                result.setText(Float.toString(result1));
            }

        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1val =
                        Float.parseFloat(num1.getText().toString());
                float num2val =
                        Float.parseFloat(num2.getText().toString());
                float result1 =  num1val/num2val;
                result.setText(Float.toString(result1));
            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
