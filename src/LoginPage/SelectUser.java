package LoginPage;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SelectUser extends LoginGUI{
    protected JPanel centralPanel, subPanel1, subPanel2, subPanel3;
    protected JButton logBut;
    protected JLabel headText;
    protected JComboBox selectBox;
    protected String[] userType = {"Client", "Trader"};
    public SelectUser() {
        super();
        createPanel();
        frame.setVisible(true);
    }
    protected void createPanel() {
        centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout(3, 1));
        centralPanel.setBorder(new EmptyBorder(150, 60, 150, 60));

        subPanel1 = new JPanel();
        subPanel2 = new JPanel();
        subPanel3 = new JPanel();

        headText = new JLabel("Select User");
        subPanel1.add(headText);
        centralPanel.add(subPanel1);

        selectBox = new JComboBox(userType);
        this.subPanel3.add(selectBox);
        centralPanel.add(this.subPanel3);

        logBut = new JButton("Login");
        subPanel2.add(logBut);
        centralPanel.add(this.subPanel2);

        frame.add(centralPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new SelectUser();
    }
}
