package com.firstSeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTestingEx {
    public static void main(String[] args) {
       WebDriver driver;
       String browser = "Chrome";

       if(browser.equalsIgnoreCase("FireFox")) {
           driver = new FirefoxDriver();

       }
           else if(browser.equalsIgnoreCase("Chrome")){
               driver = new ChromeDriver();

           }

           else if(browser.equalsIgnoreCase("Edge")){
               driver = new EdgeDriver();
           }
           else{
          throw new IllegalArgumentException("not supported");

       }
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}
