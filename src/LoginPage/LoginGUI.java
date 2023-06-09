package LoginPage;

import ian.CtmPasswordField;
import ian.CustomField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.border.EmptyBorder;

public class LoginGUI {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    protected JTabbedPane tabbedPane;
    public JFrame frame;
    protected JLabel app_Name, testtext;
//    public JTextField nameField;
//    public JPasswordField passField;
    public JButton logBut, createBut;
    public CustomField nameField;
    public CtmPasswordField passField;
    protected JPanel subPanel1, subPanel2, subPanel3, centralP, textP1, textP2, subTabPane1,
                subTapPane2;
    public LoginGUI(HashMap<String, String> originInfo) {
        initiateGUI(originInfo);
    }
    public LoginGUI() {
        loginInfo = null;
        initiateGUI(loginInfo);
    }
    protected void initiateGUI(HashMap<String, String> originInfo) {
        loginInfo = originInfo;
        frame = new JFrame("Login");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setResizable(false);

        subPanel1 = new JPanel();

        app_Name = new JLabel("IT-Smart-Canteen");
        app_Name.setBorder(new EmptyBorder(40, 0, 0, 0));

        centralP = new JPanel();
        centralP.setLayout(new GridLayout(3, 1));
        subPanel1 = new JPanel();
        subPanel2 = new JPanel();
        subPanel2.setLayout(new GridLayout(2,1));
        subPanel3 = new JPanel();


        testtext = new JLabel("");
        testtext.setBounds(50, 50, 50, 50);
        frame.add(testtext);

        textP1 = new JPanel();
        textP2 = new JPanel();

        nameField = new CustomField();
        passField = new CtmPasswordField();
        nameField.setLabelText("Username");
        passField.setLabelText("Password");

//        nameField = new JTextField("Enter Student-ID");
//        nameField.setForeground(Color.GRAY);
//        passField = new JPasswordField("Password");
//        passField.setForeground(Color.GRAY);
        subPanel2.setBorder(new EmptyBorder(0, 30, 20, 30));
//        nameField.setBorder(BorderFactory.createTitledBorder("Student-ID"));
//        passField.setBorder(BorderFactory.createTitledBorder("Password"));
//        textP1.setBorder(BorderFactory.createTitledBorder("Student-ID"));
//        textP1.add(nameField);
//        textP2.setBorder(BorderFactory.createTitledBorder("Password"));
//        textP2.add(passField);

        subPanel2.add(nameField); subPanel2.add(passField);

//        subPanel2.add(nameField);
//        subPanel2.add(passField);

        logBut = new JButton("Login");
        subPanel3.add(logBut);
        createBut = new JButton("Sign Up");
        createBut.setBorder(new EmptyBorder(0, 10, 5, 10));

        tabbedPane = new JTabbedPane();
        subTabPane1 = new JPanel();
        subTapPane2 = new JPanel();
        subTabPane1.setLayout(new BorderLayout());
        subTabPane1.add(centralP, BorderLayout.CENTER);subTabPane1.add(createBut, BorderLayout.SOUTH);

        subTapPane2.setLayout(new BorderLayout());
        subTapPane2.add(new SellerPanel().getCenterMain(), BorderLayout.CENTER);
        tabbedPane.add("Client", subTabPane1);
        tabbedPane.add("Admin", subTapPane2);

        centralP.add(subPanel1);centralP.add(subPanel2);centralP.add(subPanel3);
//        centralP.setSize(200, 300);
//        layer1 = new JPanel();
//        layer1.setLayout(new BorderLayout());
        frame.add(tabbedPane, BorderLayout.CENTER);
//        frame.add(createBut, BorderLayout.SOUTH);
        centralP.setBorder(new EmptyBorder(80, 60, 20, 60));
//        nameField.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                if (nameField.getText().equals("Enter Student-ID")) {
//                    nameField.setText("");
//                    nameField.setForeground(Color.BLACK);
//                }
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                if (nameField.getText().isEmpty()) {
//                    nameField.setForeground(Color.GRAY);
//                    nameField.setText("Enter Student-ID");
//                }
//            }
//        });
//        passField.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                if (passField.getText().equals("Password")) {
//                    passField.setText("");
//                    passField.setForeground(Color.BLACK);
//                }
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                if (passField.getText().isEmpty()) {
//                    passField.setForeground(Color.GRAY);
//                    passField.setText("Password");
//                }
//            }
//        });
        logBut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                logBut.setBackground(new Color(137, 196, 238));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                logBut.setBackground(new Color(255, 255, 255, 0));
            }
        });
        createBut.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                createBut.setBackground(new Color(137, 196, 238));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                createBut.setBackground(new Color(137, 196, 238, 0));
            }
        });

//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension screenSize = toolkit.getScreenSize();
        subPanel1.add(app_Name);
        frame.add(subPanel1, BorderLayout.NORTH);
//        frame.setLocation(765, 150);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        }

    public JFrame getFrame() {
        return frame;
    }
    //    public static void main(String[] args) {
//        try {
//            UIManager.setLookAndFeel(new FlatMacDarkLaf());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        LoginPage.LoginGUI loginGUI = new LoginPage.LoginGUI();
//    }
}
