package LoginPage;

import MainPage.SideBar;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class LoginController implements ActionListener,  MouseListener {
    private LoginGUI loginGUI;
    private LoginModel loginModel;
    public LoginController() {
        loginGUI = new LoginGUI();
        loginModel = new LoginModel();

        //MouseListener
        loginGUI.logBut.addMouseListener(this);
        loginGUI.createBut.addMouseListener(this);

        //ActionListener
        loginGUI.logBut.addActionListener(this);
        loginGUI.createBut.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginGUI.logBut) {
            String name = loginGUI.nameField.getText();
            String password = String.valueOf(loginGUI.passField.getPassword());
            if (loginModel.readObject(name)) {
                if (loginModel.getUserInfo().getPassword().equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login Success", "Login", JOptionPane.PLAIN_MESSAGE);
                    new SideBar();
                    loginGUI.frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "wrong password", "Login", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username not Found", "Login", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == loginGUI.createBut) {
            new SignPageController();
            loginGUI.getFrame().dispose();
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == loginGUI.logBut || e.getSource() == loginGUI.createBut)
            ((JButton)e.getSource()).setBackground(new Color(137, 196, 238));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == loginGUI.logBut || e.getSource() == loginGUI.createBut)
            ((JButton)e.getSource()).setBackground(new Color(255, 255, 255, 0));
    }
}
