package LoginPage;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.event.*;

public class SignPageController implements ActionListener {
    private SignUpGUI signUpGUI;

    public SignPageController() {
        signUpGUI = new SignUpGUI();
        signUpGUI.getBackBtn().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);

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
