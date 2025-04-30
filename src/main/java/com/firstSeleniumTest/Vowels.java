package com.firstSeleniumTest;

import java.util.HashSet;

public class Vowels {
    public static void main(String[] args) {

        String input = "Hello World ";

        int  vowels =0;
        int consonants = 0;
        String lowerCase = input.toLowerCase();

        for (char ch : lowerCase.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Consider only alphabetic characters
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}