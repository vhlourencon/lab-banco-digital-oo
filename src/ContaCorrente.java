
public class ContaCorrente extends Conta {
	
	
	
	public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
		super(cliente);
		super.temChequeEspecial = true; 
		super.limiteChequeEspecial = limiteChequeEspecial; 
	}

	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

}