
package DataCall2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CallingMenu2{
        private MenuKeeping2 menuKeeping2;
    public CallingMenu2(){
//        writeMenu();
//        readMenu();
    }
    public void writeMenu(MenuKeeping2 menuKeeping2) {
//        MenuKeeping2 menuKeeping2 = new MenuKeeping2();
        menuKeeping2.setTypeMenu(menuKeeping2.getTypeMenu());
        menuKeeping2.setLineMenu(menuKeeping2.getLineMenu());
        menuKeeping2.setInd(menuKeeping2.getInd());
        menuKeeping2.setEgg(menuKeeping2.getEgg());
        menuKeeping2.setOption(menuKeeping2.isOption());
        menuKeeping2.setComnent(menuKeeping2.getComnent());
        menuKeeping2.setMoney(menuKeeping2.getMoney());
        try {
            FileOutputStream fOut = new FileOutputStream("C:\\\\Users\\\\Kanitphong\\\\Desktop\\\\StoreB.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);
            oout.writeObject(menuKeeping2);
            oout.close();
            fOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

//    @Override
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
        System.out.println("NameType : "+menuKeeping.getTypeMenu());
        System.out.println("Line : "+menuKeeping.getLineMenu());
        System.out.println("Ind : "+menuKeeping.getInd());
        System.out.println("egg : "+menuKeeping.getEgg());
        System.out.println("Option :"+menuKeeping.isOption());
        System.out.println("Option :"+menuKeeping.getComnent());
        System.out.println("Money :"+menuKeeping.getMoney());
    }
    public static void main(String[] args) {
        new CallingMenu2();
        }
}
