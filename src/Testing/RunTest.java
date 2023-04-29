package Testing;

import javax.swing.*;

public class RunTest {
    public String[] food = {"Pizza", "Burger", "Pasta", "Hot Dog", "ETC"};
    public JCheckBox[] boxes = new JCheckBox[food.length];
    public JFrame frame;
    private JPanel mainPanel;
    public JButton btn;
    public RunTest() {
        frame = new JFrame("title");
        mainPanel = new JPanel();
        for (int i = 0; i < boxes.length; i++) {
            boxes[i] = new JCheckBox(food[i]);
            mainPanel.add(boxes[i]);
        }
        btn = new JButton("Book");
        mainPanel.add(btn);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}