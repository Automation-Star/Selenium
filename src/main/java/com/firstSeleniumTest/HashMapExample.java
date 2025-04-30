package com.firstSeleniumTest;

import java.util.HashMap;


public class HashMapExample {

    public static void main(String[] args) {
        // create a hashmap
        HashMap<Integer, String> Fruits = new HashMap<>();
        Fruits.put(1, "Banana");
        Fruits.put(2, "Apple");
        Fruits.put(3, "Orange");

        System.out.println(Fruits.get(2));
        Fruits.remove(3);
        System.out.println(Fruits);
           System.out.println(Fruits);

         // find teh size
        for (int i = 0; i < Fruits.size(); i++) {
            System.out.println(i);
        }
        if (Fruits.containsKey(3)){
            System.out.println("Orange is present");
        }
        else{
            System.out.println("Orange is not present");
        }

    }
}