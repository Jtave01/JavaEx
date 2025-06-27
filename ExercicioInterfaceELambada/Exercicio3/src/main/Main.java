package main;
import java.util.Scanner;

import forms.GeometricForms;
import forms.*;
public class Main {
	private final static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int option = -1;
		GeometricForms geometricforms = null;
		while(option !=0){
			System.out.println("Escolha a forma geometrica para caucular a area");
			System.out.println("1 - quadrado");
			System.out.println("2 - retangulo ");
			System.out.println("3 - circulo");
			System.out.println("4 - sair");
			option = scanner.nextInt();
			if(option == 1) {
				geometricforms = creatSquare();
				}
			else if(option ==2) {
				geometricforms = creatRectangle();
				}
			else if(option ==3) {
				geometricforms	= creatCircle();
			}
			else if(option ==4) {
				option = 0;
			}
			else {
				System.out.println("opção invalida");
				continue;
			}
			
			System.out.println("O resultado e " + " " + geometricforms.getArea());
		}
	}
	private static GeometricForms creatSquare() {
		System.out.println("Informe os lados do quadrado");
		var side = scanner.nextDouble();
		return new Square(side);
	}
	private static GeometricForms creatRectangle() {
		System.out.println("Informe a base");
		var base = scanner.nextDouble();
		System.out.println("Informe a altura");
		var height = scanner.nextDouble();
		return new Rectangle(base, height);
	}
	private static GeometricForms creatCircle() {
		System.out.println("Informe o raio");
		var radius = scanner.nextDouble();
		return new Circle(radius);
	}
}
