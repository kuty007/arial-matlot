import java.util.ArrayList;

public class Ex2_1 {

    public static int[] primeDividers(int n) {
        ArrayList<Integer> prime_factors = new ArrayList<>();//crate array for the prime factors
        while (n % 2 == 0) {//add 2 to the array while n % 2 = 0 and than divide by 2
            prime_factors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= (n); i += 2) {//loop over all the numbers between 3 to n and if n % i = 0  add to the array and than divide by i
            while (n % i == 0) {
                prime_factors.add(i);
                n /= i;
            }
        }
        return prime_factors.stream().mapToInt(i -> i).toArray();
    }

}


