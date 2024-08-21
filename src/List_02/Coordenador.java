package List_02;

public class Coordenador {

    private String nome;
    private String email;
    private String instituicaoDeOrigem;
    private Endereco endereco;
    private String telefone;
    private String funcao;

    public Coordenador(String nome, String email, String instituicaoDeOrigem, Endereco endereco, String telefone, String funcao) {
        this.nome = nome;
        this.email = email;
        this.instituicaoDeOrigem = instituicaoDeOrigem;
        this.endereco = endereco;
        this.telefone = telefone;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getInstituicaoDeOrigem() {
        return instituicaoDeOrigem;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getFuncao() {
        return funcao;
    }
}
