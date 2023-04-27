package UserData;

import java.io.*;
import java.util.ArrayList;

public class SerializeDemo {
    public SerializeDemo() {
        readText();
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
        String[] sentence = new String[100];
        ArrayList array = new ArrayList();
//        ArrayList arrayList = new ArrayList<>();
        try {
//            InputStreamReader fileRead = new InputStreamReader(new FileInputStream("text.txt"));
            FileReader fileRead = new FileReader("text.txt");
//            fileRead.read(sentence);
            while ((ch = fileRead.read()) != -1) {
                array.add((char)ch);
            }
            fileRead.close();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        } finally {
            System.out.println(array);
        }
    }
    public static void main(String[] args) {
        new SerializeDemo();
    }
}
