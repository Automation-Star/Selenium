package com.firstSeleniumTest;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your String");
//        String input = sc.next();
        //     printListElement();
        //    sortArray();

        //   MaxAndMiN();

        //   frequency();
        // arrayToList();
        //  mergeTwoList();
        //  convertListToSet();
        //   removeSpace();
        //   containsDigit();
        //    duplicateChar();
      //  capFirstLetter();
      //  countWords();
        compressString();
    }

    /*
    Add and Print List Elements
     */
    public static void printListElement() {
        List<String> list = new ArrayList<>();
        list.add("Car");
        list.add("Mazda");
        list.add("car");
        list.remove(0);
        System.out.println(list);

        //Check if a List Contains a Specific Element
        list.contains(1);
        System.out.println("it conains the value");
    }


    //Sort a List of Integers in Ascending/Descending Order
    //Input: [5, 1, 4, 2]]

    public static void sortArray() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 1, 4, 2));
        Collections.sort(numbers);
        System.out.println(numbers);

        // Descending order

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);


    }

    /*
    Find the Maximum and Minimum in a List
    Input: [10, 5, 20, 3]
    Output: Max = 20, Min = 3
     */
    public static void MaxAndMiN() {
        List<Integer> maxNumber = new ArrayList<>(Arrays.asList(10, 5, 20, 3));
        int max = 10;
        for (int num : maxNumber) {

            if (num > max) {
                max = num;
                System.out.println(max);

                int min = Collections.min(maxNumber);
                System.out.println(min);


            }
        }

    }

    /*
    Find Frequency of Each Element
Input: ["apple", "banana", "apple"]
Output: apple=2, banana=1
     */

    public static void frequency() {
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "apple"));

        Map<String, Integer> result = new HashMap<>();
        for (String fruit : fruits) {
            result.put(fruit, result.getOrDefault(fruit, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    /*
    Convert Array to List and Vice Versa
Input: String[] arr = {"a", "b", "c"}
Output: List<String> list = Arrays.asList(arr)
     */
    public static void arrayToList() {
        String[] arr = {"a", "b", "c"};

        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
    /*
    9. Merge Two Lists
Input: [1, 2] and [3, 4]
Output: [1, 2, 3, 4]
     */

    public static void mergeTwoList() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        list1.addAll(list2);

        System.out.println(list1);
    }

    /*
    Convert List to Set (to remove duplicates)
  Input: List<String>
  Output: Set<String>
     */
    public static void convertListToSet() {
        List<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango", "Apple"));
        Set<String> unifiedFruits = new HashSet<>();
        unifiedFruits.addAll(fruits);
        System.out.println(unifiedFruits);


    }

    //Remove All Whitespaces
    //Input: " Java is fun "

    public static void removeSpace() {
        String Input = "Java is fun";
        String newInput = Input.replaceAll("\\s+", "");
        System.out.println(newInput);
    }

    /*
    Check if a String Contains Only Digits
Input: "12345" → true
     */
    public static void containsDigit() {
        String input = "12345";
        boolean isDigit = input.matches("\\d+");
        System.out.println(isDigit);

    }

    /*
    Find Duplicate Characters
      Input: "programming"
     */
    public static void duplicateChar() {
        String input = "programming";
        Map<Character, Integer> noDup = new HashMap<>();
        for (char ch : input.toCharArray()) {
            noDup.put(ch, noDup.getOrDefault(ch, 0) + 1);

        }
        //Count each duplicate character
        for (Map.Entry<Character, Integer> entry : noDup.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    /*
    9. Capitalize First Letter of Each Word
      Input: "hello world from java"
     */
    public static void capFirstLetter() {
        String Input = "hello world from java";
        StringBuilder sb = new StringBuilder();
        String[] words = Input.split(" ");
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(Character.toUpperCase(word.charAt(0)))).
                        append(word.substring(1)).append(" ");
            }


        }

        String Output = sb.toString().trim();
        System.out.println(Output);
    }

    /*
    Count number of words in a sentence
     Input: "I love Java" → Output: 3
     */

    public static void countWords() {
        String input = "I love Java";
        int count =0;
        String[] words = input.split(" ");
        for(int i = 0;i<words.length ;i++){
            count++;

            }
        System.out.println(count);
        }

        /*
        Compress a string using character count
         Input: "aaabbbcc" → Output: "a3b3c2"
         */
        public static void compressString() {
            String input = "aaabbbccc";
            HashMap<Character, Integer> compress = new HashMap<>();
            char[] newInputs= input.toCharArray();
            for(char newInput :newInputs){
                compress.put(newInput, compress.getOrDefault(newInput,0)+1);

            }

            for(Map.Entry<Character, Integer> entry : compress.entrySet()){
                System.out.print(entry.getKey() + "" + entry.getValue());
            }
        }
        }


