package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class MenuManager extends JFrame {
    private JPanel mainPanel;

    public MenuManager() {
        // กำหนด Layout และสร้าง Panel หลัก
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(0, 1)); // จัดเป็นแนวตั้ง
        JScrollPane scrollPane = new JScrollPane(mainPanel);

        // เพิ่ม JPanel ของเมนูตัวอย่าง
        addMenu("Menu Name 01");
        addMenu("Menu Name 02");
        addMenu("Menu Name 03");

        // เพิ่ม JScrollPane ไปใน JFrame
        add(scrollPane);
        setTitle("Order Receiver Demo");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addMenu(String menuName) {
        // สร้าง Panel สำหรับเมนู
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.X_AXIS)); // จัดแนวนอน

        // เพิ่มส่วนประกอบต่าง ๆ ในเมนู
        JLabel menuLabel = new JLabel(menuName);
        JButton removeButton = new JButton("remove");

        // ActionListener สำหรับปุ่ม remove
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainPanel.remove(menuPanel); // ลบ JPanel เมนูนี้ออกจาก mainPanel
                mainPanel.revalidate(); // อัพเดต Layout ใหม่
                mainPanel.repaint(); // รีเฟรชหน้าจอ
            }
        });

        // เพิ่ม Component เข้าไปในเมนู Panel
        menuPanel.add(menuLabel);
        menuPanel.add(Box.createHorizontalGlue()); // เพื่อขยายพื้นที่ว่าง
        menuPanel.add(removeButton);

        // เพิ่มเมนู Panel เข้าไปใน Panel หลัก
        mainPanel.add(menuPanel);
    }

    public static void main(String[] args) {
        new MenuManager();
    }
}
