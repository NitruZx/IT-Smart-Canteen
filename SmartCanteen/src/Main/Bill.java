package Main;


import DataCall2.MenuKeeping2;
import java.awt.BorderLayout;
//import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;


public class Bill extends inform {
    public MenuKeeping2 menuKeeping2;
    
    private final JFrame mFrame;
    private final JPanel bg, show, spitOT, menu, total;
    private JTextField b;
    private final JLabel brand, nameStore, date, time, menulist ,menuHead, thankText , order, totalText1, totalText2;
    private final Font billFont;
    
    public Bill(){
        billFont = new Font("Tahoma", Font.PLAIN, 18);
        mFrame = new JFrame("It Smart CAnteen");
        bg = new JPanel();
        bg.setLayout(new BorderLayout());
        show = new JPanel();
        brand = new JLabel("IT Smart Canteen", JLabel.CENTER);brand.setFont(billFont);
        nameStore = new JLabel("Store A", JLabel.CENTER); nameStore.setFont(billFont);
        spitOT = new JPanel(new GridLayout(1, 2));
        order = new JLabel("Order 101", JLabel.LEFT); order.setFont(billFont);
        date = new JLabel("Date : " +showDate(), JLabel.LEFT); date.setBorder(new EmptyBorder(0, 10, 0, 10)); date.setFont(billFont);
        time = new JLabel("Time : " +showTime(), JLabel.RIGHT); time.setFont(billFont);
        menu = new JPanel(new GridLayout(3, 2));
        menulist = new JLabel(menuKeeping2.getTypeMenu());
        
        menu.add(menulist);
        menuHead = new JLabel("Menu", JLabel.LEFT); menuHead.setBorder(new EmptyBorder(0, 10, 0, 10)); menuHead.setFont(billFont);
        total = new JPanel(new GridLayout(1, 3));
        
        totalText1 = new JLabel("Total", JLabel.LEFT); 
        totalText2 = new JLabel("40", JLabel.RIGHT);
        thankText = new JLabel("* Thankyou for using the service *", JLabel.CENTER); thankText.setBorder(new EmptyBorder(0, 10, 10, 10));
        totalText1.setFont(billFont); totalText2.setFont(billFont); thankText.setFont(billFont);
        
        bg.add(thankText, BorderLayout.SOUTH);
        show.setLayout(new GridLayout(8, 1));
        
        spitOT.setBorder(new EmptyBorder(0, 10, 0, 10));
        spitOT.add(order); spitOT.add(time);
        
        total.setBorder(new EmptyBorder(0, 10, 0, 10));
        total.add(totalText1); total.add(totalText2);
         
        show.add(brand );
        show.add(nameStore);
        show.add(date);
        show.add(spitOT);
        show.add(menuHead);
        show.add(menu);
        
        show.add(total);
        
        bg.add(show, BorderLayout.CENTER);
        mFrame.add(bg);
        
        mFrame.setVisible(true);
        //mFrame.setSize(540, 720
        mFrame.setSize(1024, 768);
        //mFrame.pack();
        mFrame.setLocationRelativeTo(null);
        mFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        
        new Bill();
    }
}
