package com.firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToWebApp {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/basafa/Downloads/chromedriver-mac-arm64/chromedriver");
        driver.get("urllink");
        WebElement userName = driver.findElement(By.id("UserName"));
        userName.sendKeys("xyz");
        WebElement Password = driver.findElement(By.id("Passwd"));
        Password.sendKeys("abc");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        System.out.println(driver.getTitle());

        //verify the presence of an element on a webpage.
    }
}






