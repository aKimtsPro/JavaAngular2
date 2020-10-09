package exo.structCond;

import java.util.Scanner;

public class CalculetteNoLoop {

    public static void main(String[] args) {
        double firstNb, secondNb;
        String operator;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le premier nombre :");
        firstNb = scanner.nextDouble();
        System.out.println("Entrez l'opérateur (+, -, * ou /):");
        operator = scanner.next();
        System.out.println("Entrez le second nombre :");
        secondNb = scanner.nextDouble();

        switch ( operator ) {
            case "+" :
                System.out.printf("%f + %f = %f", firstNb, secondNb, (firstNb + secondNb) );
                break;
            case "-" :
                System.out.printf("%f - %f = %f", firstNb, secondNb, (firstNb - secondNb) );
                break;
            case "*" :
                System.out.printf("%f * %f = %f", firstNb, secondNb, (firstNb * secondNb) );
                break;
            case "/" :
                if ( secondNb == 0 ) {
                    System.out.println("La division par zéro est interdite.");
                }
                else {
                    System.out.printf("%f / %f = %f", firstNb, secondNb, (firstNb / secondNb) );
                }
                break;
            default :
                System.out.println("L'opérateur que vous avez entré n'est pas valide.");
        }

    }

}
