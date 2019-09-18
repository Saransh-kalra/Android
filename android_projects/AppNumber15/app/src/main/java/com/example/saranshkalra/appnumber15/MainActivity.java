package com.example.saranshkalra.appnumber15;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int fiveStarReview = 0;
    int fourStarReview = 0;
    int threeStarReview = 0;
    int twoStarReview = 0;
    int oneStarReview = 0;

    boolean firstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toast.makeText(this,"OnCreate Method is Called", Toast.LENGTH_LONG).show();

        final TextView txtFiveStarStudent = (TextView) findViewById(R.id.txtFiveStarStudent);
        final TextView txtFourStarStudent = (TextView) findViewById(R.id.txtFourStarStudent);
        final TextView txtThreeStarStudent = (TextView) findViewById(R.id.txtThreeStarStudent);
        final TextView txtTwoStarStudent = (TextView) findViewById(R.id.txtTwoStarStudent);
        final TextView txtOneStarStudent = (TextView) findViewById(R.id.txtOneStarStudent);

        RatingBar rtbFiveStarStudent = (RatingBar) findViewById(R.id.rtbFiveStarStudent);
        RatingBar rtbFourStarStudent = (RatingBar) findViewById(R.id.rtbFourStarStudent);
        RatingBar rtbThreeStarStudent = (RatingBar) findViewById(R.id.rtbThreeStarStudent);
        RatingBar rtbTwoStarStudent = (RatingBar) findViewById(R.id.rtbTwoStarStudent);
        RatingBar rtbOneStarStudent = (RatingBar) findViewById(R.id.rtbOneStarStudent);

        final Button btnResults = (Button) findViewById(R.id.btnResults);

//        rtbFiveStarStudent.setIsIndicator(true);
//        rtbFourStarStudent.setIsIndicator(true);
//        rtbThreeStarStudent.setIsIndicator(true);
//        rtbTwoStarStudent.setIsIndicator(true);
//        rtbOneStarStudent.setIsIndicator(true);

        makeThisRatingBarIndicator (rtbFiveStarStudent);
        makeThisRatingBarIndicator (rtbFourStarStudent);
        makeThisRatingBarIndicator (rtbOneStarStudent);
        makeThisRatingBarIndicator (rtbTwoStarStudent);
        makeThisRatingBarIndicator (rtbThreeStarStudent);

        final int[] studentReviews = {5, 3, 4, 2, 4, 5, 1, 3, 2, 5, 5, 3, 2, 3};

        for (int index = 0; index < studentReviews.length; index++) {

            if (studentReviews[index] == 5) {

                ++fiveStarReview;

            } else if (studentReviews[index] == 4) {

                ++fourStarReview;

            } else if (studentReviews[index] == 3) {

                ++threeStarReview;

            } else if (studentReviews[index] == 2) {

                ++twoStarReview;

            } else if (studentReviews[index] == 1) {

                ++oneStarReview;

            }

        }

        btnResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(firstTime) {

//                    for (int index = 0; index < studentReviews.length; index++) {
//
//                        if (studentReviews[index] == 5) {
//
//                            ++fiveStarReview;
//
//                        } else if (studentReviews[index] == 4) {
//
//                            ++fourStarReview;
//
//                        } else if (studentReviews[index] == 3) {
//
//                            ++threeStarReview;
//
//                        } else if (studentReviews[index] == 2) {
//
//                            ++twoStarReview;
//
//                        } else if (studentReviews[index] == 1) {
//
//                            ++oneStarReview;
//
//                        }
//
//                    }

                    firstTime = false;

                    txtFiveStarStudent.setText(fiveStarReview + "");
                    txtFourStarStudent.setText(fourStarReview + "");
                    txtThreeStarStudent.setText(threeStarReview + "");
                    txtTwoStarStudent.setText(twoStarReview + "");
                    txtOneStarStudent.setText(oneStarReview + "");

                    //btnResults.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    public void makeThisRatingBarIndicator (RatingBar ratingBar){


        ratingBar.setIsIndicator(true);


    }











}
