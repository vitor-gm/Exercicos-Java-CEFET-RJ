package Simulado

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa LeiaOrgana = new Pessoa();
        LeiaOrgana.setNome("Leia");
        LeiaOrgana.setSobreNome("Organa");
        LeiaOrgana.setSexo("Feminino");

        Pessoa Luke = new Pessoa("Luke", "SkyWalker", "Masculino");

        Jedi ObiWan = new Jedi("Obi-Wan Kenobi", "Jedi");
        Sith DarthVader = new Sith("DarthVader", "Sith");
        ObiWan.mindControl();
        ObiWan.levitation();

        DarthVader.mindControl();
        DarthVader.levitation();

        Saber sabreAzul = new Saber("Sabre de luz azul", 10d);
        Saber sabreVermelho = new Saber("Sabre de luz vermelha", 5d);
        Blast blastLaser = new Blast("Sabre de luz azul", 10d);

        sabreVermelho.pickUp(sabreVermelho, DarthVader);

        sabreAzul.pickUp(sabreAzul, ObiWan);
        blastLaser.pickUp(blastLaser, ObiWan);


        DarthVader.useSlash(sabreVermelho);
        ObiWan.useShot(blastLaser);

        blastLaser.drop(blastLaser, ObiWan);

        for(Weapon w : DarthVader.getWeapons()){
            System.out.println(w);
        }

        for(Weapon we : ObiWan.getWeapons()){
            System.out.println(we);
        }






    }
}