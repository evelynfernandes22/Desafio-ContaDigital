
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 00001;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected double limite;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}else {
		System.out.println("Saldo insuficiente para esta operação.");
		return false;
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferirPara(double valor, IConta contaDestino) {
		if (saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			
		} else if (saldo < valor) {
			System.out.println("Saldo insuficiente para esta operação.");
		}
	}


	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número da Conta: %d", this.numConta));
		System.out.println("Titular: " + this.cliente.getNomeTitular() + " " + this.cliente.getSobrenome());
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumContaCorrente() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getNumConta() {
		return numConta;
	}

}
