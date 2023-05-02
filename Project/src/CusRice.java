
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CusRice {

    private JFrame f;
    private JPanel mainPN, pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8, pnEgg, nullpn1, nullpn2, nullpn3, nullpn4, nullpn5, nullpn6, nullpn7, btnPanel;
    private JButton bk, ad, book;
    private JLabel name, adEgg, adSpe;
    private JTextField menu;
    private JTextArea comment;
    private JRadioButton omelette, friedegg, boiledegg, spe, examMeat;
    private Font titleFont, content, box;

    public CusRice() {
        f = new JFrame("CusRice");
        mainPN = new JPanel();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        pn5 = new JPanel();
        pn6 = new JPanel();
        pn7 = new JPanel();
        pn8 = new JPanel();
        pnEgg = new JPanel();
        nullpn1 = new JPanel();
        nullpn2 = new JPanel();
        nullpn3 = new JPanel();
        nullpn4 = new JPanel();
        nullpn5 = new JPanel();
        nullpn6 = new JPanel();
        nullpn7 = new JPanel();
        btnPanel = new JPanel();
        bk = new JButton("ตะกร้า");
        ad = new JButton("เพิ่ม");
        book = new JButton("จอง");
        name = new JLabel("ร้านอาหารตามสั่ง", JLabel.CENTER);
        adEgg = new JLabel("เพิ่มไข่ดาว");
        adSpe = new JLabel("พิเศษ");
        menu = new JTextField();
        comment = new JTextArea();
        omelette = new JRadioButton("ไข่เจียว +10 บาท");
        friedegg = new JRadioButton("ไข่ดาว +10 บาท");
        boiledegg = new JRadioButton("ไข่ต้ม +10 บาท");
        spe = new JRadioButton("พิเศษ +10 บาท");
        examMeat = new JRadioButton("หมูกรอบ");
        titleFont = new Font("San Francisco", Font.BOLD, 32);
        content = new Font("San Francisco", Font.PLAIN, 17);
        box = new Font("San Francisco", Font.PLAIN, 20);

        mainPN.setLayout(new GridLayout(8, 1));

        pn1.setLayout(new GridLayout(1, 5));
        pn1.setBorder(new EmptyBorder(10, 0, 10, 10));
        //pn1.setLayout(null);
        // btnPanel.setBounds(523, 0, 100, 100);
//        pn1.setLayout(new GridLayout(1, 3));
        pn1.add(nullpn1);
        pn1.add(nullpn2);
        pn1.add(nullpn3);
        pn1.add(nullpn4);
        // btnPanel.add(bk);
        bk.setFont(box);
        pn1.add(bk);

        pn2.setLayout(new BorderLayout());
        name.setFont(titleFont);
        pn2.add(name, BorderLayout.CENTER);
        pn2.setBorder(new EmptyBorder(10, 0, 0, 0));

        examMeat.setFont(content);
        pn3.add(examMeat);

        pn4.setLayout(new BorderLayout());
        pn4.setBorder(new EmptyBorder(0, 10, 0, 10));
        menu.setFont(content);
        menu.setBorder(BorderFactory.createTitledBorder("Menu : "));
        pn4.add(menu, BorderLayout.CENTER);

        pn5.setLayout(new GridLayout(1, 2));
        adEgg.setFont(content);
        adSpe.setFont(content);
        pn5.add(adEgg);
        pn5.add(adSpe);

        pn6.setLayout(new GridLayout(1, 2));
        pnEgg.setLayout(new GridLayout(3, 1));
        friedegg.setFont(content);
        omelette.setFont(content);
        boiledegg.setFont(content);
        pnEgg.add(friedegg);
        pnEgg.add(omelette);
        pnEgg.add(boiledegg);
        spe.setFont(content);
        pn6.add(pnEgg);
        pn6.add(spe);

        pn7.setLayout(new BorderLayout());
        pn7.setBorder(new EmptyBorder(0, 10, 0, 10));
        comment.setFont(content);
        pn7.add(comment, BorderLayout.CENTER);
        comment.setBorder(BorderFactory.createTitledBorder("Comment : "));

        pn8.setLayout(new GridLayout(1, 5));
        pn8.setBorder(new EmptyBorder(10, 0, 10, 10));
        pn8.add(nullpn5);
        pn8.add(nullpn6);
        pn8.add(nullpn7);
        ad.setFont(box);
        book.setFont(box);
        pn8.add(ad);
        pn8.add(book);

        f.add(mainPN);
        mainPN.add(pn1);
        mainPN.add(pn2);
        mainPN.add(pn3);
        mainPN.add(pn4);
        mainPN.add(pn5);
        mainPN.add(pn6);
        mainPN.add(pn7);
        mainPN.add(pn8);

        f.setSize(1024, 768);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CusRice();
    }
}
