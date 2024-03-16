package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);



        WaterVehicle b1 = new Boat("boat",5);
        b1.getVehicleName();
        b1.getVehicleCapacity();
    }
}