package com.firstSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class UploadAFileEx {
    public static void main(String[] args) {
        String filePath = "someFilePath";
        String downloadDir = "SomeDirPath";
        String expectedFile = "somefilename.pdf";
        System.setProperty("webdriver.chrome.driver", "/Users/basafa/Downloads/chromedriver-mac-arm64/chromedriver");
        // Set ChromeOptions to enable automatic file download
        ChromeOptions options = new ChromeOptions();
        options.addArguments("no- sandbox");
        options.addArguments("disable- notifications");
        //configure download behaviour
        options.addArguments("download.default_directory=" + downloadDir);
        //flow
        WebDriver driver = new ChromeDriver();
        driver.get("URL here");
        WebElement uploadButton = driver.findElement(By.id("Upload button"));
        uploadButton.sendKeys(filePath);
        //Download A file
        WebElement downloadBtn = driver.findElement(By.id("DownloadButton"));
        downloadBtn.click();
        //verify file is presnt in the directory
        File downloadFile = new File(downloadDir + "\\" + "expectedFile");

        if (downloadFile.exists()) {
            System.out.println("file is downlaoded");
        } else {
            System.out.println("File is not downloaded");
        }
    }

}
