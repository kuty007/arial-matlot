

public class TestStdDraw1 {

	public static void main(String[] args) {
		//Sets the canvas (drawing area) to be 512-by-512 pixels
		//StdDraw.setCanvasSize(100, 200);
		StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.point(0.5, 0.5);
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.line(0.2, 0.2, 0.8, 0.2);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.circle(100, 100, 0.5);

	}

}
