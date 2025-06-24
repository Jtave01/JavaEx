package ingressos;

public non-sealed class IngressoHomemDeFerro extends Ingresso {
	
	public IngressoHomemDeFerro() {
		setNomeFilme("Homem De Ferro");
		setTipoDouL("Legendado");
		valorDoFilme();
		setMeiaEntrada(false);
		 
	}

	protected int valBruto;
	int vallTotal;
	public int valorDoFilme() {
	this.valor = 80;
		if(this.pessoasFamilia >3 && this.meiaEntrada == false) {
			valBruto = (this.valor * this.pessoasFamilia);
			int desconto = (int) (valBruto * 0.05);
			vallTotal = valBruto - desconto;
			setValor(vallTotal);	
		}
		else if(this.pessoasFamilia >=1 && this.pessoasFamilia <=3 && this.meiaEntrada == false){
			
			vallTotal = (getValor() * this.pessoasFamilia);
			setValor(vallTotal);		
		}
		else if(this.meiaEntrada == true) {
			vallTotal = this.valor/2;
		}	
		return vallTotal;	
	}

}
