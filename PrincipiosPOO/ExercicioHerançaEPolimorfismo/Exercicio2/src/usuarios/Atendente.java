package usuarios;

public final class Atendente extends Usuarios {
	protected static int valEmCaixa =0;
	
	public Atendente() {
		
	}
	public Atendente(String nome, String email, String senha, int valEmCaixa) {
		super(nome, email, senha); 
		valEmCaixa = valEmCaixa;
		
		setAdm(false);
	}
	public static int getValEmCaixa() {
		return valEmCaixa;
	}
	public void serValEmCaixa(int valEmCaixa) {
		this.valEmCaixa = valEmCaixa;
	}
	
	public static void addVal() {
		valEmCaixa += 100;
		
	}
	
	public  String fecharCaixa() {
		return "Fechadno o caixa";
	}

}
