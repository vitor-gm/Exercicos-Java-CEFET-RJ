package List_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AreaDePesquisa {

    private List<String> areas;

    public AreaDePesquisa(String areaPesquisa) {
        this.areas = new ArrayList<>();
        areas.add(areaPesquisa);
    }

    public void adicionarArea(String areaPesquisa) {
        areas.add(areaPesquisa);
    }




}
