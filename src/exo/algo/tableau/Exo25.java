package exo.algo.tableau;

import java.util.Arrays;

public class Exo25 {

    public static void main(String[] args) {

        int[] tab = {1,2,3,4,5,6,7,8,9};

        // on echange les premiers avec les derniers.
        // une fois qu'on a parcouru la moitié du tab l'inversion est completée
        for (int i = 0; i < tab.length / 2; i++) {
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 - i];
            tab[tab.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(tab));

    }
}
