

import java.util.Scanner;

public class Ex1_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");//get the value of n from the user
        n = sc.nextInt();//set the value of n
        sc.close();
        boolean prime = true;
        if (n < 2)
            prime = false;
        int x = 2;
        while (x <= Math.sqrt(n)) { //check all the numbers (x) between 2 to the square root of the  given number (n)
            if (n % x == 0) {   // if the number(num) can be divided by x without reminder
                prime = false;      // num is not a prime number
                break;
            }
            x++;
        }
        System.out.println(prime);              //print the value of n if is prime number or not. if we checked all the numbers and they not divided num without reminder num is prime number
    }
}

/*
    //An effective way to solve all the sections of question number 1 using functions
    public static boolean isprime(int num) { // function that check if number is a prime number and return value of true or false
        if (num < 2)
            return false;
        int x = 2;
        while (x <= Math.sqrt(num)) {         //check all the numbers (x) between 2 to the given number (num)
            if (num % x == 0) {   // if the number(num) can be divided by x without reminder
                return false;      // num is not a prime number
            }
            x++;
        }
        return true;              // if we checked all the numbers and they not divided num without reminder num is prime number
    }

    public static void twin_prime(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if (isprime(i) && isprime(i + 2)) {
                System.out.println("(" + i + "," + (i + 2) + ")");
            }

        }

    }

    public static void prime_gap(int n, int m) {
        for (int i = 2; i <= n - m; i++) {
            if (isprime(i) && isprime(i + m)) {
                System.out.println("(" + i + "," + (i + m) + ")");
            }
        }
    }
}



 */
