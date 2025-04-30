package com.firstSeleniumTest;

public class LargestElementInArrayExample {

    public static void main(String[] args) {

        int[] array = {1, 3, 4, 2, 5};
       // int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }

        System.out.println(max);
    }
}



