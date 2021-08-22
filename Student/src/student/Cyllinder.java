package student;

public class Cyllinder {
	private double height;
	private double radius;
	private String colour;
	public Cyllinder(double height) {
		this.height=height;
	}
	public Cyllinder(double height,double radius) {
		this.height=height;
		this.radius=radius;
	}
	public Cyllinder(double height,double radius,String colour) {
		this.height=height;
		this.radius=radius;
		this.colour=colour;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolume() {
		double volume=Math.PI*1*1*height;
		return volume;
	}
	public double getArea() {
		double area=2*Math.PI*(1+height);
		return area;
	}
	
}
