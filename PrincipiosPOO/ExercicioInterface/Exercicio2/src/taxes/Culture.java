package taxes;

public record Culture(double tax) implements TaxApplication{

	@Override
	public double returnTax() {
		// TODO Auto-generated method stub
		return tax;
	}

}
