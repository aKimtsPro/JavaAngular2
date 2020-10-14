package exo.tableau;

import java.util.Scanner;

public class Exo24 {

    public static void main(String[] args) {

        int rslt = 0;

        Scanner sc = new Scanner( System.in );
        int nbrJoueur;
        do {
            System.out.println("Combien de joueurs ? ");
            nbrJoueur = sc.nextInt();
        }while (nbrJoueur < 0 || nbrJoueur > 10);

        int[] scores = new int[nbrJoueur];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("score du "+ (1+i)+"e joueur:");
            scores[i] = sc.nextInt();
        }

        for (int element :
                scores) {
            rslt += element;
        }

        System.out.println("La moyenne est de : " + ((double)rslt/nbrJoueur));


    }
}
