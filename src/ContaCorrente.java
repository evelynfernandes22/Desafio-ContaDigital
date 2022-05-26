
public class ContaCorrente extends Conta {

	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--------------EXTRATO CONTA CORRENTE: -------------- ");
		super.imprimirInfosComuns();
	}

	@Override
	public String toString() {
		return "ContaCorrente [agencia=" + agencia + ", numConta=" + numConta + 
				", saldo=" + saldo + ", limite="
				+ limite + "]";
	}
	

	


	
}

