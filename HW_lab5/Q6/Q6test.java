package HW_lab5.Q6;

public class Q6test {
    public static void main(String[] args) {
        Q6 ahmed=new Q6(1000);
        Q6 Saeed=new Q6(10000);
        Saeed.mystery(ahmed,5000);
        System.out.println("mohammed balance="+Saeed.getBalance());
        System.out.println("Ahmed balance="+ahmed.getBalance());
    }
}