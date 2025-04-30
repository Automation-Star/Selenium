package com.firstSeleniumTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0, "Mazda"); // Insert element at the beginning of the list (0)
        Collections.sort(cars);// sort
       for (String i : cars) {
         //   for (int i= 0 ; i< cars.size();i++){
                System.out.println(i);

            }
        }


    }


