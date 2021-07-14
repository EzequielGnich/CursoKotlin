package UI;

import javax.swing.*;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField textField1;
    private JTextField textPhone;
    private JButton cancel;
    private JButton saveContact;

    public ContactForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);
    }
}
