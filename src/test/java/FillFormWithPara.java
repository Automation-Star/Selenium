import ch.qos.logback.core.util.FileUtil;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class FillFormWithPara {

    public static void main(String[] args) {

        FillFormWithPara fillFormWithPara = new FillFormWithPara();
        fillFormWithPara.getSearchResults("Sara", "Test34@gmail.com");
    }


    @Test

    public String getSearchResults(String name, String email) {
        WebDriver driver = new ChromeDriver();
        String successMsg;
        driver.get("https://www.lugo-test.com/Selenium/seleniumQ4/sq4.html");
        WebElement nameField = driver.findElement(By.xpath("//input[@name='name']"));
        nameField.sendKeys(name);
        WebElement EmailField = driver.findElement(By.name("email"));
        EmailField.sendKeys(email);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        WebElement actualMsg = driver.findElement(By.xpath("//div[@id='res']"));
        Assert.assertTrue(actualMsg.isDisplayed());
        successMsg = actualMsg.getText();

         // select dropDown
         WebElement dropdown  =driver.findElement(By.id("Country"));
        Select select =  new Select(dropdown);
        select.selectByIndex(1);

        //Through JavaScript Executer
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("argument[0].click()" , dropdown);
        DesiredCapabilities caps = new DesiredCapabilities();



        // print
        File ScreenShot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtil.fileToURL(ScreenShot);

        System.out.println(actualMsg.getText());
        return successMsg;


    }
}
