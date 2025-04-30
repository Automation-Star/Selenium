package com.firstSeleniumTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessModeExample {
    public static void main(String[] args) {
        try {
     //     System.setProperty("webdriver.chrome.driver", "/Users/basafa/Downloads/chromedriver-mac-arm64/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--Headless");
            options.addArguments("disable-gpu");

            WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.automationexercise.com/");
            String expectedResult = "Automation Exercise";
            String actualResult = driver.getTitle();
            System.out.println(driver.getTitle());

            if (expectedResult.equals(actualResult)) {
                System.out.println("print the title");
            } else {
                System.out.println("title is wrong");
            }
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();


        }
    }

}
