package demo.poo.exo.vers4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Personne luc = new Personne("luc", "lucson");
        luc.setDateNaissance(LocalDate.now().minusYears(18));

        Courant cc0 = new Courant("BE00000000000000", luc);
        Courant cc1 = new Courant("BE00000000000001", luc);

        cc0.afficher(); // luc
        cc1.afficher(); // luc

        luc.setNom("Lucas");

        cc0.afficher(); // lucas
        cc1.afficher(); // lucas

        cc0.getTitulaire().setPrenom("luc");

    }

}
