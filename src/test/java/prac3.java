import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class prac3 {

    public static void main(String[] args) throws IOException {
       // String FilePath = "src/main/resources/Resume1";

        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
        WebElement el = wait.until(ExpectedConditions.visibilityOf(userName));
        el.sendKeys("sarwat");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("test");
        WebElement textArea = driver.findElement(By.xpath("//textarea[@name='comments']"));
        textArea.sendKeys("i am a tester");
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='cb1']"));
        checkbox1.click();

        // DropDown

        WebElement dropDown1 = driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
        Select dropdown = new Select(dropDown1);
        dropdown.selectByVisibleText("Selection Item 1");

        //

        driver.findElement(By.xpath("//input[@type='submit']")).click();


        // open new window tab
        Actions actions = new Actions(driver);

       driver.get("https://testpages.eviltester.com/styled/windows-test.html");


//      WebElement alertBox=  driver.findElement(By.id("alertexamples"));
//       alertBox.click();
//       driver.switchTo().alert().accept();
         WebElement window2 =  driver.findElement(By.id("gobasicajax"));
         window2.click();

        String mainWindow = driver.getWindowHandle();
        Set <String> windowList = driver.getWindowHandles();
        System.out.println("Window Handles: " + windowList);

        for(String window : windowList){
            System.out.println(window);
            if(!window.equals(mainWindow)){
                driver.switchTo().window(window);
                break;
            }

        }
        System.out.println(driver.getTitle());
        driver.switchTo().window(mainWindow);
      //  driver.navigate().back();

        System.out.println("Main window title" + driver.getTitle());
       // driver.quit();
    }



}
