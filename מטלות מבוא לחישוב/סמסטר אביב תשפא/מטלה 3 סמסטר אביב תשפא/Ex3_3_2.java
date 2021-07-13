public class Ex3_3_2 {
    public static void main(String[] args) {
        System.out.println(phi(0));
    }

    public static int phi(int n) {
        if(n<0)
            return -1;
        if(n==0)
            return 0;
        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (gcd1(n, i)) {
                sum++;
            }
        }
        return sum;
    }
    public static boolean gcd1(int n, int i) {
        for (int j = 2; j <= i; j++) {
            if (i % j == 0 && n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
