package MainPage;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import ian.SideMenuPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestSideBar {
    private JFrame frame;
    private JPanel jPanel1, sidebar, mainPanel, btnPanel1, btnPanel2;
    private JButton settings, home, men, jButton1, jButton2;
    private SideMenuPanel sp;
    public TestSideBar() {
        initiate();
        sp = new SideMenuPanel(frame);
        sp.setMain(mainPanel);
        sp.setSide(sidebar);
        sp.setMinWidth(55);
        sp.setMaxWidth(150);
        sp.setMainAnimation(true);
        sp.setSpeed(4);
        sp.setResponsiveMinWidth(600);
    }

    private void initiate() {
        frame = new JFrame("Great!");
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        sidebar = new JPanel();
        sidebar.setLayout(null);
        sidebar.setBackground(new java.awt.Color(16, 84, 129));
        sidebar.setBounds(0, 0, 200, 1000);
//        mainPanel.add(sidebar);

        settings = new JButton("Sett");
        settings.setForeground(new java.awt.Color(195, 217, 233));
//        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settings (Custom).png"))); // NOI18N
        settings.setText("Settings");
        settings.setBorderPainted(false);
        settings.setContentAreaFilled(false);
        settings.setFocusPainted(false);
        settings.setHideActionText(true);
        settings.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        settings.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        settings.setIconTextGap(20);
        settings.setMargin(new java.awt.Insets(2, 0, 2, 14));
        settings.setMinimumSize(new java.awt.Dimension(0, 35));
        settings.setPreferredSize(new java.awt.Dimension(50, 574));

        home = new JButton("Home");
        home.setForeground(new java.awt.Color(195, 217, 233));
//        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home (Custom).png"))); // NOI18N
        home.setText("Home");
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setHideActionText(true);
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        home.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        home.setIconTextGap(20);
        home.setMargin(new java.awt.Insets(2, 0, 2, 14));
        home.setMinimumSize(new java.awt.Dimension(0, 0));
        home.setPreferredSize(new java.awt.Dimension(50, 574));

        men = new JButton("|||");
        men.setBackground(new java.awt.Color(34, 40, 47));
//        men.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_15.png"))); // NOI18N
        men.setBorderPainted(false);
        men.setContentAreaFilled(false);
        men.setFocusPainted(false);
        men.setHideActionText(true);
        men.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        men.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        men.setIconTextGap(20);
        men.setMargin(new java.awt.Insets(2, 3, 2, 14));
        men.setMinimumSize(new java.awt.Dimension(0, 35));
        men.setPreferredSize(new java.awt.Dimension(50, 574));
        sidebar.add(men);
        men.setBounds(10, 0, 80, 60);

        btnPanel1 = new JPanel();
        btnPanel1.setLayout(null);
//        btnPanel2 = new JPanel();
//        btnPanel2.setLayout(null);
        jButton1 = new JButton("Open");
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton1ActionPerformed(e);
            }
        });
        jButton2 = new JButton("Close");
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton2ActionPerformed(e);
            }
        });
        jButton1.setBounds(300, 0, 80, 60);jButton2.setBounds(300, 100, 80, 60);
        btnPanel1.add(jButton1);btnPanel1.add(jButton2);
        frame.add(btnPanel1);;

//        frame.add(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    private void menActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menActionPerformed
        // TODO add your handling code here:
        sp.onSideMenu();
    }//GEN-LAST:event_menActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sp.openMenu();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sp.closeMenu();        // TODO add your handling code here:
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new TestSideBar();
    }
}
