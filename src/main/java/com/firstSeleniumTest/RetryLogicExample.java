package com.firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetryLogicExample {
    public static void main(String[] args) {
        String emailAddress = "robot+test@gmail.com";
        //
        try {
            WebDriver driver = new ChromeDriver();
            driver.get("url");
            WebElement Username = driver.findElement(By.id("UserName"));
            Username.sendKeys("ssarwat@jobvite-inc.com");
            WebElement Password = driver.findElement(By.id("password"));
            Password.sendKeys("password");
            WebElement talentModule = driver.findElement(By.id("TalentModule"));
            talentModule.click();
            WebElement SearchKeyword = driver.findElement(By.id("SearchKeyword"));
            SearchKeyword.sendKeys(emailAddress);
            WebElement SearchButton = driver.findElement(By.id("searchbutton"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}