package desafio_003.rectangularroomcalculator;

public class RectangularRoomCalculator implements GeometricCalculus {
	private double width;
	private double height;

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public double calculatePerimeter() {
		return 2*(width + height);
	}
}
