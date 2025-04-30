package com.firstSeleniumTest;

import net.bytebuddy.asm.Advice;

import java.util.Scanner;

//Write a Java program that asks for a day number (1-7)
// and prints the corresponding day of the week (e.g., 1 → Monday, 2 → Tuesday, etc.) using else if.
public class CheckDayAndNum {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
       System.out.println("Type any number from 1-7");
      int number = sc.nextInt();

//        if(number==1){
//            System.out.println("Monday");
//        } else if (number==2) {
//            System.out.println("Tuesday");
//
//        }
//        else{
//            System.out.println("Wednesday");

        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                 break;
            case 3:
                System.out.println("Wednesday");
            break;
            default:
                System.out.println("invalid entry");
        }
    }

}
