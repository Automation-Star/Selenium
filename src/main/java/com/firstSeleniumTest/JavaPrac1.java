package com.firstSeleniumTest;

import io.netty.handler.codec.spdy.SpdyHttpHeaders;

import java.util.*;

// Create an ArrayList of Strings and add five names to it. Print all the names.
public class JavaPrac1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sarwat");
        names.add("Ghazi");
        names.add("Alisha");
        names.add("Baqer");

        // Iterate over an ArrayList using a for loop, for-each loop, and an Iterator.
         for(String name: names){
        System.out.println(name);

        for (int i = 0; i <= names.size(); i++) {
            System.out.println(names.get(i));
        }

        // sort arrayList
        Collections.sort(names);

        //2 Remove an element from an ArrayList by value and index.
        names.remove(3);
        System.out.println(names);

        // 3size of the arraylist
        int size = names.size();
        System.out.println(size);

        // 4 Check if an element exists in an ArrayList.

        String SearchName = "Sarwat";
        if(names.contains(SearchName)){
            System.out.println("It contains the name");
        }
        else{
            System.out.println("It doesn't contains the name");
        }

       }
    }

    // Merge two ArrayLists into a single list.

    public void mergeTwoArrayList(){
        List<String> list1 = new ArrayList<>();
        list1.add("Bob");
        list1.add("Alice");

        List<String> list2 = new ArrayList<>();
        list2.add("Henry");
        list2.add("Mike");

        List<String> newList = new ArrayList<>(list1);
        newList.addAll(list2);
        System.out.println(newList);
    }

    //Remove duplicates from an ArrayList.

    public static List<String>removeDuplicatesArrayList(List<String> list1 , List<String> list2) {
        //  List<String> list1 = new ArrayList<>();
        list1.add("Bob");
        list1.add("Alice");

        // List<String> list2 = new ArrayList<>();
        list2.add("Bob");
        list2.add("Mike");


        HashSet<String> dup = new HashSet<>();
        dup.addAll(list1);
        dup.addAll(list2);
        return new ArrayList<>(dup);
    }


        }

