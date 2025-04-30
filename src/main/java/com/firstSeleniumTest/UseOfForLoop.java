package com.firstSeleniumTest;

import java.util.Scanner;

public class UseOfForLoop {
    //Print number from 1-10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for which you want a table");
        int n = sc.nextInt();
//     for(int i = 0 ; i<=10 ;i++){
//         System.out.println( i);
//     }
// }
        // print the sum of first n natural numbers
//        int sum=0;
//       for (int i = 1; i<=n ;i++){
//           sum =sum +i;
//       }
//        System.out.println(sum);
//    }
//        //print the table of any number
//        int sum = 1;
//        for (int i = 1; i <= 10; i++) {
//            sum = i * n;
//            System.out.println(sum);
//        }
//      print all even number till n
//        for (int i = 1 ; i<n ;i++){
//            i =1+i;
//
//            System.out.println(i);
//
//        }
// print all odd number till n
//        for(int i=0;i<n; i++){
//            i=i+1;
//            System.out.println(i);
//        }
        // Print numbers from 10 to 1 in reverse order using a for loop.

//        for (int i = 10 ; i>=1; i--){
//            System.out.println(i);
//        }

        // Find the sum of digits of a given number (e.g., 123 → 1+2+3 = 6).

        int sum = 0;
        while (n > 0) {
            sum += n % 10;  // Extract the last digit and add to sum
            n /= 10;        // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);




    }
}
