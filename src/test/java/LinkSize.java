import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class LinkSize {
    public static void main(String[] args) {
        int linkCount = getAllLinksCount();
        System.out.println("Total number of links: " + linkCount);

    }

    @Test
    public static int getAllLinksCount() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.ca/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int count = links.size();
        System.out.println(count);
        for (WebElement linkText : links) {
            System.out.println(linkText.getText());
        }
            // Close the browser
            driver.quit();

            return count;

        }
    }

