package HW_lab5.Q5;

public class Q5 {

        private double  balance;
        private final double interest;

        public Q5(double initialize, final double interest ){
            balance=initialize;
            this.interest=interest; }


        public void withdraw() {
            balance-=balance;
        }

        public double getBalance() {
            return balance;
        }

        public void addInterest()
        {
            balance=((this.interest/100)*balance)+balance;

        }


}
