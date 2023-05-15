package LoginPage;

import Database.DB;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class SignPageController implements ActionListener {
    private SignUpGUI signUpGUI;
    public UserInfo user;
    private SignUpPageModel signUpPageModel;

    public SignPageController() {
        signUpGUI = new SignUpGUI();
        signUpPageModel = new SignUpPageModel();
        signUpGUI.signupBtn.addActionListener(this);
        signUpGUI.backBtn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpGUI.signupBtn) {
            registerUser();
        } else if (e.getSource().equals(signUpGUI.backBtn)) {
            new Main();
            signUpGUI.frame.dispose();
        }
    }

    private void registerUser() {
        String name = signUpGUI.nameField.getText();
        String email = signUpGUI.emailField.getText();
        String password = String.valueOf(signUpGUI.passField1.getPassword());
        String password2 = String.valueOf(signUpGUI.passField2.getPassword());

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || password2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields", "Sign-up", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (name.length() < 4) {
            JOptionPane.showMessageDialog(null, "Username must at least 4 character!!!", "Sign-up", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (password.length() < 6) {
            JOptionPane.showMessageDialog(null, "Password must at least 6 character!!!", "Sign-up", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!password.equals(password2)) {
            JOptionPane.showMessageDialog(null, "Comfirm password does not match", "Sign-up", JOptionPane.ERROR_MESSAGE);
            return;
        }

        user = addUserToDB(name, email, password);
        if (user != null) {
            JOptionPane.showMessageDialog(null, "Create Account Success!", "Success", JOptionPane.PLAIN_MESSAGE);
        } else {
            System.out.println("Failed to create account");
        }
    }

    private UserInfo addUserToDB(String name, String email, String password) {
        UserInfo user = null;
        try {
            Connection conn = DB.mycon();
            PreparedStatement pst = conn.prepareStatement(" SELECT * FROM logindatabase WHERE Name=? LIMIT 1");
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            if (!rs.next()) {
                Statement stmt = conn.createStatement();
                String sql = "INSERT INTO logindatabase (Name, Email, Password) VALUES (?, ?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, password);

                int addedRows = preparedStatement.executeUpdate();
                if (addedRows > 0) {
                    user = new UserInfo();
                    user.setName(name);
                    user.setEmail(email);
                    user.setPassword(password);
                }

                stmt.close();
                conn.close();
            } else {
                JOptionPane.showMessageDialog(null, "Username already exists!", "Sign-up", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new SignPageController();
    }


}
