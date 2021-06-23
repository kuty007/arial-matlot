
package Ex2;
import java.util.Arrays;
public class Ex2 {
    public static void main(String[] args) {
        int[] po1 = {1, 2,-1,-2,-3,-4, 3,4,5};
        double[] po2={2, 0, 3, -1, 0};
        double[] po3={2, 0, 3,-1};

        double x1 =3.1958;
        System.out.println(f(po3,3.1958770751953125));
        System.out.println(root(po3,0,10,0.0001));


        //System.out.println(sort(po1, po1.length));
        int x = 1666666655;
        int y = 999999993;
    }

    //convert an given array that represents polynomial to string and add x^i(i represent the index)
    public static String poly(double[] polynom) {
        String polynomString = "";
        for (int i = polynom.length; i > 0; i--) {
            //handles the last index which is x^0
            if (polynom[i - 1] > 0 && i < polynom.length) {
                polynomString = polynomString.concat("+");
            }
            if (polynom[i - 1] == 0) {
                polynomString = polynomString.concat(String.format(""));
            } else if (i == 1) {
                polynomString = polynomString.concat(String.valueOf(polynom[i - 1]));
            } else if (i - 1 == 1) {
                polynomString = polynomString.concat(String.format("%.1fx", polynom[i - 1]));
            } else {
                polynomString = polynomString.concat(String.format("%.1fx^%d", polynom[i - 1], i - 1));
            }
        }
        return polynomString;
    }


    // the function get 2 arrays and return new array that equal to the sum of the given arrays on each index
    public static double[] add(double[] p1, double[] p2) {
        int size = Math.max(p1.length, p2.length);
        double sum[] = new double[size];

        for (int i = 0; i < p1.length; i++) {//take the values from each index in the first array and put them in the same index in the new array
            sum[i] = p1[i];
        }
        for (int i = 0; i < p2.length; i++) {//take the values from each index in the second  array and add them to the values in the same index in the new array
            sum[i] += p2[i];
        }
        return sum;
    }

    //the function get array that represents polynomial and value of x and return the value of f(x)
    public static double f(double[] poly, double x) {
        double y = 0;
        for (int i = poly.length; i > 0; i--) {
            //handles the last index which is x^0
            if (i == 1) {
                y += (poly[i - 1]);
            } else {
                y += (poly[i - 1] * Math.pow(x, (i - 1)));
            }
        }
        return y;


    }

    //the function get 2 arrays that represents polynomial and multiply them with each other
// and return new array with the result of the multiplication on each index
    public static double[] mul(double[] p1, double[] p2) {
        int size = p1.length + p2.length;
        double[] multiply = new double[size - 1];
        for (int i = 0; i < p1.length; i++) {
            for (int e = 0; e < p2.length; e++) {
                multiply[i + e] += p1[i] * p2[e];
            }
        }
        return multiply;
    }

    //The function receives an array representing a polynomial and returns an array representing the derivative of the polynomial
    public static double[] derivative(double[] po) {
        int size = po.length - 1;
        double[] derivative = new double[size];
        for (int i = size; i >= 1; i--) {
            derivative[size - 1] = po[i] * i;
            size--;
        }

        return derivative;
    }

    //The function receives an array representing a polynomial
// 2 values of X and Epsilon and returns the value of X to the distance of Epsilon from the point where where Y is equal to 0
    public static double root(double[] p, double x1, double x2, double eps) {
        if (f(p, x1) * f(p, x2) >= 0) {//If this thing holds or Y is never equal to 0 or the X values given did not cause a sign change
            System.out.println("You have not set x1 and x2 right/this polynomial doesn't have intersection point with X axis");
            System.exit(0);
        }
        double mid = 0;
        while (Math.abs(x2 - x1) >= eps) {
            mid = (x1 + x2) / 2;
            if (f(p, mid) == 0.0)//This means that the point of intersection is at the beginning of the axes
                break;
            else if (f(p, mid) * f(p, x1) < 0) {//This means that the point of intersection is at the left of the axes
                x2 = mid;
            } else {//This means that the point of intersection is at the right of the axes
                x1 = mid;
            }
        }
        return mid;

    }




    public static int sort (int arr[], int n) {

        int max = 1, len = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < 0)
                len++;
            else {
                if (max < len)
                    max = len;
                len = 0;
            }
        }
        if (max < len)
            max = len;

        return max;


    }
}