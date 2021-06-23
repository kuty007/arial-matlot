package ex4.geometry;

/**
 * This class represents a 2D axis parallel rectangle.
 * Ex4: you should implement this class!
 *
 * @author I2CS
 */
public class Rect2D implements GeoShape {
    private Point2D p1;
    private Point2D p2;

    public Rect2D(Point2D p1, Point2D p2) {
        this.p1 = new Point2D(p1);
        this.p2 = new Point2D(p2);
    }

    @Override
    public boolean contains(Point2D ot) {//If the X value of the point is greater or equal than the minimum value X of the rectangle and less or equal  than the value of the maximum value X of the rectangle and the same at the values of Y the point is contained
        double ot_x = ot.x();
        double ot_y = ot.y();
        if (Math.min(this.p1.x(), this.p2.x()) <= ot_x && ot_x <= Math.max(this.p1.x(), this.p2.x())
                && (Math.min(this.p1.y(), this.p2.y()) <= ot_y && ot_y <= Math.max(this.p1.y(), this.p2.y()))) {
            return true;
        }
        return false;
    }

    @Override
    public Point2D centerOfMass() {
        return new Point2D((this.p1.x() + this.p2.x()) / 2, (this.p1.y() + this.p2.y()) / 2);
    }

    @Override
    public double area() {
        return Math.abs(this.p1.x() - this.p2.x()) * Math.abs(this.p1.y() - this.p2.y());
    }//The difference between the X values is double the difference between the Y values equal to the area of the rectangle

    @Override
    public double perimeter() {
        return 2 * (Math.abs(this.p1.x() - this.p2.x()) + Math.abs(this.p1.y() - this.p2.y()));//The difference between the X values is + the difference between the Y  values *2 equal to the perimeter of the rectangle
    }

    @Override
    public void move(Point2D vec) {
        this.p1.move(vec);
        this.p2.move(vec);
    }

    @Override
    public GeoShape copy() {
        return new Rect2D(this.p1, this.p2);
    }

    @Override
    public Point2D[] getPoints() {
        Point2D[] ans = new Point2D[2];
        if (this.p1.x() < this.p2.x() || this.p1.y() < this.p2.y()) {
            ans[0] = new Point2D(this.p1);
            ans[1] = new Point2D(this.p2);
        } else {
            ans[0] = new Point2D(this.p2);
            ans[1] = new Point2D(this.p1);
        }
        return ans;
    }


    @Override
    public String toString() {
        return "Rect2D," + this.p1.toString() + "," + this.p2.toString();
    }
}
