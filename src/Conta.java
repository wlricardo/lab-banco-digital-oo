
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	public Object imprimirInfosComuns;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
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

	public Cliente getCliente() {
		return this.cliente;
	}

	protected String imprimirInfosComuns(Cliente cliente) {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Titular: %s\n", this.cliente.getNome()));
		sb.append(String.format("Agencia: %d\n", this.agencia));
		sb.append(String.format("Numero: %d", this.numero));
		sb.append(String.format("Saldo: %.2f", this.saldo));
		return sb.toString();
	}
}
