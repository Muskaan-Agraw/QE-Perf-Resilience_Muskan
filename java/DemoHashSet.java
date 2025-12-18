package com.example;
import java.util.HashSet;
import java.util.Iterator;
public class DemoHashSet {
    public static void main(String[] args) {
    HashSet <String> hs=new HashSet<>();
    hs.add("Mango");
    hs.add("Apple");
    hs.add("Banana");
    hs.add("Pear");
    hs.add("Papaya");
System.out.println("Original HashSet: " + hs);
System.out.println("Size of HashSet: " + hs.size());
if (hs.contains("Mango")){
    hs.remove("Mango");
}
else{
    hs.remove("Banana");
}
System.out.println("HashSet Becomes: " + hs);
Iterator <String> itr=hs.iterator();
while (itr.hasNext()){
    System.out.println(itr.next());
}

}
}
