package Simulado

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weapon {

    private String descricao;
    private Double dano;

    public Weapon(String descricao, Double dano) {
        this.descricao = descricao;
        this.dano = dano;

    }

    public void drop(Weapon weapon, Jedi j) {
        j.getWeapons().remove(weapon);

    }

    public void drop(Weapon weapon, Sith s) {
        s.getWeapons().remove(weapon);

    }
    public void pickUp(Weapon weapon, Sith s) {
        if(s.getWeapons() == null) {
            s.setWeapons(new ArrayList<>());
        }
        s.getWeapons().add(weapon);

    }

    public void pickUp(Weapon weapon, Jedi j) {
        if(j.getWeapons() == null) {
            j.setWeapons(new ArrayList<>());
        }
        j.getWeapons().add(weapon);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "descricao='" + descricao + '\'' +
                ", dano=" + dano +
                '}';
    }
}