
import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EmptyBorder;

public class WhoAreYou {

    private JFrame f;
    private JPanel panel1, panel2, panel3,panel4, panel5, panel6, panel7;
    private JLabel pic, text;
    private JButton cos, own;
    private Font Ru = new Font("Tahoma", Font.BOLD, 32);

    public WhoAreYou() {
        ImageIcon icon = null;
        f = new JFrame("IT Smart Canteen");
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel6 = new JPanel();
        panel7 = new JPanel();
        
        text = new JLabel("Who are you?", JLabel.CENTER);
        cos = new JButton("Custumer");
        cos.setFont(Ru);
        own = new JButton("Owner");
        own.setFont(Ru);
        URL imageURL = WhoAreYou.class.getResource("/picu/iglogo.png");
        if (imageURL != null) {
            icon = new ImageIcon(imageURL);
        }
        f.setLayout(new GridLayout(3, 1));
        panel1.setLayout(new GridLayout(1, 3));
        panel4.setLayout(new GridLayout(1, 5));
        panel4.setBorder(new EmptyBorder(0, 10, 100, 10));
        pic = new JLabel(icon);
    
        f.add(panel1);
        f.add(text);
        f.add(panel4);
        panel1.add(panel2);
        panel1.add(pic);
        panel1.add(panel3);
        panel4.add(panel5);
        panel4.add(cos);
        panel4.add(panel6);
        panel4.add(own);
        panel4.add(panel7);
        f.setSize(1024, 768);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new WhoAreYou();
    }
}
