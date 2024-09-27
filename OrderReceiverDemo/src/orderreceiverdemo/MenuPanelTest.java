package orderreceiverdemo;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MenuPanelTest extends JFrame {

    public MenuPanelTest() {

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        for (int i = 0; i < 5; i++) {
            menu_panel panel = new menu_panel("mama", "200", "past_not_use");// op of panel
            mainPanel.add(panel);// add main panel of fraim
        }

        add(mainPanel);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        new MenuPanelTest();
    }
}
