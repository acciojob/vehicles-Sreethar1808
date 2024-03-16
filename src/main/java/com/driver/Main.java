package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);
        Vehicle v1 = new Vehicle("Sreethar");
        Car c1 = new Car("sree", 4, 4, 5,true,"SUV",7);
        Boat b1 = new Boat();
        b1.getVehicleName();
        b1.getVehicleCapacity();
    }
}