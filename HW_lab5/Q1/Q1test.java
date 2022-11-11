package HW_lab5.Q1;

public class Q1test {
    public static void main(String[] args) {
        Q1 acc=new Q1();
        acc.deposit(1000);
        acc.withdraw(500);
        acc.withdraw(400);
        System.out.println("expected balance is 100");
        System.out.println(acc.getBalance());
        acc.deposit(900);
        acc.addInterest(10);
        System.out.println(acc.getBalance());

    }
}
