package com.firstSeleniumTest;


import java.util.*;

public class AddTwoNumInArrays {
    public static void main(String[] args) {
        // Example input
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        List<String> list2 = new ArrayList<>();
        list2.add("2");
        list2.add("4");
        list2.add("5");
        // Get the unified list
        List<String> unifiedList = mergeAndRemoveDuplicates(list1, list2);
        System.out.println("Unified List: " + unifiedList);
    }

    // Method to merge two lists and remove duplicates

    public static List<String> mergeAndRemoveDuplicates(List<String> list1, List<String> list2) {
        // Use a Set to automatically handle duplicates
        HashSet<String> nameSet = new HashSet<>();

        // Add all names from both lists to the set
        nameSet.addAll(list1);
        nameSet.addAll(list2);

        // Convert the set back to a list
        return new ArrayList<>(nameSet);


    }
}




