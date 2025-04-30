package com.firstSeleniumTest;

public class NonRepeatingChar {
        public static void main(String[] args) {
            String input = "swiss";
            char result = findFirstUnique(input);
            System.out.println("First non-repeating character: " + result);
        }

        public static char findFirstUnique(String input) {
            int[] freq = new int[26]; // 26 letters (a-z)

            // Count character frequencies
           for(char ch:  input.toCharArray()){
               freq[ch - 'a']++;

            }

            // Find first non-repeating character
            for (char ch : input.toCharArray()) {
                if (freq[ch - 'a'] == 1) {

                  //  if (freq[ch - 'a'] > 1) // to check for characters that appear more than once (i.e., repeating characters).
                    return ch;
                }
            }

            return '_'; // No unique character found
        }
    }

