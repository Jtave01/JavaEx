package employee;

public non-sealed class Salesman extends Employee{
	private double percentPerSold;
	private double soldAmount;
	
	public Salesman(String code, String name, String address, int age, double salary, double soldAmount, double percentPerSold) {
	super(code, name, address, age, salary);
	this.percentPerSold = percentPerSold;
	this.soldAmount = soldAmount;
	}
	public Salesman() {
	}
	@Override
	public String getCode() {
		
		return "SL" + this.code;
	}
	
	public double getSoldAmount() {
		return soldAmount;
	}
	public void setSoldAmount(double soldAmount) {
		this.soldAmount = soldAmount;
	}
	public double getPercentPerSold() {
		return percentPerSold;
	}
	public void setPercentPerSold(double percentPerSold) {
		this.percentPerSold = percentPerSold;
	}
	
	
	public double getFullSalary() {
		return this.salary + ((soldAmount * percentPerSold)/100) ;
	}
}
