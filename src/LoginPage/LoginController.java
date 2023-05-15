package LoginPage;

import Database.DB;
import MainPage.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginController implements ActionListener,  MouseListener {
    private LoginGUI loginGUI;
    private LoginModel loginModel;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
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
            if (name.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all field", "Login", JOptionPane.PLAIN_MESSAGE);
                return;
            }
            LoadingPage load = new LoadingPage();
            load.frame.setVisible(false);
            Thread t = new Thread(load);
            t.start();
            SwingWorker worker = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    load.frame.setVisible(true);
                    login(name, password);
                    return null;
                }

                @Override
                protected void done() {
                    load.frame.dispose();
                }
            };
            worker.execute();

        } else if (e.getSource() == loginGUI.createBut) {
            new SignPageController();
            loginGUI.getFrame().dispose();
        }
    }

    private void login(String name, String password) {
        try {
            con = DB.mycon();
            String sql = " SELECT * FROM logindatabase WHERE Name=? LIMIT 1";
            pst = con.prepareStatement(sql);
            pst.setString(1, name); //username

            rs = pst.executeQuery();
            if (rs.next()) {
                pst = con.prepareStatement(" SELECT * FROM logindatabase WHERE Name=? AND Password=?");
                pst.setString(1, name);
                pst.setString(2, password); //password
                rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Success", "Login", JOptionPane.PLAIN_MESSAGE);
                    MainFrame mainFrame = new MainFrame(name);
                    loginGUI.frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "wrong password", "Login", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Username not Found", "Login", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();

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
