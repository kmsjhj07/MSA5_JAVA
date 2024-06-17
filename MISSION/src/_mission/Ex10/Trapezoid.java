package _mission.Ex10;

public class Trapezoid {

	public double top;
	public double bottom;
	public double height;
	
	public Trapezoid( double top, double bottom, double height ) {
		this.top = top;
		this.bottom = bottom;
		this.height = height;
	}
	
	public double getArea() {
		return ((top+bottom) * height /2);
	}
}
