package file_loader;

import java.io.File;
import java.io.FileOutputStream;
import java.io.*;
import java.nio.charset.StandardCharsets;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class excel_write {

    public static void write_one_day(String now_day) {
        Map<String, Object[]> Data = new TreeMap<String, Object[]>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("src/restaurant_log/user_order.txt"),
                        StandardCharsets.UTF_8))) {
            String line;
            int line_index = 0;

            while ((line = reader.readLine()) != null) {
                String temp[] = line.split(",");
                if (temp[5].equals(now_day)) {
                    double total = Double.parseDouble(temp[3]) * Double.parseDouble(temp[4]);
                    Data.put("" + line_index, new Object[] { temp[3], temp[1], temp[2], "" + total, temp[5] });
                    line_index++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // workbook object
            XSSFWorkbook workbook = new XSSFWorkbook();

            // spreadsheet object
            XSSFSheet spreadsheet = workbook.createSheet(" 1-Day summary ");

            // creating a row object
            XSSFRow row;

            // This data needs to be written (Object[])

            Set<String> keyid = Data.keySet();

            int rowid = 0;
            for (String key : keyid) {

                row = spreadsheet.createRow(rowid++);
                Object[] objectArr = Data.get(key);
                int cellid = 0;

                for (Object obj : objectArr) {
                    Cell cell = row.createCell(cellid++);
                    cell.setCellValue((String) obj);
                }
            }

            // .xlsx is the format for Excel Sheets...
            // writing the workbook into the file...
            FileOutputStream out = new FileOutputStream(
                    new File("src/../test.xlsx"));

            workbook.write(out);
            out.close();
        } catch (Exception e) {

        }
    }

}
