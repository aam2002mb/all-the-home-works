package HW_lab5.Q2;

public class Q2 {
    private double  balance;
    double interest;

    public Q2(double initialize, double interest ){
        balance=initialize;
        this.interest=interest; }

    public void deposit(double amount) {
        balance+=amount;
    }
    public void withdraw(double amount) {
        balance-=amount;
    }

    public double getBalance() {
        return balance;
    }

    public void addInterest()
    {
        balance=((this.interest/100)*balance)+balance;

    }
}
