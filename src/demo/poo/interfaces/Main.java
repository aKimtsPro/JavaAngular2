package demo.poo.interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<TrucQuiVole> listVol = new ArrayList<>();
        listVol.add(new Avion());
        listVol.add(new Oiseau());

        listVol.get(0).voler();




    }

}
