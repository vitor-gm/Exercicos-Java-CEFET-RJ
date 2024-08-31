package List_02;

import java.util.List;

public class Tese extends Publicacao {

    private String grau;
    private String instituicao;

    public Tese(String titulo, int ano, List<AreaDePesquisa> areas, List<String> autores, AreasEspecificadasPelaSociedade areasEspecificadas, Pesquisa pesquisaAssociada, String grau, String instituicao) {
        super(titulo, ano, areas, autores, pesquisaAssociada, areasEspecificadas);
        this.grau = grau;
        this.instituicao = instituicao;
    }


    @Override
    public void imprimirInformacoes() {
        AtributosPublicacao.exibirAtributosDaPublicacao(titulo, ano, areas, autores, pesquisaAssociada);
        System.out.printf("Grau: %s\n", this.grau);
        System.out.printf("Instituição: %s\n", this.instituicao);
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
}
