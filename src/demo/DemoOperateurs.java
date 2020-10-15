package demo;

public class DemoOperateurs {

    public static void main(String[] args) {

        int a = 6, b = 4;

        // Les opérateurs

        // Opérateurs arithmétiques

        System.out.println( "addition : " +( a + b ) );
        System.out.println( "soustraction : " + ( a - b ) );
        System.out.println( "multiplication : " +  ( a * b ) );
        System.out.println( "division entière : " +  ( a / b ) ); // a = rslt * b + reste
        // 6 = 1 * 4 + 2
        System.out.println( "division classique : " + ( (double)a / b ) );
        System.out.println( "reste de la division entière : " + ( a % b ));

        // Opérateurs de comparaisons

        System.out.println(" a == b : " + (a == b) ); // egal
        System.out.println(" a == b : " + (a != b) ); // différent
        System.out.println(" a == b : " + (a >= b) ); // plus grand OU egal
        System.out.println(" a == b : " + (a <= b) ); // plus petit OU egal
        System.out.println(" a == b : " + (a > b) );  // plus grand (et pas egal)
        System.out.println(" a == b : " + (a < b) );  // plus petit (et pas egal)

        // Opérateurs logiques

        // ET - &&

        System.out.println("a et b : " + (true && true));  // true
        System.out.println("a et b : " + (true && false)); // false
        System.out.println("a et b : " + (false && true)); // false
        System.out.println("a et b : " + (false && false));// false

        // OU - ||

        System.out.println("a ou b : " + (true || true));  // true
        System.out.println("a ou b : " + (true || false)); // true
        System.out.println("a ou b : " + (false || true)); // true
        System.out.println("a ou b : " + (false || false));// false

        // NON - !

        System.out.println("non boolean : " + !true ); // false
        System.out.println("non boolean : " + !false ); // true

        // Loi de De Morgan

        // !( a && b ) = !a || !b
        // !( a || b ) = !a && !b

        int A = 3, B = 9, E = 9;
        boolean C = false, D = !C; // false, true

        System.out.println( A != 3 ); // false
        System.out.println( !D || C ); // false
        System.out.println( ((A+B) == 12) && D ); // true

        System.out.println( ((((B == 5) || (E > 10 && A < 8)) || (A < B) || C) && C) );
        // false


        // opérateurs d'affectation

        int toAffect = 5;

        toAffect = toAffect - 1;
        toAffect -= 1;
        toAffect += 5;
        toAffect /= 4;
        toAffect *= 3;

        // increment/decrement

        toAffect++; // toAffect = toAffect + 1;
        ++toAffect;

        toAffect--;
        --toAffect;

        // toAffect == 6

        System.out.println("valeur de toAffect : " + ++toAffect);

    }
}
