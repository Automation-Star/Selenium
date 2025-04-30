package com.firstSeleniumTest;

public class StringIsPalindrome {
    public static void main(String[] args) {
        String str = "sarwat";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println(" String is palindrome: " + reversed);
        } else {
            System.out.println("String is not palindrome: " + reversed);

        }
    }
}
