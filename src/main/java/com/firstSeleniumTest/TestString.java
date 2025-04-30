package com.firstSeleniumTest;

public class TestString {
public static void main(String[] args){


    String sentence = "I love Java";
    String  text=  "hello";
    String reversed = "";
    String input = "racecar";
    String palindrome = "";

System.out.println(sentence.contains("Java")); // Output: true
System.out.println(sentence.contains("Python")); // Output: false

    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    System.out.println(sb); // Output: Hello World


 // reverse hello by using loop

    for(int i = text.length()-1; i>=0;i--){
        reversed += text.charAt(i);


    }
    System.out.println(reversed);

    // pallindrome;

    for (int i = input.length()-1; i>=0;i--){
        palindrome += input.charAt(i);


    }
    System.out.println(palindrome);

    if(input.equals(palindrome)){
        System.out.println("its palindrome");

    }
    else{
        System.out.println("its not palindrome");
    }

    }
}

