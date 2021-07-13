import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;

public class TestStdDraw3 {

	public static void main(String[] args) {
		//plot line y = ax + b, a!=0
		//two points (0, b), (1,a + b)
		int n = 20;
		double fn = n;
		double []x = new double[n];
		double []y = new double[n];
		double a = 0, b = 0;
		while (a== 0) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a: ");
			a = sc.nextInt();
			System.out.println("Enter b: ");
			b = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			x[i] = (i - n/2.0);
			y[i] = a*x[i] + b;
		}

		double yMin = b, yMax = b;
		for (int i = 0; i < n; i++) {
			if (y[i] > yMax)  yMax = y[i];
			else if (y[i] < yMin) yMin = y[i];
		}
		double xMin = -n/2.0, xMax = n/2.0;
		//////////
		StdDraw.setXscale(xMin,  xMax);
		StdDraw.setYscale(yMin, yMax);

		System.out.println(xMin+", "+xMax+", "+yMin+", "+yMax);

		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.005);
		// draw line
		for (int i = 1; i < n; i++) {
			StdDraw.line(x[i-1], y[i-1], x[i], y[i]);
		}
		StdDraw.setPenColor(Color.BLACK);
		//draw axis X
		StdDraw.line(xMin, 0, xMax,0);
		//draw axis Y
		StdDraw.line(0, yMin, 0, yMax);

		// draw intersection points
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.02);
		if (a != 0) StdDraw.point(-b/a, 0);
		StdDraw.point(0, b);

		// draw coordinates of intersection points
		StdDraw.setPenColor(Color.BLACK);
		Font font = new Font("Times New Roman", Font.BOLD, 16);
		StdDraw.setFont(font);
		if (a != 0) {
			StdDraw.text(-b/a-2, -1., "("+(-b/a)+", "+0+")");
		}
		StdDraw.text(1.5, b, "("+0+", "+b+")");
		// draw the origin
		StdDraw.text(1, -1, "("+0+", "+0+")");
		StdDraw.point(0,0);
	}
}
