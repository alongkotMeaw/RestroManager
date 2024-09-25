package Main_program;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MenuFrame extends JFrame {

    public MenuFrame() {
        setTitle("Main Frame (Menu)");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu itemMenu = new JMenu("Menu");
        menuBar.add(itemMenu);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        try (BufferedReader br = new BufferedReader(new FileReader("src/allfile/Menu_list.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String itemName = parts[0];
                String imagePath = parts[1];

                mainPanel.add(new MenuBlock(itemName, imagePath));
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("load Menu file eror");
        }

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        /*
         * SwingUtilities.invokeLater(() -> {
         * MenuFrame menuFrame = new MenuFrame();
         * menuFrame.setVisible(true);
         * });
         */
        MenuFrame menuFrame = new MenuFrame();
        menuFrame.setVisible(true);
    }
}
