package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.seats=seats;
        this.type=type;
    }

    public void changeGear(int newGear){

        this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
    public int getDoors() {
        return this.doors;
    }

    public int getcurrentGear1()
    {
        return this.currentGear;
    }
    // In Car class
    public int getGears() {
        return this.gears;
    }

    public int getWheels() {
        return this.wheels;
    }

    public boolean isManual() {
        return this.isManual;
    }

    public String getType() {
        return this.type;
    }

    public int getSeats() {
        return this.seats;
    }
    // In Car class
    public int getCurrentGear() {
        return this.currentGear;
    }
}
