package ex4.tests;

import ex4.geometry.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Point2DTest {

    @Test
    void testToString() {
        Point2D a = new Point2D(3,5);
        Point2D p1 = new Point2D(2,3);
        String out1 = "3.0"+","+"5.0";
        String out2 = "2.0"+","+"3.0";
        assertEquals(a.toString(),out1);
        assertEquals(p1.toString(),out2);
        }

    @Test
    void contains() {
        Point2D a = new Point2D(3,5);
        Point2D p1 = new Point2D(3,5);
        Point2D p = new Point2D(3,6);
        Point2D p2 = new Point2D(4,5);
        assertTrue(a.contains(p1));
        assertFalse(p.contains(p2));


    }

    @Test
    void centerOfMass() {
        Point2D p = new Point2D(3,5);
        assertEquals(p.centerOfMass().toString(),p.toString());
    }

    @Test
    void area() {
        Point2D p = new Point2D(3,5);
        assertEquals(0,p.area());
    }

    @Test
    void perimeter() {
        Point2D p = new Point2D(3,5);
        assertEquals(0,p.perimeter());
    }

    @Test
    void move() {
        Point2D p = new Point2D(3,5);
        Point2D p1 = new Point2D(2,3);
        p.move(p1);
        Point2D p2 = new Point2D(5,8);
        assertEquals(p,p2);
        Point2D p3 = new Point2D(5,7);
        Point2D p4 = new Point2D(-2,-3);
        p3.move(p4);
        Point2D p5 = new Point2D(3,4);
        assertEquals(p3,p5);
        Point2D p6 = new Point2D(9,15);
        Point2D p7 = new Point2D(0,0);
        p6.move(p7);
        Point2D p8 = new Point2D(9,15);
        assertEquals(p6,p8);
    }

    @Test
    void copy() {
        Point2D p = new Point2D(3,5);
        assertEquals(p.copy(),p);
        Point2D p1 = new Point2D(0,0);
        assertEquals(p.copy(),p);
        Point2D p2 = new Point2D(-9,-150);
        assertEquals(p.copy(),p);

    }
    @Test
    void getPoints() {
        Point2D p = new Point2D(3,5);
        Point2D[] ans = new Point2D[1];
        ans[0] = p;
        assertArrayEquals((ans),p.getPoints());

    }
    @Test
    void testadd() {
        Point2D p1 = new Point2D(9,13.7) ;
        Point2D p2 = new Point2D(1.5,4.3) ;
        Point2D p3 = new Point2D(10.5,18) ;
        assertEquals(p1.add(p2),p3) ;
        Point2D p4 = new Point2D(0,0) ;
        Point2D p5 = new Point2D(5.3,9) ;
        Point2D p6 = new Point2D(5.3,9) ;
        assertEquals(p4.add(p5),p6) ;
    }

    @Test void distance(){
        Point2D p = new Point2D(3,4);
        assertEquals(5,p.distance());//distance form origin
        Point2D p1 = new Point2D(2,6);
        Point2D p2 = new Point2D(5,10);
        assertEquals(5,p1.distance(p2));//distance two different points
    }
    @Test void vector (){
        Point2D p1 = new Point2D(9,12);
        Point2D p2 = new Point2D(5,10);
        Point2D p3 = new Point2D(4,2);
        Point2D p4= new Point2D(-4,-2);
        assertEquals(p3,p2.vector(p1));
        assertEquals(p4,p1.vector(p2));


    }
}


