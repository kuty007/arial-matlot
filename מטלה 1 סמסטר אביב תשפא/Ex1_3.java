import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        sc.close();
        double d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt((d));
        System.out.println(a + "x^2+" + b + "x+" + c + " = 0");
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
    }
}



