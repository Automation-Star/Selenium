package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;

public class ExcelUtils {
    public static List<Map<String, String>> getData(String filePath, String sheetName) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            Map<String, String> rowData = new HashMap<>();

            for (int j = 0; j < row.getLastCellNum(); j++) {
                String key = headerRow.getCell(j).toString();
                String value = row.getCell(j).toString();
                rowData.put(key, value);
            }
            excelData.add(rowData);
        }

        workbook.close();
        fis.close();
        return excelData;
    }
}



//}
//