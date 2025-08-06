package org.example;

import Managers.DBManager;
import model.Account;
import model.Customer;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/Bank";
    static final String USER = "postgres";
    static final String PASS = "kaushal@999";
    public static void main(String[] args) {
        Main mn1 = new Main();
        mn1.mainMenu();
    }
    public void mainMenu() {
        Main mn = new Main();
        Customer cus = new Customer();
        DBManager dbManager = new DBManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bank Management System");
        System.out.println("1.Create Account");
        System.out.println("2.View Details");
        System.out.println("3.Deposit Money");
        System.out.println("4.Withdraw Money");
        System.out.println("5.Manage Customer(Update/View/Delete/Insert");
        System.out.println("Enter your Choice:");
        int ch = scanner.nextInt();
        if (ch == 1) {
            mn.CreateAccount();
        } else if (ch == 2) {
            mn.toString();
        } else if (ch == 3) {
            return;
        } else if (ch == 5) {
            System.out.println("1.Update");
            System.out.println("2.View");
            System.out.println("3.Delete");
            System.out.println("4.Insert");
            Integer cho = scanner.nextInt();
            if (cho == 1) {
                dbManager.updatePin();
            } else if (cho == 2) {
                dbManager.readCustomerData("22");
            } else if (cho == 3) {
                dbManager.deleteCustomer();
            } else if (cho == 4) {
                dbManager.insertCustomer();
            } else {
                System.out.println("Choose from (1-4)");
            }

        }
    }
    public Customer CreateAccount() {
        System.out.println("Fill the details to create an Account");
        Scanner scanner = new Scanner(System.in);
        Customer cus = new Customer();

        System.out.println("Enter Your first name: ");
        String firstname = scanner.nextLine();
        cus.setFirstname(firstname);

        System.out.println("Enter your last name:");
        String lastname = scanner.nextLine();
        cus.setLastname(lastname);

        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        cus.setEmail(email);

        System.out.println("Enter your phone number:");
        String phnum = scanner.nextLine();
        cus.setPhnum(phnum);

        System.out.println("Enter your pin:");
        Integer pin = scanner.nextInt();
        cus.setPin(pin);

        System.out.println("Enter your balance:");
        Double balance = scanner.nextDouble();
        cus.setBalance(balance);

        Account acc = new Account();
        System.out.println("Choose Account Type");
        System.out.println("1.SAVINGS");
        System.out.println("2.CURRENT");
        int choice = scanner.nextInt();
        String acctype = (choice == 1) ? "SAVINGS" : "CURRENT";
        acc.setAcctype(acctype);
        return null;
    }
}