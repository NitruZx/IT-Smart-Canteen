
package DataCall2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CallingMenu2 extends MenuKeeping2 implements DataMain.DataBase{
        
    public CallingMenu2(){
        writeMenu();
        readMenu();
        
    }

    @Override
    public void writeMenu() {
        MenuKeeping2 menuKeeping2 = new MenuKeeping2();
        menuKeeping2.setTypeMenu("Yum");
        menuKeeping2.setLineMenu("small");
        menuKeeping2.setInd("หกฟก ฟหกหฟก ฟหกฟหก ฟหกฟก ฟหกฟก");
        menuKeeping2.setEgg("");
        menuKeeping2.setOption(true);
        menuKeeping2.setComnent("");
        try {
            FileOutputStream fOut = new FileOutputStream("C:\\\\Users\\\\Kanitphong\\\\Desktop\\\\StoreB.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);
            oout.writeObject(menuKeeping2);
            oout.close();
            fOut.close();
            System.out.println("Menu is succed");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @Override
    public void readMenu() {
        MenuKeeping2 menuKeeping = null;
        try {
            FileInputStream fin = new FileInputStream("C:\\\\Users\\\\Kanitphong\\\\Desktop\\\\StoreB.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            menuKeeping = (MenuKeeping2) oin.readObject();
            oin.close(); fin.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        System.out.println("Menu is");
        System.out.println("Name : "+menuKeeping.getTypeMenu());
        System.out.println("Name : "+menuKeeping.getLineMenu());
        System.out.println("Ind : "+menuKeeping.getInd());
        System.out.println("egg : "+menuKeeping.getEgg());
        System.out.println("Option :"+menuKeeping.getComnent());
    }
    public static void main(String[] args) {
        new CallingMenu2();
        }
}
