package usuarios;

public final class Vendedor extends Usuarios {
	protected static int qtdVendas =0;

	public Vendedor() {
	}
	public Vendedor(String nome, String email, String senha, int qtdVendas) {
		super(nome, email, senha);
		 
		qtdVendas = qtdVendas;
		
		setAdm(false);
	}
	
	public static int getQtdVendas() {
		return qtdVendas;
	}
	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
	public static void addVendas() {
		qtdVendas = qtdVendas +1;
		
	}
	public static void consultarVendas() {
		
		System.out.println("Relizamos um total de " + " "+ qtdVendas + " " + "vendas");
	}

}
