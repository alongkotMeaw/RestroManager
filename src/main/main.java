/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import mainframe_material.menu.*;
import mainframe_material.cart.*;
import mainframe_material.add.remove.add_remove_panel;
import mainframe_material.sumary.sumary_panel;

/**
 *
 * @author meama
 */

public class Main extends javax.swing.JFrame {
    
    /**
     * Creates new form main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("lib/SukhumvitSet-Light.ttf")));
        } catch (Exception e) {

        }
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        main_panel = new javax.swing.JTabbedPane();
        main_menu_panel = new javax.swing.JPanel();
        main_cart_panel = new javax.swing.JPanel();
        main_addremove_panel = new javax.swing.JPanel();
        main_Summary_panel = new javax.swing.JPanel();

        jScrollPane6.setHorizontalScrollBar(null);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 678, Short.MAX_VALUE));
        jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 427, Short.MAX_VALUE));

        jScrollPane6.setViewportView(jPanel15);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_panel.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
        setBackground(new Color(244, 243, 242));
        setSize(1000, 700);
        setPreferredSize(new Dimension(1000, 700));
        main_panel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // TODO Auto-generated method stub
                if (((JTabbedPane) e.getSource()).getSelectedIndex() == 0) {
                    main_menu_panel.removeAll();
                    main_menu_panel.add(new menu());
                }
            }
        });

        setResizable(false);
        setTitle("Order Receiver 0.1a");
        try {
            ImageIcon iconImage = new ImageIcon("src\\ImageFolder\\stack-overflow.png");
            Image icon = iconImage.getImage();
            setIconImage(icon);
        } catch (Exception e) {

        }

        main_panel.addTab("เมนู", main_menu_panel);

        main_cart_panel.add(new cart_panel());
        main_panel.addTab("รถเข็น", main_cart_panel);

        main_addremove_panel.add(new add_remove_panel());
        main_panel.addTab("เพิ่ม/ลบ", main_addremove_panel);

        main_Summary_panel.add(new sumary_panel());
        main_panel.addTab("สรุปยอด", main_Summary_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(main_panel));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(main_panel));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            new Main().setVisible(true);
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel main_Summary_panel;
    private javax.swing.JPanel main_addremove_panel;
    private javax.swing.JPanel main_cart_panel;
    private javax.swing.JPanel main_menu_panel;
    private javax.swing.JTabbedPane main_panel;
    // End of variables declaration//GEN-END:variables

}
