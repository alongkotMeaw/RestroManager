package file_loader;

import java.io.*;

public class write_new_menu {

    public void write_menu(String neme, String price, String type, String photo_path) {
        String file_path = null;

        if (type.equals("Desert")) {
            file_path = "src\\restaurant_log\\menu_list\\desert_menu.txt";
        } else if (type.equals("Snack")) {
            file_path = "src\\restaurant_log\\menu_list\\snack_menu.txt";
        } else if (type.equals("Maincourse")) {
            file_path = "src\\restaurant_log\\menu_list\\maincourse_menu.txt";
        } else if (type.equals("Onedish")) {
            file_path = "src\\restaurant_log\\menu_list\\one_dish_menu.txt";
        } else if (type.equals("Drinks")) {
            file_path = "src\\restaurant_log\\menu_list\\drinks.txt";
        } else {
            System.out.println("Invalid menu type: " + type);
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file_path, true), "UTF-8"))) {
            String data = String.format("%s,%s,%d,%s", neme, price, 1, photo_path);
            writer.write(data);
            writer.newLine();
            System.out.println("Data written to file successfully: " + file_path);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error writing to file: " + file_path);
        }
    }
}
