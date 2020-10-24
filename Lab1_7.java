import java.util.Scanner;
import java.util.Date;

class Account{
    private int id;
    private double balance,annualInterestRate;
    private Date dateCreated;
    
    Scanner gg = new Scanner(System.in);
    
    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }
    
    public double getMonthlylnteresRate(int a){
        return annualInterestRate;
    }
    public void setall(){
        
        this.id = gg.nextInt();
        this.balance = gg.nextDouble();
        this.annualInterestRate = gg.nextDouble();
        this.dateCreated = new Date();
    }
    public double getMonthlyInterest(){
        return (annualInterestRate/100) * balance;
    }
    public void withdraw(double mom){
        balance -= mom;
    }
    public void deposit(double mom){
        balance += mom;
    }
    public double getbalance(){
        return balance;
    }
    public double getid(){
        return id;
    }
    public Date getdateCreated(){
        return dateCreated;
    }
}

public class Lab1_7 {
    public static void main(String[] args) {
        Account wow = new  Account(1122 , 20000, 4.5);
        wow.withdraw(2500);
        wow.deposit(3000);
        System.out.println(wow.getbalance());
        System.out.println(wow.getMonthlyInterest());
    }
}
