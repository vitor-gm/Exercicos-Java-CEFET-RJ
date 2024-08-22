package List_02;

import java.util.List;

public abstract class Publicacao {
    protected String titulo;
    protected int ano;
    protected List<AreaDePesquisa> areas;
    protected List<String> autores;
    protected Pesquisa pesquisaAssociada;

    public Publicacao(String titulo, int ano, List<AreaDePesquisa> areas, List<String> autores, Pesquisa pesquisaAssociada) {
        this.titulo = titulo;
        this.ano = ano;
        this.areas = areas;
        this.autores = autores;
        this.pesquisaAssociada = pesquisaAssociada;
    }
    public  Publicacao(String titulo, int ano, List<AreaDePesquisa> areas, List<String> autores) {
        this.titulo = titulo;
        this.ano = ano;
        this.areas = areas;
        this.autores = autores;

    }
    public abstract void imprimirInformacoes();
}