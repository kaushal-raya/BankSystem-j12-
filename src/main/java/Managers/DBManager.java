package Managers;

import model.Customer;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBManager {

    Connection conn = null;

    public DBManager() {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BankDB", "postgres", "kaushal@999");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void insertCustomer() {
        String firstname = "Ram";
        String lastname = "Karki";
        String email = "ram33@gmail.com";
        String phone_num = "9847384374";
        Integer pin = 8888;
        Integer cusid = 55;
        String pass = "Ram@123";
        Integer accnum = 44;
        try {
            String sql = "INSERT INTO public.\"Customer\"(\n" +
                    "\tfirstname, lastname, email, phnum, pin, cusid, password, accnum)\n" +
                    "\tVALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, firstname);
            pstmt.setString(2, lastname);
            pstmt.setString(3, email);
            pstmt.setString(4, phone_num);
            pstmt.setInt(5, pin);
            pstmt.setInt(6, cusid);
            pstmt.setString(7, pass);
            pstmt.setInt(8, accnum);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("\ud83c\udf89 Your result was saved to the database!");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void readCustomerData(String cusId) {
        try {
            String sql = "SELECT * FROM public.\"Customer\" where firstname = " + cusId + "";
            Statement statement = conn.createStatement();
            boolean status = statement.execute(sql);
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void deleteCustomer() {
        Integer cusid = 55;
        try {
            String sql = "DELETE FROM public.\"Customer\" WHERE cusid= " + cusid;
            Statement statement = conn.createStatement();
            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void updatePin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer id you want to make change on(Cannot be null) :");
        Integer ucusid=sc.nextInt();
        System.out.println("Enter the PIN if you want to change");
        Integer new_pin= sc.nextInt();
        try {
            String sql = "UPDATE public.\"Customer\" SET pin=? WHERE cusid=?";
            PreparedStatement pstmt=conn.prepareStatement(sql);
           pstmt.setInt(1,new_pin);
           pstmt.setInt(2,22);
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


//    /class
}
//public Customer addCustomerData(Customer cus){
//
//}
//

//public Customer updateCustomer(Customer cc){
//
//}
//}