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
        // Opérateurs logiques

    }
}
