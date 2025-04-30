package com.firstSeleniumTest;

import java.util.LinkedHashSet;


public class RemoveDuplicatesFromString {
    //Input: "programming"
    //🔹 Output: "progamin"
    ;
    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicates(input);
        System.out.println(output);
    }
    public static String removeDuplicates(String input) {

        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for(char ch : input.toCharArray()){
            System.out.println(ch);
            if(seen.add(ch)){
                result.append(ch);
            }

        }
        return result.toString();
    }
}
