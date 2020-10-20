package demo.poo.collection;

import demo.poo.classe.Chien;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Chenil monChenil = new Chenil();

        Chien monChien = new Chien();
        monChien.setNom("fido");

        monChenil.add( monChien );
        monChenil.afficherList();

        ArrayList<Chien> copieList = monChenil.getChienList();
        copieList.remove( monChien );

        monChenil.afficherList();




    }

}
