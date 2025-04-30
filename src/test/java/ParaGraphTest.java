import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ParaGraphTest {
    public static void main(String[] args){
        getCharactersCount();



}
@Test
public static int getCharactersCount() {
    WebDriver driver = new ChromeDriver();
    driver.get(" http://lugo-test.com/Selenium/seleniumQ3/index.html");
    List<WebElement> paragraphs = driver.findElements(By.xpath("//p[contains(text(), 'Cras aliquet urna ut sapien')]"));
    System.out.println(paragraphs.getFirst());
    StringBuilder allText = new StringBuilder();


    for(WebElement paragraph :paragraphs){
        allText.append(paragraph.getText());

    }
    return allText.length();
}
}

