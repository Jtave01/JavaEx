package main;
import serviçosDeMenssagens.*;
import java.util.Scanner;
public class Main {
	private final static Scanner scanner = new Scanner(System.in);
	private static ServiçoMenssagemInstantanea	 serviçoMenssagemInstantanea;
	public static void main(String[] args) {
		var op = -1;
		while(op != 0) {
			System.out.println("========================================");
			System.out.println("Escolha um serviço para enviar menssagem");
			System.out.println("========================================");
			System.out.println("1. SMS");
			System.out.println("2. E-mail");
			System.out.println("3. Rede Sociais");
			System.out.println("4. WhatsApp");
			System.out.println("5. Sair");
			op = scanner.nextInt();
		
		if(op ==1) {
			serviçoMenssagemInstantanea = enviarSMS();
			System.out.println("Enviando pelo SMS: " + " " + serviçoMenssagemInstantanea.EnviarMensagem());
		}
		else if(op == 2) {
			serviçoMenssagemInstantanea = enviarEmail();
			System.out.println("Enviando pelo e-mail: " + " " + serviçoMenssagemInstantanea.EnviarMensagem());
		}
		else if(op ==3) {
			serviçoMenssagemInstantanea = enviarRedeSociais();
			System.out.println("Enviando pela red social: " + " " + serviçoMenssagemInstantanea.EnviarMensagem());
		}
		else if(op ==4) {
			serviçoMenssagemInstantanea = enviarWhatsApp();
			System.out.println("Enviando pelo: WhatsApp" + " " + serviçoMenssagemInstantanea.EnviarMensagem());
		}
		else {
			System.out.println("Opção invalida");
			continue;
			}
		
		}
		
	}
	private static Sms enviarSMS() {
		scanner.nextLine();
		System.out.println("Digite a menssagem");
		String menssagem = scanner.nextLine();
		return new Sms(menssagem);
	}

	private static Email enviarEmail() {
		scanner.nextLine();
		System.out.println("Digite a menssagem");
		String menssagem = scanner.nextLine();
		return new Email(menssagem);
	}
	private static RedeSociais enviarRedeSociais() {
		scanner.nextLine();
		System.out.println("Digite a menssagem");
		String menssagem = scanner.nextLine();
		return new RedeSociais(menssagem);
	
	}
	private static WhatsApp enviarWhatsApp() {
		scanner.nextLine();
		System.out.println("Digite a menssagem");
		String menssagem = scanner.nextLine();
		return new WhatsApp(menssagem);
	}

}
