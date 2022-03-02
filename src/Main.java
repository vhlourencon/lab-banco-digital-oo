
public class Main {

	public static void main(String[] args) throws Exception {
		Banco banco = new Banco();
		banco.setNome("Bandio DIO");

		Cliente clienteVitor = new Cliente();
		clienteVitor.setNome("Vitor Hugo Lourencon");

		ContaCorrente contaCorrente = banco.criaContaCorrente(clienteVitor, 1000);
		Conta contaPoupanca = banco.criaContaPoupanca(clienteVitor);

		contaCorrente.sacar(150);
		contaCorrente.transferir(150, contaPoupanca);
		contaCorrente.imprimirExtrato();

		 contaPoupanca.depositar(100);
		 contaPoupanca.imprimirExtrato();

		 banco.imprimeListaDeContas();

	}

}
