package com.firstSeleniumTest;

import javax.print.DocFlavor;
import java.util.*;

public class Dream {
    public static void main(String[] args) {
        // reverse();
        // LargestNum();
        //count_vowel();
        // factorial();
        //fibonacci();
        //removeDuplicates();
        // nonRep_char();
        // sort_Asc();
        // missing_num();
        // dup_char();
        //second_largest();
        // pairsNum();
//        String result =compressString();
//        System.out.println(result);
        // max_min();
        //  merge_arrays();
       // secondLargest_arrayList();
        rmvDup_arrayList();


    }

    /*
    Reverse a String
     */
    public static void reverse() {
        String input = "Hello";
        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);

        }
        // System.out.println(rev);

        if (input.equals(rev)) {
            System.out.println("String is pallindrome");

        } else {
            System.out.println("String is not pallindrome");
        }
    }

    //Find Largest Number in an Array
    public static void LargestNum() {
        int[] array1 = {3, 7, 2, 9, 5};

        int max = array1[0];
        for (int num : array1) {
            if (num > max) {
                max = num;

            }

        }
        System.out.println(max);

    }

    //Count Vowels in a String
    public static void count_vowel() {
        String input = "programming";
        int vowels = 0;
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
            }
        }
        System.out.println(vowels);
    }

    //Factorial of a Number
    public static void factorial() {
        int input = 5;
        int factorial = 1;

        for (int i = 1; i <= input; i++) {
            factorial *= i;

        }
        System.out.println(factorial);
    }

    //Print the first N Fibonacci numbers.
    public static void fibonacci() {
        int input = 7;
        int a = 0;
        int b = 1;

        System.out.print(a + "," + b);//0,1
        for (int i = 2; i < input; i++) {
            int c = a + b;
            System.out.print("," + c);
            a = b;
            b = c;


        }
    }

    //Remove duplicate elements from an array.
    public static void removeDuplicates() {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        LinkedHashSet<Integer> removeDup = new LinkedHashSet<>();
        for (int num : arr) {
            removeDup.add(num);
        }
        System.out.println(removeDup);
    }

    //Find the first non-repeated character in a string.
    public static void nonRep_char() {
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
    //Check if two strings are anagrams of each other.

    public static void checkAnagram() {
        String word1 = "listen";
        String word2 = "silent";
        if (word1.length() == word2.length()) {
            System.out.println("lengths are same");
        }
    }

    //Sort an array in ascending order.
    public static void sort_Asc() {
        int[] arr = {5, 1, 4, 2, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void missing_num() {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        int expected = n * (n + 1) / 2;
        int actual = expected - total;
        System.out.println(actual);
    }

    //Print duplicate characters and their counts.
    public static void dup_char() {
        String input = "programming";
        LinkedHashMap<Character, Integer> seen = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            seen.put(ch, seen.getOrDefault(ch, 0) + 1);

        }
        for (Map.Entry<Character, Integer> findDup : seen.entrySet()) {
            if (findDup.getValue() > 1) {
                System.out.println(findDup.getKey() + "=" + findDup.getValue());
            }
        }

    }

    //Find the second largest element in an array.
    public static void second_largest(){
        int[] arr = {12, 35, 1, 10, 34, 1};
        int Largest = 0;
        int secondLargest = 0;
        for (int num : arr) {
            if (num > Largest) {
                Largest = num;

            } else if (num < Largest && num > secondLargest) {
                secondLargest = num;

            }

        }

        System.out.println(secondLargest);
    }

    public static void pairsNum() {
        //Find pairs of numbers whose sum is equal to a target.
        int[] num = {2, 4, 3, 7, 5, 8};
        int Target = 10;


    }

    public static String compressString() {

        String input = "aaabbbc";
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                sb.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        return sb.toString();
    }

    /// /Find Max and Min in an Array
    /// /Input: {3, 7, 1, 9, 5} → Output: max=9, min=1

    public static void max_min() {
        int[] input = {3, 7, 1, 9, 5};
        int max = input[0];
        int min = input[0];

        for (int num : input) {
            if (num > max) {
                max = num;

            } else if (num < min) {
                min = num;

            }
        }
        System.out.println(max);
        System.out.println(min);
    }


    /**
     * Merge two sorted arrays into a single sorted array.
     * Input: [1, 3, 5], [2, 4, 6] → Output: [1, 2, 3, 4, 5, 6]
     */

    public static void merge_arrays() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] mergedArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length + i] = arr2[i];

        }
        //Sort Arrays
        Arrays.sort(mergedArr);
        System.out.println(Arrays.toString(mergedArr));
    }

    /**
     * Find the second largest element in an ArrayList.
     * Input: [5, 1, 9, 3, 7]
     * Output: 7
     */
    public static void secondLargest_arrayList() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 1, 9, 3, 7));
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : input) {
            if (num > largest) {
                largest = num;
            } else if (largest > num && num > secondLargest) {
                secondLargest = num;

            }


        }
        System.out.println(largest);
        System.out.println(secondLargest);
        ;
    }

    /**
     * Remove duplicates from an ArrayList without using a Set.
     * Input: [1, 2, 2, 3, 4, 4, 5]
     * Output: [1, 2, 3, 4, 5]
     */
    public static void rmvDup_arrayList() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5));
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for(int num :input){
            if(!uniqueList.contains(num)){
                uniqueList.add(num);

            }
        }
        System.out.println(uniqueList);
    }
}





