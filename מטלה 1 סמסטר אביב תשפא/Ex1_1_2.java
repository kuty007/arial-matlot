

import java.util.Scanner;

public class Ex1_1_2 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");
        n = sc.nextInt();
        sc.close();
        for (int i = 3; i <= n - 2; i++) {//loop over all the numbers till n-2
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {//loop for checking if the first number is prime
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            for (int j = 2; j <=Math.sqrt(i + 2); j++) {//loop for checking if the number +2 is prime
                if ((i + 2) % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println("(" + i + "," + (i + 2) + ")");//if both of the numbers are prime print them


            }
        }
    }
}
