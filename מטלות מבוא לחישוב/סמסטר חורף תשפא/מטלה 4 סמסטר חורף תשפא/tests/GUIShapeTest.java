package ex4.tests;

import ex4.GUIShape;
import ex4.GUI_Shape;
import ex4.geometry.*;
import org.junit.jupiter.api.Test;
import java.awt.*;
import java.util.ArrayList;

import static ex4.StdDraw.CYAN;
import static org.junit.jupiter.api.Assertions.*;

class GUIShapeTest {
    Point2D p = new Point2D(0,0);
    Point2D p1 = new Point2D(1,4);
    Point2D p2 = new Point2D(5,3.5);
    Circle2D c1 = new Circle2D(p,7.7);
    Segment2D seg = new Segment2D(p1,p2);
    Rect2D rect = new Rect2D(p,p2);
    Triangle2D triangle = new Triangle2D(p,p1,p2);
    GUIShape shape1 = new GUIShape(p,false, Color.blue,1);
    GUIShape shape2 = new GUIShape(c1,true, Color.black,5);
    GUIShape shape3 = new GUIShape(seg,false, Color.cyan,4);
    GUIShape shape4 = new GUIShape(triangle,false, Color.red,3);
    GUIShape shape5 = new GUIShape(rect,true, Color.darkGray,2);
    GUIShape shape6 = new GUIShape();

    @Test
    void getShape() {
        assertEquals(p,shape1.getShape());
        assertEquals(c1,shape2.getShape());
        assertEquals(triangle,shape4.getShape());
        assertEquals(rect,shape5.getShape());
        assertEquals(seg,shape3.getShape());
    }

    @Test
    void setShape() {
        shape6.setShape(p1);
        assertEquals(p1,shape6.getShape());
        shape6.setShape(triangle);
        assertEquals(triangle,shape6.getShape());
        shape6.setShape(rect);
        assertEquals(rect,shape6.getShape());
        shape6.setShape(seg);
        assertEquals(seg,shape6.getShape());
        shape6.setShape(c1);
        assertEquals(c1,shape6.getShape());
    }

    @Test
    void isFilled() {
        assertFalse(shape1.isFilled());
        assertTrue(shape2.isFilled());
        assertFalse(shape3.isFilled());
        assertFalse(shape4.isFilled());
        assertTrue(shape5.isFilled());
    }

    @Test
    void setFilled() {
        boolean isNotFilled = false;
        boolean isFilled = true;
        shape2.setFilled(isNotFilled);
        shape4.setFilled(isFilled);
        assertFalse(shape2.isFilled());
        assertTrue(shape4.isFilled());



    }

    @Test
    void getColor() {
        assertEquals(Color.cyan,shape3.getColor());
        assertEquals(Color.blue,shape1.getColor());
        assertEquals(Color.black,shape2.getColor());
        assertEquals(Color.red,shape4.getColor());
        assertEquals(Color.darkGray,shape5.getColor());
    }

    @Test
    void setColor() {
        shape3.setColor(Color.green);
        assertEquals(Color.green,shape3.getColor());
        shape5.setColor(Color.YELLOW);
        assertEquals(Color.YELLOW,shape5.getColor());
    }

    @Test
    void getTag() {
        assertEquals(1,shape1.getTag());
        assertEquals(3,shape4.getTag());
    }

    @Test
    void setTag() {
        shape3.setTag(4);
        assertEquals(4,shape3.getTag());
        shape5.setTag(7);
        assertEquals(7,shape5.getTag());

    }

    @Test
    void copy() {
        assertEquals(shape5.toString(),shape5.copy().toString());
        assertEquals(shape2.toString(),shape2.copy().toString());

    }

    @Test
    void testToString() {
        assertEquals("GUIShape,4210752,true,2,Rect2D,0.0,0.0,5.0,3.5",shape5.toString());
        assertEquals("GUIShape,255,false,1,Point2D,0.0,0.0",shape1.toString());
        assertEquals("GUIShape,0,true,5,Circle2D,0.0,0.0,7.7",shape2.toString());
        assertEquals("GUIShape,65535,false,4,Segment2D,1.0,4.0,5.0,3.5",shape3.toString());
        assertEquals("GUIShape,16711680,false,3,Triangle2D,0.0,0.0,1.0,4.0,5.0,3.5",shape4.toString());
    }
}