package com.example;

public class Activity1 {
    public static void main(String[] args){
        car carname=new car();
        carname.make=2014;
        carname.color="black";
        carname.transimission="Manual";
        carname.displayCharacteristics();
        carname.accelerate();
        carname.brake();
    }
}
