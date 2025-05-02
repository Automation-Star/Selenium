import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class prac4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        String expectedMsg = "Your product has been added to cart." ;

        try {
            driver.get("https://www.automationexercise.com/");


            driver.manage().window().maximize();

            // find women Dress

            WebElement btn= driver.findElement(By.xpath("//a[@href='#Women']/span/i"));
            actions.scrollToElement(btn).perform();

            Thread.sleep(5000);
            btn.click();
            // Explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            WebElement el = driver.findElement(By.xpath("//*[@id='Women']/div/ul/li[1]/a"));
            wait.until(ExpectedConditions.elementToBeClickable(el));
            el.click();

//list of filtered result

            List<WebElement> Products = driver.findElements(By.xpath("//div[@class='product-image-wrapper']"));

            for (WebElement product : Products) {
                String productText = product.getText();
                System.out.println("Printed the product:" + product.getText());
                if(productText.contains("Sleeveless Dress")){
                    product.findElement(By.cssSelector("i[class='fa fa-plus-square']")).click();
                    driver.findElement(By.xpath("//button[@type='button']")).click();
                    WebElement actualMSgEl= driver.findElement(By.xpath("//p[text()='Your product has been added to cart.']"));
                    String actualMsg =actualMSgEl.getText().trim();
                    System.out.println(actualMsg);
                    Assert.assertEquals(actualMsg,expectedMsg,"Add to cart is not successful");
                    break;

                }
                
            }


        } catch (Exception e) {
            e.printStackTrace();


        } finally {
            driver.quit();

        }
    }
}



