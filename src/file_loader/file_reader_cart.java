package file_loader;

import java.awt.Dimension;
import java.io.*;
import java.util.LinkedList;

import javax.swing.*;
import mainframe_material.cart.cart_sub_panel;

public class file_reader_cart {

    public void menu_reader_for_panel_add(String filePath, JPanel panelForAdd) {
        // int index_of_panel = 0;

        panelForAdd.setLayout(new BoxLayout(panelForAdd, BoxLayout.Y_AXIS));
        System.out.println("file reader call by " + filePath);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String data;
            while ((data = br.readLine()) != null) {
                String[] arrOfStr = data.split(",");

                if (arrOfStr.length == 4) {
                    String catalog = arrOfStr[0];
                    String name = arrOfStr[1];
                    double price = Double.parseDouble(arrOfStr[2]);
                    int quatity = Integer.parseInt(arrOfStr[3]);
                    cart_sub_panel cart_panel = new cart_sub_panel(name, price, quatity, catalog);
                    cart_panel.setMinimumSize(new Dimension(996, 50));
                    cart_panel.setMaximumSize(new Dimension(996, 50));
                    cart_panel.setPreferredSize(new Dimension(996, 50));
                    panelForAdd.add(cart_panel);
                    panelForAdd.add(new JSeparator());
                    // sub_panel_link.add(cart_panel);
                } else {
                    System.err.println("Invalid data format: " + data);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("load eror " + filePath);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }

    public void mewnu_add() {
    };

}
