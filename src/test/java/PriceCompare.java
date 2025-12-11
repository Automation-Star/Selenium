import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PriceCompare {
    public static void main(String[] args) throws InterruptedException {
        // Set path to ChromeDriver

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open Amazon (without login)
        driver.get("https://www.amazon.com");

        Thread.sleep(30000);

        // Search for Mac Laptop
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mac Laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Wait for results to load
        Thread.sleep(3000);

        // Get the prices of the first two Mac laptops
        List<WebElement> prices = driver.findElements(By.cssSelector("span.a-price-whole"));

        if (prices.size() >= 2) {
            String price1 = prices.get(0).getText();
            String price2 = prices.get(1).getText();

            System.out.println("Price of first Mac laptop: $" + price1);
            System.out.println("Price of second Mac laptop: $" + price2);

            int p1 = Integer.parseInt(price1.replaceAll("[^0-9]", ""));
            int p2 = Integer.parseInt(price2.replaceAll("[^0-9]", ""));

            if (p1 > p2) {
                System.out.println("First Mac laptop is more expensive.");
            } else if (p2 > p1) {
                System.out.println("Second Mac laptop is more expensive.");
            } else {
                System.out.println("Both Mac laptops have the same price.");
            }
        } else {
            System.out.println("Could not find at least two prices.");
        }

        // Close browser
        driver.quit();
    }
}
