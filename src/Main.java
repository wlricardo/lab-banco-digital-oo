
public class Main {

	public static void main(String[] args) {

		Banco bb = new Banco("Banco do Brasil");

		ClientePessoaFisica willem = new ClientePessoaFisica();
		willem.setNome("Willem");
		willem.setCpf("111.222.333-00");

		Conta cc1 = new ContaCorrente(willem);
		Conta poupanca1 = new ContaPoupanca(willem);

		cc1.depositar(1000);
		cc1.transferir(100, poupanca1);

		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();

		bb.adicionarConta(poupanca1);
		bb.adicionarConta(cc1);

		System.out.println("\n------------------------");

		ClientePessoaJuridica empresa = new ClientePessoaJuridica();
		empresa.setNome("Empresa XYZ");
		empresa.setCnpj("444.555.999.11");

		Conta cc2 = new ContaCorrente(empresa);
		Conta poupanca2 = new ContaPoupanca(empresa);

		cc2.depositar(10000);
		cc2.transferir(1500, poupanca2);

		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();

		bb.adicionarConta(poupanca2);
		bb.adicionarConta(cc2);

		System.out.println("\n------------------------");

		System.out.println(bb);
	}
}
