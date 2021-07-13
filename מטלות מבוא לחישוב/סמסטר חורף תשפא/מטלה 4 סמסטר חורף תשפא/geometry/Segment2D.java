package ex4.geometry;

import ex4.Ex4_Const;

/**
 * This class represents a 2D segment on the plane,
 * Ex4: you should implement this class!
 *
 * @author I2CS
 */
public class Segment2D implements GeoShape {
    private Point2D p1;
    private Point2D p2;

    public Segment2D(Point2D p1, Point2D p2) {
        this.p1 = new Point2D(p1);
        this.p2 = new Point2D(p2);
    }

    @Override
    public boolean contains(Point2D ot) {
        if (ot.distance(this.p1) + ot.distance(this.p2) == this.p1.distance(this.p2)) {//If the distance between the point and the two points is equal to the distance between the two original points then the point is contained in the Segment
            return true;
        }
        return false;
    }

    @Override
    public Point2D centerOfMass() {//Makes an average of the X values Averages the Y values and creates a new point that is the center of the segment
        return new Point2D((this.p1.x() + this.p2.x()) / 2, (this.p1.y() + this.p2.y()) / 2);

    }

    /**
     *
     */
    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {//The distance between the two points twice
        return this.p1.distance(this.p2) * 2;
    }

    @Override
    public void move(Point2D vec) {
        this.p1.move(vec);
        this.p2.move(vec);

    }

    @Override
    public GeoShape copy() {
        return new Segment2D(this.p1, this.p2);

    }

    @Override
    public Point2D[] getPoints() {
        Point2D[] ans = new Point2D[2];
        ans[0] = new Point2D(this.p1);
        ans[1] = new Point2D(this.p2);
        return ans;

    }


    @Override
    public String toString() {
        return "Segment2D," + this.p1.toString() + "," + this.p2.toString();

    }
}