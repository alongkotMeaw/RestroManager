package login_page;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a JPanel with GridLayout
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Add username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        panel.add(usernameLabel);
        panel.add(usernameField);

        // Add password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Add submit button
        JButton submitButton = new JButton("Submit");
        panel.add(new JLabel()); // Empty label for spacing
        panel.add(submitButton);

        // Add panel to frame
        frame.add(panel);

        // Add action listener to submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                JOptionPane.showMessageDialog(frame, "Username: " + username + "\nPassword: " + password);
            }
        });

        // Display the frame
        frame.setVisible(true);
    }

}
