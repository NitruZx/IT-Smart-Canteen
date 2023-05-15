package MainPage;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.*;

public class SelectRestaurant {
    private JFrame frame;
    private JPanel mainPanel, subTp1, subTp2;
    private JTabbedPane tp;
    public SelectRestaurant() {
        frame = new JFrame("Testing.Test");

        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        tp = new JTabbedPane();
        subTp1 = new JPanel();
        subTp2 = new JPanel();
        tp.add("Store A", subTp1);
        tp.add("Store B", subTp2);
        tp.setBounds(0, 0, 1920, 1080);
        mainPanel.add(tp);
//        mainPanel.setBackground(new Color(103, 149, 210));
        frame.add(mainPanel);

//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setSize(1280, 720);
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

//    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(new FlatMacLightLaf());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        new SelectRestaurant();
//    }
}
