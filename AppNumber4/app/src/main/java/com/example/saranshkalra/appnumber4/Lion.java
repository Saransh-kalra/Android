package com.example.saranshkalra.appnumber4;

/**
 * Created by saranshkalra on 1/8/18.
 */

public class Lion extends Cat {


    private boolean isBrave;

    public Lion (String name, String color, int amountOfSpeed, int amountOfPower, int numberOfLegs,
                 boolean canHuntOtherAnimals, boolean isBrave){

        super(name, color, amountOfSpeed, amountOfPower, numberOfLegs, canHuntOtherAnimals);
        this.isBrave = isBrave;

    }

    public boolean getIsBrave() {
        return isBrave;
    }

    public void setIsBrave(boolean brave) {
        isBrave = brave;
    }

    @Override
    public String toString() {
        return super.toString() + " IsBrave: " + isBrave;
    }
}
