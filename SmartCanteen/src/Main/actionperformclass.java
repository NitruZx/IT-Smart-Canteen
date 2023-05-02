package Main;

import DataCall2.CallingMenu2;
import DataCall2.MenuKeeping2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.print.Book;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class actionperformclass implements ActionListener {

    public MenuKeeping2 menuKeeping2;
    private Cusnoodle cusNoodle;
    public CallingMenu2 callingMenu2 = new CallingMenu2();

    public actionperformclass() {
        cusNoodle = new Cusnoodle();
        cusNoodle.book.addActionListener(this);
        cusNoodle.bk.addActionListener(this);
        cusNoodle.ad.addActionListener(this);
        for (JCheckBox Indbox : cusNoodle.Ind) {
            Indbox.addActionListener(this);
            for (JCheckBox eggBox : cusNoodle.eggBoxs) {
                eggBox.addActionListener(this);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cusNoodle.book) {
            //Bill bill = new Bill();
            
        } else if (e.getSource() == cusNoodle.bk) {
            callingMenu2.readMenu();
        } else if (e.getSource().equals(cusNoodle.ad)) {
            menuKeeping2 = new MenuKeeping2();
            System.out.println(cusNoodle.manu.getItemAt(cusNoodle.manu.getSelectedIndex()));
            menuKeeping2.setTypeMenu((String) cusNoodle.manu.getItemAt(cusNoodle.manu.getSelectedIndex()));
            callingMenu2.writeMenu(menuKeeping2);
            if (cusNoodle.line1.isSelected()) {
                System.out.println(cusNoodle.line1.getText());
                menuKeeping2.setLineMenu((String) cusNoodle.line1.getText());
                //callingMenu2.writeMenu(menuKeeping2);
            }
            if (cusNoodle.line2.isSelected()) {
                System.out.println(cusNoodle.line2.getText());
                 menuKeeping2.setLineMenu((String) cusNoodle.line2.getText());
            }
            if (cusNoodle.line3.isSelected()) {
                System.out.println(cusNoodle.line3.getText());
                 menuKeeping2.setLineMenu((String) cusNoodle.line3.getText());
            }
            if (cusNoodle.line4.isSelected()) {
                System.out.println(cusNoodle.line4.getText());
                 menuKeeping2.setLineMenu((String) cusNoodle.line4.getText());
            }
            if (cusNoodle.line5.isSelected()) {
                System.out.println(cusNoodle.line5.getText());
                 menuKeeping2.setLineMenu((String) cusNoodle.line5.getText());
            }
            for (JCheckBox Indbox : cusNoodle.Ind) {
                if (Indbox.isSelected()) {
                    System.out.print(Indbox.getText() + "");
                    System.out.println("");
                    
                    menuKeeping2.setInd((String)Indbox.getText());
                }
            }
            for (JCheckBox eggBox : cusNoodle.eggBoxs) {
                if (eggBox.isSelected()) {
                    System.out.println(eggBox.getText());
                    menuKeeping2.setEgg((String)eggBox.getText());
                }
            }
            if (cusNoodle.spc1.isSelected()) {
                System.out.println("true");
                menuKeeping2.setMoney(menuKeeping2.getMoney()+15);
                menuKeeping2.setOption(Boolean.TRUE);
            }
            if (cusNoodle.spc2.isSelected()) {
                System.out.println("false");
                menuKeeping2.setOption(Boolean.FALSE);
            }
            menuKeeping2.setComnent(cusNoodle.comment.getText());
            callingMenu2.writeMenu(menuKeeping2);
        }
        
    }

    public static void main(String[] args) {
        new actionperformclass();
        
    }

}
