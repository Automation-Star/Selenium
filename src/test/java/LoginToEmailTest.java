
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.File;
import java.time.Duration;


public class LoginToEmailTest {
    private static final Logger log = LoggerFactory.getLogger(LoginToEmailTest.class);

    public static void main(String[] args) throws Exception {
        LoginToEmailTest loginToEmailTest = new LoginToEmailTest();
        loginToEmailTest.Loginfunc();
    }

    @Test
    public void Loginfunc() throws Exception {
        SoftAssert softAssert = new SoftAssert();
        String filePath = "SomeFile";
        String ToastMsg = "File is uploaded Successfully";
        String ExpectedResult = "Gmail";
        String ActualResult = "//a[@aria-label='Gmail']";
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        log.info("OrangeHRM loaded");
        WebElement userName = driver.findElement(By.cssSelector("input[name='username']"));
        userName.sendKeys("Admin");
        log.info("Entered user name");
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("admin123");
        log.info("Entered password");
        WebElement button = driver.findElement(By.xpath("button[type='submit']"));
        button.click();


         // Handle Alerts
        WebElement alertPopup = driver.findElement(By.id("Some id"));
        alertPopup.click();
        Alert alert=  driver.switchTo().alert();
        alert.accept();
       //right click
        Actions actions = new Actions(driver);
        actions.contextClick().perform();

        // drag and drop
        actions.dragAndDrop(userName, button);

        // Explicit wait

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(userName));
        element.click();

        //implicit wait

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // MOUSE HOVER ACTION

        actions.moveToElement(element).perform();

        // ScreenShot
        File Src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        // After login verify the page title
        Assert.assertEquals(ExpectedResult, ActualResult);

        //upload file
        WebElement uploadBtn = driver.findElement(By.id("upload button"));
        uploadBtn.sendKeys(filePath);

        //Toast msg for successful upload file
        Assert.assertEquals(ToastMsg,String.valueOf(IsSuccessfulMsgDisplayed()));

        softAssert.assertAll();
        //delete cookie
        Cookie cookie = new Cookie("name","sarwat");
        driver.manage().deleteCookie(cookie);





    }

    public boolean IsSuccessfulMsgDisplayed() {
        WebDriver driver = new ChromeDriver();
        WebElement  SuccessMsg =driver.findElement(By.id("some successful Id"));
        return SuccessMsg.isDisplayed();


    }
}

