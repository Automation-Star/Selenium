import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.css.model.Value;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
@Test

public class prac1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        Login(driver, "standard_user", "secret_sauce");
        searchProduct(driver);
        driver.quit();


    }

    public static void Login(WebDriver driver, String userName, String Password) {
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(Password);
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        String loginSuccessful = driver.getTitle();
        Assert.assertEquals("Login failed: Page title does not match", "Swag Labs", loginSuccessful);
    }

    public static void searchProduct(WebDriver driver) throws InterruptedException {
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='inventory_item']"));

        for (WebElement product : products) {
            System.out.println(product.getText().trim());
            if (product.getText().contains("Sauce Labs Bike Light")) {
                Actions actions = new Actions(driver);
                actions.moveToElement(product).perform();
                driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
                WebElement removeBtn = driver.findElement(By.xpath("//button[text()='Remove']"));
                Assert.assertTrue(removeBtn.isDisplayed());

            }


        }
    }
}
