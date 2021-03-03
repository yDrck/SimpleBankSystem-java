package usuario;

public class Correntista {
	
	private String nome;
	private String email;
	private String cpf;
	
	
	public Correntista() {
		super();
	}


	public Correntista(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "[Nome = " + nome + ", Email = " + email + ", CPF = " + cpf + "]";
	}
	
	
	
}
