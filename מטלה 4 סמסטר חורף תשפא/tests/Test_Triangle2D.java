package ex4.tests;

import ex4.geometry.Point2D;
import ex4.geometry.Triangle2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

class Test_Triangle2D {
    Triangle2D dengTr = new Triangle2D(new Point2D(2,2),new Point2D(2,5 ),new Point2D(2,5));
    Triangle2D dengTr1 = new Triangle2D(new Point2D(2,5),new Point2D(2,5 ),new Point2D(2,5));


    @Test
    void contains() {
        Triangle2D kuty = new Triangle2D(new Point2D(2,2),new Point2D(4,2 ),new Point2D(3,5));
        assertTrue(kuty.contains(new Point2D(3,4)));
        assertTrue(kuty.contains(new Point2D(3,2)));
        assertFalse(kuty.contains(new Point2D(5,10)));
        assertFalse(dengTr.contains(new Point2D(3,5)));
        assertFalse(dengTr1.contains(new Point2D(3,5)));

    }   

    @Test
    void centerOfMass() {
        Triangle2D kuty = new Triangle2D(new Point2D(2,4),new Point2D(4,4 ),new Point2D(3,6));
        Triangle2D kuty1 = new Triangle2D(new Point2D(2,4),new Point2D(4,4 ),new Point2D(6,4));
        Triangle2D kuty2 = new Triangle2D(new Point2D(3,2),new Point2D(3,4 ),new Point2D(3,7));
        assertEquals(kuty.centerOfMass(), new Point2D(3,14.0/3));
        assertEquals(kuty1.centerOfMass(), new Point2D(4,4));
        assertEquals(kuty2.centerOfMass(), new Point2D(3,13.0/3));
    }

    @Test
    void area() {
        double eps = 0.0000000000001;
        Triangle2D kuty = new Triangle2D(new Point2D(0,0),new Point2D(4,0 ),new Point2D(0,4));
        Triangle2D kuty1 = new Triangle2D(new Point2D(2,4),new Point2D(4,4 ),new Point2D(6,4));
        Triangle2D kuty2 = new Triangle2D(new Point2D(3,2),new Point2D(3,4 ),new Point2D(3,7));
        assertEquals(kuty.area(),8,eps);
        assertEquals(kuty1.area(),0,eps);
        assertEquals(kuty2.area(),0,eps);
    }

    @Test
    void perimeter() {
        double eps = 0.0000000000001;
        Triangle2D kuty = new Triangle2D(new Point2D(0,0),new Point2D(4,0 ),new Point2D(0,3));
        Triangle2D kuty1 = new Triangle2D(new Point2D(2,4),new Point2D(4,4 ),new Point2D(6,4));
        Triangle2D kuty2 = new Triangle2D(new Point2D(3,2),new Point2D(3,4 ),new Point2D(3,7));
        assertEquals(kuty.perimeter(),12,eps);
        assertEquals(kuty1.perimeter(),8,eps);
        assertEquals(kuty2.perimeter(),10,eps);
    }

    @Test
    void move() {
        Triangle2D kuty = new Triangle2D(new Point2D(0,0),new Point2D(4,0 ),new Point2D(0,3));
        Point2D p = new Point2D(7,5);
        kuty.move(p);
        Triangle2D kuty1 = new Triangle2D(new Point2D(7,5),new Point2D(11,5 ),new Point2D(7,8));
        assertArrayEquals(kuty1.getPoints(),kuty.getPoints());
    }

    @Test
    void copy() {
        Triangle2D kuty = new Triangle2D(new Point2D(0,0),new Point2D(4,0 ),new Point2D(0,3));
        assertEquals(kuty.toString(),kuty.copy().toString());
    }

    @Test
    void getPoints() {
        Point2D p = new Point2D(0,1);
        Point2D p1 = new Point2D(2,1);
        Point2D p2 = new Point2D(1,3);
        Triangle2D kuty = new Triangle2D(p,p1,p2);
        Point2D[] ans = new Point2D[3];
        ans[0] = p;
        ans[2] = p2;
        ans[1] = p1;
        assertArrayEquals((ans),kuty.getPoints());
    }
    @Test
    void testToString() {
        Triangle2D kuty = new Triangle2D(new Point2D(0,0),new Point2D(4,0 ),new Point2D(0,3));
        String out1 = "Triangle2D," + "0.0"+","+"0.0"+","+"4.0"+","+"0.0"+","+"0.0"+","+"3.0";
        assertEquals(kuty.toString(),out1);
    }
}