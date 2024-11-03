package file_loader;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;

import mainframe_material.cart.cart_sub_panel;

public class file_reader_cart {

    public void menu_reader_for_panel_add(String filePath, LinkedList<cart_sub_panel> link_Sub_panels) {
        System.out.println("File reader called for " + filePath);

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String data;
            int index_of_cart = 1;
            while ((data = br.readLine()) != null) {
                String[] arrOfStr = data.split(",");

                if (arrOfStr.length == 4) {
                    try {
                        String catalog = arrOfStr[0];
                        String name = arrOfStr[1];
                        double price = Double.parseDouble(arrOfStr[2]);
                        int quantity = Integer.parseInt(arrOfStr[3]);
                        cart_sub_panel cart_panel = new cart_sub_panel(name, price, quantity, catalog, index_of_cart);
                        index_of_cart++;
                        link_Sub_panels.add(cart_panel);
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number format in line: " + data + " - " + e.getMessage());
                    }
                } else {
                    System.err.println("Invalid data format: " + data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Load error: " + filePath);
        }
    }
}
