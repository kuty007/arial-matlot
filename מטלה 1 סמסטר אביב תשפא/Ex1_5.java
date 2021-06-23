import java.util.Scanner;

public class Ex1_5 {
    public static void main(String[] a) {
        StdDraw.setCanvasSize(900, 900);
        double min = -10, max = 10;
        StdDraw.setScale(min, max);
        StdDraw.clear();
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.line(min, 0, max, 0);
        StdDraw.line(0, min, 0, max);
        Scanner sc = new Scanner(System.in);
        double j, b, c;
        System.out.println("Enter a: ");
        j = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        sc.close();
        double d = b * b - 4 * j * c;
        double sqrt_val = Math.sqrt((d));
        double min_max = -b / (2 * j);
        double y1 = c + b * min_max + j * Math.pow(min_max, 2);
        double max1 = Math.max(Math.abs(y1), Math.abs(min_max));
        if (max1 > max) {
            StdDraw.setScale(-1.25 * max1, 1.25 * max1);
        }
        double eps = 0.1;
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);
        double x0 = min;
        double y0 = c + b * x0 + j * Math.pow(x0, 2);
        for (double x = min + eps; x < max; x += eps) {
            double y = c + b * x + j * Math.pow(x, 2);
            StdDraw.line(x0, y0, x, y);
            x0 = x;
            y0 = y;
            StdDraw.show();
        }



        StdDraw.setPenRadius(0.008);
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE.brighter());
        StdDraw.setPenRadius(0.01);
        StdDraw.point(min_max, y1);
        StdDraw.setPenColor(StdDraw.BOOK_RED.brighter());
        StdDraw.text(min_max,y1,"("+min_max+" , "+y1+")");
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE.brighter());
        StdDraw.point(0, c);
        StdDraw.setPenColor(StdDraw.BOOK_RED.brighter());
        StdDraw.text(0,c , "("+0+" , "+c+")");

        if (sqrt_val==0){
            StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE.brighter());
            StdDraw.point(-b / (2 * j), 0);
            StdDraw.setPenColor(StdDraw.BOOK_RED.brighter());
            StdDraw.text(-b / (2 * j), 0, "("+-b / (2 * j)+" , "+0+")");
        }
        else if(sqrt_val>0){
            StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE.brighter());
            StdDraw.point((-b + sqrt_val) / (2 * j), 0);
            StdDraw.point((-b - sqrt_val) / (2 * j), 0);
            StdDraw.setPenColor(StdDraw.BOOK_RED.brighter());
            StdDraw.text((-b + sqrt_val) / (2 * j), 0, "("+(-b + sqrt_val) / (2 * j)+" , "+0+")");
            StdDraw.text((-b - sqrt_val) / (2 * j), 0, "("+(-b - sqrt_val) / (2 * j)+" , "+0+")");


        }





    }
}






