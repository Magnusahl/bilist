package com.company;

public class Vehicle {
    protected int agelimit;
    protected int range;
    protected String type;
    protected Driver driver;
    protected double rangedistance;

    //constructor
    public Vehicle(int agelimit, int range, String type, double rangedistance) {
        this.agelimit = agelimit;
        this.range = range;
        this.type = type;
        this.rangedistance = rangedistance;
    }

    public int getAgelimit() {
        return agelimit;
    }

    public int getRange() {
        return range;
    }


    public void setDriver(Driver driver) {
        if (driver.getAge() < agelimit) {
            System.out.println("Driver not changed! " + driver.getName() + " is " + driver.getAge() + " but must be " + getAgelimit() + " older to drive car ");
        }
        if (driver.getAge() > agelimit) {
            System.out.println("Driver changed to " + driver.getName());
            this.driver = driver;
        }

    }

    public void drive() {
        if (driver == null) {
            System.out.println(type + " didnt drive - theres no driver");
        }
        else  {
            range -= rangedistance;
            System.out.println(type  + " drove " + rangedistance + " miles " + range + " miles to go");
        }
    }



}
