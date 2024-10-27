package mainframe_material.cart;

import javax.swing.*;
import java.awt.*;
import file_loader.file_reader_cart;

public class cart_panel extends javax.swing.JPanel {

        public cart_panel() {
                initComponents();
        }

        private void initComponents() {
                main_cart_panel = new javax.swing.JPanel();
                cart_top_panel = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                cart_choice1 = new java.awt.Choice();
                cart_jscrollpane = new javax.swing.JScrollPane();
                cart_panel_for_add = new javax.swing.JPanel();
                order_jButton = new javax.swing.JButton();
                cart_top_panel.setBackground(new java.awt.Color(204, 204, 204));
                jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
                jLabel1.setText("หมายเลขโต๊ะ");
                main_cart_panel.setPreferredSize(new Dimension(960, 635));
                cart_jscrollpane.getVerticalScrollBar().setUnitIncrement(16);
                order_jButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
                order_jButton.setText("ออเดอร์");

                // Add options to the Choice dropdown
                for (int i = 0; i < 21; i++) {
                        cart_choice1.add("" + i);
                }

                // Layout for cart_top_panel
                javax.swing.GroupLayout cart_top_panelLayout = new javax.swing.GroupLayout(cart_top_panel);
                cart_top_panel.setLayout(cart_top_panelLayout);
                cart_top_panelLayout.setHorizontalGroup(
                                cart_top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                cart_top_panelLayout.createSequentialGroup()

                                                                                .addContainerGap(541, Short.MAX_VALUE)
                                                                                .addComponent(jLabel1)
                                                                                .addGap(42, 42, 42)
                                                                                .addComponent(cart_choice1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(31, 31, 31)));
                cart_top_panelLayout.setVerticalGroup(
                                cart_top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(cart_top_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(cart_top_panelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(cart_choice1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel1))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                // Set layout for cart_panel_for_add to BoxLayout for stacking components
                // vertically
                cart_panel_for_add.setLayout(new BoxLayout(cart_panel_for_add, BoxLayout.Y_AXIS));
                cart_panel_for_add.setPreferredSize(new Dimension(700, 1000));

                cart_jscrollpane.setHorizontalScrollBar(null);
                cart_jscrollpane.setViewportView(cart_panel_for_add);

                // Main cart panel layout/
                javax.swing.GroupLayout main_cart_panelLayout = new javax.swing.GroupLayout(main_cart_panel);
                main_cart_panel.setLayout(main_cart_panelLayout);
                main_cart_panelLayout.setHorizontalGroup(
                                main_cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cart_top_panel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(main_cart_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(cart_jscrollpane,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                704,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                main_cart_panelLayout.setVerticalGroup(
                                main_cart_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_cart_panelLayout.createSequentialGroup()
                                                                .addComponent(cart_top_panel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cart_jscrollpane,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                // Layout for the entire panel
                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(main_cart_panel));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(main_cart_panel));

                // Add Order_panel instance to cart_panel_for_add and refresh display
                add_Reader_adapter.menu_reader_for_panel_add("src//restaurant_log//cart_log//cart_menu.txt",
                                cart_panel_for_add);
                cart_panel_for_add.add(order_panel);

        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private file_reader_cart add_Reader_adapter = new file_reader_cart();
        private java.awt.Choice cart_choice1;
        private javax.swing.JScrollPane cart_jscrollpane;
        private javax.swing.JPanel cart_panel_for_add;
        private javax.swing.JPanel cart_top_panel;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel main_cart_panel;
        private javax.swing.JButton order_jButton;
        private Order_panel order_panel = new Order_panel();
        // End of variables declaration//GEN-END:variables
}
