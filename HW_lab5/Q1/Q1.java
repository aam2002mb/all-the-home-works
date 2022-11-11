package HW_lab5.Q1;

public class Q1 {
    private double  balance;
    public Q1(double intialize ){
        balance=intialize;
    }
    public Q1(){
        balance=0;
    }

    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest(double interest)
    {
        balance=((interest/100)*balance)+balance;

    }
}
