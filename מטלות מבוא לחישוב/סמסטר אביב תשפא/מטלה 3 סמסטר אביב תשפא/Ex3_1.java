import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {

        geussNumber(100);

    }

    public static void geussNumber(int N) {
        System.out.println("Plese chose number between 0 to " + N);
        int low, high, middle;
        high = N;
        int x = N / 2;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int cunter = 0;
        while (n != 1) {
            System.out.println("Is " + x + " is your number?");
            System.out.println("If " + x + " was your number press 1\n" +
                    "If your number is smaller than " + x + " press 2\n" +
                    "If your number is bigger than " + x + " press 3");
            n = sc.nextInt();
            if (n == 1 || n == 2 || n == 3) {
                cunter++;
            }
            if (n == 1) {
                System.out.println("WIN!");
                System.out.println("Number of steps = " + cunter);
                System.exit(0);
            } else if (n == 2) {
                high = x - 1;
                x = x / 2;
            } else if (n == 3) {
                low = x + 1;
                middle = (low + high) / 2;
                x = middle;
            }
        }
    }
}

