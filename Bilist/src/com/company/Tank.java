package com.company;

public class Tank extends Vehicle {
    public Tank () {
        super(25, 2000, "Tank", 5);
        System.out.println("Tank created. " + getRange() + " miles to go!");
    }


}
