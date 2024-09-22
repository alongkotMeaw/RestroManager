package Main_program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBlock extends JPanel {

    private JLabel imageLabel;
    private JLabel nameLabel;
    private JButton minusButton;
    private JButton plusButton;
    private JTextField quantityField;
    private JButton orderButton;
    private int quantity = 0;

    public MenuBlock(String foodName, String imagePath) {
        setLayout(new BorderLayout());

        JPanel imagePanel = new JPanel();
        ImageIcon imageIcon = new ImageIcon(imagePath);

        Image image = imageIcon.getImage();
        Image scaledImage = image.getScaledInstance(270, 100, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(scaledImage);

        imageLabel = new JLabel(imageIcon);

        imagePanel.add(imageLabel);

        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));

        JPanel quantity_name = new JPanel();
        nameLabel = new JLabel("Menu : " + foodName);
        quantity_name.add(nameLabel);

        JPanel quantityPanel = new JPanel();
        minusButton = new JButton("-");
        plusButton = new JButton("+");
        orderButton = new JButton("Order");
        quantityField = new JTextField(String.valueOf(quantity), 1);
        //
        quantityField.setHorizontalAlignment(JTextField.CENTER);
        quantityField.setEditable(false); /// not indit by key board
        quantityPanel.add(minusButton);
        quantityPanel.add(quantityField);
        quantityPanel.add(plusButton);
        // quantityField.setHorizontalAlignment(JTextField.RIGHT);
        quantityPanel.add(orderButton);

        infoPanel.add(quantity_name);
        infoPanel.add(quantityPanel);
        // infoPanel.add(orderButton);

        add(imagePanel, BorderLayout.WEST);
        add(infoPanel, BorderLayout.CENTER);

        // Add action listeners to the buttons
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (quantity > 0) {
                    quantity--;
                    quantityField.setText(String.valueOf(quantity));
                }
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quantity++;
                quantityField.setText(String.valueOf(quantity));
            }
        });

        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /// save order in file or do some thing

                JOptionPane.showMessageDialog(null, "You ordered " + quantity + " of " + foodName);
            }
        });
    }
}
