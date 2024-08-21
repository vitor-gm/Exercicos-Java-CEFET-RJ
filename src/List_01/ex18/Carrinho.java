package List_01.ex18;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Item> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        if (item.estaVencido()) {
            System.out.println("Item vencido: " + item.getNome());
            return;
        }
        itens.add(item);
    }

    public int getQuantidadeTotal() {
        int total = 0;
        for (Item item : itens) {
            total++;
        }
        return total;
    }

    public int getQuantidadePorItem(Item item) {
        int quantidade = 0;
        for (Item i : itens) {
            if (i.equals(item)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public double getValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValorVenda();
        }
        return total;
    }


}
