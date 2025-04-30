import com.firstSeleniumTest.SeleniumTest;
import com.sun.jdi.PathSearchingVirtualMachine;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;
import java.time.Duration;

public class SearchTests {
    private static final Logger log = LoggerFactory.getLogger(SearchTests.class);

    public static void main(String[] args) {
        SearchTests searchTests = new SearchTests();
        searchTests.AdvanceSearchFunctionTest();

    }

    @Test
    public void AdvanceSearchFunctionTest()  {
        String ExpectedHomePageMsg = "Test Cases";

        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver.get("https://www.automationexercise.com/");
        log.info("Redirected to the shopping website");
        driver.getTitle();
        //Assert.assertEquals(String.valueOf(isBrandCategoryDisplayed()), ExpectedHomePageMsg);
        System.out.println(driver.getTitle());
        // register user
        driver.findElement(By.cssSelector("a[href='/login']")).click();
        //Enter Username
        WebElement userName=  driver.findElement(By.xpath("//form//input[@placeholder='Name']"));
        userName.sendKeys("Bakshi");
        // Enter EmailAddress
        WebElement email = driver.findElement(By.xpath("//form//input[@data-qa='signup-email']"));
        email.sendKeys("bakshiriya5+automationtry@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        // checking radio button
        driver.findElement(By.id("uniform-id_gender2")).click();
        //Enter password
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test@123");

        Select dropDownDay = new Select(driver.findElement(By.id("days")));
        dropDownDay.selectByIndex(2);

        Select dropDownMonths = new Select(driver.findElement(By.id("months")));
        dropDownMonths.selectByIndex(2);

        Select dropDownYear = new Select(driver.findElement(By.id("years")));
        dropDownYear.selectByVisibleText("1993");

        // Enter Details

        WebElement fName= driver.findElement(By.id("first_name"));
        // fName.sendKeys("");

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000))  ;

        //Explicit wait

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50000));
        WebElement  element  = wait.until(ExpectedConditions.visibilityOf(fName));
        element.sendKeys("Bakshi");

        WebElement lName= driver.findElement(By.id("last_name"));
        lName.sendKeys("Test");

        WebElement address= driver.findElement(By.id("address1"));
        address.sendKeys("San Matteo , CA");

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // FileHandler.copy(src,new File("/Users/basafa/Documents/Automation/newTest/src/test/Sceenshot"));


        // MouseHover action

        Actions actions = new Actions(driver);
        // actions.dragAndDrop("Source", "Target");

        //double click click

        actions.doubleClick(element).perform();

        // right click
        actions.contextClick().perform();


        actions.moveToElement(driver.findElement(By.xpath("//a[@href='/products']"))).perform();

        // click on product

        driver.findElement(By.xpath("//a[@href='/products']")).click();
        // search input box

        WebElement searchInput=  driver.findElement(By.xpath("//input[@placeholder='Search Product']"));
        searchInput.sendKeys("Polo");
        // searchInput.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//button[@id='submit_search']")).click();

        WebElement product = driver.findElement(By.xpath("//img[@alt='ecommerce website products']"));

        Assert.assertTrue(product.isDisplayed(),"product displayed");
        System.out.println(product.isDisplayed());

        driver.quit();
    }

}
