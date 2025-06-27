package serviçosDeMenssagens;

public record WhatsApp(String menssagem) implements ServiçoMenssagemInstantanea{

	@Override
	public String EnviarMensagem() {
		
		// TODO Auto-generated method stub
		return menssagem;
	}
	


}
