package demo.collectionTableau;

public class TrickRef {

    public static void main(String[] args) {

        // Les tricks de la reference

        int[] testRef1 = new int[]{ 1, 2, 3 };
        int[] testRef2 = testRef1;

        testRef1[2] = 5;

        System.out.println("affichage ref1");
        for (int i = 0; i < testRef1.length; i++) {
            System.out.println(testRef1[i]);
        }

        System.out.println("affichage ref2");
        for (int i = 0; i < testRef2.length; i++) {
            System.out.println(testRef2[i]);
        }

    }
}
