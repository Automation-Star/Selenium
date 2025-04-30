package com.firstSeleniumTest;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {

        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if ( num % 2 == 0 ) {
            System.out.println("this is even");
        }
            else{
                System.out.println("this is odd");
            }



        }
    }

