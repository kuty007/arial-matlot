package ex4.tests;

import ex4.GUIShape;
import ex4.GUI_Shape;
import ex4.Shape_Collection;
import ex4.Shape_Comp;
import ex4.geometry.*;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Shape_CollectionTest {
    Point2D p = new Point2D(0,0);
    Point2D p1 = new Point2D(1,4);
    Point2D p2 = new Point2D(5,3.5);
    Circle2D c1 = new Circle2D(p,2.5);
    Circle2D c2 = new Circle2D(p,-3);
    Segment2D seg = new Segment2D(p1,p2);
    Rect2D rect = new Rect2D(p,p2);
    Triangle2D triangle = new Triangle2D(p,p1,p2);
    GUIShape shape1 = new GUIShape(p,false, Color.blue,1);
    GUIShape shape2 = new GUIShape(c1,true, Color.black,5);
    GUIShape shape3 = new GUIShape(seg,false, Color.cyan,4);
    GUIShape shape4 = new GUIShape(triangle,false, Color.red,3);
    GUIShape shape5 = new GUIShape(rect,true, Color.darkGray,2);
    GUIShape shape6 = new GUIShape(c2,true, Color.darkGray,2);










    @Test
    void get() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        assertEquals(shape2,shaps_test.get(0));
        shaps_test.add(shape1);
        assertEquals(shape1,shaps_test.get(1));
        shaps_test.add(shape5);
        assertEquals(shape5,shaps_test.get(2));


    }

    @Test
    void size() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        assertEquals(3,shaps_test.size());
        Shape_Collection shaps_test1 = new Shape_Collection();
        shaps_test1.add(shape2);
        shaps_test1.add(shape3);
        assertEquals(2,shaps_test1.size());
        Shape_Collection shaps_test2 = new Shape_Collection();
        assertEquals(0,shaps_test2.size());
    }

    @Test
    void removeElementAt() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        assertEquals(shape5,shaps_test.removeElementAt(2));
    }

    @Test
    void addAt() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.addAt(shape5,2);
        assertEquals(shape5,shaps_test.get(2));
        Shape_Collection shaps_test1 = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.addAt(shape5,0);
        assertEquals(shape5,shaps_test.get(0));
    }

    @Test
    void add() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        assertEquals(shape5,shaps_test.get(2));
    }

    @Test
    void copy() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        assertEquals(shaps_test.toString(),shaps_test.copy().toString());
        Shape_Collection shaps_test1 = new Shape_Collection();
        shaps_test1.add(shape2);
        shaps_test1.add(shape3);
        shaps_test1.add(shape6);
        assertEquals(shaps_test.toString(),shaps_test.copy().toString());
    }
    @Test
    void sort() {
        Shape_Comp comp = new Shape_Comp(0);
        Shape_Comp comp1 = new Shape_Comp(1);
        Shape_Comp comp2 = new Shape_Comp(2);
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        shaps_test.add(shape4);
        shaps_test.sort(comp);
        Shape_Collection shaps_test1 = new Shape_Collection();
        shaps_test1.add(shape5);
        shaps_test1.add(shape4);
        shaps_test1.add(shape3);
        shaps_test1.add(shape2);
        assertEquals(shaps_test1.toString(),shaps_test.toString());
        Shape_Collection shaps_test2 = new Shape_Collection();
        shaps_test2.add(shape2);
        shaps_test2.add(shape3);
        shaps_test2.add(shape5);
        shaps_test.sort(comp1);
        Shape_Collection shaps_test3 = new Shape_Collection();
        shaps_test3.add(shape2);
        shaps_test3.add(shape3);
        shaps_test3.add(shape5);
        assertEquals(shaps_test3.toString(),shaps_test2.toString());
        Shape_Collection shaps_test4 = new Shape_Collection();
        shaps_test4.add(shape3);
        shaps_test4.add(shape5);
        shaps_test.sort(comp2);
        Shape_Collection shaps_test5 = new Shape_Collection();
        shaps_test5.add(shape3);
        shaps_test5.add(shape5);
        assertEquals(shaps_test5.toString(),shaps_test4.toString());

    }

    @Test
    void removeAll() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        shaps_test.add(shape4);
        shaps_test.removeAll();
        assertEquals(0,shaps_test.size());

    }

    @Test
    void save() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        shaps_test.add(shape4);
        shaps_test.save("shaps_test");
        Shape_Collection shaps_test1 = new Shape_Collection();
        shaps_test1.load("shaps_test");
        assertEquals(shaps_test.toString(),shaps_test1.toString());


    }

    @Test
    void load() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        shaps_test.add(shape4);
        shaps_test.save("shaps_test");
        Shape_Collection shaps_test1 = new Shape_Collection();
        shaps_test1.load("shaps_test");
        assertEquals(shaps_test.toString(),shaps_test1.toString());

    }

    @Test
    void getBoundingBox() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape6);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        shaps_test.add(shape4);
        Rect2D BoundingBox = shaps_test.getBoundingBox();
        Point2D minPoint = new Point2D(-1,-1);
        Point2D maxPoint = new Point2D(5,4);
        Rect2D testBox = new Rect2D(minPoint,maxPoint);
        assertEquals(BoundingBox.toString(),testBox.toString());
    }

    @Test
    void testToString() {
        Shape_Collection shaps_test = new Shape_Collection();
        shaps_test.add(shape2);
        shaps_test.add(shape3);
        shaps_test.add(shape5);
        assertEquals("GUIShape,0,true,5,Circle2D,0.0,0.0,2.5\n" +
                "GUIShape,65535,false,4,Segment2D,1.0,4.0,5.0,3.5\n" +
                "GUIShape,4210752,true,2,Rect2D,0.0,0.0,5.0,3.5",shaps_test.toString());

    }
}