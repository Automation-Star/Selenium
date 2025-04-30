package com.firstSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {
    //private String name;
   // private double price;
  //  public SeleniumTest(String name){
     //   this.name = name;
       // this.price= price;
      //  System.out.println(this.name);
       // System.out.println(this.price);
   // }

          WebDriver driver = new ChromeDriver();
          public void launchBrowser() {
            System.setProperty("webdriver.chrome.driver", "/Users/basafa/Downloads/chromedriver-mac-arm64/chromedriver");
            //driver =new ChromeDriver();
            driver.get("https://www.google.com");
            WebElement xyz   =  driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
          //  xyz.sendKeys(this.name);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            xyz.submit();
            driver.close();
            System.out.println(driver.getTitle());


        }
            public static void main (String[] args){
                SeleniumTest obj = new SeleniumTest();
                //SeleniumTest obj1 = new SeleniumTest("syed" , 12);
                obj.launchBrowser();
              //  obj1.launchBrowser();

    }
}