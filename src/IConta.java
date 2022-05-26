
public interface IConta {
	
	boolean sacar(double valor);

	void depositar(double valor); 

	void transferirPara(double valor, IConta contaDestino);
	
	void imprimirExtrato ();
	
			
}
