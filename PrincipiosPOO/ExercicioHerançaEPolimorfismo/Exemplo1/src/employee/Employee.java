package employee;

public sealed abstract class Employee permits Manager, Salesman{

	protected String code;
	protected String name;
	protected String address;
	protected int age;
	protected double salary;
	
	public Employee(String code, String name, String address, int age, double salary) {
		super();
		this.code = code;
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	public Employee() {
		
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public abstract double getFullSalary();
}
