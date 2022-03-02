import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Banco {

	@Getter
	@Setter
	private String nome;
	private List<Conta> contas;

	

	public ContaCorrente criaContaCorrente(Cliente cliente,double limiteChequeEspecial) {
		ContaCorrente conta = new ContaCorrente(cliente,limiteChequeEspecial);
		getContas().add(conta);
		return conta; 
	}
	
	public ContaPoupanca criaContaPoupanca(Cliente cliente) {
		ContaPoupanca conta = new ContaPoupanca(cliente);
		conta.temChequeEspecial = false; 
		conta.limiteChequeEspecial = 0.0; 
		getContas().add(conta);
		return conta;
	}

	public List<Conta> getContas() {
		if (contas == null) {
			contas = new ArrayList<Conta>();
		}
		return contas;
	}
	
	public void imprimeListaDeContas () { 
		System.out.println("=== Lista de Contas === ");
		for (Conta conta : getContas()) {
			conta.imprimirInfosComuns();
			System.out.println("-");
		}
		System.out.println("Total de Contas: " + getContas().size());
	}
	
	
	

}
