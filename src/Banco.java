import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	// Construtor para banco
	public Banco(String nome) {
		this.nome = nome;
		contas = new ArrayList<Conta>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	// Adionar conta
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}

	// Retorna as contas cujos titulares são pessoas físicas
	public List<Conta> listarContaClientesPessoaFisica() {
		List<Conta> contasClientePessoaFisica = new ArrayList<>();
		for (Conta conta : contas) {
			if (conta.cliente instanceof ClientePessoaFisica) {
				contasClientePessoaFisica.add(conta);
			}
		}
		return contasClientePessoaFisica;
	}

	public List<Conta> listarContaClientesPessoaJuridica() {
		List<Conta> contasClientePessoaJuridica = new ArrayList<>();
		for (Conta conta : contas) {
			if (conta.cliente instanceof ClientePessoaJuridica) {
				contasClientePessoaJuridica.add(conta);
			}
		}
		return contasClientePessoaJuridica;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n*** Contas cadastrada no ").append(this.getNome());
		sb.append("\n CONTAS PESSOA FÍSICA\n");
		for (Conta conta : listarContaClientesPessoaFisica()) {
			sb.append(conta.cliente.toString());
			sb.append(conta.imprimirInfosComuns(conta.getCliente())).append("\n");
		}
		sb.append("\n CONTAS PESSOA JURÍDICA\n");
		for (Conta conta : listarContaClientesPessoaJuridica()) {
			sb.append(conta.cliente.toString());
			sb.append(conta.imprimirInfosComuns(conta.getCliente())).append("\n");
		}
		return sb.toString();
	}
}
