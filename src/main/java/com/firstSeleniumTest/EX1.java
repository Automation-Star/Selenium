package com.firstSeleniumTest;

import java.util.Scanner;

import static com.firstSeleniumTest.CrossBrowserTestingEx.crossBr;

//Write a Java program to check if a given string is a palindrome.
//Input: "Anything"
public class EX1 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String input = sc.next();

        String original = input.toLowerCase();
                         String sun = input.substring(5);
        System.out.println(sun);
        String reversedString = new StringBuilder(original).reverse().toString().trim();

        if(original.equals(reversedString)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }

    }

}


