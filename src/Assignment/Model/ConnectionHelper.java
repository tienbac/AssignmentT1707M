package Assignment.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    private static Connection connection = null;
    public static Connection getConnection(){
        if (connection == null){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment_fpt", "root", "");
                System.out.println("DONE !");
            } catch (SQLException e) {
                System.out.println("Can't connect database!");
                connection = null;
            }
        }
        return connection;
    }
}
