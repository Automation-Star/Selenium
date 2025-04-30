package com.firstSeleniumTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
// remove duplicate from Array list
public class Excersise {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Sarwat");
        list1.add("Ghazi");
        list1.add("Alisha");

        List<String> list2 = new ArrayList<>();
        list2.add("Baqer");
        list1.add("Ghazi");

        List <String> UndefineList = mergeAndRemoveDuplicates(list1 , list2);
        System.out.println(UndefineList);

    }

    // creating a method to remove duplicates from list1 and list2
    public static List<String> mergeAndRemoveDuplicates(List<String> list1, List<String> list2) {
        HashSet<String> nameSet = new HashSet<>();

        nameSet.addAll(list1);
        nameSet.addAll(list2);

        return new ArrayList<>(nameSet);

    }
}
