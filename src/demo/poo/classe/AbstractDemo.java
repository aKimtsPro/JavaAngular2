package demo.poo.classe;

import java.util.ArrayList;

public class AbstractDemo {
    public static void main(String[] args) {

        ArrayList<Personne> list = new ArrayList<>();
        // employe
        // patron
        // patronSenior
        list.add(new Patron());         // 0 -> 100
        list.add(new Employe());        // 0 -> 100
        list.add(new PatronSenior());   // 0 -> 100

        for (Personne personne : list) {
            personne.setAge(100);
        }

        for (Personne personne : list) {
            System.out.println( personne.getAge() );
        }
    }
}
