import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

import java.util.Set;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class HandleMultipleWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //click on new link it will open a new tab

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement innerLink = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
        js.executeScript("arguments[0].scrollIntoView(true);" ,innerLink);
        innerLink.click();


        String parent =driver.getWindowHandle();
        //Get All Windows Handle

        Set<String> allWindows = driver.getWindowHandles();

        for(String window :allWindows){
            driver.switchTo().window(window);

            // // Switch to child window
            if(!window.equals(parent)){
                System.out.println("Child window Title"+ driver.getTitle());
            }
            else {
                System.out.println("Parent window handle"+ driver.getTitle());
            }
        }

    }



}
