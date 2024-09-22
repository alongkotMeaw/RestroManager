package test.test;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MenuFrame extends JFrame {

    // Constructor to initialize the main frame
    public MenuFrame() {
        setTitle("Main Frame (Menu)");
        setSize(600, 600); // ขนาดของหน้าต่าง
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel หลัก
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // อ่านข้อมูลจากไฟล์แล้วสร้าง panel สำหรับสินค้า
        try (BufferedReader br = new BufferedReader(new FileReader("src/allfile/Menu_list.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); // แยกข้อมูลจากไฟล์ด้วย ","
                String itemName = parts[0];
                String imagePath = parts[1]; // เก็บ path ของรูปภาพ

                mainPanel.add(createMenuItemPanel(itemName, imagePath));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ScrollPane เพื่อให้เลื่อนดูรายการได้
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane);
    }

    // Method สำหรับสร้าง panel ของแต่ละสินค้าจากข้อมูลที่อ่านจากไฟล์
    private JPanel createMenuItemPanel(String itemName, String imagePath) {
        JPanel itemPanel = new JPanel();
        itemPanel.setLayout(new BorderLayout()); // ใช้ BorderLayout จัดวางองค์ประกอบ

        // parnel size permenu
        itemPanel.setPreferredSize(new Dimension(350, 150)); // ขนาด 350x150 พิกเซล

        // ส่วนของการแสดงชื่อเมนูและปุ่ม
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS)); // จัดองค์ประกอบในแนวตั้ง

        JLabel itemLabel = new JLabel(itemName, JLabel.LEFT); // ชื่อเมนู
        itemLabel.setFont(new Font("Arial", Font.BOLD, 16)); // ตั้งฟอนต์ของชื่อเมนู

        JLabel quantityLabel = new JLabel("Quantity: ");

        // ส่วนของการเพิ่มลดจำนวน
        JButton minusButton = new JButton("-");
        JTextField quantityField = new JTextField("0");
        quantityField.setPreferredSize(new Dimension(1, 1));
        JButton plusButton = new JButton("+");
        // set

        // ปุ่มสั่งซื้อ
        JButton orderButton = new JButton("Order");

        // โหลดรูปภาพจาก path และปรับขนาด
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage(); // แปลง ImageIcon เป็น Image
        Image scaledImage = image.getScaledInstance(150, 100, Image.SCALE_SMOOTH); // ปรับขนาดรูปภาพ (150x100)
        imageIcon = new ImageIcon(scaledImage); // แปลง Image กลับเป็น ImageIcon
        JLabel imageLabel = new JLabel(imageIcon); // แสดงรูปภาพสินค้า

        // เพิ่ม component ต่าง ๆ ลงใน leftPanel
        leftPanel.add(itemLabel); // ชื่อเมนูไว้บนสุด
        leftPanel.add(quantityLabel);
        leftPanel.add(minusButton);
        leftPanel.add(quantityField);
        leftPanel.add(plusButton);
        leftPanel.add(orderButton);

        // เพิ่ม leftPanel และ imageLabel ลงใน itemPanel
        itemPanel.add(leftPanel, BorderLayout.CENTER); // จัดวาง leftPanel ไว้ทางซ้าย
        itemPanel.add(imageLabel, BorderLayout.WEST); // จัดวางรูปภาพไว้ทางขวาสุด

        // จัดการกับการกดปุ่มเพิ่มหรือลดจำนวนสินค้า
        minusButton.addActionListener(e -> {
            int quantity = Integer.parseInt(quantityField.getText());
            if (quantity > 0) {
                quantityField.setText(String.valueOf(quantity - 1));
            }
        });

        plusButton.addActionListener(e -> {
            int quantity = Integer.parseInt(quantityField.getText());
            quantityField.setText(String.valueOf(quantity + 1));
        });

        return itemPanel;
    }

    // Main method
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuFrame menuFrame = new MenuFrame();
            menuFrame.setVisible(true);
        });
    }
}
