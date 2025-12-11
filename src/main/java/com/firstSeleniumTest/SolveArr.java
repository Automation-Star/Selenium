package com.firstSeleniumTest;

import java.lang.reflect.Array;
import java.util.*;

/*
Find the Maximum and Minimum Element
Input: [10, 3, 5, 7, 99, 1]
Output: Max = 99, Min = 1
 */
public class SolveArr {
    public static void main(String[] args) {
        // find_Max_Min_Element();
        // reverseArray();

        // findDuplicate();

        // findDuplicateList();
        // reverseString();


//      SolveArr solveArr = new SolveArr();
//      solveArr.countCharFreq();

        // findLargest();

        //  secondLargest();
        //  reverseArr();

       // System.out.println(dupNumber());

        removeDuplicates();
    }

    public static void find_Max_Min_Element() {
        int[] arr = {10, 3, 5, 7, 99, 1};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max :" + max);
        System.out.println("min :" + min);
    }

/*
Reverse an Array
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
 */

    public static void reverseArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];

        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];


            System.out.println(rev[j]);

        }

    }

/*
✅ 3. Move All Zeros to the End
Input: [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
 */

    public static void moveZeros() {
        int[] arr = {0, 1, 0, 3, 12};

    }


    /*
    Find duplicates in an array
     */
    public static void findDuplicate() {
        int[] arr = {1, 1, 2, 3, 4,1};
        HashSet<Integer> dup = new HashSet<>();

        for (int result : arr) {
            dup.add(result);
        }
        System.out.println(dup);

    }


        /*
        Find duplicates from ArrayList
         */

    public static void findDuplicateList() {
        ArrayList numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);

        HashSet<Integer> removeDup = new HashSet<>(numbers);
        System.out.println(removeDup);

    }

    //Reverse a string or array
    public static void reverseString() {
        String input = "Racecar";
        String lowercase = input.toLowerCase();
        String rev = "";

        for (int i = lowercase.length() - 1; i >= 0; i--) {
            rev += lowercase.charAt(i);

        }
        System.out.println(rev);

        if (rev.equals(lowercase)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
    /*
    Count character frequency in a string

     */

    public void countCharFreq() {
        String Input = "aaabbcc";


        Map<Character, Integer> entry = new LinkedHashMap<>();
        for (char ch : Input.toCharArray()) {
            entry.put(ch, entry.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> result : entry.entrySet()) {
            System.out.println(result.getKey() + "=" + result.getValue());

        }

    }

    /*
    Input: [3, 1, 7, 4, 9, 2]
    Output: 9
     */

    public static void findLargest() {
        int[] array = {3, 1, 7, 4, 9, 2};
        int largestNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largestNum) {
                largestNum = array[i];

            }

        }
        System.out.println(largestNum);
    }

    /*
     Find the Second Largest Number
Problem: Find the second largest element in the array.

Input: [12, 35, 1, 10, 34, 1]
Output: 34
     */

    public static void secondLargest() {
        int[] arr = {12, 35, 1, 10, 34, 1, 100, 99};
        int first = 0;
        int second = 0;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num < first && num > second) {
                second = num;

            }


        }
        System.out.println(second);
    }

    /*
    3. Reverse an Array
Problem: Reverse the elements of the array in-place.

Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
     */

    public static void reverseArr() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;

        }
        for (int num : rev) {
            System.out.println(num);
        }
    }

    /*
    4. Check for Duplicates
    Problem: Return true if any value appears more than once.

    Input: [1, 2, 3, 1]
    Output: true
     */
    public static boolean dupNumber() {
        int[] Input = {1, 2, 3, 1};

        HashMap<Integer, Integer> num = new HashMap<>();
        for (int number : Input) {
            num.put(number, num.getOrDefault(number, 0) + 1);

        }
        for (Map.Entry<Integer, Integer> result : num.entrySet()) {
            if (result.getValue() > 1)
                return true;


        }

        return false;
    }

    /*
    5. Remove Duplicates from Sorted Array
Problem: Remove duplicates in-place from sorted array.

Input: [1, 1, 2, 2, 3]
Output: [1, 2, 3]
     */
    public static void removeDuplicates() {

        int[] number= {1, 1, 2, 2, 3};
        HashSet<Integer> removeDup= new LinkedHashSet<>();

        for(int num :number){
         if(removeDup.add(num))
            System.out.println(num);

            }
        }

        /*
        Move Zeroes to End
        Input: [0, 1, 0, 3, 12]
        Output: [1, 3, 12, 0, 0]
         */

    }






