package demo;

import java.util.Scanner;

public class DemoConsole {

    public static void main(String[] args) {

        // Ecrire en console
        System.out.println( "Hello world!" );

        int age = 50;
        System.out.println( "age : " + age + " ans" );

        // Lire en console

        Scanner scanner = new Scanner( System.in );

        System.out.println("Dites un truc : ");
        //String ceQuiAEteEcrit = scanner.next(); recupère jusqu'à un espace
        String ceQuiAEteEcrit = scanner.nextLine(); // récupère toute la ligne
        System.out.println( ceQuiAEteEcrit + 5);

        System.out.println( "Entrez un nombre : " );
        int nbrEcrit = scanner.nextInt();
        System.out.println( nbrEcrit + 5);


        // Transformer une chaine en nombre

        String nombreEnChaine = "123";
        int nombre = Integer.parseInt( nombreEnChaine );
        double nombreAVirgule = Double.parseDouble( nombreEnChaine );
        System.out.println( "mon nombre parsé : " + nombre );
        System.out.println( "mon nombre parsé : " + nombreAVirgule );

        // Nbr -> chaine

        String transfoNbr = ""+5;

    }

}
