
import java.util.*;
public class Lab6_5_6 {
    public static void main(String[] args) {
        Person yaya = new Person("Yaya","Sperbund");
        Date yayaDate = new Date(26,7,2020);
        Account yayaAccount = new Account(1100,20000);
        yayaAccount.setPerson(yaya);
        yayaAccount.setDateCreated(yayaDate);
        yayaAccount.withdraw(500);
        Person nadej = new Person("Nadej","Hungry");
        Date nadejDate = new Date(12,8,2020);
        Account nadejAccount = new Account(1123,20000);
        nadejAccount.setPerson(yaya);
        nadejAccount.setDateCreated(yayaDate);
        nadejAccount.withdraw(500);
        //6.1
        SavingAccount yayaSavingAccount = new SavingAccount(1100,20000);
        SavingAccount nadejSavingAccount = new SavingAccount(1123,20000);
        yayaSavingAccount.setannualInterestRate(4.5);
        yayaSavingAccount.withdraw(2500);
        yayaSavingAccount.deposit(3000);
         yayaSavingAccount.transfer(nadejSavingAccount,5000);
         System.out.println("Detail of Yaya's account : "+ yayaSavingAccount);
         System.out.println("Detail of Nadej's account : "+ nadejSavingAccount);
         
        

    }
    }
    class Date{
        private int d,m,y;
        Date(){}
        Date(int d,int m,int y){
            this.d=d;
            this.m=m;
            this.y=y;
    
}
        @Override
        public String toString(){
            return this.d+"/"+this.m+"/"+this.y;
        }
}
        class Person{
        Date dDate;
        String name,surname;
        int age;
        Person(){}
        Person(String name,String surname){
            this.name = name;
            this.surname = surname;
        }
        @Override
        public String toString(){
            return this.name+" "+this.surname;
        } 
    }
class FixAccount extends Account {
	FixAccount(){}
	FixAccount(int id,double balance){
		super(id,balance);
	}
        @Override
        void transfer(Account a,double amount)
        {
            System.out.println("Can't Transfer");
        }
}
class SavingAccount extends Account{
    SavingAccount(){}
    SavingAccount(int id,double balance){
        super(id,balance);
    }
    @Override
    void transfer(Account tar,double amount){
        this.setbalance(this.getbalance()-amount-20);
        tar.setbalance(tar.getbalance()+amount);
    }
}
//5
    class Account{
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dateCreated;
        private double setannuallnterestRate;
        private Person obPerson;
     
        Account(){}
        Account(int id,double balance){
            this.id =id;
            this.balance =balance;
            this.annualInterestRate = annualInterestRate;
        }
        public void setID(int id){
            this.id =id;
        }
        public int getID(){
            return this.id;
        }
         void setPerson (Person p) {
            this.obPerson = p;
	}
        public void setbalance(double balance){
            this.balance = balance;
        }
        public double getbalance(){
            return balance;
        }
        public void setannualInterestRate(double annualInterestRate){
            this.annualInterestRate = annualInterestRate;
        }
        public double getannualInterestRate(){
            return annualInterestRate;
        }
        public void setdateCreated(Date d){
            this.dateCreated = d;
        }
        public Date getdateCreated(){
            return dateCreated;
        }
        double getMonthlyInterestRate(){
        return annualInterestRate/12;
        }
         void getMonthlyInterest(double amount){
          this.annualInterestRate = this.annualInterestRate * amount;
        }
        void withdraw(double amount){
            this.balance = this.balance-amount;
        }
        void deposit(double amount){
            this.balance = this.balance+amount;
        }
        void setDateCreated(Date d){
      this.dateCreated=d;      
        }
        void transfer(Account tar,double money){
            this.balance -=money;
            tar.setbalance(tar.getbalance()+money);
        }
        public String toString(){
            return this.id+" "+this.balance;
        }
    }