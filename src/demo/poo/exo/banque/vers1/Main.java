package demo.poo.exo.banque.vers1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Personne eric = new Personne();
        eric.nom="garcia";
        eric.prenom= "Eric";
        eric.dateNaissance= LocalDate.of(1998,05,15);

        Courant cc = new Courant();
        cc.numeroCompte= "2564";
        cc.solde= 9856;
        cc.ligneCredit= 52;
        cc.titulaire=eric;

        cc.depot(98);
        cc.retrait(968);

    }

}
