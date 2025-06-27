package forms;

public record Circle(double radius) implements GeometricForms {

	private static final double pi = 3.14;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return pi *(radius * radius);
	}
}
