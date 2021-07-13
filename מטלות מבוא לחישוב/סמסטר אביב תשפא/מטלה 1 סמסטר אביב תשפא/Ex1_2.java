
import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Enter n1: ");
        n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        n2 = sc.nextInt();
        sc.close();
        int x = Math.min(n1, n2);//find the minimum between n1&n2
        int y = Math.max(n1, n2);//find the max between n1&n2
        int sum = 1;
        int sum1 = 0;
        String bin_num = Integer.toBinaryString(x);//find the value of min number in binary
        String result= "";
        int[] nums = new int[bin_num.length()];
        for (int i = bin_num.length() - 1; i >= 0; i--) {
            System.out.println(sum + "," + y);
            nums[i] = y;
            if (bin_num.charAt(i) == '1') {
                sum1 += y;// if the char in index i of the bin number equal to 1 add y to the sum
                result += "" + y + "+";
            }
            sum *= 2;//multiply min number by 2
            y *= 2;//multiply max number by 2
        }
        System.out.println("The result of " + n1 + "*" + n2 + " is: " + result.substring(0, result.length() - 1) + "=" + sum1);
    }
}




