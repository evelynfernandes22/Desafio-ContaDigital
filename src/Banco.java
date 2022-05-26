import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nomeBanco;
	private List<Conta> contas;
	

	public Banco(String nomeBanco) {
		super();
		this.nomeBanco = nomeBanco;
	}


	public String getNomeBanco() {
		return nomeBanco;
	}


	public List<Conta> getContas() {
		return contas;
	}

}
