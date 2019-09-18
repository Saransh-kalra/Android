package com.example.saranshkalra.appnumber4;

/**
 * Created by saranshkalra on 1/8/18.
 */

public class Bird extends Animal{

    private final boolean canFly ;
    private int numberOfWings;

    public Bird( String name, String color, int amountOfSpeed, int amountOfPower, boolean canFly, int numberOfWings ){

        super(name, color, amountOfSpeed, amountOfPower);
        this.canFly = canFly;
        this.numberOfWings = numberOfWings;

    }

    public boolean getCanFly() {
        return canFly;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %s: %b %s: %d", "Fly", canFly, "Number Of Wings",numberOfWings);
    }
}
