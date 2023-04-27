package UserData;

import java.io.*;
import java.util.ArrayList;

public class SerializeDemo {
    public SerializeDemo() {
        readObject();
    }
    public void writeObject() {
        Account account = new Account();
        account.setName("NitruZx");
        account.setPassword("1234");
        account.setUseType("Owner");
        try {
            FileOutputStream fOut = new FileOutputStream("data.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fOut);
            oout.writeObject(account);
            oout.close(); fOut.close();
            System.out.println("Serialized data");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public void readObject() {
        Account account = null;
        try {
            FileInputStream fin = new FileInputStream("data.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            account = (Account) in.readObject();
            in.close();
            fin.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        System.out.println("Deserialized Account.");
        System.out.println("Name : "+account.getName());
        System.out.println("Pass : "+account.getPassword());
        System.out.println("Type : "+account.getUseType());
    }
    public void writeText() {
        String sentence = "I am the god of my own.";
        try (FileWriter fw = new FileWriter("text.txt")) {
            fw.write(sentence);
            System.out.println("Write successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readText() {
        int ch;
        char[] sentence = new char[100];
//        ArrayList arrayList = new ArrayList<>();
        try {
            InputStreamReader fileRead = new InputStreamReader(new FileInputStream("text.txt"));
            fileRead.read(sentence);
//            while ((ch = fr.read()) != -1) {
//                arrayList.add((char)ch);
//            }
            fileRead.close();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            System.out.println(sentence);
        }
    }
    public static void main(String[] args) {
        new SerializeDemo();
    }
}
