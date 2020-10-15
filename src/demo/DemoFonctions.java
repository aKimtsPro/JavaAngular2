package demo;

import java.util.Arrays;

public class DemoFonctions {

    public static void main(String[] args) {

//        int[] score1 = { 1 ,2 ,3 };
//        int[] score2 = { 1 ,2 ,3 };
//
//        afficherMoyenne(score1);
//        afficherMoyenne(score2);
//
//        if( moyenne(score1) > moyenne(score2) ){
//            System.out.println("Score 1 a la plus grand moyenne");
//        }
//        else{
//            System.out.println("Score 2 a la plus grand moyenne");
//        }

//        int a = 5, b = 3, rslt = addition(a,b);
//
//        System.out.println( a );    // 5
//        System.out.println( b );    // 3
//        System.out.println(rslt);   // 8
//
//        int membre1 = 5;
//        int membre2 = 3;
//        int rslt2 = addition(membre1, membre2);
//        System.out.println();

//        int[] tab = {1, 2, 3, 4};
//        System.out.println( additionTab(tab) );
//        // 10
//        System.out.println(Arrays.toString(tab));
//        // 1 // soucis // 10
//        // 2 // soucis // 2
//        // 3 // soucis // 3
//        // 4 // soucis // 4

//
//        String bonjour = "Bien le bonjour";
//        System.out.println( concatCaVa(bonjour) ); // Bien le bonjour. Ca va?
//        System.out.println( bonjour ); // Bien le bonjour

        System.out.println( addition( 5, addition(1,2)) );

    }


    static String concatCaVa(String message){

        message += ". Ca va?";
        return message;

    }

    static int additionTab(int[] membres){
        if(membres.length == 0)
            return 0;

        for (int i = 1; i < membres.length; i++) {
            membres[0] += membres[i];
        }
        return membres[0];
    }

    static int addition(int membre1, int membre2){
        membre1 += membre2;
        return membre1;
    }

    static double moyenne(int[] tableau){

        int somme = 0;
        for (int element : tableau) {
            somme += element;
        }
        double rslt = ((double)somme/tableau.length);

        return rslt;

    }

    static void afficherMoyenne(int[] tableau){
        if(tableau.length == 0){
            System.out.println("tableau vide");
            return;
        }

        double moyenne = moyenne(tableau);
        System.out.println("moyenne : " + moyenne);

    }
}
