package com.firstSeleniumTest;


import java.util.Scanner;

class AddTwoInegersValue {
    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter integer x and Y");
        int  x =  scanner.nextInt();
        int y= scanner.nextInt();
        int sum = x + y;
        System.out.println(sum);


    }
}