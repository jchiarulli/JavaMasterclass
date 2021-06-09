package com.company;


// I am not familiar enough with the LinkedHashMap to be able to implement it in 45 minutes along with the other Java programs, so I had to resort to using the external library which
// I am comfortable using. I have also found some tutorials explaining the concept of the linkedHashMap which I will use to learn how to implement it myself.
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(1, "dog");
        lhm.put(2, "cat");
        lhm.put(3, "bird");

        System.out.println(lhm);

        System.out.println("Check if LinkedHashMap is empty: " + lhm.isEmpty());
        System.out.println("Value for key 1: " + lhm.get(1));
        System.out.println("Does LinkedHashMap contain key 3: " + lhm.containsKey(3));
        System.out.println("Size of LinkedHashMap: " + lhm.size());
        System.out.println("Does the LinkedHashMap contain the value dog: " + lhm.containsValue("dog"));
        System.out.println("Delete the element with a key of 3: " + lhm.remove(3));
        System.out.println(lhm);
    }
}
