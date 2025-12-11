package com.firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class InterviewWithTcs {
    public static void main(String[] args){
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("India");
        test1.add("USA");
        test1.add("Canada");

        for(String country :test1){
            System.out.println(country);
        }


        int input =6;
        int factorial =1;
        for(int i =1 ; i<=input;i++){
            factorial= factorial*i;
        }
        System.out.println(factorial);
    }

public void handleBrowser(){
    WebDriver driver = new ChromeDriver();
        String parent= driver.getWindowHandle();

        driver.get("some url ");

        // Click some inner url
    WebElement innerUrl = driver.findElement(By.id("some xpath"));
    innerUrl.click();

    // Store new tab in String

    Set<String> childTab = driver.getWindowHandles();
    // switch to child tab


    // now loop through all opened tab / window without duploicate

    for(String win : childTab){
        driver.switchTo().window(win);

        if(win.equals(childTab)){
            System.out.println(driver.getTitle());
        }
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
    }

}
}
