package Managers;

import model.Account;
import model.Customer;
import java.util.Scanner;

public class AuthManager {


    public Customer userLogin(String email, String password) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email");
        scanner.nextLine();
        System.out.println("Enter your password");
        scanner.nextLine();
        if (email.equals("admin@gmail.com") && password.equals("admin@123")) {
            Account acc = new Account();
            return null;
//            return new Customer("Admin", "admin", "admin@gmail.com", "000000000", 1111, 1111.0, 222, "admin@123");

        }
        return null;


    }

    public void changePin(Customer customer) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your old pin");
        Integer pin = scanner.nextInt();
        System.out.println("Enter your new  pin");
        Integer newpin = scanner.nextInt();
        customer.setPin(newpin);

    }
    public  void changePass(Customer customer){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your old password");
        scanner.nextLine();
        System.out.println("Enter the new Password");
        String pass =scanner.nextLine();
        customer.setPassword(pass);



    }



}