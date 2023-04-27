package MainPage;

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
    private JLabel text1, text2;
    private DrawerController drawer;
    public SideBar() {
        frame = new JFrame();
        frame.setLayout(null);

        sidePanel = new JPanel();
        sidePanel.setBackground(new Color(38, 62, 110));
        sidePanel.setBounds(0, 0, 100, 720);
        tp = new JTabbedPane();
        subTp1 = new JPanel();
        subTp1.setLayout(new BorderLayout());
        subTp2 = new JPanel();
        subTp1.setBackground(Color.GREEN);
        subTp1.add(new SelectRestaurant().getMainPanel(), BorderLayout.CENTER);
        subTp2.setBackground(Color.RED);
        tp.add("test1", subTp1);
        tp.add("test2", subTp2);
        tp.setBounds(100, -35, 1150, 720);

//        text1 = new JLabel("text1");
        text2 = new JLabel("text2");
//        subTp1.add(text1);
        subTp2.add(text2);

        drawer = Drawer.newDrawer(frame)
                .header(new JLabel("Header"))
                .separator(2, Color.BLACK)
                .enableScroll(true)
                .addChild(new DrawerItem("Store").build())
                .addChild(new DrawerItem("Queue").build())
                .addFooter(new DrawerItem("Account").build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem drawerItem) {
                        System.out.println(i);
                        if (i == 0) {
                            tp.setSelectedIndex(0);
                        } else if (i == 1) {
                            tp.setSelectedIndex(1);
                        }
                    }
                })
                .build();

        btnPanel = new JPanel();
        btnPanel.setOpaque(false);
        btnPanel.setBounds(0, 0, 100, 100);

        menu = new JButton("|||");

//        Dimension size = menu.getPreferredSize();
        menu.setBounds(0, 0, 80, 60);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setFocusPainted(false);
        menu.setForeground(Color.WHITE);
        menu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                menu.setForeground(new Color(137, 196, 238));
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
