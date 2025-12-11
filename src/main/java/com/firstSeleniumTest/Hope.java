package com.firstSeleniumTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Hope {
    public static void main(String[] args) {

        compressString();
       // titleCase();
        FirstNonRep();
    }


//    Count Occurrences of Each Character

    public static void compressString() {

        String Input = "Apple";
        char[] NewInputs = Input.toCharArray();

        Map<Character, Integer> result = new LinkedHashMap<>();
        for (char ch : NewInputs) {

            result.put(ch, result.getOrDefault(ch, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }

    /*
    Convert a String to Title Case
     Input: "hello world" → Output: "Hello World"
     */

    public static void titleCase() {
        String Input = "hello world";
        String[] words = Input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(Character.toUpperCase(word.charAt(0)))).append(word.substring(1)).append(" ");

        }
        System.out.println(sb);
    }

    /*
    Find First Non-Repeating Character
Input: "aabbccdeff" → Output: "d"
     */

    public static void FirstNonRep() {
        String Input = "aabbccdeff";
        int[] freq = new int[26];

        for (char ch : Input.toCharArray()) {
            freq[ch - 'a']++;

        }
        for (char ch : Input.toCharArray()) {
            if (freq[ch - 'a'] == 1) {

                System.out.println(ch);
                break;

            }

        }
    }

    /*
    Check if Two Strings are Anagrams
Input: "listen" and "silent" → Output: true
     */
    }


