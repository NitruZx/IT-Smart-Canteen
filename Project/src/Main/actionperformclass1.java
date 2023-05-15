package Main;

import DataCall.CallingMenu;
import DataCall.MenuKeeping;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.print.Book;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class actionperformclass1 implements ActionListener {

    public MenuKeeping menuKeeping;
    private CusRice cusRice;
    //public CallingMenu callingMenu = new CallingMenu();

    public actionperformclass1() {
        cusRice = new CusRice();
        cusRice.book.addActionListener(this);
        //cusRice.bk.addActionListener(this);
        //cusRice.ad.addActionListener(this);
        for (JRadioButton meatBox : cusRice.meatBoxes) {
            meatBox.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cusRice.book) {
            menuKeeping = new MenuKeeping();
            for (int i = 0; i < cusRice.meatBoxes.length; i++){
            if (cusRice.meatBoxes[i].isSelected()){
                System.out.println(cusRice.meatBoxes[i].getText());
                menuKeeping.setInd((String)cusRice.meatBoxes[i].getText());
            }
            }
            menuKeeping.setMenuName(cusRice.menu.getText());
            System.out.println(cusRice.menu.getText());
            if (cusRice.omelette.isSelected()){
                System.out.println(cusRice.omelette.getText());
                menuKeeping.setInd((String)cusRice.omelette.getText());
                menuKeeping.setMoney(menuKeeping.getMoney()+10);
            }
            if (cusRice.friedegg.isSelected()){
                System.out.println(cusRice.friedegg.getText());
                menuKeeping.setInd((String)cusRice.friedegg.getText());
                menuKeeping.setMoney(menuKeeping.getMoney()+10);
            }
            if (cusRice.boiledegg.isSelected()){
                System.out.println(cusRice.boiledegg.getText());
                menuKeeping.setInd((String)cusRice.boiledegg.getText());
                menuKeeping.setMoney(menuKeeping.getMoney()+10);
            }
            if (cusRice.spe.isSelected()){
                System.out.println("true");
                menuKeeping.setMoney(menuKeeping.getMoney()+10);
                menuKeeping.setOption(Boolean.TRUE);
            }
            if (cusRice.normal.isSelected()){
                System.out.println("false");
                menuKeeping.setMoney(menuKeeping.getMoney());
                menuKeeping.setOption(Boolean.FALSE);
            }
            menuKeeping.setMenuName(cusRice.comment.getText());
            System.out.println(cusRice.comment.getText());
            

      //  } else if (e.getSource() == cusRice.bk) {
        //    callingMenu.readMenu();
       // } else if ()
    }
    }
    public static void main(String[] args) {
        new actionperformclass1();
    }
}

    