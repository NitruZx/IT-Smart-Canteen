package DataCall;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CallingMenu {

    private MenuKeeping menuKeeping;

    public CallingMenu() {

        //   writeMenu();
        // readMenu();
    }

    //  @Override
    public void writeMenu(MenuKeeping menuKeeping) {
        // MenuKeeping menuKeeping = new MenuKeeping();
        menuKeeping.setMenuName(menuKeeping.getMenuName());
        menuKeeping.setInd(menuKeeping.getInd());
        menuKeeping.setEgg(menuKeeping.getEgg());
        menuKeeping.setOption(menuKeeping.isOption());
        menuKeeping.setComnent(menuKeeping.getComnent());
        menuKeeping.setMoney(menuKeeping.getMoney());

        //   menuKeeping.setComnent("");
        try {
            FileOutputStream fOut = new FileOutputStream("C:\\\\Users\\\\Kanitphong\\\\Desktop\\\\StoreA.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);
            oout.writeObject(menuKeeping);
            oout.close();
            fOut.close();
            System.out.println("Menu is succed");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    //   @Override
    public void readMenu() {
        MenuKeeping menuKeeping = null;
        try {
            FileInputStream fin = new FileInputStream("C:\\\\Users\\\\Kanitphong\\\\Desktop\\\\StoreA.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            menuKeeping = (MenuKeeping) oin.readObject();
            oin.close();
            fin.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        System.out.println("Menu is");
        System.out.println("Name : " + menuKeeping.getMenuName());
        System.out.println("Ind : " + menuKeeping.getInd());
        System.out.println("egg : " + menuKeeping.getEgg());
        System.out.println("Option : " + menuKeeping.isOption());
        System.out.println("Comment : " + menuKeeping.getComnent());
        System.out.println("+ money : " + menuKeeping.getMoney());
    }

    public static void main(String[] args) {
        new CallingMenu();
    }
}
