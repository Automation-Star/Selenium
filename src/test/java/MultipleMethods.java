import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * Write a function to check if a button is enabled or disabled.
 *
 *
 */

public class MultipleMethods {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        boolean msg = isButtonEnabled(driver, (By.id("login-button")));
        System.out.println("successful attempt to click:" + msg);
        driver.quit();

    }


    public static boolean isButtonEnabled(WebDriver driver, By buttonLocator) {
        WebElement btn = driver.findElement(buttonLocator);
        if (btn.isEnabled()) {
            btn.click();
            return true;
        } else {
            System.out.println("btn is disabled");
            return false;


        }
    }

    // Write a function that scrolls down to a specific element using JavaScript.

    public static void scrollToElement(WebDriver driver, By locator) {
        WebElement el = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.scrollToElement(el).perform();

    }

    /**
     * Write a function to handle JavaScript alerts.
     * Function should:
     * Accept acceptAlert as a boolean parameter (true to accept, false to dismiss)
     */

    public static void handleAlert(WebDriver driver, boolean acceptAlert) {
//        WebElement AlertPopup = driver.findElement(By.id(""));
//        AlertPopup.click();
        try {
            Alert alert = driver.switchTo().alert();
            if (acceptAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }

        } catch (NoAlertPresentException e) {
            System.out.println("Alert is not present" + e.getMessage());
        }
    }

    /**
     * Write a function that checks if a page is loaded successfully.
     * The function should take a URL and an expected element's locator as parameters.
     * boolean isPageLoaded(String url, By expectedElement)
     */

    public static boolean isPageLoaded(WebDriver driver, String url, By expectedElement) {
        try {
            driver.get(url);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(expectedElement));
            return element.isDisplayed();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Write a function that fetches all broken links on a webpage.
     * A link is considered broken if it returns a 404 error.
     */

    public static void brokenLinks(WebDriver driver){
        List<WebElement> brokenLinksOnPage = driver.findElements(By.xpath(""));
        if(brokenLinksOnPage.isEmpty()){

        }
    }
}


