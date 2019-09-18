package com.example.saranshkalra.appnumber4;

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

        TextView txtAnimal = (TextView) findViewById(R.id.txtAnimal);
        TextView txtLeopard = (TextView) findViewById(R.id.txtLeopard);
        TextView txtLion = (TextView) findViewById(R.id.txtLion);
        TextView txtCat = (TextView) findViewById(R.id.txtCat);
        TextView txtBird = (TextView) findViewById(R.id.txtBird);

        Animal animal1 = new Animal("tiger", "orange", 60, 80);

        txtAnimal.setText(animal1.toString());

        Cat cat1 = new Cat("My cat","White",40 ,30 , 4, true);

        txtCat.setText(cat1.toString());

        Lion myLion = new Lion("My Lion", "Golden", 90, 300, 4, true, true);

        txtLion.setText(myLion.toString());

        Leopard myLeopard = new Leopard("My Leopard", "Yellow", 400, 200, 4, true, "Sharp");

        txtLeopard.setText(myLeopard.toString());

        Bird myBird = new Bird("My Bird", "White",600,20, true, 2);

        txtBird.setText(myBird.toString());



    }


}
