import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout; //GapBtn
import javax.swing.BorderFactory; //GapBtn
import javax.swing.Box; //GapBtn
import java.awt.GridLayout;
import java.awt.FlowLayout;


public class Basket {
    private final JFrame frame;
    private final JPanel panel, pn;
    private final JScrollPane scroll;
    private final JTable table;
    private final JButton btnAdd, btnBook, btnDel;

    public Basket(){
        frame = new JFrame();
        panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        pn = new JPanel();
        pn.setLayout(new FlowLayout());
        scroll = new JScrollPane();
        table = new JTable();
        btnAdd= new JButton(); btnBook = new JButton(); btnDel = new JButton();
        
        table.setModel(new DefaultTableModel(
            new Object [][]{
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
            },
            new String[]{
                "Order", "Menu", "Price", "Delete"
            }     
        ));
        scroll.setViewportView(table);
        scroll.setBounds(50, 50, 300, 150);
        
        btnAdd.setText("Add");
        btnAdd.setBounds(10, 463, 295, 35);
        btnBook.setText("Book");
        btnBook.setBounds(313, 463, 290, 35);
           
//        pn.setLayout(new BoxLayout(pn, BoxLayout.Y_AXIS));
//        pn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//        pn.add(Box.createVerticalGlue());
        
        panel.add(scroll);
        
        // Button
        pn.add(btnAdd);
//        pn.add(Box.createHorizontalStrut(10));
        pn.add(btnBook);
//        panel.add(Box.createVerticalGlue());
        
        panel.add(pn);
        frame.add(panel);
        
//        frame.pack();
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Basket();
    }
}
// yung mai sed tae gu ja pen ba laew