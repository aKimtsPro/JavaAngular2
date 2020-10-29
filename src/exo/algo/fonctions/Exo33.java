package exo.algo.fonctions;

public class Exo33 {

    public static int puissance(int choix, int puiss){
        return (int)Math.pow(choix, puiss);
    }

    public static int carre(int choix){
        choix*=choix;
        return choix;
    }

    public static void main(String[] args) {
        int nbre=3;
        System.out.println(carre(nbre));


    }

}
