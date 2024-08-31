package List_02;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Coordenador coordenador = new Coordenador("João", "exemplo@exemplo.com", "CEFET-RJ", new Endereco("25692658", "23", "Rio de Janeiro"), "21 996352895", "Cordenador");
        AreasEspecificadasPelaSociedade areasPesquisa = new AreasEspecificadasPelaSociedade();

        ArrayList<String> autores = new ArrayList<>();
        autores.add("Exemplo");
        autores.add("Exemplo1");

        ArrayList<AreaDePesquisa> areas = new ArrayList<>();
        areas.add(new AreaDePesquisa("Matemática"));

        Livros livro = new Livros("Titulo", 1996, areas, autores, "Editora", "Rio de Janeiro", areasPesquisa);
        livro.imprimirInformacoes();




    }



}