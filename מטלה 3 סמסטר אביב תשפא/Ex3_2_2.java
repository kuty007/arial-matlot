public class Ex3_2_2 {
    public static boolean checkPowerThree(int n) {
        if (n <= 0)
            return false;
        StringBuilder result = new StringBuilder("=" + n);
        int pow = 20;
        for (int i = pow; i >= 0; i--) {
            int sub = (int) Math.pow(3, i);
            if (n - sub >= 0) {
                n = n - sub;
                result.insert(0, "3^" + i + "+");
            }
            if (n == 0) {
                int pos = result.toString().indexOf('=');
                result = new StringBuilder(result.substring(0, pos - 1) + result.substring(pos));
                System.out.println(result);
                return true;

            }
        }
        return false;

    }
}
