package demo;

public class DemoConversion {

    public static void main(String[] args) {

        // conversion implicite
        int a = 5;
        float b = a;

        short s = 45;
        byte byt = 117;

        // conversion explicite =
        // ( grand nbr octet -> petit nombre octet ) OU
        // ( reel -> entier )
        float c = 5.7F;
        int d = (int)c;


        int i = 5, j = 2;

        System.out.println( (double)i / j ); // 5 = 2 * 2 + 1


        float exempleFloat = 4.5F;
        int recept = (int)exempleFloat;
    }
}
