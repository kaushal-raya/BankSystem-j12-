package Managers;

import model.Account;
import model.Customer;
import model.Transaction;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TransactionManager {

   public void withdraw(Customer acc){
       double currBalance=acc.getAccount().getBalance();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Email");
       sc.nextLine();
       System.out.println("Enter your password");
       sc.nextLine();
       System.out.println("Enter the amount you want to withdraw");
       double balance = sc.nextDouble();
       if (balance <= acc.getBalance()){
        Double newbalance=balance-currBalance;
        acc.setBalance(newbalance);
        System.out.println("Your new balance is "+newbalance);

       }
       else {
           System.out.println("Insufficient Amount Cant Withdraw");
       }
   }
   public void deposit(Customer acc){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter yout account ID");
       double newbalance=sc.nextDouble();
       acc.setBalance(newbalance);


   }


}
