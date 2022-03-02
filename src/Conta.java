
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	protected boolean temChequeEspecial; 
	protected double  limiteChequeEspecial; 

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}

	@Override
	public void sacar(double valor) throws Exception {
		
		if (valor <= 0.0) {
			throw new Exception("O valor da operacao é inválido!");
		}
		double saldoAux = saldo - valor; 
		double limiteAux = limiteChequeEspecial *(-1);
		if(temChequeEspecial &&  saldoAux < limiteAux) { 
			throw new Exception("O valor da operacao é superior ao limite cheque especial!");
		}
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) throws Exception {
		if (valor <= 0.0) {
			throw new Exception("O valor da operacao é inválido!");
		}
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) throws Exception {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}