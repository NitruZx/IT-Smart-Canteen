package LoginPage;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.event.*;


public class SignPageController implements ActionListener {
    private SignUpGUI signUpGUI;
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
            String name = signUpGUI.nameField.getText(), pass1 = String.valueOf(signUpGUI.passField1.getPassword()),
                    pass2 = String.valueOf(signUpGUI.passField2.getPassword());
            String email = signUpGUI.emailField.getText();
            if (pass1.equals(pass2)) {
                signUpPageModel.getUserInfo().setName(name);
                signUpPageModel.getUserInfo().setPassword(pass1);
                signUpPageModel.getUserInfo().setEmail(email);
                if (signUpPageModel.writeObject(name)) {
                    JOptionPane.showOptionDialog(null, "Success", "SignUP", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                    new Main();
                    signUpGUI.frame.dispose();
                }
            }
        } else if (e.getSource().equals(signUpGUI.backBtn)) {
            new Main();
            signUpGUI.frame.dispose();
        }
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
