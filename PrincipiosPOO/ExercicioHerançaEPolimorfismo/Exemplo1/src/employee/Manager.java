package employee;

public non-sealed class Manager extends Employee{
	
	private String login;
	private String passwd;
	private double commission;
	
	public Manager(String code, String name, String address, int age, double salary, String login, String passwd,double commission) {
		super(code, name, address, age, salary);
		this.login = login;
		this.passwd = passwd;
		this.commission = commission;
	}
	public Manager() {
		
	}
	@Override
	public String getCode() {
		return "Mn" + this.code;
	}
	public String getLogin() {
		return login;
	}
	public String getPasswd() {
		return passwd;
	}
	public double getCommision() {
		return commission;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public void setCommission(double commission) {
		this.commission = commission; 
	}
	
	
	public double getFullSalary() {
		return this.salary + this.commission;
	}
}
