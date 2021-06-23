package ex4;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.util.*;

import ex4.geometry.*;

/**
 * This class represents a collection of GUI_Shape.
 * Ex4: you should implement this class!
 *
 * @author I2CS
 */
public class Shape_Collection implements GUI_Shape_Collection {
    private ArrayList<GUI_Shape> guiShapesArray;

    public Shape_Collection() {
        guiShapesArray = new ArrayList<GUI_Shape>();
    }

    @Override
    public GUI_Shape get(int i) {
        return guiShapesArray.get(i);
    }

    @Override//return the size of the collection (if empty return 0).
    public int size() {
        return guiShapesArray.size();
    }

    @Override
    public GUI_Shape removeElementAt(int i) {
        GUI_Shape temp = guiShapesArray.get(i);
        guiShapesArray.remove(i);
        return temp;
    }

    @Override
    public void addAt(GUI_Shape s, int i) {
        guiShapesArray.add(i, s);
    }

    @Override
    public void add(GUI_Shape s) {
        guiShapesArray.add(s);
    }

    @Override
    public GUI_Shape_Collection copy() {//Creates a deep copy of the collection
        Shape_Collection sc = new Shape_Collection();
        for (int i = 0; i < this.guiShapesArray.size(); i++)
            sc.add(guiShapesArray.get(i));

        return sc;
    }


    @Override
    public void sort(Comparator comp) {
        this.guiShapesArray.sort(comp);
    }

    @Override
    public void removeAll() {
        guiShapesArray.clear();
    }

    @Override
    public void save(String file) {
        String save = toString();
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(save);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void load(String file) {
        try {
            File fw = new File(file);
            Scanner sc = new Scanner(fw);
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(","); //creates an array of string from the text file whenever there is "," put the value that was before it into place in the array
                Color color = new Color(Integer.parseInt(data[1])); // reads the color
                boolean filled = Boolean.parseBoolean(data[2]); // reads if the shape is filled or not
                int tag = Integer.parseInt(data[3]); // reads the tag
                GeoShape gs = new Point2D(0, 0); // creates a default shape
                switch (data[4]) { // reads the shape from the text file, each shape creates the shape from the next indexes of the array of strings
                    case "Point2D" -> gs = new Point2D(Double.parseDouble(data[5]), Double.parseDouble(data[6]));//Gives the shape its points according to their place in the array
                    case "Circle2D" -> gs = new Circle2D(new Point2D(Double.parseDouble(data[5]), Double.parseDouble(data[6])), Double.parseDouble(data[7]));
                    case "Segment2D" -> gs = new Segment2D(new Point2D(Double.parseDouble(data[5]), Double.parseDouble(data[6])), new Point2D(Double.parseDouble(data[7]), Double.parseDouble(data[8])));
                    case "Triangle2D" -> gs = new Triangle2D(new Point2D(Double.parseDouble(data[5]), Double.parseDouble(data[6])),
                            new Point2D(Double.parseDouble(data[7]), Double.parseDouble(data[8])), new Point2D(Double.parseDouble(data[9]), Double.parseDouble(data[10])));
                    case "Rect2D" -> gs = new Rect2D(new Point2D(Double.parseDouble(data[5]), Double.parseDouble(data[6])), new Point2D(Double.parseDouble(data[7]), Double.parseDouble(data[8])));
                    default -> System.out.println("Not a GeoShape");
                }
                add(new GUIShape(gs, filled, color, tag)); // creates a new shape
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Rect2D getBoundingBox() {
        ArrayList<Double> x = new ArrayList<>();//Creates an array that get the X values
        ArrayList<Double> y = new ArrayList<>();//Creates an array that get the Y values
        for (int i = 0; i < guiShapesArray.size(); i++) {
            if (this.guiShapesArray.get(i).getShape() instanceof Circle2D) {//A special case where the shape is a circle
                Point2D shape[] = guiShapesArray.get(i).getShape().getPoints();
                GeoShape shpe = guiShapesArray.get(i).getShape();
                double dist = ((Circle2D) shpe).getRadius();
                Point2D circle_points[] = new Point2D[4];
                circle_points[0] = shape[1];
                circle_points[1] = new Point2D(shape[0].x(), shape[0].y() - dist);
                circle_points[2] = new Point2D(shape[0].x() - dist, shape[0].y());
                circle_points[3] = new Point2D(shape[0].x() + dist, shape[0].y());
                for (int j = 0; j < circle_points.length; j++) {//Goes over the points of the shape and divides them according to the values of X and Y into the two arrays we created
                    x.add(circle_points[j].x());
                    y.add(circle_points[j].y());
                }
            } else {
                Point2D[] shape = guiShapesArray.get(i).getShape().getPoints();
                for (int j = 0; j < shape.length; j++) {
                    x.add(shape[j].x());
                    y.add((shape[j].y()));
                }
            }
        }
        Point2D max = new Point2D(Collections.max(x), Collections.max(y));//Creates the maximum point of the Bounding Box
        Point2D min = new Point2D(Collections.min(x), Collections.min(y));//Creates the minimum point of the Bounding Box
        Rect2D BoundingBox = new Rect2D(min, max);
        return BoundingBox;
    }

    @Override
    public String toString() {
        String GuiToString = "";
        for (int i = 0; i < guiShapesArray.size(); i++) {
            if (i < guiShapesArray.size() - 1) {
                GuiToString += this.guiShapesArray.get(i).toString() + "\n";
            } else
                GuiToString += this.guiShapesArray.get(i).toString();


        }
        return GuiToString;
    }
}