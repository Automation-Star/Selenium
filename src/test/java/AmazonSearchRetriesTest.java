import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AmazonSearchRetriesTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        int retries = 3;  // Number of retry attempts
        boolean testPassed = false;

        for (int i = 0; i < retries; i++) {
            try {
                // Navigate to Amazon
                driver.get("https://www.amazon.com");

                // Find the search bar, enter text, and click search
                driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
                driver.findElement(By.id("nav-search-submit-button")).click();
                System.out.println(driver.getTitle());

                // Wait and check if results are visible
                WebElement firstResult = driver.findElement(By.cssSelector(".s-main-slot .s-result-item"));
                if (firstResult.isDisplayed()) {
                    System.out.println("Test Passed: Search results are displayed.");
                    testPassed = true;
                    break;  // Exit the retry loop on success
                }

            } catch (Exception e) {
                System.out.println("Attempt " + (i + 1) + " failed: " + e.getMessage());
            }
        }

        if (!testPassed) {
            System.out.println("Test Failed after " + retries + " attempts.");
        }

        driver.quit();  // Close the browser
    }
}

