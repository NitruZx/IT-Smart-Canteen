package LoginPage;

import ian.CtmPasswordField;
import ian.CustomField;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SellerPanel {
    private JPanel centerMain, buttPanel, textPanel, emptyPanel;
    private JButton loginButt;
    private CustomField username;
    private CtmPasswordField password;
    private Color color = new Color(145, 3, 216);
//    private JTextField username, password;
    public SellerPanel() {
        centerMain = new JPanel();
        centerMain.setLayout(new GridLayout(3, 1));

        textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(2, 1));
//        emptyPanel = new JPanel();
        buttPanel = new JPanel();

        username = new CustomField();
        password = new CtmPasswordField();
        username.setLabelText("Admin user");username.setLineColor(color);username.setSelectionColor(new Color(188, 142, 218));
        password.setLabelText("Password");password.setLineColor(color);password.setSelectionColor(new Color(188, 142, 218));

//        username = new JTextField("Enter-Owner-ID");
//        username.setForeground(Color.GRAY);
//        password = new JPasswordField("Password");
//        password.setForeground(Color.GRAY);

//        username.setBorder(BorderFactory.createTitledBorder("OwnerID"));
//        password.setBorder(BorderFactory.createTitledBorder("Password"));

        loginButt = new JButton("Login");
        buttPanel.add(loginButt);
        textPanel.setBorder(new EmptyBorder(10, 30, 10, 30));
        textPanel.add(username);textPanel.add(password);

//        centerMain.add(emptyPanel);
        centerMain.add(textPanel);centerMain.add(buttPanel);
        centerMain.setBorder(new EmptyBorder(80, 60, 20, 60));

//        username.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                if (username.getText().equals("Enter-Owner-ID")) {
//                    username.setText("");
//                    username.setForeground(Color.BLACK);
//                }
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                if (username.getText().isEmpty()) {
//                    username.setForeground(Color.GRAY);
//                    username.setText("Enter-Owner-ID");
//                }
//            }
//        });
//        password.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                if (password.getText().equals("Password")) {
//                    password.setText("");
//                    password.setForeground(Color.BLACK);
//                }
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                if (password.getText().isEmpty()) {
//                    password.setForeground(Color.GRAY);
//                    password.setText("Password");
//                }
//            }
//        });
    }

    public JPanel getCenterMain() {
        return centerMain;
    }
}
