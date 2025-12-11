package com.firstSeleniumTest;

import java.util.*;

public class OOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String input = sc.nextLine();
//     String result =   capFirstLetter();
//        System.out.println(result);
//        Boolean result=checkAnagrams();
//        System.out.println("Strings are Anagrams:" + result);
        //       removeSpace(input);

//        char result = findFirstNonRepeatedChar(input);
//        System.out.println(result);

//      boolean result =  checkContainsDigit(input);
//        System.out.println(result);

//        boolean result = alphaString(input);
//        System.out.println(result);
  //
        //     removeSpace(input);

//        char result = nonRep(input);
//        System.out.println("First non-repeating character: " + result);

//      String result =  findDuplicateCharacter(input);
//      System.out.println(result);

      dupChar(input);

   //     findFirstNonRepeatedChar();

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
        String result = input.replaceAll(" ", "");
        System.out.println(result);


    }

    /*
    Find First Non-Repeated Character
     */

    public static char findFirstNonRepeatedChar() {
       String input = "swiss";
        int[] freq = new int[26];

//count characters
        for (char ch : input.toCharArray()) {
            System.out.println(ch);
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
        for (Character ch : input.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;

    }

    /*
    Find Duplicate Characters
     */
    public static String findDuplicateCharacter(String input) {

        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (seen.add(ch))
                sb.append(ch);
        }
        return sb.toString();
    }

    /*
    Capitalize First Letter of Each Word
     */
    public static String capFirstLetter() {
     String text = "hello world from java";
        text.toLowerCase();
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                //capitalize first letter in the word
                sb.append(Character.toUpperCase(word.charAt(0))).
                        append(word.substring(1)).append(" ");

            }


        }
        return sb.toString().trim();

    }

    /*
    Check if String Contains Only Alphabets
    Input: "helloWorld"
     */
    public static boolean alphaString(String input) {
        return input.matches("[a-zA-Z]+");

    }

    public static char nonRep(String input) {
        int[] freq = new int[26];
//
        for(char ch :input.toCharArray()){
            freq[ch -'a']++;

            }

        for(char ch : input.toCharArray()){
            if(freq[ch-'a']==1){


                return ch ;
            }
        }

        return '-';
    }

    /*
    Find Duplicate Characters


     */

    public static void dupChar(String input) {

        Map<Character, Integer> dup = new HashMap<>();
        //count each character
        for(char ch : input.toCharArray()){
            dup.put(ch, dup.getOrDefault(ch,0)+1);

        }

        // count each duplicate character
          for(Map.Entry<Character , Integer> entry : dup.entrySet()){
              if(entry.getValue()>1){
                  System.out.println(entry.getKey());
              }
          }
    }

}



