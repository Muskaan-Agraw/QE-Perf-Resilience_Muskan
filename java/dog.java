package com.example;

public class dog extends Abstractanimal {
    public void sound(){
        System.out.println("Booooo");
    }
    public static void main(String args[]) {
    	//Instantiation
        dog timmy = new dog();
        timmy.sound();
    }
}
