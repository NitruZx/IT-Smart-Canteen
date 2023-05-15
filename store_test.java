
import java.util.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

public class store_test {

    private final JFrame bg;
    private final JPanel show, cook, tables;
    private final JButton add, delete;
    private final JLabel ingredient, price;
    private final JTable checking;
    private final JTextField ingretext, pricetext;
    private final Font thai;
    private final JScrollPane pane;
    private store_obj ohh;

    public store_test() {
        bg = new JFrame();
        show = new JPanel();
        cook = new JPanel();
        ohh = new store_obj();
        thai = new Font("Tahoma", Font.PLAIN, 18);
        show.setLayout(new GridLayout(1, 2));

        cook.setLayout(new GridLayout(3, 2));
        ingredient = new JLabel("Ingredient");
        ingredient.setBorder(new EmptyBorder(0, 10, 10, 10));
        ingretext = new JTextField();
        ingretext.setFont(thai);
        price = new JLabel("Price");
        price.setBorder(new EmptyBorder(0, 10, 10, 10));
        pricetext = new JTextField();
        add = new JButton("Add");
        add.setFont(thai);
        delete = new JButton("Delete");
        delete.setFont(thai);

        tables = new JPanel();
        checking = new JTable();

        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        checking.setModel(model);
        model.addColumn("Ingredient");
        model.addColumn("Price");
        pane = new JScrollPane(checking);
        checking.setFont(thai);
        Object[] row = new Object[2];

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (pricetext.getText().isEmpty() & ingretext.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please Enter your Ingredient and Price");
                } else if ( pricetext.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter your Price");
                } else if (ingretext.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please Enter your Ingredient");
                } else {  
                    try {
                        Integer.parseInt(pricetext.getText());
                        ohh.add(ingretext.getText(), pricetext.getText());
                        row[0] = ingretext.getText();
                        row[1] = pricetext.getText();
                        model.addRow(row);     
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please Enter your price");    
                }
                    
                pricetext.setText("");
                ingretext.setText("");
              }
            }
        });

        delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                int row = checking.getSelectedRow();
                DefaultTableModel model = (DefaultTableModel) checking.getModel();
                model.removeRow(row);
             
            }
        }
        );

        cook.add(ingredient);
        cook.add(ingretext);
        cook.add(price);
        cook.add(pricetext);
        cook.add(add);
        cook.add(delete);

        tables.add(pane);

        bg.add(show);
        show.add(cook);
        show.add(tables);

        bg.setSize(1024, 768);
        bg.setVisible(true);
        bg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new store_test();
    }
}
