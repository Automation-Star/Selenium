package com.firstSeleniumTest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Interview_WithT_CS {

    //prime number
    public static void main(String[] args) {
        //  primeNum();
        // revInteger();
        // largestNum();
        //countNum();
        // commonDivisor();
        //missingNum();
        //div();
        // power();
        // secondLargest();
        // sumTarget();
        // fibonacciSeries();
//       String result = dupDigit();
//        System.out.println(result);
        //occurrenceNum();
      //  removeDup();
        //  findNonRepChar();
        // substringOccur();
        // removeWhiteSpace();
        // capFirstLetter();
        // strToInt();
      //  maxOccurringChar();
        // vowels_Consonant();
        // reverse_word_sen();
        // longest_word();
        //freq_word();
//        boolean res = string_rotation();
//        System.out.println(res);
        // sum_Array_List();
        // count_List();
        // convert_Array_arrayList();
//       boolean result= check_arrayList_equal();
//        System.out.println(result);
        // rmv_element_iteration();
        // replace_element();
        // second_highest();
        // merge_ArrayList();
        // convert_ArrayList_Array();
        // find_Missing_num();
       // find_Max_Minim();
       // sort_Array();
    }

    //*****
    public static void primeNum() {
        System.out.println("Prime numbers from 1 to 100:");
        for (int i = 2; i <= 100; i++) {  //numbers from 2 to 100 ,because prime starts from 2
            boolean isPrime = true; // this is not java method
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {

                System.out.print(i + " ");
            }
        }

    }

    //Reverse an integer
    //Input: 123 → Output: 321
    public static void revInteger() {
        int num = 121;
        int orignal = num;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;   // get last digit
            rev = rev * 10 + digit; // add digit to reversed number
            num = num / 10;         // remove last digit
        }

        System.out.println(rev);
//Check if a number is palindrome

        if (orignal == rev) {
            System.out.println("number is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }
    }

    //Find the largest digit in a number

    public static void largestNum() {
        int input = 9832;
        int largestNum = 0;

        while (input != 0) {
            int digit = input % 10;// get last digit
            if (digit > largestNum) {
                largestNum = digit;
            }
            input = input / 10;
        }

        System.out.println(largestNum);
    }

    //Count the number of digits in a number
    //👉 Input: 4509 → Output: 4
    public static void countNum() {
        int input = 4509344;
        int count = 0;
        while (input != 0) {
            input = input / 10;
            count++;


        }
        System.out.println(count);
    }

    // Find the greatest common divisor (GCD) of two numbers
    // Input: 36 and 60 → Output: 12
    public static void commonDivisor() {
        int input1 = 36;
        int input2 = 60;
        int div = 0;

        for (int i = 1; i <= input1 && i <= input2; i++) {
            if (input1 % i == 0 && input2 % i == 0) {

                div = i;
            }

        }
        System.out.println(div);
    }

    public static void missingNum() {
        int[] num = {1, 2, 4, 5};
        int n = num.length + 1;
        int expectedNum = n * (n + 1) / 2;
        int total = 0;
        for (int x : num) {
            total += x;
        }
        int missingNum = expectedNum - total;

        System.out.println(missingNum);

    }

    // Print all numbers divisible by 3 and 5 between 1 and 100.
    public static void div() {

        System.out.println("print number 1 to 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

    }

    //Find the power of a number without using Math.pow().
//👉 Input: base = 2, exponent = 5 → Output: 32
    public static void power() {
        int base = 2;
        int exponent = 5;
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;


        }
        System.out.println(result);
    }

    //Find the second largest number in an array of integers.
    public static void secondLargest() {
        int[] number = {1, 2, 3, 4};
        int first = 0;
        int sec = 0;

        for (int num : number) {
            if (num > first) {
                sec = first;
                first = num;
            } else if (num < first && num > sec) {
                sec = num;
            }
        }
        System.out.println(sec);
    }

    //Find all pairs in an array whose sum is equal to a given number.
    public static void sumTarget() {
        int[] Input = {1, 2, 3, 4, 5};
        int Target = 6;

        for (int i = 0; i < Input.length; i++) {
            for (int j = i + 1; j < Input.length; j++) {
                if (Input[i] + Input[j] == Target) {

                    System.out.println("(" + Input[i] + "," + Input[j] + ")");
                }

            }
        }
    }

    //Print the Fibonacci series up to N terms.
    public static void fibonacciSeries() {
        int a = 0;
        int b = 1;
        int n = 10;

        System.out.print(a + "," + b);
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            System.out.print("," + c);
            a = b;
            b = c;
        }
    }

    //Check if a number contains duplicate digits.
    //👉 Input: 1223 → Output: Yes

    public static String dupDigit() {
        int[] input = {1, 2, 2, 3};
        HashSet<Integer> seen = new HashSet<>();
        for (int num : input) {
            if (!seen.add(num)) {
                return "yes";

            }

        }
        return "no";
    }

    //Count Occurrences of Each Character
    public static void occurrenceNum() {
        String input = "aabbccdd";
        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> res : result.entrySet()) {
            System.out.print(res.getKey() + "->" + res.getValue() + ",");
        }

    }

    //Remove All duplicates character
    public static void removeDup() {
        String input = "programming";
        LinkedHashSet<Character> rmv = new LinkedHashSet<>();
        for (char ch : input.toCharArray()) {
            rmv.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : rmv) {
            sb.append(ch);

        }
        System.out.println(sb);
    }

    //Find the First Non-Repeating Character
    public static void findNonRepChar() {
        String input = "aabbcddee";
        int[] freq = new int[26];

        for (char ch : input.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : input.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                System.out.println(ch);
            }
        }
    }

    //Find Substring Occurrences
//Input: "abcabcabc", "abc"
//Output: 3
    public static void substringOccur() {
        String input = "abcabcabcabc";
        String sub = "abc";

        int count = (input.length() - input.replace(sub, "").length()) / sub.length();
        System.out.println(count);
    }

    //Remove White Spaces
    public static void removeWhiteSpace() {
        String input = "java is fun";
        String text = input.replace(" ", "");
        System.out.println(text);

    }

    //Capitalize First Letter of Each Word
    public static void capFirstLetter() {
        String input = "java is fun";
        String[] text = input.split(" ");
        String result = "";

        for (String txt : text) {
                String cap = txt.substring(0, 1).toUpperCase() + txt.substring(1);
            result += cap + " ";

        }
        System.out.println(result.trim());

    }

    //Convert String to Integer
    public static void strToInt() {
        String input = "12345";
        int integer = Integer.valueOf(input);
        System.out.println(integer);
    }

    //Find Maximum Occurring Character
    public static void maxOccurringChar() {
        String input = "succccess";

        LinkedHashMap<Character, Integer> res = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            res.put(ch, res.getOrDefault(ch, 0) + 1);
        }

        int max =0 ;
        char maxChar =' ';
        for (Map.Entry<Character, Integer> occurrence : res.entrySet()) {
            if (occurrence.getValue() > max) {
                max= occurrence.getValue();
                maxChar= occurrence.getKey();


            }

        }
        System.out.println(maxChar +"=" + max);
    }

    //Count Number of Vowels and Consonants
    public static void vowels_Consonant() {
        String input = "Automation";
        String lc = input.toLowerCase();
        int vowels = 0;
        int consonant = 0;

        for (char ch : lc.toCharArray()) {
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

    //Reverse Each Word in a Sentence
    public static void reverse_word_sen() {
        String input = "Java is fun";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder revWord = new StringBuilder(word);

            result.append(revWord.reverse()).append(" ");

        }
        System.out.println(result);
    }

    //Find the Longest Word in a Sentence
    public static void longest_word() {
        String input = "Selenium automates browsers";
        String[] words = input.split(" "); // broke down the word separately
        String longest = "";
        for (String word : words) { // iterated through a words now i have 3 words
            if (word.length() > longest.length()) {// i want to compare words and assign ;
                longest = word;
            }

        }
        System.out.println(longest);
    }

    //Find Frequency of Each Word in a Sentence
    public static void freq_word() {
        String input = "This is Java and Java is fun";
        String[] words = input.split(" "); // Words alag kiye
        LinkedHashMap<String, Integer> freq = new LinkedHashMap<>(); // Hashmap top store in a pair
        for (String word : words) { // iterate over
            freq.put(word, freq.getOrDefault(word, 0) + 1);

        }
        for (Map.Entry<String, Integer> res : freq.entrySet()) {
            System.out.println(res.getKey() + "=" + res.getValue());
        }
    }

    //Check if a String Contains Only Digits
    public static boolean contains_digit() {
        String input = "12345";
        return input.matches("\\d+");

    }

    // Check if one string is a rotation of another.
    public static boolean string_rotation() {
        String s1 = "abcde";
        String s2 = "deabcg";

        s1 = s1 + s2;
        s1.contains(s2);
        return true;


    }

    //Find the sum of all elements in ArrayList
    public static void sum_Array_List() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        int sum = 0;
        for (int add : list) {
            sum += add;

        }
        System.out.println(sum);
    }

    //18️⃣ Count elements greater than a given number
    public static void count_List() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        int n = 12;
        int count = 0;

        for (int num : list) {
            if (num > n) {
                count++;
            }

        }
        System.out.println(count);

    }

    //Convert array to ArrayList
    public static void convert_Array_arrayList() {
        int[] array = {1, 2, 3};

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : array) {
            list.add(num);

        }
        System.out.println(list);
    }

    //Check if two ArrayLists are equal
    public static boolean check_arrayList_equal() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collections.sort(list1);
        if (list1.equals(list2)) {
            return true;

        }
        return false;

    }

    //Remove elements during iteration safely
    //remove odd number
    public static void rmv_element_iteration() {
        Integer[] input = {1, 2, 3, 4, 5, 6};
        for (int num : input) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    //Replace a specific element in ArrayList
    //Input: List = [10, 20, 30], Replace 20 with 99
    public static void replace_element() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
        list.set(1, 99);
        System.out.println(list);


    }

    //Find second highest number in ArrayList
    //Input: [10, 20, 5, 15,18]
    public static void second_highest() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 5, 15, 18));
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > max) {
                max = num;

            } else if (num > secondLargest && num < max) {
                secondLargest = num;
            }
        }
        System.out.println(secondLargest);
    }

    //Merge two ArrayLists
//Input:
//List1 = [1, 2]
//List2 = [3, 4]
    public static void merge_ArrayList() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4));

        list1.addAll(list2);
        System.out.println(list1);
    }

    //Convert ArrayList to Array
    //Input: [1, 2, 3]
    public static void convert_ArrayList_Array() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        //Convert ArrayList → Integer[]
        //tells Java the type of array (Integer[])
        //A new Integer array with correct size
        Integer[] array = list.toArray(new Integer[0]);
        String formatted = Arrays.toString(array).replace("[", "{").
                replace("]", "}");
        System.out.println(formatted);
    }

    //Find missing number from ArrayList
    //Input: [1, 2, 3, 5] (missing 4)
    public static void find_Missing_num() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        int n = list.size() + 1;
        int expected = n * (n + 1) / 2;
        int total = 0;
        for (int num : list) {
            total += num;
        }
        int actual = expected - total;

        System.out.println(actual);
    }

    //Find the maximum & minimum number in an ArrayList
    public static void find_Max_Minim() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 9, 1, 3, 7));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : list) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    //Sort an ArrayList without using Collections.sort()
    //Solving by Using STREAM API
    public static void sort_Array() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 5, 1, 4, 3));

        list =new ArrayList<>(
             list.stream().sorted().toList()
        );
        System.out.println(list);

    }
}