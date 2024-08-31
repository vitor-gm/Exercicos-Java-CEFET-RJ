package List_02;

import java.util.List;

public abstract class Publicacao {
    protected String titulo;
    protected int ano;
    protected List<AreaDePesquisa> areas;
    protected List<String> autores;
    protected Pesquisa pesquisaAssociada;

    public Publicacao(String titulo, int ano, List<AreaDePesquisa> areas, List<String> autores, Pesquisa pesquisaAssociada, AreasEspecificadasPelaSociedade areasEspecificadas) {
        this.titulo = titulo;
        this.ano = ano;
        this.areas = areas;
        this.autores = autores;
        this.pesquisaAssociada = pesquisaAssociada;
        validarAreasDePesquisa(areasEspecificadas);
    }
    public Publicacao(String titulo, int ano, List<AreaDePesquisa> areas, List<String> autores, AreasEspecificadasPelaSociedade areasEspecificadas) {
        this.titulo = titulo;
        this.ano = ano;
        this.areas = areas;
        this.autores = autores;
        validarAreasDePesquisa(areasEspecificadas);

    }

    private void validarAreasDePesquisa(AreasEspecificadasPelaSociedade areasEspecificadas) {
        for(AreaDePesquisa area : areas) {
            if(!areasEspecificadas.isAreaDePesquisaValida(area.getNome())) {
                throw new IllegalArgumentException("Área de pesquisa inválida: " + area.getNome());
            }
        }
    }
    public abstract void imprimirInformacoes();
}