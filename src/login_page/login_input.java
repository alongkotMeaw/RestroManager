package login_page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class login_input {

    private LayoutLogin layoutAction;
    private String user_input_username;
    private String user_input_password;
    private String user_name;
    private String password;

    public login_input(LayoutLogin inputLogin) {
        this.layoutAction = inputLogin;
        load_password_file(); // call for load

        // Create an ActionListener using a lambda expression
        layoutAction.button_submit.addActionListener(e -> {
            if (e.getSource() == layoutAction.button_submit) {
                System.out.println("user press sybmit botton");
                user_input_username = layoutAction.inputTextField_username.getText();
                user_input_password = layoutAction.inputTextField_password.getText();
                System.out.println(user_input_password + user_input_username);
                if (user_input_password.length() == 0 || user_input_username.length() == 0) { // check if input is null
                    System.out.println("user input null");
                } else if (user_input_username.equals(user_name) && user_input_password.equals(password)) {
                    System.out.println("login sucess");
                } else
                    System.out.println("wrong passs word");

            } else {
                System.out.println("Something wrong in login input action");

            }
        });
    }

    public void load_password_file() {
        Properties env = new Properties();
        String password_path = "src\\login_page\\Matrrial\\.env";

        try (FileInputStream input = new FileInputStream(password_path)) {
            env.load(input);
            user_name = env.getProperty("USERNAME");
            password = env.getProperty("PASSWORD");
            System.out.println("load password file sucess");
            System.out.println(user_name + " " + password);
        } catch (IOException f_cath) {
            System.out.println("load password file faill");
            f_cath.printStackTrace();
        }

    }
}
