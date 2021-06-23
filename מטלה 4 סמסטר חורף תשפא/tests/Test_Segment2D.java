package ex4.tests;

import ex4.geometry.Point2D;
import ex4.geometry.Segment2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_Segment2D {
    Segment2D dengSeg = new Segment2D(new Point2D(11, 11), (new Point2D(11, 11)));


    @Test
    void contains() {
        Segment2D kuty = new Segment2D(new Point2D(5, 5), (new Point2D(9, 5)));
        Point2D p = new Point2D(7, 5);
        assertTrue(kuty.contains(p));
        Segment2D seg = new Segment2D(new Point2D(5, 5), (new Point2D(9, 5)));
        Point2D p1 = new Point2D(7, -3);
        assertFalse(seg.contains(p1));
        assertTrue(dengSeg.contains(new Point2D(11, 11)));
        assertFalse(dengSeg.contains(new Point2D(21, 45)));
    }

    @Test
    void centerOfMass() {
        Segment2D kuty = new Segment2D(new Point2D(5, 5), (new Point2D(9, 5)));
        Point2D p = new Point2D(7, 5);
        Point2D p1 = new Point2D(11, 11);
        assertEquals(p, kuty.centerOfMass());
        assertEquals(p1, dengSeg.centerOfMass());


    }

    @Test
    void area() {
        Segment2D kuty = new Segment2D(new Point2D(5, 5), (new Point2D(9, 5)));
        assertEquals(0, kuty.area());

    }

    @Test
    void perimeter() {
        Segment2D kuty = new Segment2D(new Point2D(5, 5), (new Point2D(9, 5)));
        assertEquals(8, kuty.perimeter());
        assertEquals(0, dengSeg.perimeter());

    }

    @Test
    void move() {
        Segment2D kuty = new Segment2D(new Point2D(5, 5), (new Point2D(9, 5)));
        Point2D p = new Point2D(7, 5);
        kuty.move(p);
        Segment2D kuty1 = new Segment2D(new Point2D(12, 10), (new Point2D(16, 10)));
        assertArrayEquals(kuty.getPoints(), kuty1.getPoints());

    }

    @Test
    void copy() {
        Segment2D kuty = new Segment2D(new Point2D(5, 5), (new Point2D(9, 5)));
        assertEquals(kuty.toString(), kuty.copy().toString());


    }

    @Test
    void getPoints() {
        Point2D p = new Point2D(0, 0);
        Point2D p1 = new Point2D(4, 0);
        Segment2D kuty = new Segment2D(p, p1);
        Point2D[] ans = new Point2D[2];
        ans[0] = p;
        ans[1] = p1;
        assertArrayEquals((ans), kuty.getPoints());
        Point2D p2 = new Point2D(11, 11);
        Point2D p3 = new Point2D(11, 11);
        Point2D[] ans1 = new Point2D[2];
        ans[0] = p2;
        ans[1] = p3;
        assertArrayEquals((ans), dengSeg.getPoints());
    }

    @Test
    void testToString() {
        Segment2D kuty = new Segment2D(new Point2D(5, 5), (new Point2D(9, 5)));
        String out1 = "Segment2D," + "5.0" + "," + "5.0" + "," + "9.0" + "," + "5.0";
        assertEquals(kuty.toString(), out1);
        Segment2D kuty1 = new Segment2D(new Point2D(5.2, 5.95), (new Point2D(9.3, 5.4)));
        String out2 = "Segment2D," + "5.2" + "," + "5.95" + "," + "9.3" + "," + "5.4";
        assertEquals(kuty1.toString(), out2);

    }
}