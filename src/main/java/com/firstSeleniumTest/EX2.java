package com.firstSeleniumTest;

import ch.qos.logback.core.util.FileUtil;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

/**
 * Navigate to the demo product website (e.g., https://www.saucedemo.com/).
 * Log in with valid credentials (standard_user / secret_sauce).
 * Search for a product, e.g., "Sauce Labs Backpack".
 * Verify that the search results contain the correct product.
 * Click on the product and verify that the product details page opens with the correct details (name, price, etc.).
 * Add the product to the cart.
 * Take a screenshot of the cart page after adding the product.
 * Log out.
 */
public class EX2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // String msg = "Sauce Labs Backpack";
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        //Search product
//        WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
//        product.click();
        // System.out.println(product.isDisplayed());
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_item']"));
        for (WebElement productList : products) {
            System.out.println(productList.getText());
            if(productList.getText().contains("Sauce Labs Bike Light")){
                productList.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
            }
              }


//        WebElement addToCart = driver.findElement(By.id("add-to-cart"));
//        addToCart.click();
//        File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtil.fileToURL(Screenshot);
//
//        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(menu));
//        element.click();
//        WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
//        WebDriverWait waitLogout = new WebDriverWait(driver, Duration.ofSeconds(3000));
//        WebElement waitForLogout = waitLogout.until(ExpectedConditions.elementToBeClickable(logout));
//        waitForLogout.click();
//        driver.quit();
//    }

//        //logout
//        EX2 ex2 = new EX2();
//        ex2.logOut();
//        driver.quit();


    }
        public void logOut () {
            WebDriver driver = new ChromeDriver();
            WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2000));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(menu));
            element.click();
            driver.findElement(By.id("logout_sidebar_link")).click();


        }
    }








