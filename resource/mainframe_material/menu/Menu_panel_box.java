package mainframe_material.menu;

import java.io.*;
import javax.swing.*;

import java.awt.*;
import java.nio.charset.StandardCharsets;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author meama
 */
public class Menu_panel_box extends javax.swing.JPanel {

    private String menu_name;
    private double menu_price;
    private String menu_photopath;
    private String menu_type;
    /**
     * Creates new form Menu_panel_box
     */
    private int puatity = 0;

    public Menu_panel_box(String menu_name, double menu_price, String menu_photopath, String menu_type) {
        this.menu_name = menu_name;
        this.menu_price = menu_price;
        this.menu_photopath = menu_photopath;
        this.menu_type = menu_type;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        plus_jButton = new javax.swing.JButton();
        minus_jButton = new javax.swing.JButton();
        jLabel_menu_name = new javax.swing.JLabel();
        jLabel_menu_photo = new javax.swing.JLabel();
        order_jButton = new javax.swing.JButton();
        jLabel_menu_price = new javax.swing.JLabel();
        jLabel_alert = new javax.swing.JLabel();

        jButton3.setText("order");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setPreferredSize(new java.awt.Dimension(680, 160));
        setBackground(new Color(244, 243, 242));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setEditable(false);
        jTextField1.setFocusable(false);
        jTextField1.setText("0");
        jTextField1.setFont(new java.awt.Font("Sukhumvit Set", 0, 16));
        jTextField1.setBackground(new Color(255, 255, 255));

        plus_jButton.setText("-");
        plus_jButton.setFocusable(false);
        plus_jButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 16));
        plus_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minus_jButtonActionPerformed(evt);
            }
        });

        minus_jButton.setText("+");
        minus_jButton.setFocusable(false);
        minus_jButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 16));
        minus_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plus_jButtonActionPerformed(evt);
            }
        });

        jLabel_menu_name.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
        jLabel_menu_name.setText(menu_name);
        try {
            jLabel_menu_photo.setBackground(new java.awt.Color(153, 204, 0));

            // Attempt to load the image
            java.net.URL imgURL = getClass().getResource(menu_photopath);
            if (imgURL != null) {
                // jLabel_menu_photo.setIcon(new javax.swing.ImageIcon(imgURL)); // NOI18N
                // image resize
                Image originalImage = new ImageIcon(imgURL).getImage();
                Image resizedImage = originalImage.getScaledInstance(135, 120, Image.SCALE_SMOOTH); // Width: 100px,
                                                                                                    // Height: 100px
                jLabel_menu_photo.setIcon(new ImageIcon(resizedImage)); // Set resized image as icon

            } else {
                System.out.println("Image not found at path: " + menu_photopath);
            }
        } catch (Exception e) {
            System.out.println("Error loading menu photo for " + menu_name + ": " + e.getMessage());
        }

        order_jButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 18)); // NOI18N
        order_jButton.setText("เพิ่ม");
        order_jButton.setFocusable(false);
        order_jButton.setBackground(new Color(85, 124, 86));
        order_jButton.setForeground(Color.white);
        order_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_jButtonActionPerformed(evt);
            }
        });

        jLabel_menu_price.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
        jLabel_menu_price.setText("" + menu_price);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel_menu_photo)
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel_menu_name)
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel_menu_price))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(plus_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(minus_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156,
                                        Short.MAX_VALUE)
                                .addComponent(order_jButton)
                                .addGap(59, 59, 59)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel_menu_name)
                                                        .addComponent(jLabel_menu_price))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(plus_jButton)
                                                        .addComponent(minus_jButton)
                                                        .addComponent(order_jButton)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel_menu_photo)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    private void plus_jButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_plus_jButtonActionPerformed
        if (puatity < 99) {
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
            ;
            puatity++;
            jTextField1.setText("" + puatity);
        }
    }// GEN-LAST:event_plus_jButtonActionPerformed

    private void minus_jButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_minus_jButtonActionPerformed
        if (puatity > 0) {
            if (puatity == 1) {
                jTextField1.setBorder(BorderFactory.createEmptyBorder());
            }
            puatity--;
            jTextField1.setText("" + puatity);
        }
        // TODO add your handling code here:
    }// GEN-LAST:event_minus_jButtonActionPerformed

    private void order_jButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_order_jButtonActionPerformed
        /// write to file of cart
        if (puatity > 0) {

            jLabel_alert.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
            jLabel_alert.setText(puatity + " x " + menu_name + " ถูกเพิ่มไปที่รถเข็น");
            JOptionPane.showMessageDialog(null, jLabel_alert, "items added", JOptionPane.INFORMATION_MESSAGE);

            // read file for check
            int line_edit = 0;
            String filePath = "resource\\restaurant_log\\cart_log\\cart_menu.txt";
            Boolean check_menu = true;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"),
                    8192)) {
                String data;
                while ((data = br.readLine()) != null) {
                    String[] arrOfStr = data.split(",");
                    String name = arrOfStr[1];
                    System.out.println("check by " + name + " menu name " + menu_name);
                    if (name.equals(menu_name)) {
                        System.out.println("dwa");
                        check_menu = false;
                        break;
                    }
                    line_edit++;

                }

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("load eror " + filePath);
            }

            /// write file to cart file
            if (check_menu) {
                try (BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("resource\\restaurant_log\\cart_log\\cart_menu.txt", true),
                                StandardCharsets.UTF_8))) {
                    System.out.println("user order" + menu_type + ',' + menu_name + ',' + menu_price + ',' + puatity);
                    writer.write(menu_type + ',' + menu_name + ',' + menu_price + ',' + puatity + "\n");
                    System.out.println("File written successfully!");
                } catch (IOException e) {
                    System.out.println("Error writing to file: " + e.getMessage());
                }
            } else {

                String inputFilePath = "resource\\restaurant_log\\cart_log\\cart_menu.txt",
                        outputFilePath = "resource\\restaurant_log\\cart_log\\cart_temp.txt";
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(new FileInputStream(inputFilePath), StandardCharsets.UTF_8));
                        BufferedWriter writer = new BufferedWriter(
                                new OutputStreamWriter(new FileOutputStream(outputFilePath), StandardCharsets.UTF_8))) {
                    String line;

                    // write to temp
                    while ((line = reader.readLine()) != null) {
                        String[] arrOfStr = line.split(",");
                        String name = arrOfStr[1];
                        if (name.equals(menu_name)) {
                            double price = Double.parseDouble(arrOfStr[2]);
                            int quantity = Integer.parseInt(arrOfStr[3]);
                            quantity = quantity + puatity;
                            line = menu_type + ',' + name + ',' + price + ',' + quantity;
                        }
                        // System.out.println(line);
                        writer.write(line);
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                inputFilePath = "resource\\restaurant_log\\cart_log\\cart_temp.txt";
                outputFilePath = "resource\\restaurant_log\\cart_log\\cart_menu.txt";
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(new FileInputStream(inputFilePath), StandardCharsets.UTF_8));
                        BufferedWriter writer = new BufferedWriter(
                                new OutputStreamWriter(new FileOutputStream(outputFilePath, false),
                                        StandardCharsets.UTF_8))) {

                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine();
                        // System.out.println("end");
                        System.out.println(line);
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

        // TODO add your handling code here:
    }// GEN-LAST:event_order_jButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//
        // GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel_menu_name;
    private javax.swing.JLabel jLabel_menu_photo;
    private javax.swing.JLabel jLabel_menu_price;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minus_jButton;
    private javax.swing.JButton order_jButton;
    private javax.swing.JButton plus_jButton;
    private javax.swing.JLabel jLabel_alert;
    // End of variables declaration//GEN-END:variables
}
