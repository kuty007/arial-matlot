import java.util.Arrays;

public class Ex3_3_1 {
    public static void main(String[] args) {
        int array[] = {7, 8, 9, 3, 5};
        //System.out.println((searchModArray(array, 7, 9)));
        //System.out.println((int) Math.pow(3, 21));
        System.out.println(mod(-5,-8));
        System.out.println((-5) % -8);
    }

    public static int mod(int m, int n) {
        int sum = 0;
        if (m<0&&n<0) {
            m = Math.abs(m);
            n = Math.abs(n);
            while (sum + n <= m) {
                sum += n;
            }
            return (m - sum)*-1;
        }

        if (m > 0 && n < 0) { // m % -n case
            n = Math.abs(n);
            while (m >= n)
                m -= n;
            return m;
        }
        if (m < 0 && n > 0) { // -m % n case
            m = Math.abs(m);
            while (m >= n)
                m -= n;
            return -m;
        }
            if (m < n && m > 0) {
                return m;
            } else if (m == n) {
                return 0;
            }
            while (sum + n <= m) {
                sum += n;
            }
            return m - sum;

    }

    public static int[] sortModArray(int[] a, int n) {
        int x = a.length;
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                if ((a[j] % n == a[j + 1] % n) && (a[j] > a[j + 1])) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                } else if (a[j] % n > a[j + 1] % n) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }


            }
        }
        return a;
    }

    public static int searchModArray(int[] a, int n, int num) {
        int max, min, mid;
        max = a.length - 1;
        min = 0;
        mid = (a.length) / 2;
        while (a[min] % n <= a[max] % n) {
            if (a[mid] % n < num % n) {
                min = mid + 1;
            } else if (a[mid] == num) {
                return mid;
            } else {
                max = mid - 1;
            }
            mid = (min + max) / 2;
            if (min > max) {
                System.out.println("Element is not found!");
                return -1;
            }

        }

        return -1;
    }
}



