package LoginPage;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import ian.CtmPasswordField;
import ian.CustomField;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class SignUpGUI {
    public JFrame frame;
    public JLabel registerText;
    public CustomField nameField, emailField;
    public CtmPasswordField passField1, passField2;
    private JPanel mainPanel, topPanel, btnPanel;
    public JButton signupBtn, backBtn;
    public SignUpGUI() {
        frame = new JFrame("Sign-Up");
        frame.setLayout(new BorderLayout());
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 1));
        mainPanel.setBorder(new EmptyBorder(40, 40, 150, 40));
        topPanel = new JPanel();
        topPanel.setLayout(new GridBagLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        topPanel.setPreferredSize(new Dimension(400, 100));

        registerText = new JLabel("Register");

        nameField = new CustomField();
        emailField = new CustomField();
        passField1 = new CtmPasswordField();
        passField2 = new CtmPasswordField();

        nameField.setLabelText("Username (at least 4 character)");emailField.setLabelText("Email");
        passField1.setLabelText("Password (at least 6 character)");passField2.setLabelText("Confirm Password");

        mainPanel.add(nameField);mainPanel.add(emailField);mainPanel.add(passField1);mainPanel.add(passField2);

        registerText.setFont(registerText.getFont().deriveFont(30f));
        registerText.setForeground(new Color(57, 58, 58));

        signupBtn = new JButton("Create Account");
        backBtn = new JButton("Back");
        backBtn.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 10));

        btnPanel = new JPanel();
        btnPanel.setBorder(new EmptyBorder(10, 0, 20, 0));
        btnPanel.add(signupBtn);

        mainPanel.add(btnPanel);

        topPanel.add(registerText);

        frame.add(backBtn, BorderLayout.SOUTH);
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }
}
