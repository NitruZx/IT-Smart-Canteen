package LoginPage;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SignUpGUI {
    public JFrame frame;
    public JLabel nameLabel, passLabel1, passLabel2, emailLabel, registerText;
    public JTextField nameField, emailField;
    public JPasswordField passField1, passField2;
    private JPanel mainPanel, topPanel, emptyPane, btnPanel;
    public JButton signupBtn, backBtn;
    public SignUpGUI() {
        frame = new JFrame("Sign-Up");
        frame.setLayout(new BorderLayout());
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 2));
        mainPanel.setBorder(new EmptyBorder(40, 10, 200, 80));
        topPanel = new JPanel();
        topPanel.setLayout(new GridBagLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.setPreferredSize(new Dimension(400, 100));
        emptyPane = new JPanel();

        registerText = new JLabel("Register");
        nameLabel = new JLabel("Username : ", JLabel.RIGHT);
        passLabel1 = new JLabel("Password : ", JLabel.RIGHT);
        passLabel2 = new JLabel("Confirm Password : ", JLabel.RIGHT);
        emailLabel = new JLabel("Email : ", JLabel.RIGHT);

        nameField = new JTextField();
        emailField = new JTextField();
        passField1 = new JPasswordField();
        passField2 = new JPasswordField();



        registerText.setFont(registerText.getFont().deriveFont(30f));
        registerText.setForeground(new Color(57, 58, 58));

        signupBtn = new JButton("Create Account");
        backBtn = new JButton("Back");
        backBtn.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

        btnPanel = new JPanel();
        btnPanel.setBorder(new EmptyBorder(0, 0, 20, 0));
        btnPanel.add(signupBtn);

        mainPanel.add(nameLabel);mainPanel.add(nameField);
        mainPanel.add(passLabel1);mainPanel.add(passField1);
        mainPanel.add(passLabel2);mainPanel.add(passField2);
        mainPanel.add(emailLabel);mainPanel.add(emailField);
        mainPanel.add(emptyPane);mainPanel.add(btnPanel);

        topPanel.add(registerText);

        frame.add(backBtn, BorderLayout.SOUTH);
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);

//        SignPageController control = new SignPageController();
//        backBtn.addActionListener(control);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

//    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(new FlatMacLightLaf());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        new SignUpGUI();
//    }

    public JButton getBackBtn() {
        return backBtn;
    }
    public JFrame getFrame() {
        return frame;
    }
}
