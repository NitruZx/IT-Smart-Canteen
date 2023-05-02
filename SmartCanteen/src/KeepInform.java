
import Main.inform;
import java.io.*;

public class KeepInform extends inform {

    public static void main(String[] args) {
        String name = " ssss ";
        try {
            try ( FileWriter myWriter = new FileWriter("C:\\\\Users\\\\Kanitphong\\\\Desktop\\\\StoreA.txt")) {               
                myWriter.write(name);
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
