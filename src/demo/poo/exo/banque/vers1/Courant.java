package demo.poo.exo.banque.vers1;

public class Courant {
    String numeroCompte;
    double solde;
    double ligneCredit;
    Personne titulaire;

    void depot (double montant){
        if (montant<=0)
            System.out.println("error");
        else
            solde = solde+montant;
    }
    void retrait (double montant){

        if (montant<=0)
            System.out.println("error");
        else if (montant>solde+ligneCredit)
            System.out.println("pas assez d'argent");
        else
            solde= solde- montant;

    }

}
