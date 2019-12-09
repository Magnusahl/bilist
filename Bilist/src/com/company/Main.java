package com.company;

public class Main {

    public static void main(String[] args) {

        Driver d1 = new Driver("Emilia", 17);
        Driver d2 = new Driver("Niklas", 21);


        Vehicle v1 = new Car();
        Vehicle v2 = new Tank();

        v1.drive();
        v2.drive();

        v1.setDriver(d1);
        v1.setDriver(d2);
        v2.setDriver(d2);
        v2.setDriver(new Driver("Tankman", 30));

        v1.drive();
        v2.drive();

    }
}
