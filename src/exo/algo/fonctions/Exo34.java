package exo.algo.fonctions;

public class Exo34 {

    public static int search( int[] haystack, int needle ) {

        for( int i = 0; i < haystack.length; i++) {
            if( haystack[i] == needle) return i;
        }
        return -1;
    }

    public static void main(String[] args) {



    }

}
