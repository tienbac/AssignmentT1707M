package Assignment.Model;

import java.sql.Connection;
import java.sql.SQLException;

public class CloseConnectionHelper {
    public static Connection connection = ConnectionHelper.getConnection();
    public void closeConnection(){
        if (connection != null){
            try {
                System.out.println("Connection is closing!");
                connection.close();
                System.out.println("Done!");
            } catch (SQLException e) {
                System.err.println("Can't close connection!");
                e.printStackTrace();
            }
        }
    }
}
