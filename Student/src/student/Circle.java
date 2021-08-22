package student;

public class Circle {
	private double radius;
	private String colour;
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String colour) {
		this.colour=colour;
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + "]";
	}
	public  double getArea() {
		double area=Math.PI*radius*radius;
		return area;
	}

}
