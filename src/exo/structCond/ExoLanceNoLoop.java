package exo.structCond;

import java.util.Scanner;

public class ExoLanceNoLoop {

    public static void main(String[] args) {

        // Version 1

        Scanner scanner = new Scanner(System.in);

        boolean pret,  panierVide;
        int stockBalle;

        System.out.println("quel est le stock de balle?");
        stockBalle= scanner.nextInt();
        panierVide = stockBalle <= 0;
        if (panierVide) {
            System.out.println("remplir panier");
        }
        else {
            System.out.println("etes_vous pret ?");
            pret = scanner.nextBoolean();
            if (pret){
                System.out.println("lancer balle");
                stockBalle = (stockBalle-1);
            }
            else{
                System.out.println("pas prêt");
            }
        }


        // Version 2

//        boolean pret;
//        int stockBalle;
//
//        Scanner sc = new Scanner( System.in );
//
//        System.out.println("Entrez nbr de balle : ");
//        stockBalle = sc.nextInt();
//
//        System.out.println("Etes vous prêt?");
//        pret = sc.nextBoolean();
//
//        if( stockBalle <= 0 ) // panierVide = true
//        {
//            System.out.println("Le panier est vide");
//        }
//        else if( pret ){ // panierVide = false && pret = true
//            System.out.println("Lancement de balle");
//            stockBalle--;
//        }
//        else{ // panierVide = false && pret = false
//            System.out.println("Le tennisman n'est pas pret...");
//        }


    }

}
