package login_page;

import javax.swing.*;
import java.awt.*;

public class LayoutLogin extends JFrame {

    JButton button_submit;
    JTextField inputTextField_username, inputTextField_password;

    public LayoutLogin() {
        setTitle("Login page");
        setSize(750, 500);
        setLocationRelativeTo(null); // set log in frame center of monitor
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel text_login_username = new JLabel("Username:");
        JLabel text_login_password = new JLabel("Password:");
        button_submit = new JButton("Submit");
        inputTextField_username = new JTextField(16);
        inputTextField_password = new JTextField(16);

        // Create a panel with a background image
        JPanel set_background_JPanel = new JPanel() {
            private Image backgroundImage = new ImageIcon(
                    "src/login_page/Matrrial/image.png").getImage();

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this); // Draw the image to fill the panel
            }
        };
        set_background_JPanel.setLayout(new GridBagLayout()); // Set layout to the background panel
        GridBagConstraints con = new GridBagConstraints();
        // con.insets = new Insets(5, 5, 5, 5); //

        // Add username label and text field
        con.gridx = 0;
        con.gridy = 0;
        con.anchor = GridBagConstraints.WEST;
        set_background_JPanel.add(text_login_username, con);

        con.gridx = 1;
        con.gridy = 0;
        con.anchor = GridBagConstraints.EAST;
        set_background_JPanel.add(inputTextField_username, con);

        // Add password label and text field
        con.gridx = 0;
        con.gridy = 1;
        con.anchor = GridBagConstraints.WEST;
        set_background_JPanel.add(text_login_password, con);

        con.gridx = 1;
        con.gridy = 1;
        con.anchor = GridBagConstraints.EAST;
        set_background_JPanel.add(inputTextField_password, con);

        // Add login button
        con.gridx = 1;
        con.gridy = 2;
        con.anchor = GridBagConstraints.EAST;
        set_background_JPanel.add(button_submit, con);

        // Add background panel to the frame
        add(set_background_JPanel);

        setVisible(true);
    }

}
