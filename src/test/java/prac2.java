import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *  /**
 *      * Write a Selenium Java  that attempts to log in to 'https://www.saucedemo.com/'
 *      * using incorrect credentials.
 *      * If the login fails, retry with correct credentials up to 3 times before failing."
 *      */


public class prac2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        retriesLogin(driver, "test123", "secret_sauce", "standard_user");
        driver.close();
    }

    public static void retriesLogin(WebDriver driver, String wrongUserName, String password, String correctUserName) throws InterruptedException {
        int retries = 3;
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(wrongUserName);
        driver.findElement(By.id("password")).sendKeys(password);
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        // Assert.assertTrue(driver.getTitle().contains("Swag Labs"));
        WebElement loginPageTitle = driver.findElement(By.xpath("//div[@class='login_logo']"));

        if (loginPageTitle.isDisplayed()) {
            for (int i = 0; i < retries; i++) {
                driver.navigate().refresh();
                driver.findElement(By.id("user-name")).sendKeys(correctUserName);
                driver.findElement(By.id("password")).sendKeys(password);
                Thread.sleep(3000);
                driver.findElement(By.id("login-button")).click();
                if (driver.getTitle().contains("Swag Labs")) {
                    return;


                }

            }
            Assert.fail("Login failed after 3 attempts.");
        }

    }
}

