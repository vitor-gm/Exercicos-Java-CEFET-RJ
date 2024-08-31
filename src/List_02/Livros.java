package List_02;

import java.util.List;

public class Livros extends Publicacao {

    private String editora;
    private String localDePublicacao;

    public Livros(String titulo, int ano, List<AreaDePesquisa> areas, List<String> autores, Pesquisa pesquisaAssociada, String editora, String localDePublicacao, AreasEspecificadasPelaSociedade areasEspecificadas) {
        super(titulo, ano, areas, autores, pesquisaAssociada, areasEspecificadas);
        this.editora = editora;
        this.localDePublicacao = localDePublicacao;
    }

    public Livros(String titulo, int ano, List<AreaDePesquisa> areas, List<String> autores, String editora, String localDePublicacao, AreasEspecificadasPelaSociedade areasEspecificadas) {
        super(titulo, ano, areas, autores, areasEspecificadas);
        this.editora = editora;
        this.localDePublicacao = localDePublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocalDePublicacao() {
        return localDePublicacao;
    }

    public void setLocalDePublicacao(String localDePublicacao) {
        this.localDePublicacao = localDePublicacao;
    }

    @Override
    public void imprimirInformacoes() {
        AtributosPublicacao.exibirAtributosDaPublicacao(titulo, ano, areas, autores, pesquisaAssociada);
        System.out.printf("Editora: %s\n", this.editora);
        System.out.printf("Local de Publicação: %s\n", this.localDePublicacao);

    }
}
