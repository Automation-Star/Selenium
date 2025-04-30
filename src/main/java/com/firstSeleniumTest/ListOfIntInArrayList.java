package com.firstSeleniumTest;
import java.util.ArrayList;
import java.util.List;
public class ListOfIntInArrayList {

    public static void main(String[] args) {
        // Create a list of integer arrays
        List<int[]> listOfArrays = new ArrayList<>();

        // Create individual arrays and add them to the list
        // Create individual arrays and add them to the list
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

        listOfArrays.add(array1);
        listOfArrays.add(array2);
        listOfArrays.add(array3);

        // Accessing and printing elements from the list of arrays
        for (int i = 0; i < listOfArrays.size(); i++) {
            int[] currentArray = listOfArrays.get(i);
            System.out.println("Array " + (i + 1) + ": ");
            for (int num : currentArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


