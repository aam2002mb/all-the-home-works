package lab2.HW_Lab2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double x,y,z,sum,avg;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Three numbers :");
        x= in.nextDouble();
        y= in.nextDouble();
        z= in.nextDouble();
        sum=x+y+z;
        avg=sum/3;
        System.out.println("average ="+avg);
    }
}
