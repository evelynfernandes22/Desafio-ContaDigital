
public class Teste {

	public static void main(String[] args) {
		
		Cliente titular1 = new Cliente();
		titular1.setNomeTitular("Maria Vitória");
		titular1.setSobrenome("Santos");
		titular1.setCpf("12345678910");
				
		IConta conta1 = new ContaCorrente(titular1); 
		conta1.depositar(2000);
				
		IConta poupanca = new ContaPoupanca(titular1); 
		conta1.transferirPara(300, poupanca);
		poupanca.transferirPara(20, conta1);
		//poupanca.sacar(400);
		
		conta1.imprimirExtrato();
		System.out.println();
		poupanca.imprimirExtrato();
		
	}

}
