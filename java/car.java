package com.example;
public class car {
    String color;
    String transimission;
    int make;
    int tyres;
    int doors;
    public car(){
        tyres=4;
        doors=4;

    }
    public void displayCharacteristics(){
        System.out.println("Color is" + color);
        System.out.println("Transmission is" + transimission);
        System.out.println("make is" + make);
        System.out.println("No of tyres" + tyres);
        System.out.println("No of doors" + doors);
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }
}