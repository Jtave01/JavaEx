package usuarios;

public sealed class  Usuarios permits Gerente, Vendedor, Atendente{
	protected String nome;
	protected String email;
	protected String senha;
	
	private boolean adm;
	public Usuarios(String nome, String email, String senha ) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.adm = adm;
	}
	public Usuarios() {
		
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public boolean getAdm() {
		return adm;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setAdm(boolean adm) {
		this.adm = adm;
	}
	
	public String realizarLogin() {
		return "LOGANDO. . . ";
	}
	public String realizarLogoff() {
		return "SAINDO. . . ";
	}
	public String alterarDados() {
		return "Dados alterados com sucesso";
	}
	public String alterarSenha() {
		return "Senha alterad com sucesso";
	}
	

}
