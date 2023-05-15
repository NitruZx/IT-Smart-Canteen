package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    public static Connection mycon() {
        Connection con = null;
        final String DB_URL = "jdbc:mysql://db4free.net:3306/kinsabye";
        final String Username = "nitruzx";
        final String Password = "tj08706772308211";

        try {
            con = DriverManager.getConnection(DB_URL, Username, Password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}
