import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetryLoginInfiniteTimes {
    /**
     * Modify the previous function to retry login up to N times (where N is passed as a parameter).
     * If all attempts fail, return "Max retries reached".
     *
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       String result=  loginAttempts(driver,"standard_user1","secret_sauce1",3,"standard_user", "secret_sauce" );
       System.out.println(result);
        driver.quit();
    }


    public static String loginAttempts(WebDriver driver, String userNameWrong, String passwordWrong, int N, String userNameCorrect, String passwordCorrect) throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(userNameWrong);
        driver.findElement(By.id("password")).sendKeys(passwordWrong);
        WebElement login = driver.findElement(By.id("login-button"));
        login.click(); // first time failed
        if (driver.findElement(By.xpath("//div[@class='error-message-container error']")).isDisplayed()) {
            for (int i = 1; i <= N; i++) {
                Thread.sleep(3000);
                driver.navigate().refresh();
                driver.findElement(By.id("user-name")).sendKeys(userNameCorrect);
                driver.findElement(By.id("password")).sendKeys(passwordCorrect);
                driver.findElement(By.id("login-button")).click();
                if (driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed()) {
                    return "successful Login";

                }
            }

        }
        return "attempted maximum number of reties";
    }

}

