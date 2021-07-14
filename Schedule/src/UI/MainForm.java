package UI;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {
    private JTable tableContacts;
    private JPanel rootPanel;
    private JButton addContact;
    private JButton removeContact;
    private JLabel labelContact;

    public MainForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
