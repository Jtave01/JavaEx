package serviçosDeMenssagens;

public record RedeSociais(String menssagem) implements ServiçoMenssagemInstantanea{

	@Override
	public String EnviarMensagem() {
		
		// TODO Auto-generated method stub
		return menssagem;
	}

	
}
