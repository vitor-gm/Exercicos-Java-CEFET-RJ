package List_02;

import java.util.List;

public class ConferenciasEArtigos extends Publicacao {

    private String nome;
    private int volume;
    private int numero;

    public ConferenciasEArtigos(String titulo, int ano, List<AreaDePesquisa> areas, List<String> autores, AreasEspecificadasPelaSociedade areasEspecificadas, Pesquisa pesquisaAssociada, String nome, int volume, int numero) {
        super(titulo, ano, areas, autores, pesquisaAssociada, areasEspecificadas);
        this.nome = nome;
        this.volume = volume;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void imprimirInformacoes() {
        AtributosPublicacao.exibirAtributosDaPublicacao(titulo, ano, areas, autores, pesquisaAssociada);
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Volume: %d\n", this.volume);
        System.out.printf("Número: %d\n", this.numero);




    }
}
