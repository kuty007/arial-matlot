import java.util.Scanner;

public class Ex1_1_3 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        System.out.println("Enter m: ");
        m = sc.nextInt();
        sc.close();
        for (int i = 2; i <= n - m; i++) {//loop over all the numbers till n-m
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {//loop for checking if the first number is prime
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            for (int j = 2; j <= Math.sqrt(i + m); j++) {//loop for checking if the number + m is prime
                if ((i + m) % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("(" + i + "," + (i + m) + ")");//if both of the numbers are prime print them


            }
        }
    }
}

