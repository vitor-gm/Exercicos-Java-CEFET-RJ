package Simulado

public class Pessoa {

    private String nome;
    private String sobreNome;
    private String sexo;

    public Pessoa() {

    }

    public Pessoa(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public Pessoa(String nome, String sobreNome, String sexo) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
