package Simulado

public class Blast extends Weapon {


    public Blast(String descricao, Double dano) {
        super(descricao, dano);
    }

    public void shot() {
        System.out.println("Shot");

    }
}
