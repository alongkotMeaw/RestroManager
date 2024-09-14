package login_page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class login_input {

    private LayoutLogin layoutAction;

    public login_input(LayoutLogin inputLogin) {
        this.layoutAction = inputLogin;

        // Create an ActionListener using a lambda expression
        layoutAction.button_submit.addActionListener(e -> {
            if (e.getSource() == layoutAction.button_submit) {
                System.out.println("You pressed submit");
            } else {
                System.out.println("Something wrong in login input action");
            }
        });
    }
}
