package com.example;
import java.util.HashMap;
import java.util.Iterator;
public class DemoHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hs1=new HashMap<>();
    hs1.put(1, "Red");
        hs1.put(2, "Green");
        hs1.put(3, "Blue");
        hs1.put(4, "White");
        hs1.put(5, "Black");
 hs1.remove(4);
 if (hs1.containsValue("Green")){
    System.out.println("It exists");
 }
 System.out.println(hs1.size());
 Iterator<String> valueItr = hs1.values().iterator();
 Iterator<Integer> keyItr = hs1.keySet().iterator();
 while (valueItr.hasNext()){
    System.out.println(valueItr.next());
 }
 while(keyItr.hasNext()){
    System.out.println(keyItr.next());
 }

}
}
