import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class TCS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Login(driver);


    }

    public static void Login(WebDriver driver) {
        driver.get("https://www.lugo-test.com/Selenium/seleniumQ4/sq4.html");
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("syedasarwat");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bakshiriya5@gmail.com");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String expRes = "32";
        WebElement actual = driver.findElement(By.id("res"));
        String actualText = actual.getText();
        Assert.assertEquals(actualText, expRes);
        driver.quit();
        //Explicit Wait / used interface of WebdriberWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("")));

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

// Java Script Executer
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

// Action class
        Actions actions = new Actions(driver);
       // mousehover
        actions.moveToElement(driver.findElement(By.id(""))).perform();

        //doubleclick

        actions.doubleClick(driver.findElement(By.id(""))).perform();

        //DragAndDrop
       // actions.dragAndDrop("source", "target").perform();

        //Handle Alert

        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();
        alert.sendKeys("test");

//Handle Frame
        driver.switchTo().frame("frameName");
        driver.switchTo().defaultContent();

        //Handle multiple Windows

        String parent =driver.getWindowHandle();
        Set<String> allWindows =driver.getWindowHandles();
        for(String x :allWindows){
            driver.switchTo().window(x);
        }


    }

}
