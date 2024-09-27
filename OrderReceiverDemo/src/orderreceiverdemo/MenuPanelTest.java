package orderreceiverdemo;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class MenuPanelTest extends JFrame {

    public MenuPanelTest() {
        setTitle("Order Receiver Demo");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        for (int i = 0; i < 5; i++) {
            menu_panel panel = new menu_panel("mama", "200", "past_not_use");
            add(panel);
        }
        setSize(1000, 1000);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ensure the GUI is created on the Event Dispatch Thread
        new MenuPanelTest();
    }
}
