package ex4.tests;

import ex4.geometry.Point2D;
import ex4.geometry.Rect2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_Rect2D {
    Rect2D r1 = new Rect2D(new Point2D(1,1),new Point2D(1,4));
    Rect2D r2 = new Rect2D(new Point2D(1,1),new Point2D(1,1));

    @Test
    void contains() {
        Rect2D r = new Rect2D(new Point2D(1,1),new Point2D(4,4));
        assertTrue(r.contains(new Point2D(3,4)));
        assertFalse(r.contains(new Point2D(8,10)));
        assertTrue(r.contains(new Point2D(2,1)));
        assertTrue(r1.contains(new Point2D(1,4)));
        assertTrue(r2.contains(new Point2D(1,1)));
        assertFalse(r1.contains(new Point2D(2,4)));
        assertFalse(r2.contains(new Point2D(3,1)));

    }

    @Test
    void centerOfMass() {
        Rect2D r = new Rect2D(new Point2D(1,1),new Point2D(4,4));
        Point2D p = new Point2D(2.5,2.5);
        Point2D p1 = new Point2D(1,1);
        Point2D p2 = new Point2D(1,2.5);
        assertEquals(p,r.centerOfMass());
        assertEquals(p1,r2.centerOfMass());
        assertEquals(p2,r1.centerOfMass());

    }

    @Test
    void area() {
        Rect2D r3 = new Rect2D(new Point2D(1,1),new Point2D(4,4));
        assertEquals(9,r3.area());
        assertEquals(0,r1.area());
        assertEquals(0,r2.area());


    }

    @Test
    void perimeter() {
        Rect2D r = new Rect2D(new Point2D(0,0),new Point2D(5,10));
        assertEquals(30,r.perimeter());
        assertEquals(0,r2.perimeter());


    }

    @Test
    void move() {
        Rect2D r = new Rect2D(new Point2D(1,1),new Point2D(4,4));
        Point2D p = new Point2D(3,-1);
        r.move(p);
        Rect2D r1 = new Rect2D(new Point2D(4,0),new Point2D(7,3));
        assertArrayEquals(r.getPoints(),r1.getPoints());
    }

    @Test
    void copy() {
        Rect2D r = new Rect2D(new Point2D(1,1),new Point2D(4,4));
        assertEquals(r.toString(),r.copy().toString());
    }
    @Test
    void getPoints() {
        Point2D p = new Point2D(0,0);
        Point2D p1 = new Point2D(4,4);
        Rect2D r = new Rect2D(p1,p);
        Point2D[] ans = new Point2D[2];
        ans[0]=p;
        ans[1]=p1;
        assertArrayEquals((ans),r.getPoints());
    }
    @Test
    void testToString() {
        Rect2D r = new Rect2D(new Point2D(1,1),new Point2D(4,4));
        String out1 = "Rect2D," + "1.0"+","+"1.0"+","+"4.0"+","+"4.0";
        assertEquals(r.toString(),out1);
        Rect2D r1 = new Rect2D(new Point2D(1.5,1.9),new Point2D(4.3,-4));
        String out2 = "Rect2D," + "1.5"+","+"1.9"+","+"4.3"+","+"-4.0";
        assertEquals(r.toString(),out1);
    }
}