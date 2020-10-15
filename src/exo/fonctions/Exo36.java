package exo.fonctions;

import java.util.Scanner;

public class Exo36 {

    public static void main(String[] args) {
        int[] sceau = {-1};
        int[] marmite = {0};
        boolean marmitePleine;
        Scanner sc = new Scanner(System.in);
        while (sceau[0] < 0 || sceau[0] > 17){
            System.out.println("Combien de pdt dans le sceau : ");
            sceau[0] = sc.nextInt();
        }
        marmitePleine = peler(sceau, marmite);
        if (marmitePleine) System.out.println("la marmite contient " + marmite[0] + " pdt, il reste " + sceau[0] + " dans le sceau." );


    }

    public static int remplirSceau(){
        System.out.println("le sceau est vide je le remplis");
        return 17;
    }

    public static boolean peler(int[] sceau, int[] marmite){
        while (marmite[0] < 50){
            if (sceau[0] < 1) sceau[0] = remplirSceau();
            sceau[0]--;
            marmite[0]++;
            System.out.println(marmite[0] + " patates dans la marmite, il en reste " + sceau[0] + " dans le sceau");
        }
        return true;
    }
}
