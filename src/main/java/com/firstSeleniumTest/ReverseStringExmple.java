package com.firstSeleniumTest;

public class ReverseStringExmple {
        public static void main(String[] args) {
            String str = "radar";
            String reversed = "";

            StringBuilder result = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
              //  reversed += str.charAt(i);
               result.append(str.charAt(i));


            }
            System.out.println(result);
           }
    }