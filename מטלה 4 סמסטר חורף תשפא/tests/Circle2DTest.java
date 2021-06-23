package ex4.tests;

import ex4.geometry.Circle2D;
import ex4.geometry.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2DTest {
    Circle2D dengrte = new Circle2D(new Point2D(0, 0), 0);
    Point2D p12 = new Point2D(0, 0);

    @Test
    void testToString() {
        Circle2D kuty = new Circle2D(new Point2D(0, 0), 5);
        String out1 = "Circle2D," + "0.0" + "," + "0.0" + "," + "5.0";
        assertEquals(kuty.toString(),out1);
        Circle2D kuty1 = new Circle2D(new Point2D(86, 41), 4.5);
        String out2 = "Circle2D," + "86.0" + "," + "41.0" + "," + "4.5";
        assertEquals(kuty1.toString(), out2);
    }

    @Test
    void contains() {
        Circle2D kuty = new Circle2D(new Point2D(0, 0), 5);
        Point2D p = new Point2D(10, 9);
        Point2D p1 = new Point2D(5, 0);
        Point2D p2 = new Point2D(3, 4);
        Point2D p3 = new Point2D(0, 0);
        assertFalse(kuty.contains(p));
        assertTrue(kuty.contains(p1));
        assertTrue(kuty.contains(p2));
        assertTrue(dengrte.contains(p3));
        assertFalse(dengrte.contains(p));

    }

    @Test
    void centerOfMass() {
        Point2D p1 = new Point2D(5, 0);
        Circle2D kuty = new Circle2D(p1, 4);
        assertEquals(p1, kuty.centerOfMass());
        assertEquals(p12, dengrte.centerOfMass());
    }

    @Test
    void area() {
        Circle2D kuty = new Circle2D(new Point2D(0, 0), 5);
        assertEquals(Math.PI * 25, kuty.area());
        Circle2D kuty1 = new Circle2D(new Point2D(-950, 9), 8);
        assertEquals(Math.PI * 64, kuty1.area());
        Circle2D kuty2 = new Circle2D(new Point2D(-950, 9), -5);
        assertEquals(Math.PI * 1, kuty2.area());
        assertEquals(0, dengrte.area());

    }

    @Test
    void perimeter() {
        Circle2D kuty = new Circle2D(new Point2D(0, 0), 5);
        assertEquals(Math.PI * 10, kuty.perimeter());
        Circle2D kuty1 = new Circle2D(new Point2D(8, 25), 4.3);
        assertEquals(Math.PI * 8.6, kuty1.perimeter());
        assertEquals(0, dengrte.perimeter());
    }

    @Test
    void move() {
        Circle2D kuty = new Circle2D(new Point2D(0, 0), 5);
        Point2D p1 = new Point2D(6, 3);
        kuty.move(p1);
        Circle2D kuty1 = new Circle2D(new Point2D(6, 3), 5);
        assertArrayEquals(kuty.getPoints(), kuty1.getPoints());
    }

    @Test
    void copy() {
        Circle2D kuty = new Circle2D(new Point2D(0, 0), 5);
        assertEquals(kuty.toString(), kuty.copy().toString());
    }

    @Test
    void getPoints() {
        Point2D p = new Point2D(0, 0);
        double radius = 5;
        Circle2D kuty = new Circle2D(p, radius);
        Point2D p1 = new Point2D(0, 0);
        double radius1 = 0;
        Circle2D dengrte = new Circle2D(p1, radius1);
        Point2D[] ans = new Point2D[2];
        ans[0] = p;
        ans[1] = new Point2D(ans[0].x(), ans[0].y() + radius);
        Point2D[] ans1 = new Point2D[2];
        ans[0] = p1;
        ans[1] = new Point2D(ans[0].x(), ans[0].y() + radius1);
        assertArrayEquals((ans), dengrte.getPoints());

    }
}

