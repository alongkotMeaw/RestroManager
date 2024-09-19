package order;

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

import login_page.Main_login;

public class order_layout extends JFrame {
    public order_layout(String order_titleString) {
        super(order_titleString);
        setSize(750, 500);
        setLocationRelativeTo(null); // set log in frame center of monitor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // menu now dont have choice think talk about is later
        // *************************** inprogress ********************///
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu editMenu = new JMenu("Menu");
        editMenu.setBorder(new LineBorder(Color.gray, 2)); // color ||Thickness
        menuBar.add(editMenu);
        //////////////////////////////////////////////////////////////////
        JMenu count_item = new JMenu("Cart(0)");
        count_item.setBorder(new LineBorder(Color.gray, 2));
        menuBar.add(count_item);

        JMenu total_item = new JMenu("Table No: 10");
        total_item.setBorder(new LineBorder(Color.gray, 2));
        // set null box in midle
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(total_item);

        /// end menu ///////////////////////////////
        ////////////////////////// in progress //////////////////////
        /*
         * JPanel menu_panel = new JPanel();
         * menu_panel.setLayout(new GridLayout(0, 1));
         * 
         * // create left panel
         * for (int i = 0; i < 3; i++) {
         * JPanel leftPanel = new JPanel();
         * leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
         * leftPanel.add(new JButton("Button 1 - " + (i + 1)));
         * leftPanel.setBackground(Color.BLACK);
         * leftPanel.setPreferredSize(new Dimension(300, 200));
         * menu_panel.add(leftPanel);
         * }
         * 
         * // creatw right panel
         * JPanel rightPanel = new JPanel();
         * rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
         * rightPanel.add(new JButton("Button 2"));
         * rightPanel.setBackground(Color.white);
         * 
         * // add and set size
         * add(leftPanel, BorderLayout.WEST);
         * add(rightPanel, BorderLayout.EAST);
         * 
         * // Add panel to JScrollPane
         * JScrollPane scroll_pane = new JScrollPane(menu_panel);
         * // Add JScrollPane
         * add(scroll_pane);// add scrooll
         */
        setVisible(true);
    }

    public static void main(String[] args) {
        new order_layout("test");
    }

}