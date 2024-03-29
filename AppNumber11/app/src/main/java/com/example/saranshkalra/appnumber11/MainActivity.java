package com.example.saranshkalra.appnumber11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;

public class MainActivity extends AppCompatActivity {

    private static final SecureRandom secureRandomNumbers = new SecureRandom();

    private enum Status { NOTSTARTEDYET, PROCEED, WON, LOST};


    private static final int TIGER_CLAWS = 2;
    private static final int TREE = 3;
    private static final int CEVEN = 7;
    private static final int WE_LEVEN = 11;
    private static final int PANTHER = 12;

    TextView txtCalculations;
    ImageView imgDice;
    Button btnRestartGame;

    String oldTxtCalculationsValue = "";
    boolean  firstTime = true;
    Status gameStatus = Status.NOTSTARTEDYET;
    int points;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtCalculations = (TextView) findViewById(R.id.txtCalculations);
        imgDice = (ImageView) findViewById(R.id.imgDice);
        btnRestartGame = (Button) findViewById(R.id.btnRestartTheGame);
        final TextView txtGameStatus = (TextView) findViewById(R.id.txtGameStatus);


        makeBtnRestartInvisible();

//        txtGameStatus.setText("");
//        txtCalculations.setText("");

        imgDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (firstTime){
                    txtGameStatus.setText("");
                    txtCalculations.setText("");
                }

                if (gameStatus == Status.NOTSTARTEDYET){

                    int diceSum = letsRollTheDice();
                    oldTxtCalculationsValue = txtCalculations.getText().toString();
                    points = 0;

                    switch (diceSum) {

                        case CEVEN:
                        case WE_LEVEN:
                            gameStatus = Status.WON;
                            txtGameStatus.setText("You Win!");
                            makeImgDiceInvisible();
                            makeBtnRestartVisible();
                            break;
                        case TIGER_CLAWS:
                        case TREE:
                        case PANTHER:
                            gameStatus = Status.LOST;
                            txtGameStatus.setText("You Lost!");
                            makeImgDiceInvisible();
                            makeBtnRestartVisible();
                            break;

//                        case 4:
//                        case 5:
//                        case 6:
//                        case 8:
//                        case 9:
//                        case 10:
                        default:
                            gameStatus = Status.PROCEED;
                            points = diceSum;
                            txtCalculations.setText(oldTxtCalculationsValue + "Your Point is: " + points + "\n");
                            txtGameStatus.setText("Continue The Game!");
                            oldTxtCalculationsValue = "Your Point is " + points + "\n";
                    }

                    return;


                }


                if(gameStatus == Status.PROCEED){

                    int diceSum = letsRollTheDice();
                    if(diceSum == points) {
                        gameStatus = Status.WON;
                        txtGameStatus.setText("You Win!");
                        makeImgDiceInvisible();
                        makeBtnRestartVisible();
                    }
                    else if (diceSum == CEVEN){

                        gameStatus = Status.LOST;
                        txtGameStatus.setText("You Lost!");
                        makeImgDiceInvisible();
                        makeBtnRestartVisible();

                    }

                }

            }
        });



        btnRestartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gameStatus = Status.NOTSTARTEDYET;
                txtGameStatus.setText("");
                txtCalculations.setText("");
                oldTxtCalculationsValue = "";
                makeImgDiceVisible();
                makeBtnRestartInvisible();

            }
        });


    }


    private void makeImgDiceInvisible(){

        imgDice.setVisibility(View.INVISIBLE);

    }

    private void makeBtnRestartInvisible(){

        btnRestartGame.setVisibility(View.INVISIBLE);

    }

    private void makeImgDiceVisible(){

        imgDice.setVisibility(View.VISIBLE);

    }

    private void makeBtnRestartVisible(){

        btnRestartGame.setVisibility(View.VISIBLE);

    }

    private int letsRollTheDice() {

        int randDie1 = 1 + secureRandomNumbers.nextInt(6);
        int randDie2 = 1 + secureRandomNumbers.nextInt(6);
        int sum = randDie1 + randDie2;

        txtCalculations.setText(String.format(oldTxtCalculationsValue + "You Rolled %d + %d = %d%n",randDie1,randDie2,sum));

        return sum;
    }

}
