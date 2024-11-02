// package test;

// import java.io.File;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import org.apache.poi.ss.usermodel.Cell;
// import org.apache.poi.ss.usermodel.Row;
// import org.apache.poi.ss.usermodel.Sheet;
// import org.apache.poi.ss.usermodel.Workbook;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// public class ImageDropDemo {
//     public static void main(String[] args) {
//         // Create a workbook
//         Workbook workbook = new XSSFWorkbook();

//         // Create a sheet in the workbook with a given name
//         Sheet sheet = workbook.createSheet("excel-sheet");

//         // Create a row in the sheet
//         Row row = sheet.createRow(0);

//         // Add a cell in the row
//         Cell cell = row.createCell(0);

//         // Set a value to the cell
//         cell.setCellValue("something");

//         try (FileOutputStream out = new FileOutputStream(new File("excel.xlsx"))) {
//             workbook.write(out);
//         } catch (IOException e) {
//             e.printStackTrace();
//         } finally {
//             try {
//                 workbook.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
