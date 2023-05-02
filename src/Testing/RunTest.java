package Testing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class RunTest {
    public String[] food = {"Pizza", "Burger", "Pasta", "Hot Dog", "ETC"};
    public JCheckBox[] boxes = new JCheckBox[food.length];
    public JFrame frame;
    private JPanel mainPanel;
    public JButton btn, btn2;
    public Message message;
    public RunTest() {
        frame = new JFrame("title");
        mainPanel = new JPanel();
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new JCheckBox(food[i]);
            mainPanel.add(boxes[i]);
        }

        btn = new JButton("Book");
        btn2 = new JButton("Popup!");
        message = new Message();
        message.setBorder(new EmptyBorder(20, 20, 20, 20));
        mainPanel.add(btn);
        mainPanel.add(btn2);
        mainPanel.add(message);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}