package login_page;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.beans.JavaBean;

public class LayoutLogin {

    JButton button_submit;
    JTextField inputTextField_username, inpuTextField_password;

    public LayoutLogin() {
        JFrame mainFrame = new JFrame("Login Page");
        mainFrame.setSize(750, 500);
        mainFrame.setLocationRelativeTo(null); // set log in frame center of monitor
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text_login_username = new JLabel("username");
        JLabel text_login_password = new JLabel("password");
        button_submit = new JButton("submit");
        inputTextField_username = new JTextField(16);
        inpuTextField_password = new JTextField(16);

        // add and set position to frame
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding around components
        gbc.anchor = GridBagConstraints.WEST; // Align components to the west

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(text_login_username, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(inputTextField_username, gbc);

        // Add password label and field
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(text_login_password, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(inpuTextField_password, gbc);

        // Add login button
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST; // Align the button to the east
        panel.add(button_submit, gbc);

        mainFrame.add(panel);

        // Add panel to the frame
        // mainFrame.add(panel);

        mainFrame.setVisible(true);
    }

}
