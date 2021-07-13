public class Ex2_2_1 {
    public static void main(String[] args) {
        System.out.println(isPerfect(45));
    }

    public static boolean isPerfect(int n) {
        if (n < 6)  //if n<6 (the first perfect number) return false
            return false;
        int sum = 1;
        for (int i = 2; i < n; i++) {//chack all the numbers between 2 to n-1 and if they divide n add them to sum
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;//if sum = n return true else return false
    }
}
