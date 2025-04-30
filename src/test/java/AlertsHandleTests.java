import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsHandleTests {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/alerts/alert-test.html");
        AlertsHandleTests alertsHandle = new AlertsHandleTests();
       // alertsHandle.alertHandle(driver);
      //  alertsHandle.alertCancel(driver);
      //  alertsHandle.dragAndDrop(driver);
       alertsHandle.iframeTest(driver);
    }


    @Test
    public void alertHandle(WebDriver driver){
        WebElement popupAlert = driver.findElement(By.xpath("//input[@onclick='show_alert()']"));
        popupAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.quit();

    }
@Test
    public void alertCancel(WebDriver driver){
        WebElement popupAlert = driver.findElement(By.xpath("//input[@onclick='show_confirm()']"));
        popupAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
       driver.quit();

    }
@Test
    public void dragAndDrop(WebDriver driver){
        driver.get("https://testpages.eviltester.com/styled/drag-drop-javascript.html");
        Actions actions = new Actions(driver);
        WebElement source = driver.findElement(By.cssSelector("div[id='draggable1']"));
        WebElement target = driver.findElement(By.cssSelector("div[id='droppable1']"));
        actions.dragAndDrop(source, target).perform();
        driver.close();
    }
    @Test
    public void iframeTest(WebDriver driver){
        driver.get("https://testpages.eviltester.com/styled/iframes-test.html");
        WebElement frameName = driver.findElement(By.xpath("//iframe[@id='thedynamichtml']"));
        driver.switchTo().frame(frameName);
        Actions actions = new Actions(driver);

        WebElement getText= driver.findElement(By.id("iframe59"));
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(1000));
//        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("iframe59")));
//        element.isDisplayed();
       actions.scrollToElement(getText).perform();
        System.out.println(driver.getTitle());

        driver.quit();

    }

}
