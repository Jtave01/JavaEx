package ingressos;

public non-sealed class IngressoHomemAranha extends Ingresso {
	
	public IngressoHomemAranha() {
		setNomeFilme("Homem Aranha");
		setTipoDouL("Dublado");
		valorDoFilme();
		setMeiaEntrada(false);
		 
	}
	protected int valBruto;
	int vallTotal;
	@Override
	public int valorDoFilme() {
		this.valor = 100;
		if(this.pessoasFamilia >3 &&  this.meiaEntrada == false) {
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
