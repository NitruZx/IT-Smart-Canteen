package Main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class inform {

    private int orderA = 0, orderB = 0;
    private String nameStore;
    private String nDay, nTime;

    public String showDate() {
        LocalDate day = LocalDate.now();
        DateTimeFormatter fromDay = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        nDay = day.format(fromDay);
        return nDay;
    }

    public String showTime() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter fromTime = DateTimeFormatter.ofPattern("HH:mm");
        nTime = time.format(fromTime);
        return nTime;
    }

    public String getNa() {
        nameStore = "haha";
        return nameStore;
    }

    public inform() {
    }

    public boolean CheckOrder(String nameStore, int newOrder) {
        if (nameStore.equals("Store A") && (newOrder > orderA)) {
            orderA += 1;
        } else if (nameStore.equals("Store B") && (newOrder > orderB)) {
            orderB += 1;
        }
        System.out.println("It Smart Canteen");
        System.out.println("Date " + showDate());
        System.out.println("Time " + showTime());
        System.out.println(orderA);
        return true;

    }


    public static void main(String[] args) {
        inform form = new inform();
        String time = form.showDate();
//        String name = "Rice pig pig";
        try {
            try ( FileWriter myWriter = new FileWriter("C:\\\\Users\\\\Kanitphong\\\\Desktop\\\\StoreA.txt")) {
                myWriter.write("n = "+time);
                
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public int getOrderA() {
        return orderA;
    }

    public int getOrderB() {
        return orderB;
    }

    public String getNameStore() {
        return nameStore;
    }

    public void setOrderA(int orderA) {
        this.orderA = orderA;
    }

    public void setOrderB(int orderB) {
        this.orderB = orderB;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public String getnDay() {
        return nDay;
    }

    public void setnDay(String nDay) {
        this.nDay = nDay;
    }
}
