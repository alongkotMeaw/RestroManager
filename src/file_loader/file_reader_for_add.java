package file_loader;

import java.io.*;
import javax.swing.*;

import mainframe_material.menu.Menu_panel_box;

public class file_reader_for_add {

    public void menu_reader_for_panel_add(String filePath, JPanel panelForAdd, String category) {

        panelForAdd.setLayout(new BoxLayout(panelForAdd, BoxLayout.Y_AXIS));
        System.out.println("file reader call by " + filePath);
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String data;
            while ((data = br.readLine()) != null) {
                String[] arrOfStr = data.split(",");

                if (arrOfStr.length == 4) {
                    String name = arrOfStr[0];
                    double price = Double.parseDouble(arrOfStr[1]);
                    int menu_status = Integer.parseInt(arrOfStr[2]);
                    String imagePath = arrOfStr[3];
                    if (menu_status == 1) {// can use is status is 1
                        panelForAdd.add(new Menu_panel_box(name, price, imagePath, category));
                        panelForAdd.add(new JSeparator());
                    } else
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
