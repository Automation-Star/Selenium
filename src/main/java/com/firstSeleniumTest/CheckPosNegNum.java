package com.firstSeleniumTest;

import java.util.Scanner;

//Write a Java program to check if a number is positive, negative, or zero using else if.
public class CheckPosNegNum {
    public static void main(String[] args){
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        if (number>0){
            System.out.println("Number is positive");
        } else if (number<0) {
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is zero");
        }
    }

}
