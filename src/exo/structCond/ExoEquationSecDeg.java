package exo.structCond;

import java.util.Scanner;

public class ExoEquationSecDeg {

    public static void main(String[] args) {
        System.out.println("Veuillez entrer une valeur pour a,b et c dans l'expression: ax*x+by+c");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a= scanner.nextInt();
        System.out.print("b = ");
        double b= scanner.nextInt();
        System.out.print("c = ");
        double c= scanner.nextInt();
        double delta= b*b-4*a*c;
        System.out.println("delta vaut= " + delta);
        if (delta<0){
            System.out.println("axx+by+c n'a pas de solution ");
        }
        else if (delta==0){
            double x= -b/2*a;
            System.out.println("x est une solution unique, x =  " + x);
        }
        else{
            double x1= (-b+Math.pow(delta,0.5))/(2*a);
            double x2= (-b-Math.pow(delta,0.5))/(2*a);
            System.out.println("axx+by+c a deux solution : x1 et x2.");
            System.out.println("  x1 = " + x1 + "  x2= " + x2);
        }

    }
}



