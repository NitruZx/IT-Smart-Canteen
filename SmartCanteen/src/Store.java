
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Store {

    private JFrame fr;
    private JLabel FoodName, img, nameStore;
    private JCheckBox meat1, meat2, meat3;
    private JButton back, next;
    private JTextField onther;
    private JPanel main ,top, down;
    private JRadioButton small, big;
    private Font meatFont = new Font("Tahoma", Font.BOLD, 18);

    public Store() {
        main = new JPanel();
        fr = new JFrame("IT Smart Canteen");
        nameStore = new JLabel("Noodle wasana", JLabel.CENTER); nameStore.setFont(meatFont);
        top = new JPanel();
        main.setLayout(new GridLayout(2,1));
        //top.setLayout(new BorderLayout());
        down = new JPanel(); down.setLayout(new GridLayout(3, 5));
        
        small = new JRadioButton("Rice Stick Noodles"); small.setFont(meatFont);
        big = new JRadioButton("Wide Rice Noodles"); big.setFont(meatFont);
        meat1 = new JCheckBox("Pig"); meat1.setFont(meatFont);
        meat2 = new JCheckBox("Chick"); meat2.setFont(meatFont);
                
        top.add(nameStore);
        down.add(small);
        down.add(big);
        down.add(meat1);
        down.add(meat2);
        
        main.add(top);
        main.add(down);
        
        
        fr.add(main);
        
       
        fr.setVisible(true);
        //fr.setSize(960, 1200);
        fr.pack();
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Store();
    }
}
