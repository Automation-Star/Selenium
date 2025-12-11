package com.firstSeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;

public class TuesdayTest {
    public static void main(String[] args) {

//String c = "Welcome

        String input = "welcome";
        String rev = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);
        }
        System.out.println(rev);
    }


}
