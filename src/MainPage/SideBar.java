package MainPage;

import LoginPage.LoginController;
import LoginPage.LoginGUI;
import LoginPage.Main;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class SideBar {
    private JFrame frame;
    private JTabbedPane tp;
    private JPanel sidePanel, btnPanel, subTp1, subTp2, mainPanel;
    private JButton menu;
    private JLabel text2;
    private DrawerController drawer;
    private DrawerItem storeBtn, queueBtn, logOuttBtn;
    private final Color color = new Color(103, 149, 210);
    public SideBar() {
        frame = new JFrame("Kin Sabye");
        frame.setLayout(new BorderLayout());
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        sidePanel = new JPanel();
        sidePanel.setBackground(color);
        sidePanel.setBounds(0, 0, width, height);
        tp = new JTabbedPane();
        subTp1 = new JPanel();
        subTp1.setLayout(new BorderLayout());
        subTp2 = new JPanel();
        subTp1.add(new SelectRestaurant().getMainPanel(), BorderLayout.CENTER);
        subTp2.setBackground(Color.WHITE);
        tp.add("Store", subTp1);
        tp.add("Queue", subTp2);
        tp.setBounds(100, -35, 1150, 720);

//        text1 = new JLabel("text1");
        text2 = new JLabel("text2");
//        subTp1.add(text1);
        subTp2.add(text2);
        storeBtn = new DrawerItem("Store");
        queueBtn = new DrawerItem("Queue");
        logOuttBtn = new DrawerItem("Log Out");

        storeBtn.setForeground(Color.BLACK);
//        storeBtn.setEffectColor(new Color(250, 152, 132));
        queueBtn.setForeground(Color.BLACK);
//        queueBtn.setEffectColor(new Color(250, 152, 132));
        logOuttBtn.setForeground(Color.BLACK);
//        logOuttBtn.setEffectColor(new Color(250, 152, 132));

        drawer = Drawer.newDrawer(frame)
                .drawerWidth(200)
                .header(new JLabel("Header"))
                .separator(2, Color.WHITE)
                .enableScroll(true)
                .addChild(storeBtn.build())
                .addChild(queueBtn.build())
                .addFooter(logOuttBtn.build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem drawerItem) {
                        System.out.println(i);
                        if (i == 0) {
                            tp.setSelectedIndex(0);
//                            drawer.hide();
                        } else if (i == 1) {
                            tp.setSelectedIndex(1);
//                            drawer.hide();
                        } else if (i == 2) {
                            int option = JOptionPane.showOptionDialog(null, "Are you sure to logout?", "LogOut", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                            if (option == 0) {
                                new Main();
                                frame.dispose();
                            } else {
                                drawer.hide();
                            }

                        }
                    }
                })
                .build();

        btnPanel = new JPanel();
//        btnPanel.setBackground(new Color(177, 194, 229));
        btnPanel.setOpaque(false);
        btnPanel.setBounds(0, 0, 100, 720);

        menu = new JButton("|||");

//        Dimension size = menu.getPreferredSize();
        menu.setBounds(0, 0, 95, 60);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setFocusPainted(false);
        menu.setForeground(Color.WHITE);
        menu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu.setForeground(new Color(15, 77, 210));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menu.setForeground(UIManager.getColor("control"));
            }
        });

        btnPanel.setLayout(null);
        btnPanel.add(menu);
        btnPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (drawer.isShow()) {
                    drawer.hide();
                } else {
                    drawer.show();
                }
            }
        });
        mainPanel.add(tp);
        mainPanel.add(btnPanel);
        mainPanel.add(sidePanel);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setResizable(false);
        frame.setSize(1280, 720);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        frame.setUndecorated(true);
//        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public Color getColor() {
        return color;
    }
    public static void main(String[] args) {
//        System.setProperty("sun.java2d.uiScale","1.2");
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new SideBar();
    }
}
