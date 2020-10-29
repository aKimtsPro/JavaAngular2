package exo.algo.tableau;

import java.util.Arrays;

public class Exo32 {

    public static void main(String[] args) {

        int[] t1 = { 1, 2, 2, -5 ,9, 7}, t2 = { -2, 9, 4, 9};
        int[] tFinal = new int[t1.length + t2.length];

        // parcours des valeurs à insérer
        for (int i = 0; i < tFinal.length ; i++) {
            boolean placed = false;
            // parcours de la zone pertinente pour l'insertion
            // (tant que toInsert n'est pas inséré)
            for (int j = 0; j <= i && !placed; j++) {
                int toInsert = (i < t1.length ? t1[i] : t2[i-t1.length]);
                // On n'a pas trouvé de valeur supérieur dans la zone pertinente
                // => ajout à la fin de la zone pertinente
                if(i == j)
                {
                    // insertion
                    tFinal[j] = toInsert;
                    placed = true;
                }
                // On trouve une valeur supérieur dans zone pertinente
                // décalage des valeurs suivantes puis insértion à cet endroit
                else if (tFinal[j] > toInsert )
                {
                    // décalage
                    for (int k = i; k > j ; k--) {
                        tFinal[k] = tFinal[k-1];
                    }
                    // insertion
                    tFinal[j] = toInsert;
                    placed = true;
                }
            }
        }

        System.out.println(Arrays.toString(tFinal));

    }

}
