

import Utils.ExcelUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.*;

    public class LoginTest {

        @DataProvider(name = "excelData")
        public Object[][] getExcelData() throws IOException {
            List<Map<String, String>> data = ExcelUtils.getData("TestData.xlsx", "Sheet1");

            Object[][] testData = new Object[data.size()][1];
            for (int i = 0; i < data.size(); i++) {
                testData[i][0] = data.get(i);
            }
            return testData;
        }

        @Test(dataProvider = "excelData")
        public void testLogin(Map<String, String> row) {
            System.out.println("Testing with: " + row.get("Username") + " / " + row.get("Password"));

            // Example Selenium steps
            // driver.findElement(By.id("username")).sendKeys(row.get("Username"));
            // driver.findElement(By.id("password")).sendKeys(row.get("Password"));
            // driver.findElement(By.id("login")).click();
        }
    }

