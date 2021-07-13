package ex4.geometry;

/**
 * This class represents a 2D Triangle in the plane.
 * Ex4: you should implement this class!
 *
 * @author I2CS
 */
public class Triangle2D implements GeoShape {
    private Point2D p1;
    private Point2D p2;
    private Point2D p3;

    public Triangle2D(Point2D p1, Point2D p2, Point2D p3) {
        this.p1 = new Point2D(p1);
        this.p2 = new Point2D(p2);
        this.p3 = new Point2D(p3);
    }

    @Override
    public boolean contains(Point2D ot) {
        double eps = 0.1;
        if (p1.x() == p2.x() && p2.x() == p3.x() && p1.y() == p2.y() && p2.y() == p3.y() && p3.y() != ot.y() || p3.x() != ot.x()) {//Handles cases of degenerative triangle
            return false;
        } else if (p1.x() == p2.x() && p2.x() == p3.x() && p3.x() == ot.x() && p1.y() == p2.y() && p2.y() == p3.y() && p3.y() == ot.y()) {//Handles cases of degenerative triangle
            return true;
        } else {
            double p1TOp2 = p1.distance(p2);
            double p1TOp3 = p1.distance(p3);
            double p2TOp3 = p2.distance(p3);
            double otTOp1 = ot.distance(p1);
            double otTOp2 = ot.distance(p2);
            double otTOp3 = ot.distance(p3);
            double perimeter1 = (otTOp1 + otTOp2 + p1TOp2) / 2;
            double perimeter2 = (otTOp1 + otTOp3 + p1TOp3) / 2;
            double perimeter3 = (otTOp3 + otTOp2 + p2TOp3) / 2;
            double area1 = Math.sqrt((perimeter1) * (perimeter1 - p1TOp2) * (perimeter1 - otTOp1) * (perimeter1 - otTOp2));
            double area2 = Math.sqrt((perimeter2) * (perimeter2 - otTOp1) * (perimeter2 - otTOp3) * (perimeter2 - p1TOp3));
            double area3 = Math.sqrt((perimeter3) * (perimeter3 - otTOp3) * (perimeter3 - otTOp2) * (perimeter3 - p2TOp3));
            return !(area1 + area2 + area3 > area() + eps); //if the sum of areas isn't greater then the big  triangle area then point is contained

        }
    }


    @Override
    public Point2D centerOfMass() {
        return new Point2D((this.p1.x() + this.p2.x() + this.p3.x()) / 3, (this.p1.y() + this.p2.y() + this.p3.y()) / 3);
    }

    /**
     * https://en.wikipedia.org/wiki/Heron%27s_formula
     * d = peremiter/2;
     * area = Math.sqrt((d-a)(d-b)(d-c)),  a,b,c are the edges length
     */
    @Override
    public double area() {
        double eps = 0.00001;//Creating epsilon for standard deviation
        double p = perimeter() / 2;
        return Math.sqrt((p) * (p - this.p1.distance(this.p2)) * (p - this.p1.distance(this.p3)) * (p - this.p2.distance(this.p3)));
    }

    @Override
    public double perimeter() {//Calculate the perimeter by calculating the distance every two points
        return this.p1.distance(this.p2) + this.p1.distance(this.p3) + this.p2.distance(this.p3);
    }

    @Override
    public void move(Point2D vec) {//move the triangle
        this.p1.move(vec);
        this.p2.move(vec);
        this.p3.move(vec);
    }

    @Override
    public GeoShape copy() {
        return new Triangle2D(this.p1, this.p2, this.p3);
    }//makes a copy of the triangle

    @Override
    public Point2D[] getPoints() {//Forms an array of points from the points of the triangle
        Point2D[] ans = new Point2D[3];
        ans[0] = new Point2D(this.p1);
        ans[1] = new Point2D(this.p2);
        ans[2] = new Point2D(this.p3);
        return ans;
    }


    @Override
    public String toString() {//Returns the values of the triangle in the form of a string
        return "Triangle2D," + this.p1.toString() + "," + this.p2.toString() + "," + this.p3.toString();
    }
}
