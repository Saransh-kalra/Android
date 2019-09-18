package com.example.saranshkalra.appnumber7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final TextView txtStart = (TextView) findViewById(R.id.txtStart);
        final TextView txtI = (TextView) findViewById(R.id.txtI);
        final TextView txtSwitch = (TextView) findViewById(R.id.txtSwitch);
        final Button btnLoop = (Button) findViewById(R.id.btnLoop);
        Button btnSwitch = (Button) findViewById(R.id.btnSwitch);



        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                 for(int i=0; i<=10; i++) {
//                     txtStart.setText(i + "");
//                 }

//                 int i=0;
//                 while (i <= 10){
//
//                     txtStart.setText(i + "");
//                     i++;
//
//                 }
//
//                 txtI.setText(i + "");

//                 int y=0;
//                 do{
//
//                     txtStart.setText(y + "");
//                     y++;
//
//                 }while(y <= 15);


                for(int x=0; x<30; x++){

                    if (x == 5){
                        continue;
                    }

                    Log.i("LOG", x + "");

                }




            }
        });

        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nameString = "L";

                switch (nameString){

                    case "Animal1" :
                        txtSwitch.setText("Our Animal Name is Animal1");
                        break;

                    case "Lion" :
                        txtSwitch.setText("The Name of Our Animal is Lion");
                        break;

                    default:
                        txtSwitch.setText("The Name Of Our Animal is Something Else");

                }

            }
        });


    }


}
