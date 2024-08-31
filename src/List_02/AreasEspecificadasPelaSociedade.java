package List_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AreasEspecificadasPelaSociedade {

    private List<String> opiniaoPublica;

    public AreasEspecificadasPelaSociedade() {
        this.opiniaoPublica = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.printf("Área de pesquisa %d: ", i);
            String areaPesquisa = sc.nextLine();
            opiniaoPublica.add(areaPesquisa);
        }
    }

    public List<String> getOpiniaoPublica() {

        return opiniaoPublica;
    }

    public boolean isAreaDePesquisaValida(String areaDePesquisa) {
        return opiniaoPublica.contains(areaDePesquisa);
    }
}