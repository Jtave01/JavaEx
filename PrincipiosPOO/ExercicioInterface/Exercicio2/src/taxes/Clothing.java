package taxes;

public record Clothing(double tax)implements TaxApplication {

	@Override
	public double returnTax() {
		// TODO Auto-generated method stub
		return tax;
	}

}
