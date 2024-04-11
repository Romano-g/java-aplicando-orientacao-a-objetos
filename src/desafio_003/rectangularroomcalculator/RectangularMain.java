package desafio_003.rectangularroomcalculator;

public class RectangularMain {
	public static void main(String[] args) {
		RectangularRoomCalculator rectangle = new RectangularRoomCalculator();

		rectangle.setWidth(20);
		rectangle.setHeight(5);

		System.out.println(rectangle.calculateArea());
		System.out.println(rectangle.calculatePerimeter());
	}
}
