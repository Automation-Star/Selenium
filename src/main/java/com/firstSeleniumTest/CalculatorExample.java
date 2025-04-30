package com.firstSeleniumTest;

import java.util.Scanner;

public class CalculatorExample {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give first number");
        int x = sc.nextInt();
        System.out.println("Give Second number");
        int y = sc.nextInt();
        int Addition = x+y;
        int Subtraction = x-y;
        int multiplication = x*y;
        int division = x/y;
        System.out.println("Give operator sum|Sub|Div|mul");
        String operator= sc.next();


        if(operator.equals("sum")){
            System.out.println("This is Sum of the given number:" + Addition);
        }
        else if( operator.equals("Sub")){
            System.out.println("This is the subtraction of the number;" + Subtraction );
        } else if (operator.equals("mul")) {
            System.out.println("This is the multiplication of the number;" + multiplication );

        } else if (operator.equals("div")) {
            System.out.println("This is the divide of the number;" + division);
        }
            else{
            System.out.println("Not present on the calculator");
            }
        }
    }
