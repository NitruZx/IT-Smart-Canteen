package MainPage;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import javax.swing.*;
import java.awt.*;

public class SelectRestaurant {
    private JFrame frame;
    private JPanel mainPanel, subTp1, subTp2;
    private JTabbedPane tp;
    public SelectRestaurant() {
        frame = new JFrame("Test");

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        tp = new JTabbedPane();
        subTp1 = new JPanel();
        subTp2 = new JPanel();
        tp.add("Store 1", subTp1);
        tp.add("Store 2", subTp2);

        mainPanel.add(tp, BorderLayout.CENTER);
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
