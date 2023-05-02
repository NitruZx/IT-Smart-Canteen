package Main;

import DataCall2.MenuKeeping2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.print.Book;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class actionperformclass extends DataCall2.MenuKeeping2 implements ActionListener {
 
    private Cusnoodle cusNoodle;

    public actionperformclass() {
        cusNoodle = new Cusnoodle();
        cusNoodle.book.addActionListener(this);
        cusNoodle.bk.addActionListener(this);
        cusNoodle.ad.addActionListener(this);
        for (JCheckBox Linebox : cusNoodle.Ind) {
            Linebox.addActionListener(this);
            for (JCheckBox eggBox : cusNoodle.eggBoxs) {
                eggBox.addActionListener(this);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cusNoodle.book) {
            System.exit(0);
        } else if (e.getSource() == cusNoodle.bk) {
            cusNoodle.comment.setText("Button Pressed!");
        } else if (e.getSource().equals(cusNoodle.ad)) {
            System.out.println(cusNoodle.manu.getItemAt(cusNoodle.manu.getSelectedIndex()));
            //setTypeMenu((cusNoodle.manu.getSelectedIndex()));
             if (cusNoodle.line1.isSelected()){
                System.out.println(cusNoodle.line1.getText());
                 //setLineMenu(cusNoodle.line1.getText());
            }
              if (cusNoodle.line2.isSelected()){
                System.out.println(cusNoodle.line2.getText());
            }
               if (cusNoodle.line3.isSelected()){
                System.out.println(cusNoodle.line3.getText());
            }
                if (cusNoodle.line4.isSelected()){
                System.out.println(cusNoodle.line4.getText());
            }
                 if (cusNoodle.line5.isSelected()){
                System.out.println(cusNoodle.line5.getText());
            }
            for (JCheckBox Linebox : cusNoodle.Ind) {
                if (Linebox.isSelected()) {
                    System.out.print(Linebox.getText()+" ");
                }
            }
            for (JCheckBox eggBox : cusNoodle.eggBoxs) {
                if (eggBox.isSelected()) {
                    System.out.println(eggBox.getText());
                }
            }
            if (cusNoodle.spc1.isSelected()){
                System.out.println("false");
            }
            if (cusNoodle.spc2.isSelected()){
                System.out.println("true");
            }
        }
    }

    public static void main(String[] args) {
        new actionperformclass();
    }

}
