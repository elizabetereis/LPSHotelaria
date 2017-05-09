

/**
 * TODO description
 */
public abstract class Pessoa {
	
	private String nome;
	private String identificacao;
	private String endereco;
	private String email;
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, String identificacao, String endereco, String email){
		
		this.nome = nome;
		this.identificacao = identificacao;
		this.endereco = endereco;
		this.email = email;	
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		((Pessoa) this).nome = nome;
	}
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		((Pessoa) this).identificacao = identificacao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		((Pessoa) this).endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		((Pessoa) this).email = email;
	}
	
}