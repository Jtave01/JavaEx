package taxes;

public record HealthBeing(double tax)implements TaxApplication {

	@Override
	public double returnTax() {
		// TODO Auto-generated method stub
		return tax;
	}

}
