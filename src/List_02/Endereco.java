package List_02;

public class Endereco {

    private String cep;
    private String numero;
    private String cidade;

    public Endereco() {

    }

    public Endereco(String cep, String numero, String cidade) {
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }
}
