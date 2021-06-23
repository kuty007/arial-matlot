

import java.util.Scanner;

public class Ex1_4 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: 0) exit, 1) aX^2+bX+c=0");
        x = sc.nextInt();
        if (x != 1) {
            System.out.println("Ex1 - done!");
        }
        while (x == 1) {
            double a, b, c;
            System.out.println("Enter a: ");
            a = sc.nextDouble();
            System.out.println("Enter b: ");
            b = sc.nextDouble();
            System.out.println("Enter c: ");
            c = sc.nextDouble();
            System.out.println(a + "x^2+" + b + "x+" + c + " = 0");


            double d = b * b - 4 * a * c;
            double sqrt_val = Math.sqrt((d));
            if (a == 0 && b == 0 && c == 0) {
                System.out.println("x1 can be any number - trivial!");
            } else if (a == 0 && b == 0) {
                System.out.println("Error, no answer!");
            } else if (a == 0) {
                System.out.println("X1=X2=" + -c / b);
            } else if (d > 0) {
                System.out.println("X1=" + (-b + sqrt_val) / (2 * a) + "\n"
                        + "X2=" + (-b - sqrt_val) / (2 * a));
            } else if (d == 0 && a != 0) {
                System.out.println("X1=X2=" + -b / (2 * a));
            } else if (d < 0) {
                System.out.println("the parabola does not intersect the x-axis");
            }
            System.out.println("enter a number: 0) exit, 1) aX^2+bX+c=0");
            x = sc.nextInt();
            if (x != 1) {
                System.out.println("Ex1 - done!");
            }


        }


    }

}




