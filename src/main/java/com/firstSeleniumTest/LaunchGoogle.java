package com.firstSeleniumTest;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.time.Duration;

class OpenBrowser {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/basafa/Downloads/chromedriver-mac-arm64/chromedriver");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());

        //Handle popup Alert
        WebElement popupAlerts = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        popupAlerts.click();
        //Switch to Alert
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        //Accept
        alert.accept();
        System.out.println();

        // Open another browser
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com");
        //Search text
        WebElement SearchBox = driver.findElement(By.name("q"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Added explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(SearchBox));
        element.sendKeys("Selenium WebDriver");
        //File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        element.submit();

        WebElement clickableElement = driver.findElement(By.xpath("//h3[text()='WebDriver']"));
        clickableElement.click();
        System.out.println("This is WebDriver page" + driver.getTitle());
        // driver.quit();
        // Validate DropDown

        Select dropDownValue =   new Select(driver.findElement(By.xpath("//div[@class='dropdown-menu']")));
        dropDownValue.selectByVisibleText("About Selenium");

        // perform Mouse hover Action

        WebElement mouseOverElement = driver.findElement(By.xpath("//a[@title='Getting started']"));
        Actions actions =new Actions(driver);
        actions.moveToElement(mouseOverElement).perform();

        //perform draganddrop action
        Actions actions1 = new Actions(driver);
        //actions1.dragAndDrop(sourceElement , targetElement).perform();

        //upload file
        WebElement uploadFile = driver.findElement(By.id("tex here"));
        uploadFile.sendKeys("Filepath");

        //Scroll to browser by using java script
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window scroll by", 0,50);
    }
}

class dupActions {
    public static void main(String[] args) {
      //  System.setProperty("xyz")
        WebDriver driver = new ChromeDriver();
        driver.get("get url");
        //Handle alert
        WebElement alertPopup = driver.findElement(By.id("popup"));
        alertPopup.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.dismiss();

        //Implicit wait

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Explicit wait

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement xyz = wait.until(ExpectedConditions.visibilityOf(alertPopup));
        xyz.click();

        // Switch to Another tab
        driver.switchTo().newWindow(WindowType.TAB);
        // maxmize window

        driver.manage().window().maximize();

        // handle iframre
        WebElement iframe = driver.findElement(By.id("iframeElement"));
        driver.switchTo().frame(iframe);
        iframe.click();
        // TakeScreenshot

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Drag And Drop

        Actions actions = new Actions(driver);
        //actions.dragAndDrop("ElemntSource", "Element Target").perform();

        //
        actions.moveToElement(iframe).perform();

        //DropDown actions

        Select dropDownAction = new Select(iframe);
        dropDownAction.selectByVisibleText("xyz");

        //
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window scroll by" ,0,50);

        JavascriptExecutor jjs =(JavascriptExecutor) driver;
        jjs.executeScript("window scroll by",0,50);

        //handle cookies
        Cookie cookie = new Cookie("usernamw" , "sarwat");
        driver.manage().addCookie(cookie);

        //reteriver cookies
        Cookie retrievedCookie = driver.manage().getCookieNamed("username");
        System.out.println(retrievedCookie);
        driver.manage().deleteCookie(retrievedCookie);

    }
}



