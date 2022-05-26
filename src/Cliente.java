
public class Cliente {
	
	
	protected String nomeTitular;
	protected String sobrenome;
	protected String cpf;
	
	public Cliente() {
		
	}
	
	public Cliente(String nomeTitular, String sobrenome, String cpf) {
		super();
		this.nomeTitular = nomeTitular;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
