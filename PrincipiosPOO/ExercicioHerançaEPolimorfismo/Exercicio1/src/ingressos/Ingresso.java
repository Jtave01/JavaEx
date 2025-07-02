package ingressos;

public sealed abstract class Ingresso permits IngressoHomemAranha, IngressoHomemDeFerro {
	private String nomeFilme;
	protected int valor;
	protected String tipoDouL;
	protected int pessoasFamilia;
	protected boolean meiaEntrada = false;
	
	public Ingresso(String nomeFilme, int valor, String tipoDouL, int pessoasFamilia ) {
		this.nomeFilme = nomeFilme;
		this.valor = valor;
		this.tipoDouL = tipoDouL;
		this.pessoasFamilia = pessoasFamilia;
	}
	public Ingresso() {
		
	}
	public int getPessoasFamilia() {
		return pessoasFamilia;
	}
	public void setPessoasFamilia(int pessoasFamilia) {
		this.pessoasFamilia = pessoasFamilia;
	}
	public String getNomeFilme() {
		return nomeFilme;
	}
	public int getValor() {
		return valor;
	}
	public String getTipoDouL() {
		return tipoDouL;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public void setTipoDouL(String tipoDouL) {
		this.tipoDouL = tipoDouL ;
	}
	public boolean isMeiaEntrada() {
		return meiaEntrada;
	}
	public void setMeiaEntrada(boolean meiaEntrada) {
		this.meiaEntrada = meiaEntrada;
	}
	
	public void calcValMeiaEntrada() {
		if(this.meiaEntrada == true) {
			this.valor = this.valor/2;
			System.out.println(this.valor);
		}
	}
	
	
	public abstract int valorDoFilme();
	
	
}
