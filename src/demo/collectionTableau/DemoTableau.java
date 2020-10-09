package demo.collectionTableau;

public class DemoTableau {

    public static void main(String[] args) {

        int[] tabEntier = new int[5];

        tabEntier[0] = 5;
        tabEntier[1] = 5;
        tabEntier[2] = 5;
        tabEntier[3] = 5;
        tabEntier[4] = 5;

        // assigner directement des valeurs au tableau
        int[] tabEntier2 = new int[]{ 0, 1, 10, 11, 100 };


        System.out.println("mon premier element est : "+ tabEntier[0]);

        // System.out.println("element d'index 42 : " + tabEntier[42]);

        // récupérer la taille

        System.out.println("La taille de mon tableau est : " + tabEntier.length );


        for (int i = 0; i < tabEntier.length ; i++) {
            System.out.println(i + " : " + tabEntier[i]);
        }


        // tableau multi-dimensionnels

        String[] tabChaine = new String[]{"salut", "ca va?"};

        int[][] tabTabEntier = new int[][]{
                new int[]{1, 2},
                new int[]{1,2,3}
        };

        tabTabEntier[0] = new int[3];
        int[] tabAAjouter = new int[9];
        tabTabEntier[1] = tabAAjouter;
        tabTabEntier[2] = new int[9];
        tabTabEntier[3] = new int[1];
        tabTabEntier[4] = new int[2];


        tabTabEntier[0][0] = 3;






    }

}
