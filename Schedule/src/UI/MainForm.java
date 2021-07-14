package UI;

import javax.swing.*;

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
    }
}
