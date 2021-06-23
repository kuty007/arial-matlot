package ex4;

import java.awt.Color;
import java.util.Scanner;
import java.awt.*;

import ex4.geometry.*;


/**
 * This class is the "main" class which will be constructed and run as in (ex4.tests.Test_Ex4).
 * Ex4: you should implement this class!
 *
 * @author boaz.benmoshe
 */
public class Ex4 implements Ex4_GUI {
    public static void main(String[] args) {
        if (args.length == 2) {
            Ex4 win = new Ex4();
            GUI_Shape_Collection sc = win.getShape_Collection();
            sc.load(args[0]);
            Shape_Comp comp = new Shape_Comp(Integer.parseInt(args[1]));
            Rect2D bounding = sc.getBoundingBox();
            Point2D min = bounding.getPoints()[0], max = bounding.getPoints()[1];
            int tag = sc.size();
            GUI_Shape s7 = new GUIShape(bounding, false, Color.gray, tag++);
            sc.add(s7);
            double m0 = Math.min(min.x(), min.y());
            double m1 = Math.max(max.x(), max.y());
            StdDraw.setScale(m0 - 0.1, m1 + 0.1);
            sc.sort(comp);
            win.show();

            int flag = 0;
            while (flag != -1) {
                Scanner sca = new Scanner(System.in);
                System.out.print("Enter a sorting method (a number in [0-5]): ");
                String fs = sca.next();
                flag = Integer.parseInt(fs);
                comp = new Shape_Comp(flag);
                sc.sort(comp);
                System.out.println("**** Sorting accurding to flag=" + flag + " ****");
                System.out.println(sc);
                System.out.println();
                win.show();
                sc.save("test_save.txt");
            }
        }
    }


    private GUI_Shape_Collection gsc;

    public Ex4() {
        this.gsc = new Shape_Collection();
    }

    @Override
    public void init(GUI_Shape_Collection g) {
        this.gsc = g;
    }

    @Override
    public GUI_Shape_Collection getShape_Collection() {
        return this.gsc;
    }

    @Override
    public void show() {//Goes through all the shapes in the collection and draws each shape according to its parameters
        for (int i = 0; i < gsc.size(); i++) {
            GUI_Shape guiShape = gsc.get(i);
            GeoShape shape = guiShape.getShape();
            StdDraw.setPenColor(guiShape.getColor());
            StdDraw.setPenRadius(0.004);
            if (shape instanceof Point2D) {
                Point2D point = (Point2D) shape;
                StdDraw.point(point.x(), point.y());
            }
            if (shape instanceof Circle2D) {
                Circle2D circle = (Circle2D) shape;
                if (guiShape.isFilled()) {
                    StdDraw.filledCircle(circle.centerOfMass().x(), circle.centerOfMass().y(), circle.getRadius());

                } else {
                    StdDraw.circle(circle.centerOfMass().x(), circle.centerOfMass().y(), circle.getRadius());
                }
            }
            if (shape instanceof Triangle2D) {
                Triangle2D triangle = (Triangle2D) shape;
                Point2D[] trianglePoints = triangle.getPoints();
                double[] triangle_x_points = new double[trianglePoints.length];
                double[] triangle_y_points = new double[trianglePoints.length];
                for (int j = 0; j < trianglePoints.length; j++) {
                    triangle_x_points[j] = trianglePoints[j].x();
                    triangle_y_points[j] = trianglePoints[j].y();
                }
                if (guiShape.isFilled()) {
                    StdDraw.filledPolygon(triangle_x_points, triangle_y_points);
                } else {
                    StdDraw.polygon(triangle_x_points, triangle_y_points);
                }
            }
            if (shape instanceof Segment2D) {
                Segment2D seg = (Segment2D) shape;
                Point2D[] segPoints = seg.getPoints();
                StdDraw.line(segPoints[0].x(), segPoints[0].y(), segPoints[1].x(), segPoints[1].y());

            }
            if (shape instanceof Rect2D) {
                Rect2D rect = (Rect2D) shape;
                Point2D[] rectPoints = rect.getPoints();
                Point2D p1 = rectPoints[0];
                Point2D p2 = rectPoints[1];
                double halfWide = Math.abs(p1.x() - p2.x()) / 2;
                double halfHigh = Math.abs(p1.y() - p2.y()) / 2;
                if (guiShape.isFilled()) {
                    StdDraw.filledRectangle(rect.centerOfMass().x(), rect.centerOfMass().y(), halfWide, halfHigh);
                } else
                    StdDraw.rectangle(rect.centerOfMass().x(), rect.centerOfMass().y(), halfWide, halfHigh);
            }

        }

    }


    @Override
    public String getInfo() {

        return gsc.toString();
    }
}
