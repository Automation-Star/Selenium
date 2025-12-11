import com.firstSeleniumTest.CrossBrowserTestingEx;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class ParallelBrowserTest {
    public static void main(String[] args) {

    }

    @Parameters("browser")
    @Test
    public void openGoogle(String browser) {
        WebDriver driver;
    if(browser.equalsIgnoreCase("chrome")) {
        driver = new ChromeDriver();
    } else if (browser.equalsIgnoreCase("FireFox")) {
        driver=new FirefoxDriver();
    } else if (browser.equalsIgnoreCase("safari")) {
        driver= new SafariDriver();
    }
else {
    throw new IllegalArgumentException("Not supported");
    }

        driver.get("https://www.google.com");
        System.out.println(browser + " Title: " + driver.getTitle());

    }



    //TestNGDataProvider
    @Parameters("browser")
    @Test(priority = 1)
    public static void xyz() {
        WebDriver driver = new ChromeDriver();
        driver.switchTo().frame("frameName");
        driver.switchTo().defaultContent();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));

        //Action Class

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id(""))).perform();
        actions.doubleClick().perform();
        //actions.dragAndDrop(source, target).perform();
        //dropdown
        Select drpdwn = new Select(driver.findElement(By.xpath("")));
        drpdwn.selectByIndex(1);

        //Screenshot
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //How to fetch all links on a webpage?
        List<WebElement> allLinks= driver.findElements(By.xpath(""));
        for(WebElement link :allLinks){
            System.out.println(link.getAttribute("href"));
            //
WebElement checkbox= driver.findElement(By.id("chkbox"));
if(!checkbox.isSelected())
checkbox.click();
        }
    }
}
