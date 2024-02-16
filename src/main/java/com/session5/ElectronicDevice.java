package main.java.com.session5;
/*
* Create an abstract class called ElectronicDevice. It has the following fields and methods:
Fields: brand, model, operating system, power status, battery level (accurate XX)
Concrete methods: turn on, turn off
Abstract methods: charge, display device’s information (brand, model, operating_system)
* */

public abstract class ElectronicDevice{
    // attributes, fields, properties
    String brand; // variabila declarata
    String model;
    String operating_system;
    boolean power_status;
    int battery_level = 1;

    // methods
    public void turn_on(){
        this.power_status = true;
        System.out.println("The device is turned on!");
    }
    public void turn_off(){
        this.power_status = false;
        System.out.println("The device is turned off");
    }
    public abstract void charge();
    public abstract void displayDeviceInfo();

}
