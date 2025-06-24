package main;
import employee.*;
@SuppressWarnings("unused")
public class Main {
	 
	//public  final static Employee manager = new Manager();
	
		public static void main(String[] args) {
		printEmployee(new Manager());	
		printEmployee(new Salesman());	
			
		}
		
		public static void  printEmployee(Employee employee ) {
			System.out.printf("====%s====\n", employee.getClass().getCanonicalName());
			switch(employee) {
			case Manager manager -> {
				manager.setName("Joao");
				manager.setLogin("Joao");
				manager.setPasswd("abc123");
				manager.setAge(45);
				manager.setCode("956");
				manager.setSalary(5000);
				manager.setCommission(1200);
				
				System.out.println(manager.getName());
				System.out.println(manager.getLogin());
				System.out.println(manager.getPasswd());
				System.out.println(manager.getSalary());
				System.out.println(manager.getCode());
				manager.getFullSalary();
			}
			case Salesman salesman ->{
				salesman.setCode("456");
				salesman.setName("Pedro");
				salesman.setAge(36);
				salesman.setSalary(3000);
				salesman.setPercentPerSold(19);
				salesman.setSoldAmount(1000);
				
				System.out.println(salesman.getName());
				System.out.println(salesman.getCode());
				System.out.println(salesman.getAge());
				System.out.println(salesman.getSalary());
			}				
			
		}
			System.out.println(employee.getFullSalary());
	}
}
