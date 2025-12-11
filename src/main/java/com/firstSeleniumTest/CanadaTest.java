package com.firstSeleniumTest;

import java.io.OutputStream;
import java.util.*;

public class CanadaTest {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // System.out.println("give any string");
//        String x = sc.next();
//      //  System.out.println("Enter any Integer");
//        int n =sc.nextInt();

        // fibonacciSeries();
        // countOccurance(x);
    String result = compressString();
        System.out.println(result);
        //    findMissingNum();
        // findMaxAndMin();
        //  factorial();
        //  findOccurrenceString();
        //  secondLargest();
        // mergeTwoArray();
        //  findDuplicatesElements();
        //  pairsOfArr();
        //  reverseStr();
        //  stringOccur();
        //  nonRep();
        //  countVow();
        // removeDup();
        //  compressString();
        // Anagram();
        // CapitalizeFirstLetter();
        //addNum();
       // lambdaTest();
       // lambdaTest1();
    }

    //fibonacci Series
    //0,1 ,1
    //a=1, b=1 , c=2 => a=1,b=2 , c=3 +> a=2,b=3, c=5.
    public static void fibonacciSeries() {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.print("fibonacci Series:" + a + "," + b);

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print("," + c);
            a = b;
            b = c;


        }

    }


    public static void countOccurance(String x) {
        HashMap<Character, Integer> result = new LinkedHashMap<>();
        for (char ch : x.toCharArray()) {
            result.put(ch, result.getOrDefault(ch, 0) + 1);

        }
        for (Map.Entry<Character, Integer> compressRes : result.entrySet()) {
            System.out.println(compressRes.getKey() + "=" + compressRes.getValue());
        }


    }

    public static String compressString() {
        String input = "aaabbbc";
        StringBuilder sb = new StringBuilder(); //a3
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

    // Find the missing number
    public static void findMissingNum() {
        int[] number = {1, 2, 3, 4, 5, 7};
        int n = number.length + 1;
        int Expected = n * (n + 1) / 2; //15
        int total = 0;
        for (int num : number) {
            total += num;
        }
        int missingNum = Expected - total;
        System.out.println(missingNum);


    }
//Find Max and Min in an Array
//Input: {3, 7, 1, 9, 5} → Output: max=9, min=1

    public static void findMaxAndMin() {
        int[] Input = {3, 7, 1, 9, 5};
        int max = Input[0];
        int min = Input[0];

        for (int num : Input) {
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
//Factorial of a Number (loop + recursion)
//Input: 5 → Output: 120

    public static void factorial() {
        int Input = 5;
        int factorial = 1;

        for (int i = 1; i <= Input; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    //Count Occurrences of a Character in String
    //Input: "programming", 'g' → Output: 2
    public static void findOccurrenceString() {
        String Input = "programming";
        HashMap<Character, Integer> result = new HashMap<>();
        for (char ch : Input.toCharArray()) {
            result.put(ch, result.getOrDefault(ch, 0) + 1);

        }
        if (result.containsKey('g')) {
            System.out.println(result.get('g'));

        }
    }

    //Find the second largest number in an array.
    public static void secondLargest() {
        int[] Input = {3, 7, 1, 9, 5};
        int firstLargest = 0;
        int secondLargest = 0;

        for (int num : Input) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num < firstLargest && num > secondLargest) {
                secondLargest = num;
            }

        }
        System.out.println(secondLargest);
    }
    /*
    /**
     * Merge two sorted arrays into a single sorted array.
     * Input: [1, 3, 5], [2, 4, 6] → Output: [1, 2, 3, 4, 5, 6]
     */

    public static void mergeTwoArray() {

        int[] input1 = {1, 3, 5};
        int[] input2 = {2, 4, 6};
        int[] mergedArr = new int[input1.length + input2.length];

        for (int i = 0; i < input1.length; i++) {
            mergedArr[i] = input1[i];
        }
        for (int i = 0; i < input2.length; i++) {
            mergedArr[input1.length + i] = input2[i];
        }

        //sort Arrays
        Arrays.sort(mergedArr);
        System.out.println(Arrays.toString(mergedArr));
    }

    /**
     * Find all duplicate elements in an array.
     * Input: [1, 2, 3, 2, 4, 1] → Output: 1, 2
     */
    public static void findDuplicatesElements() {
        int[] arr = {1, 2, 3, 2, 4, 1};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                dup.add(num);

            }

        }
    }

    /**
     * Find all pairs of numbers in an array that add up to a specific sum.
     * Input: [1, 2, 3, 4, 5], sum=6 → Output: (1, 5), (2, 4)
     */

    public static void pairsOfArr() {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }

            }
        }


    }
//Reverse a string.

    public static void reverseStr() {
        String input = "racecar";
        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);

        }
        System.out.println(rev);
        if (input.equals(rev)) {
            System.out.println("String is pallindrome");
        } else
            System.out.println("String is not pallindrome");
    }

    //Count occurrences of each character in a string.
    public static void stringOccur() {
        String input = "Apple";
        LinkedHashMap<Character, Integer> occur = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            occur.put(ch, occur.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> res : occur.entrySet()) {
            System.out.println(res.getKey() + "=" + res.getValue());
        }
    }

    //Find the first non-repeated character in a string.
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

    //Count vowels and consonants in a string.
    public static void countVow() {
        String input = "apple";
        int vowels = 0;
        int consonant = 0;


        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                }
                else {
                    consonant++;
                }

            }
        }
        System.out.println("vowels =" + vowels);
        System.out.println("consonant =" + consonant);
    }

    //Remove all duplicates from a string.
    public static void removeDup() {
        String input = "sarwat";
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        for (char ch : input.toCharArray()) {
            //if (seen.add(ch)) {
                seen.add(ch);

            //}

        }
        System.out.println(seen);
    }
    //Anagaram

    public static void Anagram() {
        String input1 = "silent";
        String input2 = "listen";

        if (input1.length() == input2.length()) {
            System.out.println("lengths are equal");
        }
        char[] text1 = input1.toCharArray();
        char[] text2 = input2.toCharArray();

        // SortArrays
        Arrays.sort(text1);
        Arrays.sort(text2);

        if (Arrays.equals(text1, text2)) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }

    }

    //    CapitalizeFirstLetter();
    public static void CapitalizeFirstLetter() {
        String input = "java is fun";
       StringBuilder sb = new StringBuilder();
        String[] rmvSpaceInput = input.split(" ");
        for (String ch : rmvSpaceInput) {

            sb.append(Character.toUpperCase(ch.charAt(0))).
                    append(ch.substring(1)).append(" ");
        }

        System.out.println(sb);
    }

    /**
     * Create an ArrayList of integers and add numbers from 1 to 10. Print the list.
     */

    public static void addNum() {
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            num.add(i);
        }
        System.out.println(num);
    }

    //Lambda expression '
    public static void lambdaTest() {
        List<String> names = Arrays.asList("John", "Sara", "Mike");

                // Lambda to print each element
                names.forEach(name-> System.out.println(name));


            }

    //sort
    public static void lambdaTest1() {
        List<Integer> names = Arrays.asList(1, 6, 7, 4);

        names.sort((a,b)->a-b);
        System.out.println(names);
    }

    }

