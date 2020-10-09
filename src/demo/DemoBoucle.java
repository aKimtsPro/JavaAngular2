package demo;

import java.util.Scanner;

public class DemoBoucle {

    public static void main(String[] args) {


        // verif avant chaque itération

        int nbrOeuf = 3;
        while( nbrOeuf > 0 ){
            System.out.println("je pete un oeuf.");
            nbrOeuf--;
        }

        // lorsqu'on connait le nombre d'itération à faire

        for ( int nOeuf = 3 ; nOeuf > 0 ; nOeuf-- ){
            System.out.println("je pete un oeuf.");
        }

        // vérif après chaque itération (première itération gratuite)

        System.out.println("--- do ... while ---");

        boolean condition = false;

        do {

            System.out.println("instruction;");

        } while(condition);


        // boucle sur tableaux/collections

        System.out.println("--- foreach ---");

        String[] tabString = new String[]{"salut", "comment", "ca", "va?"};

        for (int i = 0; i < tabString.length; i++) {
            System.out.print( tabString[i] + " " ) ;
        }

        for ( String element : tabString ) {
            System.out.print( element+" " ) ;
        }

    }
}
