
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class book {
    private JFrame frame;
    private JPanel pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8;
    private JLabel topmain, menumain, pricemain, checkmain;
    private JTextArea details;
    private JTextField money;
    private JButton yes, no;
    private Font title, content, box, guide;
    
    
public book(){
frame = new JFrame("ยืนยันการจอง") ;
pn1 = new JPanel();
pn2 = new JPanel();
pn3 = new JPanel();
pn4 = new JPanel();
pn5 = new JPanel();
pn6 = new JPanel();
pn7 = new JPanel(); 
//pn8 = new JPanel();
topmain = new JLabel("รายละเอียดการจอง");
menumain = new JLabel("รายการอาหาร");
pricemain = new JLabel("ราคาอาหารรวม");
checkmain = new JLabel("ท่านต้องการกดยืนยันออเดอร์หรือไม่");
details = new JTextArea();
money = new JTextField();
yes = new JButton("ตกลงยืนยันออเดอร์");
no  = new JButton("ไม่ต้องการยืนยันออเดอร์");
title = new Font("MNW PidTermLaew", Font.BOLD, 30);
content = new Font("MNW PidTermLaew", Font.PLAIN, 17);
box = new Font("MNW PidTermLaew", Font.BOLD, 22);
guide = new Font("MNW PidTermLaew", Font.PLAIN, 18);

frame.setLayout(new GridLayout(7,1));
pn1.setLayout(new BorderLayout());
frame.add(pn1);
frame.add(pn2);
frame.add(pn3);
frame.add(pn4);
frame.add(pn5);
frame.add(pn6);
frame.add(pn7);
//frame.add(pn8);

pn1.setLayout(new FlowLayout());
pn1.add(topmain);
topmain.setFont(title);

pn2.setLayout(new BorderLayout());
pn2.add(menumain);
menumain.setFont(content);

pn3.setLayout(new BorderLayout());
pn3.add(details);
details.setEditable(false);

pn4.setLayout(new BorderLayout());
pn4.add(pricemain);
pricemain.setFont(content);

pn5.setLayout(new BorderLayout());
pn5.add(money);
money.setEnabled(false);

pn6.setLayout(new BorderLayout());
pn6.add(checkmain);
checkmain.setFont(content);

pn7.setLayout(new GridLayout(1, 2));
pn7.setBorder(new EmptyBorder(0, 15, 10, 15));
pn7.add(yes);
//pn7.add(pn8);
pn7.add(no);
yes.setFont(content);
no.setFont(content);


frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setSize(1024, 768);

}

    public static void main(String[] args) {
        new book();
    }



}
