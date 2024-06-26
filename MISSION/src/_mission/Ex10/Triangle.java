package _mission.Ex10;

public class Triangle {
	
	public double width;
	public double height;
	
	public Triangle( double width, double height ) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	public double getArea() {
		return width * height * 0.5;
	}

}
