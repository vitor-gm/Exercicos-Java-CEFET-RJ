package List_02;

import java.util.List;

public class AtributosPublicacao {

    public static void exibirAtributosDaPublicacao(String titulo, int ano, List<AreaDePesquisa> areas, List<String> autores, Pesquisa pesquisaAssociada) {
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Ano: %d\n", ano);
        for (AreaDePesquisa area : areas) {
            System.out.printf("Área de Pesquisa: %s\n", area.getNome());
        }
        for (String autor : autores) {
            System.out.printf("Autor: %s\n", autor);
        }
        if (pesquisaAssociada == null) {
            System.out.print("Não há pesquisa associada\n");
        }else {
            System.out.printf("Pesquisa associada: %s\n", pesquisaAssociada.getNome());
        }


    }
}
