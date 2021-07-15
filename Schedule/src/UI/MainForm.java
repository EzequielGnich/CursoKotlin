package UI;

import business.ContactBusiness;
import entity.ContactEntity;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame {
    private JTable tableContacts;
    private JPanel rootPanel;
    private JButton addContact;
    private JButton removeContact;
    private JLabel labelContactCount;

    private ContactBusiness mContactBusiness;
    private String mName = "";
    private String mPhone = "";

    public MainForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - getSize().width / 2, dim.height / 2 - getSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mContactBusiness = new ContactBusiness();

        setListeners();
        loadContacts();
    }

    private void loadContacts() {
        List<ContactEntity> contactList = mContactBusiness.getContactList();

        String[] columnsNames = {"Nome", "Telefone", "Ações"};

        DefaultTableModel model = new DefaultTableModel(new Object[0][0][0], columnsNames);

        for (ContactEntity contact : contactList) {
            Object[] o = new Object[3];

            o[0] = contact.getName();
            o[1] = contact.getPhone();

            model.addRow(o);
        }

        tableContacts.clearSelection();
        tableContacts.setModel(model);
    }

    private void setListeners() {
        addContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ContactForm();
                dispose();
            }
        });

        tableContacts.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    if (tableContacts.getSelectedRow() != -1) {
                        mName = tableContacts.getValueAt(tableContacts.getSelectedRow(), 0).toString();
                        mPhone = tableContacts.getValueAt(tableContacts.getSelectedRow(), 1).toString();
                    }
                }
            }
        });

        removeContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    mContactBusiness.deleteContact(mName, mPhone);
                    loadContacts();

                    mName = "";
                    mPhone = "";
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(new JFrame(), err.getMessage());
                }
            }
        });


    }
}
