package usuarios;

public final class Gerente extends Usuarios {
	
	public Gerente() {
		 
	}

	public Gerente(String nome, String email, String senha) {
		super(nome, email, senha);
		 
		setAdm(true);
	}
	
	public String gerarRelatorio() {
		final Atendente atd = new Atendente();
		final Vendedor vnd = new Vendedor();
		System.out.println("Tivemos uma quantidade total de vendas de " + " " + vnd.qtdVendas + " " + "vendas" + 
		" " + "com um lucro total de " + atd.valEmCaixa);
		return "";
	}
	
	public void consultarVendas() {
		final Vendedor vnd = new Vendedor();
		System.out.println("Relizamos um total de " + " "+ vnd.qtdVendas + " " + "vendas");
	}
	
}
