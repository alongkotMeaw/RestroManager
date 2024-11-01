package mainframe_material.cart;

import java.awt.Color;
import java.util.LinkedList;
import java.io.BufferedWriter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import file_loader.file_reader_cart;
import javax.swing.*;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cart_panel extends javax.swing.JPanel {

        public cart_panel() {
                initComponents();
        }

        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jButton1 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jComboBox1 = new javax.swing.JComboBox<>();
                jLabel1 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jPanel3 = new javax.swing.JPanel();
                link_Sub_panels = new LinkedList<>();

                jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);

                jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18));
                jButton1.setFont(new java.awt.Font("Sukhumvit Set", 0, 18));
                jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 18));
                jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 16));
                jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 18));
                jLabel5.setFont(new java.awt.Font("Sukhumvit Set", 0, 16));

                setPreferredSize(new java.awt.Dimension(985, 650));

                jPanel1.setBackground(new java.awt.Color(204, 204, 204));

                jButton1.setText("ออเดอร์");
                jButton1.setPreferredSize(new java.awt.Dimension(100, 35));
                jButton1.setFocusable(false);
                jButton1.setBackground(new Color(85, 124, 86));
                jButton1.setForeground(Color.white);

                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
                jLabel2.setText("ราคารวม :");

                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
                jLabel3.setText("change total_price here!");

                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
                jLabel4.setText(", โต๊ะ :");

                jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
                jLabel5.setText("โปรดเลือกหมายเลขโต๊ะ");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addGap(82, 82, 82)
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel4)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                566,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jButton1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(62, 62, 62)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel5))
                                                                .addContainerGap(223, Short.MAX_VALUE)));

                jPanel2.setBackground(new java.awt.Color(204, 204, 204));

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
                                                "14", "15" }));
                jComboBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox1ActionPerformed(evt);
                        }
                });
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                                // remove_buttonActionPerformed(evt);
                        }
                });

                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
                jLabel1.setText("หมายเลขโต๊ะ :");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jComboBox1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(15, 15, 15)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jComboBox1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel1))
                                                                .addContainerGap(14, Short.MAX_VALUE)));

                jScrollPane1.setHorizontalScrollBar(null);

                jPanel3.setLayout(null);
                jScrollPane1.setViewportView(jPanel3);
                jPanel3.getAccessibleContext().setAccessibleName("jPanel3");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jScrollPane1))
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                463,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));

                jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));
                add_Reader_adapter.menu_reader_for_panel_add("src//restaurant_log//cart_log//cart_menu.txt",
                                link_Sub_panels);
                // add panel
                for (cart_sub_panel p : link_Sub_panels) {
                        jPanel3.add(p);
                }

        }// </editor-fold>

        private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {

                if (jComboBox1.getSelectedIndex() == 0)
                        jLabel5.setText("โปรดเลือกหมายเลขโต๊ะ");
                else
                        jLabel5.setText(String.valueOf(jComboBox1.getSelectedIndex()));
        }

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                System.out.println("test");
                String filePath = "src\\restaurant_log\\user_order.txt";
                LocalDateTime currentTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy/HH:mm:ss");

                String formattedTime = currentTime.format(formatter);
                for (cart_sub_panel p : link_Sub_panels) {
                        if (p.getIndexofcart() != -1) {
                                // write to file

                                String data = String.valueOf(jComboBox1.getSelectedIndex()) + ","
                                                + p.getcatalogofcart() + ","
                                                + p.getnameofcart() + ","
                                                + p.getquatityofcart() + ","
                                                + p.getpriceofcart() + ","
                                                + formattedTime;

                                try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                                                new FileOutputStream(filePath, true), StandardCharsets.UTF_8))) {
                                        writer.write(data);
                                        writer.newLine(); //
                                } catch (IOException e) {
                                        e.printStackTrace();
                                        System.out.println("Error writing to file: " + filePath);
                                }
                        }
                }
                // delete data
                try (OutputStreamWriter writer = new OutputStreamWriter(
                                new FileOutputStream("src\\restaurant_log\\cart_log\\cart_menu.txt", false),
                                StandardCharsets.UTF_8)) {

                        System.out.println("dataclear " + filePath);
                } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("something wrong delete " + filePath);
                }

        }// GEN-LAST:event_jButton1ActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private file_reader_cart add_Reader_adapter = new file_reader_cart();
        private javax.swing.JButton jButton1;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private LinkedList<cart_sub_panel> link_Sub_panels;
        private int table_index = 0;

}
