package com.company;

public class Car extends Vehicle {
    public Car () {
        super(18,100, "Car", 10);
        System.out.println("Car created. " + getRange() + " miles to go!");
    }


    /*
    public int getRange() {
        return range;
    }

    public int getAgelimit() {
        return agelimit;
    }

    public void setCar() {
        this.agelimit = getAgelimit();
        this.range = getRange();
    }*/

}
