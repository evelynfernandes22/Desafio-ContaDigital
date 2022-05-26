
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("--------------EXTRATO CONTA POUPANÇA: -------------- ");
		super.imprimirInfosComuns();

	}

	@Override
	public boolean sacar(double valor) {

		if (saldo >= valor) { // Tem saldo na conta
			saldo -= valor;
			return true;
		} else {	//não tem saldo na conta
			System.out.println("Operação de saque poupança não realizada, saldo insuficiente.");
			return false;
		}
	}

	@Override
	public String toString() {
		return "ContaPoupanca [agencia=" + agencia + ", numConta=" + numConta + 
				", saldo=" + saldo + ", limite="
				+ limite + "]";
	}
	

}
