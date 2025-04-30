package com.firstSeleniumTest;

import java.util.Scanner;

public class FactorialExample {
        public static void main(String[] args) {
            System.out.println("Enter any number");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
           int factorial=1;

            for (int i = number; i > 1; i--) {

              factorial *= i;

            }

            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }

