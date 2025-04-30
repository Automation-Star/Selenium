package com.firstSeleniumTest;

public class LengthOfString {
    public static void main(String[] args){
        String input = "Hello";
        int count =0;
        for(int i = 0;i<input.length();i++){
            //  char ch = input.charAt(i);
            count++;

        }
        System.out.println(count);

        // coverted input into upeercase
        String upperCse= input.toUpperCase();
        System.out.println(upperCse);

        //  coverted input into lowecase
        String loweCase = input.toLowerCase();
        System.out.println(loweCase);




        }
    }
