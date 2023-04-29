package Testing;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionperformclass implements ActionListener {
    private RunTest runTest;
    public actionperformclass() {
        runTest = new RunTest();
        for (JCheckBox box : runTest.boxes) {
            box.addActionListener(this);
        }
        runTest.btn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(runTest.btn))
            for (JCheckBox box : runTest.boxes) {
                if (box.isSelected()) {
                    System.out.println(box.getText());
                }
            }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new actionperformclass();
    }
}