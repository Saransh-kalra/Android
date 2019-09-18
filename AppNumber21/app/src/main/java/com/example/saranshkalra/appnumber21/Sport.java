package com.example.saranshkalra.appnumber21;

import android.widget.TextView;

/**
 * Created by saranshkalra on 4/2/18.
 */

public class Sport {

    private String sportName;
    private int[] scores;

    public Sport(String sportName, int[] scores) {

        this.sportName = sportName;
        this.scores = scores;

    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public int getTheMinimumValue() {

        int lowestScore = scores[0];
        for (int score : scores) {

            if (score < lowestScore) {
                lowestScore = score;
            }

        }

        return lowestScore;

    }

    public int getTheMaximumValue() {

        int highestScore = scores[0];
        for (int score : scores) {

            if (score > highestScore) {
                highestScore = score;
            }

        }

        return highestScore;

    }

    public double getTheAverageValue() {

        int total = 0;

        for(int score : scores) {
            total += score;
        }

        return (double) total/scores.length;

    }

    public void letsOutPutTheScores(TextView textView) {

        String oldTextViewValue;

        for (int index = 0; index < scores.length; index++){

            oldTextViewValue = textView.getText().toString();

            textView.setText(String.format(oldTextViewValue + "Athlete Number: %2d: %3d\n", index,
                                            scores[index]));

        }
    }




}
