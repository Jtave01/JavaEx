package forms;

public record Rectangle(double height, double base ) implements GeometricForms {

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return height * base;
	}

}
