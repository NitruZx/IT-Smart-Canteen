package Main;

import DataCall.MenuKeeping;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class actionperformclass1 implements ActionListener {

    public MenuKeeping menuKeeping;
    private CusRice cusRice;
//    public CallingMenu callingMenu = new CallingMenu();

    public actionperformclass1() {
        cusRice = new CusRice();
        cusRice.book.addActionListener(this);
//        cusRice.bk.addActionListener(this);
//        cusRice.ad.addActionListener(this);
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
//                System.out.println(cusRice.meatBoxes[i].getText());
                menuKeeping.setInd((String)cusRice.meatBoxes[i].getText());
                menuKeeping.setMoney(menuKeeping.getMoney()+40);
            }
            }
            menuKeeping.setMenuName(cusRice.menu.getText());
//            System.out.println(cusRice.menu.getText());
            if (cusRice.omelette.isSelected()){
//                System.out.println(cusRice.omelette.getText());
                menuKeeping.setEgg((String)cusRice.omelette.getText());
                menuKeeping.setMoney(menuKeeping.getMoney()+10);
            }
            else if (cusRice.friedegg.isSelected()){
//                System.out.println(cusRice.friedegg.getText());
                menuKeeping.setEgg((String)cusRice.friedegg.getText());
                menuKeeping.setMoney(menuKeeping.getMoney()+10);
            }
            else if (cusRice.boiledegg.isSelected()){
//                System.out.println(cusRice.boiledegg.getText());
                menuKeeping.setEgg((String)cusRice.boiledegg.getText());
                menuKeeping.setMoney(menuKeeping.getMoney()+10);
            }
            if (cusRice.spe.isSelected()){
//                System.out.println("true");
                menuKeeping.setMoney(menuKeeping.getMoney()+10);
                menuKeeping.setOption(Boolean.TRUE);
            }
            else if (cusRice.normal.isSelected()){
//                System.out.println("false");
                menuKeeping.setMoney(menuKeeping.getMoney());
                menuKeeping.setOption(Boolean.FALSE);
            }
            menuKeeping.setComnent(cusRice.comment.getText());
            System.out.print(menuKeeping.getMenuName() + " : ");
            System.out.println(menuKeeping.getInd());
            System.out.println(menuKeeping.getEgg());
            System.out.println(menuKeeping.getComnent());
            System.out.println(menuKeeping.getMoney());
            

//        } else if (e.getSource() == cusRice.bk) {
//            callingMenu.readMenu();
//        } else if ()
    }
    }
    public static void main(String[] args) {
        new actionperformclass1();
    }
}

    