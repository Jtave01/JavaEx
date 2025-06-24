package main;
import ingressos.*;
public class Main {
	private final static IngressoHomemAranha ingressoHomemAranha = new IngressoHomemAranha();
	private final static IngressoHomemDeFerro ingressoHomemDeFerro = new IngressoHomemDeFerro();
	public static void main (String[]args) {
		printIngresso(ingressoHomemAranha);
		printIngresso(ingressoHomemDeFerro);
	}
	
	public static void printIngresso(Ingresso ingresso) {
		System.out.printf("====%s====\n", ingresso.getClass().getCanonicalName());
		switch(ingresso) {
		case IngressoHomemAranha homemAranha ->{
			homemAranha.setPessoasFamilia(1);
			homemAranha.setMeiaEntrada(true);
			
			System.out.println("Ingresso para o filme " + " " + homemAranha.getNomeFilme() + 
			" " + homemAranha.getTipoDouL() + " " + "No valor de " + " " + homemAranha.valorDoFilme() + " ");		
			}
		case IngressoHomemDeFerro homemDeFerro ->{
			homemDeFerro.setPessoasFamilia(5);
			homemDeFerro.setMeiaEntrada(false);
			
			System.out.println("Ingresso para o filme " + " " + homemDeFerro.getNomeFilme() + 
			" " + homemDeFerro.getTipoDouL() + " " + "No valor de " + " " + homemDeFerro.valorDoFilme() + " ");		
					
		}
		
		}
	}
}
