public class ClientePessoaFisica extends Cliente {

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Tipo de Cliente: pessoa física"
                + "\nNome : " + super.getNome()
                + "\nCPF  : " + this.cpf;
    }
}
