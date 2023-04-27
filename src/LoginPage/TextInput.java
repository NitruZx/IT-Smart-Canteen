package LoginPage;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.HashMap;
import javax.swing.border.EmptyBorder;

public class TextInput extends LoginGUI{
    protected JLabel testtext;
    protected JTextField nameField;
    protected JPasswordField passField;
    protected JButton logBut, createBut;
    protected JPanel subPanel2, subPanel3, centralP, textP1, textP2;
    public TextInput(HashMap<String, String> originInfo) {
//        initiateGUI();
        super(originInfo);
        createInput(originInfo);
        frame.setVisible(true);
    }
    protected void createInput(HashMap<String, String> originInfo) {
        loginInfo = originInfo;
        centralP = new JPanel();
        centralP.setLayout(new GridLayout(3, 1));
        subPanel1 = new JPanel();
        subPanel2 = new JPanel();
        subPanel2.setLayout(new GridLayout(2,1));
        subPanel3 = new JPanel();


        testtext = new JLabel("test");
        testtext.setBounds(50, 50, 50, 50);
        frame.add(testtext);

        textP1 = new JPanel();
        textP2 = new JPanel();

        nameField = new JTextField("Enter Student-ID");
        nameField.setForeground(Color.GRAY);
        passField = new JPasswordField("Password");
        passField.setForeground(Color.GRAY);
        subPanel2.setBorder(new EmptyBorder(10, 10, 10, 10));
        nameField.setBorder(BorderFactory.createTitledBorder("Student-ID"));
        passField.setBorder(BorderFactory.createTitledBorder("Password"));
//        textP1.setBorder(BorderFactory.createTitledBorder("Student-ID"));
//        textP1.add(nameField);
//        textP2.setBorder(BorderFactory.createTitledBorder("Password"));
//        textP2.add(passField);

        subPanel2.add(nameField);
        subPanel2.add(passField);

        logBut = new JButton("Login");
        subPanel3.add(logBut);
        createBut = new JButton("Create Account");
        createBut.setBorder(new EmptyBorder(0, 10, 5, 10));

        centralP.add(subPanel1);centralP.add(subPanel2);centralP.add(subPanel3);
        centralP.setSize(200, 300);
        frame.add(centralP, BorderLayout.CENTER);frame.add(createBut, BorderLayout.SOUTH);
        centralP.setBorder(new EmptyBorder(80, 60, 20, 60));
        nameField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (nameField.getText().equals("Enter Student-ID")) {
                    nameField.setText("");
                    nameField.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (nameField.getText().isEmpty()) {
                    nameField.setForeground(Color.GRAY);
                    nameField.setText("Enter Student-ID");
                }
            }
        });
        passField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (passField.getText().equals("Password")) {
                    passField.setText("");
                    passField.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (passField.getText().isEmpty()) {
                    passField.setForeground(Color.GRAY);
                    passField.setText("Password");
                }
            }
        });
        logBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == logBut) {
                    String userID = nameField.getText();
                    String password = String.valueOf(passField.getPassword());
                    if (loginInfo.containsKey(userID)) {
                        if (loginInfo.get(userID).equals(password)) {
                            testtext.setForeground(Color.GREEN);
                            testtext.setText("Success");
                        } else {
                            testtext.setForeground(Color.RED);
                            testtext.setText("Wrong Password");
                        }
                    } else {
                        testtext.setForeground(Color.YELLOW);
                        testtext.setText("Name not Found");
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserInfo userInfo = new UserInfo();
        new TextInput(userInfo.getLoginfo());
    }
}
