package Testing;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class actionperformclass implements ActionListener, MouseListener {
    private RunTest runTest;
    public actionperformclass() {
        runTest = new RunTest();
        for (JCheckBox box : runTest.boxes) {
            box.addActionListener(this);
        }
        runTest.btn.addActionListener(this);
        runTest.message.button1.addMouseListener(this);
        runTest.message.button2.addMouseListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(runTest.btn))
            for (JCheckBox box : runTest.boxes) {
                if (box.isSelected()) {
                    System.out.println(box.getText());
                }
            }
        if (e.getSource().equals(runTest.btn2)) {
            runTest.message.setVisible(true);
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

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(runTest.message.button1))  {
            runTest.message.button1.setBackground(new Color(143, 224, 155));
        } else if (e.getSource().equals(runTest.message.button2)) {
            runTest.message.button2.setBackground(new Color(211, 118, 171));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource().equals(runTest.message.button1))  {
            runTest.message.button1.setBackground(new Color(48, 155, 5));
        } else if (e.getSource().equals(runTest.message.button2)) {
            runTest.message.button2.setBackground(new Color(147, 9, 57));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource().equals(runTest.message.button1))  {
            runTest.message.button1.setBackground(new Color(51, 204, 0));
        } else if (e.getSource().equals(runTest.message.button2)) {
            runTest.message.button2.setBackground(new Color(204, 0, 51));
        }
    }
}