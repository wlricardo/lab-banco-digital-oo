public class ClientePessoaJuridica extends Cliente {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Tipo de Cliente: pessoa jurídica"
                + "\nNome : " + super.getNome()
                + "\nCNPJ : " + this.cnpj;
    }
}
