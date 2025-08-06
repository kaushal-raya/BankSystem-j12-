package Managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static Connection connection = null;
    static String jdbcUrl = "jdbc:postgresql://localhost:5432/Bank";
    static String username = "postgres";
    static String pass = "kaushal@999";

//   private DBConnection(){
//
//   }

    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            if (connection == null) {
                connection = DriverManager.getConnection(jdbcUrl, username, pass);
                System.out.println("Sucessfully connected to the database ");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Postgreesql JDBC driver not found :" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error in Sql :" + e);
        }
        return connection;
    }
}
