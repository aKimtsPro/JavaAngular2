package demo.poo.classe;

import java.util.ArrayList;

public class Appli {

    public static void main(String[] args) {

        // heritage et conversion

        // enfant -> parent
        Personne p = new Patron();

        // parent -> enfant
        if (p instanceof Patron) {
            Patron patron = (Patron) p;
            System.out.println(patron.getNomEntreprise());
        }
        else
        {
            System.out.println("p n'est pas un patron");
        }

        // classe de base universelle

        Chien c = new Chien();
        c.setNom("fido");
        Object o = new Chien();


        System.out.println( c ); // override //

        System.out.println( o ); // override //

        System.out.println("--- equals ---");

        Chien c2 = new Chien();
        c2.setNom("fido");

        System.out.println( c.equals(c2) );




    }
}
