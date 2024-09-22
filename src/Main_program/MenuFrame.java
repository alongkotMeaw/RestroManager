package Main_program;

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
            System.out.println("load Menu file eror");
        }

        // ScrollPane เพื่อให้เลื่อนดูรายการได้
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane);
    }

    // Method สำหรับสร้าง panel ของแต่ละสินค้าจากข้อมูลที่อ่านจากไฟล์
    private JPanel createMenuItemPanel(String itemName, String imagePath) {
        JPanel itemPanel = new JPanel();
        itemPanel.setLayout(new BorderLayout()); // ใช้ BorderLayout จัดวางองค์ประกอบ

        // ขนาดของ itemPanel
        itemPanel.setPreferredSize(new Dimension(350, 150)); // ขนาด 350x150 พิกเซล

        // ส่วนของการแสดงชื่อเมนูและปุ่ม
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH; // ให้คอมโพเนนต์ใช้พื้นที่ทั้งหมด

        // ชื่อเมนู
        JLabel itemLabel = new JLabel(itemName, JLabel.LEFT);
        itemLabel.setFont(new Font("Arial", Font.BOLD, 16)); // ตั้งฟอนต์ของชื่อเมนู

        // จำนวน
        JLabel quantityLabel = new JLabel("Quantity: ");

        // ปุ่มเพิ่มลดจำนวน
        JButton minusButton = new JButton("-");
        JTextField quantityField = new JTextField("0", 3); // เพิ่ม quantityField
        JButton plusButton = new JButton("+");

        // ปุ่มสั่งซื้อ
        JButton orderButton = new JButton("Order");

        // โหลดรูปภาพจาก path และปรับขนาด
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage(); // แปลง ImageIcon เป็น Image
        Image scaledImage = image.getScaledInstance(150, 100, Image.SCALE_SMOOTH); // ปรับขนาดรูปภาพ (150x100)
        imageIcon = new ImageIcon(scaledImage); // แปลง Image กลับเป็น ImageIcon
        JLabel imageLabel = new JLabel(imageIcon); // แสดงรูปภาพสินค้า

        // เพิ่มคอมโพเนนต์ใน leftPanel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 3; // รูปภาพใช้พื้นที่ 3 แถว
        leftPanel.add(imageLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        leftPanel.add(itemLabel, gbc);

        gbc.gridy = 1;
        gbc.gridheight = 1;
        leftPanel.add(quantityLabel, gbc);

        gbc.gridy = 2;
        gbc.gridheight = 1;
        leftPanel.add(plusButton, gbc);

        gbc.gridy = 2;
        gbc.gridx = 4; // ตำแหน่งของปุ่มลดจำนวน
        leftPanel.add(quantityField, gbc);

        gbc.gridy = 2;
        gbc.gridx = 5; // ตำแหน่งของปุ่มลดจำนวน
        leftPanel.add(minusButton, gbc);

        gbc.gridy = 2;
        gbc.gridx = 7;
        leftPanel.add(orderButton, gbc);

        itemPanel.add(leftPanel, BorderLayout.CENTER);
        // set bg

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
