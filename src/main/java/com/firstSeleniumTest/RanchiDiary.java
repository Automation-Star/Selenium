package com.firstSeleniumTest;

import org.openqa.selenium.Capabilities;

import javax.swing.*;
import java.util.*;

public class RanchiDiary {
    public static void main(String[] args) {

        //   reverseString();
        //  countVowels();
        //  removeDup();
        // firstNonRepCha();
       //  checkAnagrams();
       // numberOfString();
        //   CapitalizeFirstLetter();
        //  compressString();
        //  largest_Smallest_array();
        //   reverseArray();
//        boolean result = sortArrayInAsc();
//        System.out.println(result);
//        System.out.println("this is sorted :" + result);
        //   findDuplicatesElements();
        // mergeArr();

        //  pairsOfArray();
        //   secondLargest();
        //  missingNum();
        // addNumArrayList();
        // arr1();
        //  arr2();
        // arr3();
        //  System.out.println(arr4());

        //  arr5();
        // arr6();

        //  arr7();

        // ar8();
        // ar9();
        //  ar10();
//     boolean result =   func1();
//        System.out.println(result);
        //   func2();

        //    nonRep();
    }

    /*1. Reverse a String
        Write a method to reverse a given string.
        Input: "hello" → Output: "olleh"
                */

    public static void reverseString() {
        String Input = "hello";
        String rev = "";

        for (int i = Input.length() - 1; i >= 0; i--) {
            rev += Input.charAt(i);

        }
        System.out.println(rev);
    }

    /*
    Count Vowels and Consonants
    Input: "Hello" → Output: Vowels: 2, Consonants: 3
     */

    public static void countVowels() {
        String Input = "Hello";
        int vowels = 0;
        int consonant = 0;
        String letters = Input.toLowerCase();
        for (char ch : letters.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;

                } else {
                    consonant++;

                }

            }
        }
        System.out.println(vowels);
        System.out.println(consonant);

    }


    /*
    Remove Duplicate Characters
Remove duplicate characters from a string, keeping the first occurrence.
Input: "programming" → Output: "progamin"
     */
    public static void removeDup() {
        String Input = "programming";
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> result = new LinkedHashSet<>();
        for (char ch : Input.toCharArray()) {
            if (result.add(ch)) {
                sb.append(ch);

            }
        }
        System.out.println(result);


    }

    /*
     Find First Non-Repeating Character
Find the first character that does not repeat in a string.
Input: "swiss" → Output: 'w'
     */

    public static void firstNonRepCha() {
        String Input = "swiss";
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
    . Check if Two Strings are Anagrams
Check if two strings are anagrams (same characters in different order).
Input: "listen", "silent" → Output: true
     */

    public static void checkAnagrams() {
        String Input1 = "listen";
        String Input2 = "silent";

        if (Input1.length() == Input2.length()) {
            System.out.println("Lengths are equal");
        }

        char[] text1 = Input1.toCharArray();
        char[] text2 = Input2.toCharArray();

        Arrays.sort(text1);
        Arrays.sort(text2);

        if(Arrays.equals(text1,text2)) {
            System.out.println("Strings are Angaram");

        } else {

            System.out.println("String arenot anaagram ");
        }
    }
        /*
        Count Occurrences of Each Character
Count how many times each character appears in a string.
Input: "apple" → Output: a:1 p:2 l:1 e:1
         */

    public static void numberOfString() {
        String Input = "apple";
        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();
        // Iterate through Character
        for (char ch : Input.toCharArray()) {
            result.put(ch, result.getOrDefault(ch, 0) + 1);


        }
        //Iterate over stored values
        for (Map.Entry<Character, Integer> occur : result.entrySet()) {

            System.out.println(occur.getKey() + "=" + occur.getKey());


        }


    }

    /*
    Capitalize First Letter of Each Word
    Capitalize the first letter of each word in a sentence.
    Input: "java is fun" → Output: "Java Is Fun"
     */
    public static void CapitalizeFirstLetter() {
        String word = "java is fun";
        String[] words = word.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String sentence : words) {
            if (!sentence.isEmpty()) {
                sb.append(Character.toUpperCase(sentence.charAt(0))).
                        append(sentence.substring(1)).append(" ");
            }
        }

        System.out.println(sb);

    }

    /*
    10. Compress a String (Run-Length Encoding)
Compress a string using run-length encoding.
Input: "aaabbcc" → Output: "a3b2c2"
     */

    public static void compressString() {
        String Input = "aaabbcac";
        String Output = "";
        Character CharPat = null;
        Integer rep = 0;

        HashMap<Character, Integer> seq = new HashMap<>();
        for (char ch : Input.toCharArray()) {
            seq.put(ch, seq.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> compress : seq.entrySet()) {
            Output = Output.concat(compress.getKey() + "" + compress.getValue());

        }
        System.out.println(Output);


    }

    /*
    Write a program to find the largest and smallest element in an array.
    Input: [10, 4, 7, 25, 1] → Output: Largest: 25, Smallest: 1
    */

    public static void largest_Smallest_array() {
        int[] Input = {10, 4, 7, 25, 1};
        int largest = Input[0];
        int smallest = Input[0];


        for (int num : Input) {
            if (num > largest) {
                largest = num;

            }

            if (num < smallest) {
                smallest = num;

            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }


        /*
        Reverse the elements of an array without using extra space.
        Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1]
         */

    public static void reverseArray() {
        int[] Input = {1, 2, 3, 4, 5};
        int[] rev = new int[Input.length];
        int j = 0;

        for (int i = Input.length - 1; i >= 0; i--) {
            rev[j] = Input[i];
            j++;

        }
        System.out.println(Arrays.toString(rev));
    }

    /*
      Check whether an array is sorted in ascending order.
      Input: [1, 2, 3, 4] → Output: true
      Input: [4, 2, 1] → Output: false
     */

    public static boolean sortArrayInAsc() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 2, 1};

        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                return false;

            }

        }

        return true;

    }

    /**
     * Find all duplicate elements in an array.
     * Input: [1, 2, 3, 2, 4, 1] → Output: 1, 2
     */
    public static void findDuplicatesElements() {
        int[] arr = {1, 2, 3, 2, 4, 1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int result : arr) {
            if (!seen.add(result)) {
                duplicates.add(result);
            }

        }
        System.out.println(duplicates);
    }

    /**
     * Merge two sorted arrays into a single sorted array.
     * Input: [1, 3, 5], [2, 4, 6] → Output: [1, 2, 3, 4, 5, 6]
     */

    public static void mergeArr() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] mergedArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length + i] = arr2[i];
        }
        //sort array
        Arrays.sort(mergedArr);

        System.out.println(Arrays.toString(mergedArr));
    }

    /**
     * Find all pairs of numbers in an array that add up to a specific sum.
     * Input: [1, 2, 3, 4, 5], sum=6 → Output: (1, 5), (2, 4)
     */
    public static void pairsOfArray() {
        int[] input = {1, 2, 3, 4, 5};
        int target = 6;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    System.out.println("(" + input[i] + ", " + input[j] + ")");
                }

            }
        }
    }

    /**
     * Write a program to find the second largest element in an array.
     * Input: [10, 20, 5, 8] → Output: 10
     */

    public static void secondLargest() {
        int[] Input = {10, 20, 5, 8};
        int firstLargest = 0;
        int secondLargest = 0;

        for (int num : Input) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else {
                if (num < firstLargest && num > secondLargest) {
                    secondLargest = num;
                }


            }

        }
        System.out.println(secondLargest);

    }

    /**
     * Given an array of n-1 numbers from 1 to n, find the missing number.
     * Input: [1, 2, 4, 5] → Output: 3
     */

    public static void missingNum() {
        int[] Input = {1, 2, 3, 5};
        int n = Input.length + 1;
        int expected = n * (n + 1) / 2;
        int actualSum = 0;


        for (int num : Input) {
            actualSum += num;
        }
        int missingNumber = expected - actualSum;
        System.out.println(missingNumber);


    }

    /**
     * Create an ArrayList of integers and add numbers from 1 to 10. Print the list.
     */

    public static void addNumArrayList() {
        ArrayList<Integer> arr = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


        for (int list : arr)
            System.out.println(list);
    }

    /**
     * Add an element at the first position of an ArrayList and print the updated list.
     * Input: ["Java", "Python", "C++"], add "Selenium" at index 0.
     * Output: ["Selenium", "Java", "Python", "C++"]
     */

    public static void arr1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        list.add(0, "Selenium");
        System.out.println(list);

    }

    /**
     * Retrieve the third element from an ArrayList of strings.
     * Input: ["Red", "Blue", "Green", "Yellow"]
     * Output: "Green"
     */
    public static void arr2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("yellow");

        System.out.println(list.get(2));

    }

    /**
     * Remove the element "Java" from an ArrayList if it exists.
     * Input: ["Java", "Python", "C#"]
     * Output: ["Python", "C#"]
     */
    public static void arr3() {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.remove(0);
        System.out.println(list);

    }

    /**
     * Check if the ArrayList contains the number 25.
     * Input: [5, 10, 25, 30]
     * Output: true
     */

    public static boolean arr4() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 25, 30));

        if (list.contains(25)) {
            return true;
        }
        return false;
    }

    /**
     * Create an ArrayList of integers and print only the even numbers.
     * Input: [1, 2, 3, 4, 5, 6]
     * Output: 2, 4, 6
     */
    public static void arr5() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        for (int num : list) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    /**
     * Reverse an ArrayList without using Collections.reverse().
     * Input: [10, 20, 30, 40]
     * Output: [40, 30, 20, 10]
     */
    public static void arr6() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));


        }
        System.out.println(reversed);
    }

    /**
     * Merge two ArrayLists and remove duplicates.
     * Input: [1, 2, 3] and [3, 4, 5]
     * Output: [1, 2, 3, 4, 5]
     */
    public static void arr7() {


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5));

        //merge list
        list1.addAll(list2);

        // remove duplicates
        LinkedHashSet<Integer> removeDup = new LinkedHashSet<>(list1);

        //convert to the array list
        ArrayList<Integer> MergedList = new ArrayList<>(removeDup);
        System.out.println(MergedList);

    }

    /**
     * Find the frequency of an element in an ArrayList.
     * Input: [1, 2, 2, 3, 2, 4], element = 2
     * Output: Frequency = 3
     */

    public static void ar8() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 2, 4));
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : list1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);


        }

        int element = 2; // Element whose frequency we want
        System.out.println("Frequency of " + element + " = " + freq.getOrDefault(element, 0));
    }

    /**
     * Remove duplicates from an ArrayList without using a Set.
     * Input: [1, 2, 2, 3, 4, 4, 5]
     * Output: [1, 2, 3, 4, 5]
     */

    public static void ar9() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int num : list1) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }

        }
        System.out.println(uniqueList);
    }

    /**
     * Find the second largest element in an ArrayList.
     * Input: [5, 1, 9, 3, 7]
     * Output: 7
     */

    public static void ar10() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 1, 9, 3, 7));
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for (int num : list1) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }

        }
        System.out.println(secondLargest);
    }

    /**
     * CheckIfNumber that takes in a string.
     * The function should check to see if the string represents a number.
     * Simply return True if it does, False otherwise.
     */

    public static boolean func1() {
        String Input = "123";

        for (char Inp : Input.toCharArray()) {
            if (Character.isLetter(Inp)) {
                return false;
            }

        }
        return true;
    }

    /**
     * Write a Java program to find the second largest number in an array.
     */

    public static void func2() {
        int[] input = {10, 5, 1, 2, 30};
        int largest = 0;
        int secondLargest = 0;

        for (int num : input) {
            if (largest < num) {
                secondLargest = largest;
                largest = num;

            } else {
                if (num < largest && num > secondLargest) {
                    secondLargest = num;
                }

            }

        }
        System.out.println(secondLargest);
    }

    /**
     * Find First Non-Repeating Character
     * Find the first character that does not repeat in a string.
     * Input: "swiss" → Output: 'w'
     */

    public static void nonRep() {
        String input = "swiss";
        int[] freq = new int[26];

        for (char ch : input.toCharArray()) {
            freq[ch - 'a']++;

        }

        for (char ch : input.toCharArray()) {
            if (freq[ch - 'a'] == 1) {

                System.out.println(ch);
                break;
            }
        }
    }

//    public static void missingMultipleNumbers() {
//        boolean[] present = new boolean[101]; // 0 unused
//        List<Integer> numbers ={1,2,3,4,100}
//        for (int num : numbers) {
//            present[num] = true;
//        }
//
//        for (int i = 1; i <= 100; i++) {
//            if (!present[i]) {
//                System.out.println("Missing number is: " + i);
//                break;
//            }
//        }
    }


