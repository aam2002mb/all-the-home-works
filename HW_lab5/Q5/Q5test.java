package HW_lab5.Q5;

public class Q5test {
    public static void main(String[] args) {
        Q5 x=new Q5(1000,8);

        x.addInterest();
        System.out.println(x.getBalance());
        x.withdraw();
        System.out.println(x.getBalance());
    }
}
