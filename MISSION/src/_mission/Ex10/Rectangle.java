package _mission.Ex10;

public class Rectangle {

	public double width;
	public double height;
	
	public Rectangle( double width, double height ) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public double getArea() {
		return width * height;
	}
}
