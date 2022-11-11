package lab2.HW_Lab2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double perimeter,area,a,b;
        System.out.println("print perimeter and area of rectangle");
        System.out.println("---------------------");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length & width");
        a=in.nextDouble();
        b=in.nextDouble();
        perimeter=2*(a+b);
        System.out.println("Perimeter ="+perimeter);
        System.out.println("---------------------");
        area=a*b;
        System.out.println("Area ="+area);
    }
}
