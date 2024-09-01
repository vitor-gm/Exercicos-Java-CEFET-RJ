package Simulado-P2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sith implements Force {

    private String nome;
    private String titulo;
    private List<Weapon> weapons;

    public Sith() {
        this.weapons = new ArrayList<>();

    }

    public Sith(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;


    }

    public static void weapons(Weapon weapon) {


    }

    @Override
    public void mindControl() {
        System.out.println("Mind Control");
    }

    @Override
    public void farseeing() {
        System.out.println("Farseeing");
    }

    @Override
    public void telepath() {
        System.out.println("Telepath");

    }

    public void levitation() {
        System.out.println("Levitation Something");
    }

    public void lightning() {
        System.out.println("Lightning");
    }

    public void useSlash(Saber saber) {
        saber.slash();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }
}
