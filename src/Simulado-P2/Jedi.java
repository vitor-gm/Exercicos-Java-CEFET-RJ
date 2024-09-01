package Simulado

import java.util.ArrayList;

import java.util.List;

public class Jedi implements Force {

    private String nome;
    private String titulo;
    private List<Weapon> weapons;

    public Jedi() {
        this.weapons = new ArrayList<>();

    }

    public Jedi(String nome, String titulo) {
        this.nome = nome;
        this.titulo = titulo;

    }

    public void mindControl() {
        System.out.println("Do what I wish");
    }

    @Override
    public void farseeing() {
        System.out.println("Farseeing");
    }

    @Override
    public void telepath() {
        System.out.println("Telepath");

    }

    @Override
    public void levitation() {
        System.out.println("Levitation");
    }



    public void patience() {
        System.out.println("Patience");
    }

    public void useShot(Blast blast) {
        blast.shot();
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

