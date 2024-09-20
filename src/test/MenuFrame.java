package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MenuFrame extends JFrame {
    public MenuFrame() {
        // Set up the main frame
        setTitle("Restaurant Menu");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the menu items (with vertical BoxLayout)
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        // Sample data (menu items)
        // read menu file
        // max menu = 50

        String[] menuNames = new String[100];
        int[][] menuValues = new int[100][];
        int i = 0;
        try {
            // เปิดไฟล์เพื่ออ่าน
            FileReader fr = new FileReader("src\\allFile\\Menu_list.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            // อ่านไฟล์ทีละบรรทัด
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                menuNames[i] = parts[0].trim();
                menuValues[i] = new int[parts.length - 1];
                for (int j = 1; j < parts.length; j++) {
                    menuValues[i][j - 1] = Integer.parseInt(parts[j].trim());
                }

                i++;
            }

            // ปิดการอ่านไฟล์
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Declaring loop variable
        // int menu_num;
        /*
         * // Holds true till there is nothing to read
         * while ((i = fr.read()) != -1)
         * 
         * System.out.print((char) i);
         */
        // String[] items = { "Pizza", "Burger", "Pasta", "Salad", "Sushi", "Steak",
        // "Noodles", "Rice", "Ice Cream" };

        // Loop to create and add menu items

        for (String item : menuNames) {
            /// check if menu list all dis play
            if (i-- == 0)
                break;
            // Create a panel for each menu item with a fixed size
            JPanel itemPanel = new JPanel();
            itemPanel.setPreferredSize(new Dimension(200, 200));
            itemPanel.setMaximumSize(new Dimension(400, 200)); // Ensure the size stays fixed
            itemPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

            // Set border for visibility
            itemPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            // Item label
            JLabel itemLabel = new JLabel(item);

            // Quantity input
            JTextField quantityField = new JTextField("1", 3);

            // Order button
            JButton orderButton = new JButton("Order");
            orderButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String quantity = quantityField.getText();
                    System.out.println("" + "Ordered " + quantity + " " + item);

                }
            });

            // Add components to the item panel
            itemPanel.add(itemLabel);
            itemPanel.add(new JLabel("Quantity:"));
            itemPanel.add(quantityField);
            itemPanel.add(orderButton);

            // Add the item panel to the main menu panel
            menuPanel.add(itemPanel);
        }

        // Wrap the menu panel in a scroll pane
        JScrollPane scrollPane = new JScrollPane(
                menuPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Add the scroll pane to the main frame
        add(scrollPane);

        // Display the window
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the frame in the event-dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuFrame();
            }
        });
    }
}
