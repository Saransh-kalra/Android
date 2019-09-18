package com.example.saranshkalra.appnumber18;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText edtPuzzle = findViewById(R.id.edtPuzzle);
        String oldEdtPuzzleValue;

        Puzzle myPuzzle = new Puzzle();
        myPuzzle.letsShuffleTheDevices();

        for(int i = 0; i < 60; i++) {

            oldEdtPuzzleValue = edtPuzzle.getText().toString();

            edtPuzzle.setText(oldEdtPuzzleValue + myPuzzle.giveMeTheModels()) ;
        }


    }

}
