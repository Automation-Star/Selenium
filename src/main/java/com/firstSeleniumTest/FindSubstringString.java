package com.firstSeleniumTest;
//Reverse Words in a Sentence
public class FindSubstringString {

    public static void main(String[] args) {
        String input = "Java is cool";
        String[] words = input.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            reversed.append(words[i]);
            if (i != 0) reversed.append(" ");
        }
        System.out.println(reversed.toString());


// Count Words in a Sentence
        String input1 = "  Java is fun and powerful ";
        String[] newInput = input1.trim().split("\\s+");
        System.out.println(newInput.length);



    //4. Find the Largest Number in an Array

            int[] nums = {3, 9, 2, 15, 6};
           int  max = nums[0];
           for(int num : nums){
               if(num>max) {
                   max = num;
               }

           }
        System.out.println(max);

            //Check if Two Strings are Anagrams

}
}


