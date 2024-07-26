package main.com.java.poo.Exercicio.ex18;

import javax.xml.crypto.Data;
import java.util.Date;

public class Item {

    private String nome;
    private double valorCompra;
    private double valorVenda;
    private Data validade;
    private Fornecedor fornecedor;

    public Item(String nome, double valorCompra, Fornecedor fornecedor, Data validade) {
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.valorVenda = valorCompra * 1.3; // 30% de lucro
        this.validade = validade; // Data atual
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public Data getValidade() {
        return validade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public boolean estaVencido() {
        return validade.equals(validade);
    }

}
