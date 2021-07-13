package ex4;
/**
 * This class implements the GUI_shape.
 * Ex4: you should implement this class!
 * @author I2CS
 */
import java.awt.Color;
import ex4.geometry.*;

public class GUIShape implements ex4.GUI_Shape {
	private Color color;
	private boolean filled;
	private int tag;
	private GeoShape shape;
		public GUIShape(){
			color = Color.CYAN;
			filled = false;
			tag =1;
			shape = new Point2D(0,0);
		}
		public GUIShape(GeoShape geoShape, boolean isFilled, Color cl, int x ){
			shape = geoShape;
			filled = isFilled;
			color = cl;
			tag = x;
		}

	@Override
	public GeoShape getShape() {
		return shape;
	}//Returns the shape

	@Override
	public void setShape(GeoShape g) {
			shape = g;
	}//Determines the shape

	@Override
	public boolean isFilled() {//return true if the shape is filled and falls if the shape is not filled
		return filled;	}

	@Override
	public void setFilled(boolean filled) {
			this.filled=filled;
	}//set the shape state true/false to determine whether the shape is filled or not filled

	@Override
	public Color getColor() {
		return this.color;
	}//Returns the color of the shape

	@Override
	public void setColor(Color cl) {//Determines the color of the shape

		this.color = cl;
	}

	@Override
	public int getTag() {
		return tag;
	}

	@Override
	public void setTag(int tag) {
		this.tag  =  tag ;
	}

	@Override
	public GUI_Shape copy() {
		return new GUIShape(shape, filled, color, tag);//Creates a copy of the shape
	}
	@Override
	public String toString() {
			if(this.shape instanceof Point2D){//Returns all the data from which the shape is constructed in the form of a string
			return "GUIShape,"+(this.color.getRGB()&0xffffff)+","+this.filled+","+this.tag+",Point2D,"+shape.toString();
			}else
				return "GUIShape,"+(this.color.getRGB()&0xffffff)+","+this.filled+","+this.tag+","+shape.toString();
	}
}



