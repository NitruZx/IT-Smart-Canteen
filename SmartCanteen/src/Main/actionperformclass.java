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

public class actionperformclass implements ActionListener, ItemListener {
    
    public MenuKeeping2 menuKeeping2;
    private Cusnoodle cusNoodle;
    public CallingMenu2 callingMenu2 = new CallingMenu2();
    int countInd = 0;
    int countEgg = 0;
    
    public actionperformclass() {
        cusNoodle = new Cusnoodle();
        cusNoodle.book.addActionListener(this);
        cusNoodle.bk.addActionListener(this);
        cusNoodle.ad.addActionListener(this);
        cusNoodle.spc1.addActionListener(this);
        for (JCheckBox Indbox : cusNoodle.Ind) {
            Indbox.addActionListener(this);
            Indbox.addItemListener(this);
        }
        for (JCheckBox eggBox : cusNoodle.eggBoxs) {
            eggBox.addActionListener(this);
            eggBox.addItemListener(this);
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
                    menuKeeping2.setInd((String) Indbox.getText());
                }
            }
            for (JCheckBox eggBox : cusNoodle.eggBoxs) {
                if (eggBox.isSelected()) {
                    System.out.println(eggBox.getText());
                    menuKeeping2.setEgg((String) eggBox.getText());
                }
            }
            if (cusNoodle.spc1.isSelected()) {
                menuKeeping2.setOption(true);
                System.out.println("พิเศษ");
            }
            if (cusNoodle.spc2.isSelected()) {
                menuKeeping2.setOption(false);
                   System.out.println("พิเศษ ที่ไหนหละ ");
            }
            menuKeeping2.setComnent(cusNoodle.comment.getText());
            callingMenu2.writeMenu(menuKeeping2);
            MoneyCal();
            System.out.println(menuKeeping2.getMoney());
        }
    }
    
    public static void main(String[] args) {
        new actionperformclass();
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        for (JCheckBox indBox : cusNoodle.Ind) {
            if (e.getSource() == indBox) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    countInd++;
                }
                if (e.getStateChange() == ItemEvent.DESELECTED) {
                    countInd--;
                }
            }
        }
        for (JCheckBox eggBox : cusNoodle.eggBoxs) {
            if (e.getSource() == eggBox) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    countEgg++;
                }
                if (e.getStateChange() == ItemEvent.DESELECTED) {
                    countEgg--;
                }
            }
        }
    }
    
    public void MoneyCal() {
        menuKeeping2.setMoney(menuKeeping2.getMoney() + (countEgg) * 10);
        if (countInd == 1) {
            menuKeeping2.setMoney(menuKeeping2.getMoney() + 40);
        } else if (countInd > 1) {
            menuKeeping2.setMoney(menuKeeping2.getMoney() + (countInd - 1) * 20 + 40);
        }
        if (menuKeeping2.isOption()) {
            menuKeeping2.setMoney(menuKeeping2.getMoney() + 15);
        }
    }
    
}
