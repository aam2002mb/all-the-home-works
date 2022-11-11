package HW_lab5.Q2;

public class Q2tester {
    public static void main(String[] args) {
        Q2 x=new Q2(1000,10);
        x.addInterest();
        System.out.println("expected result is 1100");
        System.out.println(x.getBalance());
    }
}
