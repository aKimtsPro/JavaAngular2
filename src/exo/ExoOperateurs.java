package exo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class ExoOperateurs {

    public static void main(String[] args) {

        int a, b;

        Scanner input = new Scanner(System.in);

        System.out.println("Encodez le premier nombre ENTIER : ");
        a = input.nextInt();

        System.out.println("Encodez le second nombre ENTIER : ");
        b = input.nextInt();


        System.out.printf("%d * %d = %d\n", a, b, (a*b));
        System.out.printf("%d / %d = %.1f\n", a, b, ((double)a/b));
        System.out.printf("%d DIV %d = %d\n", a, b, (a/b));

        System.out.printf("%d MOD %d = %d\n", a, b, (a%b));

        // les marqueur

        // int, short, byte, long = %d
        // char = %c
        // String = %s
        // float, double = %f
        // floating formaté : %.2f (2 chiffres après la virgule)

        System.out.println(a + " MOD " + b + " = " + (a%b));


    }

}
