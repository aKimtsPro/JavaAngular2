package demo;

public class DemoVariable {

    public static void main(String[] args) {

        // Declaration de variable

        // Les entiers

        // byte  = 1 octet = 00000000 || -128 : 127 ( 256 )
        // short = 2 octet = 00000000 00000000 || -32 000 : 32 000 (64 000)
        // int   = 4 octet = -2 300 000 000 : 2 300 000 000
        // long  = 8 octet

        byte monTresPetitEntier;
        short monPetitEntier;
        int monEntier;
        long monGrandEntier;

        // Les réels

        // float = 4 octet
        // double = 8 octet

        float monReel;
        double monReelPrecis;

        // Les autres

        // char  = 2octets
        // String =  ?? octets
        // boolean = 1 octet

        boolean bool = true; // ou false (et rien d'autre)
        char monChar = 'a';
        String maChaineDeCara = "ma chaine de caractère";

        // Attention à la différence var par valeur/var par référence

        // affectation

        monEntier = 2;

        // déclaration avec init

        int varInit = 56;

        // déclarer plusieurs variables

        int age = 2, taille, poid = 5;

        // constantes

        final int TAXE = 21;
        // TAXE = 22; impossible

        // Les conventions de nommage

        int camelCase;
        int snake_case;
        final int CONSTANTE = 10;
    }

}
