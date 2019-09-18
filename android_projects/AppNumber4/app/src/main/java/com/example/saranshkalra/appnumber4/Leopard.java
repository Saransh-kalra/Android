package com.example.saranshkalra.appnumber4;

/**
 * Created by saranshkalra on 1/8/18.
 */

public class Leopard extends Cat {

    private String claws = "Sharp";

    public Leopard(String name, String color, int amountOfSpeed, int amountOfPower, int numberOfLegs,
                   boolean canHuntOtherAnimals, String claws ){

        super(name, color, amountOfSpeed, amountOfPower, numberOfLegs, canHuntOtherAnimals);

        this.claws = claws;

    }

    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }

    @Override
    public String toString() {
        return super.toString() + " Claws: " + claws;
    }
}
