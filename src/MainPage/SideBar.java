package MainPage;

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
    private JPanel sidePanel, btnPanel, subTp1, subTp2;
    private JButton menu;
    private JLabel text2;
    private DrawerController drawer;
    public SideBar() {
        frame = new JFrame();
        frame.setLayout(null);

        sidePanel = new JPanel();
        sidePanel.setBackground(new Color(177, 194, 229));
        sidePanel.setBounds(0, 0, 720, 1280);
        tp = new JTabbedPane();
        subTp1 = new JPanel();
        subTp1.setLayout(new BorderLayout());
        subTp2 = new JPanel();
        subTp1.add(new SelectRestaurant().getMainPanel(), BorderLayout.CENTER);
        subTp2.setBackground(Color.RED);
        tp.add("Store", subTp1);
        tp.add("Queue", subTp2);
        tp.setBounds(100, -35, 1150, 720);

//        text1 = new JLabel("text1");
        text2 = new JLabel("text2");
//        subTp1.add(text1);
        subTp2.add(text2);

        drawer = Drawer.newDrawer(frame)
//                .drawerBackground(new Color(177, 194, 229))
                .drawerWidth(200)
                .header(new JLabel("Header"))
                .separator(2, Color.WHITE)
                .enableScroll(true)
                .addChild(new DrawerItem("Store").build())
                .addChild(new DrawerItem("Queue").build())
                .addFooter(new DrawerItem("Log-Out").build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem drawerItem) {
                        System.out.println(i);
                        if (i == 0) {
                            tp.setSelectedIndex(0);
                        } else if (i == 1) {
                            tp.setSelectedIndex(1);
                        } else if (i == 2) {
                            int option = JOptionPane.showOptionDialog(null, "Are you sure to logout?", "LogOut", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                            if (option == 0) {
                                Main main = new Main();
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
                menu.setForeground(new Color(69, 146, 187));
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
        frame.add(tp);
        frame.add(btnPanel);
        frame.add(sidePanel);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new SideBar();
    }
}
