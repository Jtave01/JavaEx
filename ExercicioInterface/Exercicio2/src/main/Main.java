package main;
import java.util.Scanner;
import taxes.*;
public class Main {
	private final static Scanner scanner = new Scanner(System.in);	
	public static void main(String[]args) {
		var option = -1;
		 TaxApplication taxApplication;
		do {
			System.out.println("========================");
			System.out.println("Choose an option for taxes");
			System.out.println("1.Foods");
			System.out.println("2.Health and wll-being");
			System.out.println("3.Clolthis");
			System.out.println("4.Culture");
			System.out.println("5.Exit");
			option = scanner.nextInt();
		switch(option) {
		case 1 -> {
			taxApplication = taxForFood();
			System.out.println("Tax for food: " + " " + taxApplication.returnTax()+"%");
			}
		case 2 -> {
			taxApplication = taxHealthBeing();
			System.out.println("Tax for Health and wll-being: " + " " + taxApplication.returnTax()+"%");
		}
		case 3 -> {
			taxApplication = taxClothing();
			System.out.println("Tax for clothing: " + " " + taxApplication.returnTax()+"%");
		}
		case 4 -> {
			taxApplication = taxCulture();
			System.out.println("Tax for culture: " + " " + taxApplication.returnTax()+"%");
		}
		case 5 -> {
			option = 0;
		}	
			}			
		}while(option !=0);
	}
	public static Food taxForFood() {
		return new Food(1.0);
	}
	public static HealthBeing taxHealthBeing() {
		return new HealthBeing(1.5);
	}
	public static Clothing taxClothing() {
		return new Clothing(2.5);
	}
	public static Culture taxCulture() {
		return new Culture(4.0);
	}
	public static TaxApplication tax() {
		
		
		
		return null;
		
	}
}
