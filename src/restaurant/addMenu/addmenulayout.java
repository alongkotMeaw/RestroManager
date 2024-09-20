package restaurant.addMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class addmenulayout extends JFrame {
    public addmenulayout() {
        setTitle("Menu Add");
        setSize(500, 500);
        // create panel
        JPanel JPanel = new JPanel();
        JButton button_add = new JButton("Add"); // botom for add new menu 1 by 1
        JPanel.add(button_add);

        // add panel
        add(JPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        // test ui

        new addmenulayout();
    }

}
