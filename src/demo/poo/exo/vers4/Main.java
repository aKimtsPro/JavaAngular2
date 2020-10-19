package demo.poo.exo.vers4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Personne luc = new Personne("luc", "lucson");
        luc.setDateNaissance(LocalDate.now().minusYears(18));

        Courant cc0 = new Courant("BE00000000000000", luc);
        Epargne ce = new Epargne("BE00000000000000", luc);

        System.out.println( "--- epargne ---\n"+ ce + "\n--- courant ---");
        System.out.println( cc0 );

        cc0.retrait(1000);

        System.out.println( cc0 );


    }

}
