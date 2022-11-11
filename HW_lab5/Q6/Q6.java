package HW_lab5.Q6;

public class Q6 {
    private double  balance;
    public Q6(double initialize ){
        balance=initialize;
    }
    public Q6(){
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

    public void  mystery(Q6 that, double amount)
    { this.balance = this.balance - amount;
        that.balance = that.balance + amount; }

    public void addInterest(double interest)
    {
        balance=((interest/100)*balance)+balance;

    }

}
