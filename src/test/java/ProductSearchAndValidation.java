import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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
public class ProductSearchAndValidation {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


        //Search product
        WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product.click();
        retriesAddToCart(driver);
        driver.close();



    }

    public static void retriesAddToCart(WebDriver driver) throws InterruptedException {
       WebElement AddToCart= driver.findElement(By.id("add-to-cart"));
      int  retries = 3;
      for(int i =1; i<=retries;i++){
          if(AddToCart.isDisplayed()){
              AddToCart.click();
              break;
          }
          Thread.sleep(3000);
          driver.navigate().refresh();

      }

    }
}
