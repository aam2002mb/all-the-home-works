package lab3.HW_Lab3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number :");
        int x= in.nextInt();
        if(x>0)
            System.out.println("positive");
        else if(x<0)
            System.out.println("negative");
        else if(x==0)
            System.out.println("Zero");
    }
}
