package file_loader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import mainframe_material.add.remove.add_remove_panel;
import mainframe_material.add.remove.remove_sup_panal;

public class file_reader_for_remove_panal {

    public static void reader(String file_path, LinkedList<remove_sup_panal> supanel, add_remove_panel main,
            String menu_type) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file_path), "UTF-8"),
                8192)) {
            String data;
            int menu_index = 0;

            while ((data = br.readLine()) != null) {
                String[] arrOfStr = data.split(",");

                if (arrOfStr.length == 4) {
                    String name = arrOfStr[0];
                    double price = Double.parseDouble(arrOfStr[1]);
                    int menu_status = Integer.parseInt(arrOfStr[2]);
                    String imagePath = arrOfStr[3];
                    remove_sup_panal p = new remove_sup_panal(name, price, menu_status, menu_index, main, menu_type,
                            imagePath);
                    menu_index++;
                    supanel.add(p);

                    // panelForAdd.add(new Menu_panel_box(name, price, imagePath, category));
                    // panelForAdd.add(new JSeparator());

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("load eror " + file_path);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }

    }
}
