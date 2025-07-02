package main;
import java.util.Scanner;
import usuarios.*;
public class Main {
	public static Scanner scan = new Scanner(System.in);
	private  static Gerente g = new Gerente("joao", "joao@.com.br", "*****");
	private  static Vendedor v = new Vendedor("Marcos", "marcos@.com.br", "*****", 0);
	private  static Atendente a = new Atendente("Pedro", "pedro@.com.br", "*****", 0);
		
	public static void main(String[] args) {
		a.addVal();
		v.addVendas();
		v.addVendas();
		
		var option = -1;
		do {
			System.out.println("Opção1");
			System.out.println("Opção2");
			System.out.println("Opção2");
			option = scan.nextInt();
			switch(option) {
			case 1 ->{
				System.out.println("Dados do gerente" +  " "+  g.getNome() + " " + g.getEmail() + " "+ g.getSenha());
				System.out.println("E administrador? " + " " + g.getAdm());
				System.out.println(g.gerarRelatorio());
				g.consultarVendas();
			
			}
			case 2 ->{
				System.out.println("Dados do vendedor" +  " "+  v.getNome() + " " + v.getEmail() + " "+ v.getSenha());
				System.out.println("E administrador? " + " " + v.getAdm()); 
				v.consultarVendas();
			}
			case 3 ->{
				System.out.println("Dados do atendente" +  " "+  a.getNome() + " " + a.getEmail() + " "+ a.getSenha());
				System.out.println("E administrador? " + " " + a.getAdm());
				System.out.println("Um total de " + a.getValEmCaixa());
			}
			}
			
		}while(option!=0);	
	}
	
	
}
