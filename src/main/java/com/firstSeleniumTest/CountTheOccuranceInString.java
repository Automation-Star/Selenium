package com.firstSeleniumTest;

import java.util.HashMap;
import java.util.Scanner;

public class CountTheOccuranceInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String input = sc.next();
        //aaabbccc
        HashMap<Character, Integer> findOccureance = new HashMap<>();

        for (char ch : input.toCharArray()) {
            findOccureance.put(ch, findOccureance.getOrDefault(ch, 0) + 1);



        }
        System.out.println(findOccureance);
    }
}
