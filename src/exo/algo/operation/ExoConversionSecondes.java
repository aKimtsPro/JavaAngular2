package exo.algo.operation;

import java.util.Scanner;

public class ExoConversionSecondes {
    public static void main(String[] args) {
        int j, h, m, s;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner un nombre de seconde");
        s = scanner.nextInt();

        j = s / 86400;
        h = s % 86400 / 3600;
        m = s % 3600 / 60;
        s = s % 60;

        System.out.println(j+" j "+h+" h "+m+" m "+s+" s");



        System.out.println("Donner un nombre de seconde");
        s = scanner.nextInt();

        m = s / 60;
        h = m / 60;
        j = h / 24;

        s = s % 60;
        m = m % 60;
        j = h % 24;

        System.out.println(j+" j "+ h +" h "+ m +" m "+ s +" s");
    }
}