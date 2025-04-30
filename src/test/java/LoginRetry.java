import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRetry {
    /**
     * Write a Selenium Java  that attempts to log in to 'https://www.saucedemo.com/'
     * using incorrect credentials.
     * If the login fails, retry with correct credentials up to 3 times before failing."
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user1");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        Thread.sleep(5000);
       String msg =  loginException(driver);
        System.out.println(msg);
//        try{
//            driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
//        }
//        catch ( Exception ex){
//            retriesLogin(driver, "standard_user", "secret_sauce");
//        }

        driver.quit();


    }


    public static void retriesLogin(WebDriver driver, String userName, String password) {
        int retries = 3;
        WebElement loginPageTitle = driver.findElement(By.xpath("//div[@class='login_logo']"));

        for (int i = 1; i < retries; i++) {
            if (loginPageTitle.isDisplayed()) {
                driver.navigate().refresh();
                driver.findElement(By.id("user-name")).sendKeys(userName);
                driver.findElement(By.id("password")).sendKeys(password);
                driver.findElement(By.id("login-button")).click();
                break;
            }

        }
        WebElement homePageTitle = driver.findElement(By.xpath("//div[@class='app_logo']"));
        homePageTitle.isDisplayed();
    }
//If login fails, return "Login failed"; if successful, return "Login successful".
    public static String loginException(WebDriver driver ) {
        if (driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed()) {
            return "login failed";


        } else {
            return  "Login successful";

        }
    }

    }


