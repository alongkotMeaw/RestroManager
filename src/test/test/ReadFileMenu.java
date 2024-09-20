package test.test;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileMenu {
    public static void main(String[] args) {
        try {
            // เปิดไฟล์เพื่ออ่าน
            FileReader fr = new FileReader("src\\allFile\\Menu_list.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            int i = 0;

            // เก็บชื่อเมนูเป็น String array
            String[] menuNames = new String[100];
            // เก็บตัวเลขในแต่ละแถวเป็น int array
            int[][] menuValues = new int[100][];

            // อ่านไฟล์ทีละบรรทัด
            while ((line = br.readLine()) != null) {
                // แยกบรรทัดตามคอมม่า
                String[] parts = line.split(",");

                // เก็บส่วนแรกเป็นชื่อเมนู
                menuNames[i] = parts[0].trim();

                // สร้าง array เพื่อเก็บค่าตัวเลขจากส่วนที่เหลือ
                menuValues[i] = new int[parts.length - 1];

                // เก็บค่าตัวเลขที่เหลือใน array ของ int
                for (int j = 1; j < parts.length; j++) {
                    menuValues[i][j - 1] = Integer.parseInt(parts[j].trim());
                }

                i++; // เพิ่มค่า i เพื่อเก็บในแถวถัดไป
            }

            // ปิดการอ่านไฟล์
            br.close();

            // แสดงผลข้อมูลที่เก็บไว้
            for (int j = 0; j < i; j++) {
                System.out.print("Menu: " + menuNames[j] + " | Values: ");
                for (int value : menuValues[j]) {
                    System.out.print(value + " ");
                }
                System.out.println(); // ขึ้นบรรทัดใหม่หลังจากแสดงแต่ละแถว
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
