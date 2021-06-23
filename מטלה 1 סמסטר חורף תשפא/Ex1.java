

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
    }
    public static boolean isprime(int num) {  // function that check if number is a prime number and return value of true or false
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {//check all the numbers (x) between 2 to the root of the given number (num)
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String mpgcd(String[] args) {         //function that find the largest common prime divider between 2 numbers(a,b)
        int num1, num2;
        if (args.length < 2) {                        //check if we already got input to are function and if not ask the user to input numbers
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter the first number for max prime GCD: ");
            num1 = myObj.nextInt();
            System.out.println("Enter the number second number for max prime GCD: ");
            num2 = myObj.nextInt();

        } else {
            num1 = Integer.parseInt(args[0]);    //change the type of input from string to int
            num2 = Integer.parseInt(args[1]);    //change the type of input from string to int
        }
        int x = Math.min(num1, num2);           // find the small number between num1 and num2 and call him x
        int maxprimedivder = 1;                 // set a variable maxprimedivder to be equal to 1
        if (x > 0) {
            for (int i = x; 2 <= i; i--) {      // check all the numbers (i) form x to the number 2 in descending order
                if (num1 % i == 0 && num2 % i == 0 && isprime(i) == true) {// check if the number is the divider of num1 and num 2 and if this is a prime number
                    maxprimedivder = i;         //if we found number i that is true for all the conditions in the previous stage update the value of maxprimedivder to be equal to him
                    return ("Computes the GPCD(" + num1 + "," + num2 + ") =\n" + "Max Prime Common Divider: " + maxprimedivder);    // once we found maxprimedivder we return him
                }
            }
        }
        return ("Computes the GPCD(" + num1 + "," + num2 + ") =\n" + "Max Prime Common Divider: " + maxprimedivder);               // if we didn't found any prime divider of num 1 and num 2 return the value we set at the first stage
    }
}


