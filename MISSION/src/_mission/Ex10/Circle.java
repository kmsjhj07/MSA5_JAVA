package _mission.Ex10;

public class Circle {

	public double radius;
	
	Circle( double radius ) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	public double getArea() {
		return radius * radius * 3.14;
	}
}
