package com.firstSeleniumTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

//Check if Two Strings are Anagrams
public class CheckTwoStringsAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String");
        String input1 = sc.next();
        System.out.println("Enter Second String");
        String input2 = sc.next();

        if (areAnagram(input1, input2)) {
            System.out.println(input1 + " and " + input2 + " are anagrams.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not anagrams.");
        }
    }

    public static boolean areAnagram(String input1, String input2) {
        if(input1.length()!=input2.length()){
            System.out.println("Lengths are not same");
            return false;
        }
       char[] stringInput1 = input1.toCharArray();
        char[] stringInput2 = input2.toCharArray();

      // sort
        Arrays.sort(stringInput1);
        Arrays.sort(stringInput2);

       return true;
    }

}

