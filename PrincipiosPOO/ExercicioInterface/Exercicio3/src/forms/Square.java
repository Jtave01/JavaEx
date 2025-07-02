package forms;

public record Square(double side) implements GeometricForms {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
