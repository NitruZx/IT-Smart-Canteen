package Main;

import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

public class Cusnoodle {

    private final JFrame frame;
    public final JComboBox manu;
    final JButton bk;
    public final JButton ad, book;
    public final JRadioButton line1, line2, line3, line4, line5, spc1, spc2;
    //public final JCheckBox topping1, topping2, topping3, topping4, topping5, topping6, topping7, topping8, topping9, topping10, egg1;
    //public final JCheckBox egg1;
//    public String menuList[] = {"เย็นตาโฟ", "ก๋วยเตี๋ยวเรือ", "ก๋วยเตี๋ยวต้มยำ", "ก๋วยเตี๋ยวน้ำใส"};
    public String Toping[] = {"หมูเด้งดึ๋งๆ ", "หมูตุ๋นหุง อุ่น ตุ๋น ต้ม นึ่ง ", "หมูชิ้น ชา", "หมูกรุบกรอบ", "หมูแดงมาก", "เนื้อออสซี่", "ไข่ไก่อารมณ์ดี", "เกี๊ยวหมูทอด", "แคปหมูจากสุพัน", "เนื้อฮิปโปทอด"};
    public String Egg[] = {"ไข่ไก่จากแม่ไก่อารมณ์ดี", "ไข่เป็ดจากแม่เป็ดอารมณ์เสีย", "ไข่ไก่กำพร้าแม่"};
    public JCheckBox[] Ind = new JCheckBox[Toping.length], eggBoxs = new JCheckBox[Egg.length];
    public final JTextField comment;
    private final JLabel DCtion1, DCtion2, DCtion3, DCtion4, DCtion5, DCtion6, namestore, pic;
    private final JPanel big, pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8, pn9, pn10, blank1, blank2, blank3, blank4, blank5, blank6, blank7,
            pnDCtion1, pnDCtion2, pnDCtion3, pnDCtion4, pnDCtion5, pnDCtion6;
    private final Font title, content, box, guide;
    private final Color boxc;
    public CheckboxGroup cg;
    ImageIcon icon = null;

    public Cusnoodle() {
        frame = new JFrame("Cusnoodle");
        namestore = new JLabel("ก๋วยเตี๋ยวป้าแจ๋วสุดจ๊าบ ก๊าบๆ คือเสียงเป็ด", JLabel.CENTER);
        DCtion1 = new JLabel("กรุณาเลือกชนิดของประเภทก๋วยเตี๋ยว");
        DCtion2 = new JLabel("กรุณาเลือกชนิดของเส้น");
        DCtion3 = new JLabel("กรุณาเลือกวัตถุดิบ");
        DCtion4 = new JLabel("จะใส่ไหมไข่อะ?");
        DCtion5 = new JLabel("พิเศษ หรือ ดา");
        DCtion6 = new JLabel("อื่นๆ");
        manu = new JComboBox();
        bk = new JButton("ตะกร้าจ้า");
        ad = new JButton("เพิ่มเมนูป่าว");
        book = new JButton("จอง");
        line1 = new JRadioButton("เส้นหมี่");
        line2 = new JRadioButton("เสื้อเล็ก");
        line3 = new JRadioButton("เส้นใหญ่");
        line4 = new JRadioButton("วุ้นเส้น");
        line5 = new JRadioButton("บะหมี่ไข่");
        spc1 = new JRadioButton("พิเศษ");
        spc2 = new JRadioButton("ไม่พิเศษ");
//        topping1 = new JCheckBox("หมูเด้งดึ๋งๆ"); topping2 = new JCheckBox("หมูตุ๋นหุง อุ่น ตุ๋น ต้ม นึ่ง");
//        topping3 = new JCheckBox("หมูชิ้น ชา"); topping4 = new JCheckBox("หมูกรุบกรอบ");
//        topping5 = new JCheckBox("หมูแดงมาก"); topping6 = new JCheckBox("เนื้อออสซี่");
//        topping7 = new JCheckBox("ไข่ไก่อารมณ์ดี"); topping8 = new JCheckBox("เกี๊ยวหมูทอด");
//        topping9 = new JCheckBox("แคปหมูจากสุพัน"); topping10 = new JCheckBox("เนื้อฮิปโปทอด");
        //    egg1 = new JCheckBox("ใส่ไข่ไก่อารมณ์ดี");

        ButtonGroup lGroup = new ButtonGroup();
        lGroup.add(line1);
        lGroup.add(line2);
        lGroup.add(line3);
        lGroup.add(line4);
        lGroup.add(line5);

        ButtonGroup SpcGroup = new ButtonGroup();
            SpcGroup.add(spc1);
        SpcGroup.add(spc2);

        comment = new JTextField();
        big = new JPanel();
        pn1 = new JPanel();
        pn2 = new JPanel();
        pn3 = new JPanel();
        pn4 = new JPanel();
        pn5 = new JPanel();
        pn6 = new JPanel();
        pn7 = new JPanel();
        pn8 = new JPanel();
        pn9 = new JPanel();
        pn10 = new JPanel();
        blank1 = new JPanel();
        blank2 = new JPanel();
        blank3 = new JPanel();
        blank4 = new JPanel();
        blank5 = new JPanel();
        blank6 = new JPanel();
        blank7 = new JPanel();
        pnDCtion1 = new JPanel();
        pnDCtion2 = new JPanel();
        pnDCtion3 = new JPanel();
        pnDCtion4 = new JPanel();
        pnDCtion5 = new JPanel();
        pnDCtion6 = new JPanel();

        title = new Font("TH SarabunPSK", Font.BOLD, 30);
        content = new Font("TH SarabunPSK", Font.PLAIN, 17);
        box = new Font("TH SarabunPSK", Font.BOLD, 22);
        guide = new Font("TH SarabunPSK", Font.PLAIN, 18);
        boxc = new Color(103, 149, 210);
        URL imageURL = Cusnoodle.class.getResource("/pic/rukna.jpg");
        if (imageURL != null) {
            icon = new ImageIcon(imageURL);
        }

        big.setLayout(new GridLayout(16, 1));

        pn1.setLayout(new GridLayout(1, 5));
        pn1.setBorder(new EmptyBorder(10, 0, 10, 10));
        pn1.add(blank1);
        pn1.add(blank2);
        pn1.add(blank6);
        pn1.add(blank7);
        bk.setFont(box);
        bk.setBackground(boxc);
        pn1.add(bk);

        pn2.setLayout(new BorderLayout());
        pn2.setBorder(new EmptyBorder(0, 10, 0, 10));
        pn2.add(namestore, BorderLayout.CENTER);
        namestore.setFont(title);

        pn3.setLayout(new BorderLayout());
        pic = new JLabel(icon);
        pn3.setBorder(new EmptyBorder(10, 10, 10, 10));
        pn3.add(pic, BorderLayout.CENTER);

        pnDCtion1.setLayout(new BorderLayout());
        pnDCtion1.add(DCtion1);
        DCtion1.setFont(guide);

        pn4.setLayout(new BorderLayout());
        pn4.add(manu);
        pn4.setBorder(new EmptyBorder(0, 10, 0, 10));
        manu.addItem("เย็นตาโฟ");
        manu.addItem("ก๋วยเตี๋ยวเรือ");
        manu.addItem("ก๋วยเตี๋ยวต้มยำ");
        manu.addItem("ก๋วยเตี๋ยวน้ำใส");
        manu.setFont(content);

        pnDCtion2.setLayout(new BorderLayout());
        pnDCtion2.add(DCtion2);
        DCtion2.setFont(guide);

        pn5.setLayout(new GridLayout(1, 5));
        pn5.add(line1);
        pn5.add(line2);
        pn5.add(line3);
        pn5.add(line4);
        pn5.add(line5);
        line1.setFont(content);
        line2.setFont(content);
        line3.setFont(content);
        line4.setFont(content);
        line5.setFont(content);

        pnDCtion3.setLayout(new BorderLayout());
        pnDCtion3.add(DCtion3);
        DCtion3.setFont(guide);

        pn6.setLayout(new GridLayout(2, 5));

        for (int i = 0; i < Ind.length; i++) {
            Ind[i] = new JCheckBox(Toping[i]);
            pn6.add(Ind[i]);
            Ind[i].setFont(content);
        }
//        pn6.add(topping2);
//        pn6.add(topping3);
//        pn6.add(topping4);
//        pn6.add(topping5);
//        pn6.add(topping6);
//        pn6.add(topping7);
//        pn6.add(topping8);
//        pn6.add(topping9);
//        pn6.add(topping10);
//        topping1.setFont(content);
//        topping2.setFont(content);
//        topping3.setFont(content);
//        topping4.setFont(content);
//        topping5.setFont(content);
//        topping6.setFont(content);
//        topping7.setFont(content);
//        topping8.setFont(content);
//        topping9.setFont(content);
//        topping10.setFont(content);

        cg = new CheckboxGroup();

        pnDCtion4.setLayout(new BorderLayout());
        pnDCtion4.add(DCtion4);
        DCtion4.setFont(guide);

        pn7.setLayout(new GridLayout(1, 5));

        for (int i = 0; i < eggBoxs.length; i++) {
            eggBoxs[i] = new JCheckBox(Egg[i]);
            pn7.add(eggBoxs[i]);
            eggBoxs[i].setFont(content);
        }
//        pn7.add(egg1);
//        egg1.setFont(content);

        pnDCtion5.setLayout(new BorderLayout());
        pnDCtion5.add(DCtion5);
        DCtion5.setFont(guide);

        pn8.setLayout(new GridLayout(1, 5));
        pn8.add(spc1);
        pn8.add(spc2);
        spc1.setFont(content);
        spc2.setFont(content);

        pnDCtion6.setLayout(new BorderLayout());
        pnDCtion6.add(DCtion6);
        DCtion6.setFont(guide);

        pn9.setLayout(new BorderLayout());
        pn9.add(comment, BorderLayout.CENTER);
        pn9.setBorder(new EmptyBorder(0, 10, 0, 10));
        comment.setFont(content);

        pn10.setLayout(new GridLayout(1, 5));
        pn10.setBorder(new EmptyBorder(10, 0, 10, 10));
        pn10.add(blank3);
        pn10.add(blank4);
        pn10.add(blank5);
        pn10.add(ad);
        pn10.add(book);
        ad.setFont(box);
        book.setFont(box);

        big.add(pn1);
        big.add(pn2);
        big.add(pn3);
        big.add(pnDCtion1);
        big.add(pn4);
        big.add(pnDCtion2);
        big.add(pn5);
        big.add(pnDCtion3);
        big.add(pn6);
        big.add(pnDCtion4);
        big.add(pn7);
        big.add(pnDCtion5);
        big.add(pn8);
        big.add(pnDCtion6);
        big.add(pn9);
        big.add(pn10);

        frame.add(big);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1024, 768);

    }

    public JButton getBk() {
        return bk;
    }

}
