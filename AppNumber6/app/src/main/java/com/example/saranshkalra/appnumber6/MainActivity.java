package com.example.saranshkalra.appnumber6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final TextView txtResult = (TextView) findViewById(R.id.txtResult);
        final EditText edtNumber = (EditText) findViewById(R.id.edtNumber);
        Button btnResult = (Button) findViewById(R.id.btnresult);
        TextView txtEnter = (TextView) findViewById(R.id.txtEnter);


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFieldValue = edtNumber.getText() + "";
                int intValue = Integer.parseInt(textFieldValue);
                String result = "";

                /*if (textFieldValue.contains("51")) {
                    //txtResult.setText(textFieldValue + " Great!");
                    result = textFieldValue + " Great!";
                }

                else{
                    //txtResult.setText("The Value Is Not 51, and The Value Is " + textFieldValue);
                    result = "The Value Is Not 51, and The Value Is " + textFieldValue;
                }*/

                /*if (textFieldValue.contains("90")){
                    result = "Your Grade is A and your number is: " + textFieldValue;
                }
                else if (textFieldValue.contains("80")){
                    result = "Your Grade is B and your number is: " + textFieldValue;
                }
                else if (textFieldValue.contains("70")){
                    result = "Your Grade is C and your number is: " + textFieldValue;
                }
                else if (textFieldValue.contains("60")){
                    result = "Your Grade is F and your number is: " + textFieldValue;
                }
                else{
                    result = "You are not sufficient";
                }*/

                if (intValue >= 90){
                    result = "Your Grade is A and your number is: " + intValue;
                }
                else if (intValue >= 80){
                    result = "Your Grade is B and your number is: " + intValue;
                }
                else if (intValue >= 70){
                    result = "Your Grade is C and your number is: " + intValue;
                }
                else if (intValue >= 60){
                    result = "Your Grade is F and your number is: " + intValue;
                }
                else{
                    result = "You are not accepted";
                }


                txtResult.setText(result);

            }
        });



    }
}
