package model;

import java.util.Random;
import  java.util.Scanner;

public class Customer {
    private String firstname;
    private String lastname ;
    private String email;
    private String phnum;
    private Integer pin;
    private double balance;
    private Integer cusId;
    public String password;
    public Account account;


    public Customer(){

    }


    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phnum='" + phnum + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                ", cusId=" + cusId +
                '}';
    }

    public Customer(String firstname, String lastname, String email, String phnum, Integer pin, double balance, Integer cusId, String password, Account account) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phnum = phnum;
        this.pin = pin;
        this.balance = balance;
        this.cusId = cusId;
        this.password = password;
        this.account = account;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhnum() {
        return phnum;
    }

    public void setPhnum(String phnum) {
        this.phnum = phnum;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    private int generateCusid() {
        Random rand = new Random();
        int cusId = rand.nextInt(100, 1000);
        return cusId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
