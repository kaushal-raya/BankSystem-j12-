package model;
import java.util.Date;
import  java.util.Random;
public class Account {
    private String name;
    private Integer accnum;
    private Double Balance;
    private String email;
    private Date creationDate;
    public String acctype;
    public  double IntRate;




    public Account(){

//        Constructionn Channing
       this("Ram",10.0,"ram33@gmail.com","Savings",5.55);


    }



    public Account(String name, Double balance, String email,String acctype,double intrate) {
        this.name = name;
        this.accnum = generateAccount();
        this.Balance = balance;
        this.email = email;
        this.creationDate=creationDate();
        this.acctype =acctype;
        this.IntRate=intrate;

    }


   private int generateAccount() {
        Random rand = new Random();
        int accnum = rand.nextInt(1000, 100000);
        return accnum;
    }

    public Date creationDate() {

        return new Date();

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accnum=" + accnum +
                ", Balance=" + Balance +
                ", email='" + email + '\'' +
                ", creationDate=" + creationDate +
                ", AccountType=" + acctype +
                '}';
    }

    public Integer getAccnum() {
        return accnum;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        if (balance <0){
            System.out.println("Cannot set balance to this");
            return;
        }


    }

    public String getAcctype() {
        return acctype;
    }

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public void setAccnum(Integer accnum) {
        if (accnum<1000 || accnum>10000) {
            System.out.println("Inavalid");
            return;
        }



    }
}