package MainPage;

import LoginPage.*;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import ian.ModelColor;
import ian.PanelGradiant;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame {
    private LoginModel loginModel;
    private JFrame frame;
    private JPanel btnPanel, mainPanel, page1, page2;
    private JButton menu;
    private DrawerController drawer;
    private DrawerItem storeBtn, queueBtn, logOuttBtn;
    private PanelGradiant panelGradiant;
    private CardLayout cardLayout = new CardLayout();
    private final Color color = new Color(79, 69, 87);

    public MainFrame() {
        this("");
    }
    public MainFrame(String username) {
        frame = new JFrame("Kin Sabye");
        frame.setLayout(new BorderLayout());

        //create CardLayout
        mainPanel = new JPanel();
        mainPanel.setLayout(cardLayout);

        page1 = new JPanel();page1.setBackground(Color.RED);
        page2 = new JPanel();page2.setBackground(Color.BLUE);
        mainPanel.add(page1, "1");
        mainPanel.add(page2, "2");
        cardLayout.show(mainPanel, "1");

        ImageIcon icon = new ImageIcon("src/MainPage/menu3.png");
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon menuIcon = new ImageIcon(newimg);

        ImageIcon icon2 = new ImageIcon("src/MainPage/store.png");
        Image img2 = icon2.getImage();
        Image newimg2 = img2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon storeIcon = new ImageIcon(newimg2);

        ImageIcon icon3 = new ImageIcon("src/MainPage/queue.png");
        Image img3 = icon3.getImage();
        Image newimg3 = img3.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon queueIcon = new ImageIcon(newimg3);

        ImageIcon icon4 = new ImageIcon("src/MainPage/logout.png");
        Image img4 = icon4.getImage();
        Image newimg4 = img4.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon logoutIcon = new ImageIcon(newimg4);

        panelGradiant = new PanelGradiant();
        panelGradiant.addColor(new ModelColor(new Color(79, 69, 87), 0.2f),
                new ModelColor(new Color(79, 69, 87), 0.7f), new ModelColor(new Color(57, 54, 70), 1f));
        panelGradiant.setPreferredSize(new Dimension(0, 100));
        storeBtn = new DrawerItem("Store");
        queueBtn = new DrawerItem("Queue");
        logOuttBtn = new DrawerItem("Log Out");

        storeBtn.setForeground(Color.BLACK);
        queueBtn.setForeground(Color.BLACK);
        logOuttBtn.setForeground(Color.BLACK);

        drawer = Drawer.newDrawer(frame)
                .drawerWidth(200)
                .header(new JLabel(username, JLabel.CENTER))
                .space(10)
//                .separator(2, Color.WHITE)
                .enableScroll(true)
                .addChild(storeBtn.icon(storeIcon).iconTextGap(30).build())
                .addChild(queueBtn.icon(queueIcon).iconTextGap(30).build())
                .addFooter(logOuttBtn.icon(logoutIcon).iconTextGap(20).build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem drawerItem) {
                        if (i == 0) {
                            cardLayout.show(mainPanel, "1");
                        } else if (i == 1) {
                            cardLayout.show(mainPanel, "2");
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
        btnPanel.setOpaque(false);
        btnPanel.setBounds(0, 0, 300, 720);

        menu = new JButton(menuIcon);
        menu.setBounds(10, 20, 95, 60);
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.setFocusPainted(false);
        menu.setForeground(Color.WHITE);

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
        panelGradiant.add(btnPanel);

        frame.add(panelGradiant, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setMinimumSize(new Dimension(1280, 720));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public Color getColor() {
        return color;
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new MainFrame();
    }
}
