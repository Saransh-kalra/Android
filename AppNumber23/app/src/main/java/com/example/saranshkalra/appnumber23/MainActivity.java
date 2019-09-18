package com.example.saranshkalra.appnumber23;

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

        TextView txtGameName = findViewById(R.id.txtGameName);
        TextView txtGameScores = findViewById(R.id.txtGameScores);
        TextView txtGameLowestScore = findViewById(R.id.txtGameLowestScore);
        TextView txtGameHighestScore = findViewById(R.id.txtGameHighestScore);
        TextView txtGameAverageValueOfScores = findViewById(R.id.txtGameAverageValueOfScores);

        int[][] gameScoresArray = { {45, 67, 34},
                {23, 56, 49},
                {23, 69, 88},
                {17, 28, 84},
                {38, 54, 75},
                {51, 34, 71},
                {15, 83, 46},
                {36, 47, 15},
                {83, 94, 34},
                {17, 37, 0} };

        Game myGame = new Game("God Of War", gameScoresArray);
        txtGameName.setText(myGame.getGameName());
        myGame.letsOutPutTheScoresToTheScreen(txtGameScores);
        txtGameHighestScore.setText(myGame.getMaximumScore() + "");
        txtGameLowestScore.setText(myGame.getMinimumscore() + "");


    }

    String oldTxtGameAverageValueOfScores;

    for(int gameIndex =0; gameIndex<= )





}
