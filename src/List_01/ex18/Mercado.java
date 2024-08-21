package List_01.ex18;

import javax.xml.crypto.Data;

public class Mercado {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Fornecedor X", "123456789", "Rua X, 123", "12345678901234");

        Item item1 = new Item("Produto 1", 10.35, fornecedor, new Data() {
        });
        Item item2 = new Item("Produto 2", 19.60, fornecedor, new Data() {
        });

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarItem(item1);
        carrinho.adicionarItem(item2);
        carrinho.adicionarItem(item1);

        System.out.println("Quantidade total de itens: " + carrinho.getQuantidadeTotal());
        System.out.println("Quantidade de " + item1.getNome() + ": " + carrinho.getQuantidadePorItem(item1));
        System.out.println("Valor total da compra: R$" + carrinho.getValorTotal());

    }

}
