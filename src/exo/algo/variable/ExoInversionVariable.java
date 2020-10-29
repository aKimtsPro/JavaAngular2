package exo.algo.variable;

public class ExoInversionVariable {
//        Créez deux variables a et b capables de stocker des entiers.
//        Donnez leur des valeurs différentes.
//        Inversez le contenu des deux variables.
//
//        Affichez leur contenu avant et après l'inversion.

    public static void main(String[] args) {
        int a = 4, b = 8, temp;
        System.out.println(a + " et " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " et " + b);

        a = a + b;  // 8 + 4 = 12
        b = a - b;  // 12 - 4 = 8
        a = a - b;  // 12 - 8 = 4

        System.out.println(a + " et " + b);
    }
}
