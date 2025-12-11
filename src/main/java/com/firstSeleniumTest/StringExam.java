package com.firstSeleniumTest;

import java.lang.reflect.Array;
import java.util.*;

public class StringExam {

    public static void main(String[] args) {

            removeDup();
        //  findFirstNonRepChar();

        //   countDupChar();

//        boolean result = checkAnagram();
//        System.out.println(result);

        //      vowels();

     //   longestWord();

      //  permutation();
    }

    /*
    Remove all duplicates from a string
Input: "programming" → Output: "progamin"
     */
    public static void removeDup() {
        String input = "programming";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> unique = new LinkedHashSet<>();
        for (char ch : input.toCharArray()) {
            if (unique.add(ch)) {
                result.append(ch);

            }

        }
        System.out.println(result);
    }
    /*
    Find the first non-repeating character
Input: "aabbcde" → Output: c
     */

    public static void findFirstNonRepChar() {
        String input = "awabbcde";

        Map<Character, Integer> unique = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            unique.put(ch, unique.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> result : unique.entrySet()) {
            if (result.getValue() == 1) {
                System.out.println(result.getKey());
                break;
            }
        }
    }

    /*
    Count duplicate characters in a string
Input: "programming" → Output: g=2, r=2, m=2
 */
    public static void countDupChar() {
        String input = "programming";

        Map<Character, Integer> countChar = new HashMap<>();
        for (char ch : input.toCharArray()) {
            countChar.put(ch, countChar.getOrDefault(ch, 0) + 1);
        }

        //count dup char
        for (Map.Entry<Character, Integer> result : countChar.entrySet()) {
            if (result.getValue() > 1) {

                System.out.println(result.getKey() + "=" + result.getValue());
            }
        }

    }
    /*
    Check if two strings are anagrams
Input: "listen", "silent" → Output: true
     */

    public static boolean checkAnagram() {
        String input1 = "listen";
        String input2 = "tea";

        if (input1.length() != input2.length()) {
            System.out.println("Inputs are not Anagram");
            return false;
        }
        char[] inp1 = input1.toCharArray();
        char[] inp2 = input2.toCharArray();
        Arrays.sort(inp1);
        Arrays.sort(inp2);

        if (inp1.equals(inp2)) {
            System.out.println("Strings are Anagram");
        }
        return true;
    }

          /*
          Count vowels and consonants in a string
          Input: "Java" → Output: Vowels: 2, Consonants: 2

           */

    public static void vowels() {
        String letter = "vowels";
        int vowels = 0;
        int Consonants = 0;
        String lowercase = letter.toLowerCase();
        for (char ch : lowercase.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;

                } else {
                    Consonants++;
                }
            }

        }

        System.out.println(vowels);
        System.out.println(Consonants);


    }

    /*
    Find the longest word in a sentence
    Input: "Java is simple and powerful" → Output: "powerful"
     */
    public static void longestWord() {
        String input = "Java is neeeeeeeeeee and powerful";
        String[] words = input.split(" ");
        String longestWord = "";


        for (String word : words) {
          if(word.length()>longestWord.length()){
              longestWord=word;

            }
        }
        System.out.println(longestWord);
    }

    /*
    Print all permutations of a string
Input: "abc" → Output: "abc", "acb", "bac", "bca", "cab", "cba"
     */
    public static void permutation() {


    }


}


