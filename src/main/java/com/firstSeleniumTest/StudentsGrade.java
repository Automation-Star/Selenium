package com.firstSeleniumTest;

import java.util.Scanner;

/**
 * Write a Java program that takes a student's percentage and prints the grade:
 * 90 and above → A
 * 80-89 → B
 * 70-79 → C
 * 60-69 → D
 * Below 60 → F
 */

public class StudentsGrade {
    public static void main(String[] args) {
        System.out.println("Enter Student number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 90) {
            System.out.println("Student achieved A Grade");
        } else if (number >= 80 && number <= 89) {
            System.out.println("Student achieved B Grade");

        } else if (number >= 70 && number <= 79) {
            System.out.println("Student achieved C Grade");
        } else if (number >= 60 && number <= 69) {
            System.out.println("Student achieved D Grade");
        } else if(number<59) {
            System.out.println("Student achieved F Grade");
        }
        else
            System.out.println("Student was absent");
    }
}
