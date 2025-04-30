import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Element_Interaction_Parameterized_Functions {
    /**
     * Create a function that clicks an element using different locators.
     * The function should accept parameters like:
     * clickElement(By locator, int maxRetries)
     * It should retry clicking up to maxRetries times before failing.
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.ca");
        retrySearchAttempt(driver, By.xpath("//input[@id='twotabsearchtextbox']"), By.xpath("//div[@data-cy='title-recipe']"), 3);
        driver.close();
    }

    public static void retrySearchAttempt(WebDriver driver, By searchBoxLocator, By productListLocator, int maxRetries) {

        WebElement searchBox = driver.findElement(searchBoxLocator);
        searchBox.sendKeys("samsung laptop 2024");
        searchBox.submit();
        List<WebElement> products = driver.findElements(productListLocator);

        if (products.isEmpty()) {
            System.out.println("product is not found");
            return;
        }
        boolean productFound = false;

        // try finding product
        for (WebElement product : products) {
            System.out.println(product.getText());
            if (product.getText().contains("Samsung Galaxy Book5 Pro, 14\", AI PC, Copilot+, Intel U7H, 16GB RAM, 512GB Storage, Touch AMOLED Display - Gray (CAD Version & Warranty) ")) {
                product.click();
                productFound = true;
                break;
            }
        }
        // Retry clicking on any product if the correct one is not found
        if (!productFound) {
            for (int i = 1; i <= maxRetries; i++) {
                if (products.size() > 2) {
                    System.out.println("retry selection other product" + i);
                    products.get(2).click();
                    return;
                } else {
                    System.out.println("Not enough products to retry selection.");
                }
            }

        }
    }
    }

