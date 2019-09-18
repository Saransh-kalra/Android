package com.example.saranshkalra.appnumber23;

import android.widget.TextView;

/**
 * Created by saranshkalra on 4/9/18.
 */

public class Game {

    private String gameName;
    private int[][] scores;

    public Game(String gameName, int[][] scores) {
        this.scores = scores;
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getMinimumscore() {

        int lowestScore = scores[0][0]; // Assume this  is the Smallest Score Value
        for (int[] gameScores : scores) {
            for(int score: gameScores) {
                if(score < lowestScore){
                    lowestScore = score;
                }
            }
        }

        return lowestScore;

    }

    public int getMaximumScore() {

        int highestScore = scores[0][0]; // Assume this  is the Smallest Score Value
        for (int[] gameScores : scores) {
            for(int score: gameScores) {
                if(score > highestScore){
                    highestScore = score;
                }
            }
        }

        return highestScore;

    }

    public double getTheAverageValueOfTheScores(int[] scores){

        int total =0;

        //sum scores for each game
        for(int score: scores){
            total += score;
        }

        return (double) total / scores.length;
    }

    public void letsOutPutTheScoresToTheScreen(TextView textView){

        String oldTextViewValue;

        for(int gameIndex = 0; gameIndex < scores.length; gameIndex++){

            for(int gameScore : scores[gameIndex]){

                oldTextViewValue = textView.getText().toString();

                textView.setText(String.format(oldTextViewValue + "Game Number %2d: %3d\n\n\n", (gameIndex + 1),
                        gameScore));

            }

        }
    }
}
