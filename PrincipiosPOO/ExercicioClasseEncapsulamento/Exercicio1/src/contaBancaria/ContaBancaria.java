package contaBancaria;
//import java.util.Scanner;
public class ContaBancaria {
	//private final Scanner scanner = new Scanner(System.in);
	private double saldo = 00.00;
	private double boleto =00.00;
	private double chequeEspecial = 00.00;
	private boolean foiChamado;
	
	public  ContaBancaria(double saldo, double chequeEspecial, double boleto) {
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
		this.boleto = boleto;
	}
	
	
	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public double getSaldo() {
		return saldo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public double getBoleto() {
		return boleto;
	}
	public void setCheque(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	public  void setBoleto(double boleto) {
		this.boleto = boleto;
		
	}

	
	public void pagarBoleto() {
	
			this.saldo -= this.boleto;	
	}
	
	public void addValor(Double deposito) {	
		if(deposito <= 500.00) {
			double valorAdcionarCheque1 = 50.00;
			setCheque(valorAdcionarCheque1);
			setSaldo(deposito);
		}
		 if(deposito > 500.00) {
			double valorAdcionarCheque2 = deposito/2;
			setCheque(valorAdcionarCheque2);
			setSaldo(deposito);
		}		
	}
	public void chequeUsando() {	
			this.chequeEspecial -= this.boleto;
		}

	public void vintePercent() {
	 
		double percent = 20.00;
		double valor = this.chequeEspecial * percent /100;
		setCheque(this.chequeEspecial - valor);
		foiChamado = true;
	}
	
	public void usandoCheque() {
		if(foiChamado == true) {
			System.out.println("Voce esta usando o chuqe especial no valor de " + " " + getChequeEspecial());
		}
		else {
			System.out.println("Voce possui um cheque especial no valor de" + " " + getChequeEspecial() + " " + "porem não esta sendo usado");
		}
		
	}
}
	
	
