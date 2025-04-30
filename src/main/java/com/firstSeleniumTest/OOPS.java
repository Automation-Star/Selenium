package com.firstSeleniumTest;

import java.util.Arrays;
import java.util.Scanner;

public class OOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
//        Boolean result=checkAnagrams();
//        System.out.println("Strings are Anagrams:" + result);
        //       removeSpace(input);

//        char result = findFirstNonRepeatedChar(input);
//        System.out.println(result);

      boolean result =  checkContainsDigit(input);
        System.out.println(result);

    }





    /* Reverse a String
     */

    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed String:" + reversed);
        return reversed;
    }


    //Reverse String By using StringBuilder function
    public static void reverseStringBySB(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

    }

    /*
    Count Vowels and Consonants
     */

    public static void countVowels(String input) {

        int vowels = 0;
        int consonant = 0;

        String letters = input.toLowerCase();
        for (char ch : letters.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonant++;
                }
            }


        }
        System.out.println("Vowels count:" + vowels);
        System.out.println("Consonant Count:" + consonant);
    }

    public void main() {
    }


    /*
    Check if Two Strings are Anagrams
     */
    public static boolean checkAnagrams() {

        String input1 = "Tea";
        String input2 = "eat";
        if (input1.length() != input2.length()) {
            System.out.println("String length is not equal");
            return false;
        }
        char[] inp1 = input1.toCharArray();
        char[] inp2 = input2.toCharArray();

        Arrays.sort(inp1);
        Arrays.sort(inp2);


        return Arrays.equals(inp1, inp2);

    }

    /*
    Remove All Whitespaces
     */
    public static void removeSpace(String input) {
        String result = input.replaceAll("\\s+", "");
        System.out.println("After removing whitespaces: " + result);


    }

    /*
    Find First Non-Repeated Character
     */

    public static char findFirstNonRepeatedChar(String input) {
        int[] freq = new int[26];
//count characters
        for (char ch : input.toCharArray()) {
            freq[ch - 'a']++;

        }
        // count rpeated characters

        for (char ch : input.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                return ch;

            }


        }
        return '-';
    }

    /*
    Check if a String Contains Only Digits
     */
    public static boolean checkContainsDigit(String input) {

     // return input.matches("\\d+");
        for(Character ch :input.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }

return true;

    }

    /*
    Find Duplicate Characters
     */

    

}
