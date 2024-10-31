package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class ImageDropDemo {
    public static void main(String[] args) {
        // ดึงเวลาปัจจุบัน
        LocalDateTime currentTime = LocalDateTime.now();

        // กำหนดรูปแบบวันที่และเวลา
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy,HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        // แสดงเวลาปัจจุบัน
        System.out.println("เวลาปัจจุบัน: " + formattedTime);
    }
}