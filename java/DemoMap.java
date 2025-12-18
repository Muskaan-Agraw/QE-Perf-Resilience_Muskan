package com.example;
import java.util.Map;
import java.util.HashMap;
public class DemoMap {
    public static void main(String[] args) {
        Map<String,Integer> numbers=new HashMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        System.out.println("Keys: " + numbers.keySet());
        // Access values of the map
        System.out.println("Values: " + numbers.values());
        // Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());
        int value = numbers.remove("Two");
        System.out.println("Keys: " + numbers.keySet());
        System.out.println("Removed Value: " + value);
    }
}
