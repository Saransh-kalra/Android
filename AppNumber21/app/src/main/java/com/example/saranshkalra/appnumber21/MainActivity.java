package com.example.saranshkalra.appnumber21;

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

        TextView txtSportName = (TextView) findViewById(R.id.txtSportName);
        TextView txtScores = (TextView) findViewById(R.id.txtScores);
        TextView txtScoresAverage = (TextView) findViewById(R.id.txtScoresAverage);
        TextView txtHighestScore = (TextView) findViewById(R.id.txtHighestScore);
        TextView txtLowestScore = (TextView) findViewById(R.id.txtLowestScore);

        int[] scoresArray = {87, 34, 56, 23, 65, 98, 35, 21,48, 56, 45, 86, 37};

        Sport mySport = new Sport("Boxing", scoresArray);
        txtSportName.setText(mySport.getSportName());
        mySport.letsOutPutTheScores(txtScores);
        txtScoresAverage.setText(mySport.getTheAverageValue() + "");
        txtHighestScore.setText(mySport.getTheMaximumValue() + "");
        txtLowestScore.setText(mySport.getTheMinimumValue() + "");


    }

}
