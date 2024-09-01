package Simulado

public class Saber extends Weapon {

    public Saber(String descricao, Double dano) {
        super(descricao, dano);
    }

    public void slash() {
        System.out.println("Slash");

    }
}
